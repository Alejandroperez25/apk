package com.google.android.gms.common.internal.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static int a(int i2) {
        return i2 & 65535;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int a(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (i2 >> 16) & 65535 : parcel.readInt();
    }

    public static void b(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + a(parcel, i2));
    }

    private static void a(Parcel parcel, int i2, int i3) {
        int iA = a(parcel, i2);
        if (iA == i3) {
            return;
        }
        String hexString = Integer.toHexString(iA);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iA);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void a(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(i3);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    public static int b(Parcel parcel) {
        int iA = a(parcel);
        int iA2 = a(parcel, iA);
        int iDataPosition = parcel.dataPosition();
        if (a(iA) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(iA));
            throw new a(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = iA2 + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    public static boolean c(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean d(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        if (iA == 0) {
            return null;
        }
        a(parcel, i2, iA, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static int e(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long f(Parcel parcel, int i2) {
        a(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long g(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        if (iA == 0) {
            return null;
        }
        a(parcel, i2, iA, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float h(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static String i(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }

    public static IBinder j(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA);
        return tCreateFromParcel;
    }

    public static Bundle k(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }

    public static ArrayList<String> l(Parcel parcel, int i2) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] b(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return tArr;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iA = a(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }

    public static void m(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }
}

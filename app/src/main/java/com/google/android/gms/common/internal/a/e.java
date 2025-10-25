package com.google.android.gms.common.internal.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public abstract class e {
    public static <T extends d> byte[] a(T t) {
        Parcel parcelObtain = Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        t.a(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends d> String b(T t) {
        return com.google.android.gms.common.util.b.a(a(t));
    }

    public static <T extends d> T a(String str, Parcelable.Creator<T> creator) {
        return (T) a(com.google.android.gms.common.util.b.a(str), creator);
    }

    public static <T extends d> void a(T t, Intent intent, String str) {
        intent.putExtra(str, a(t));
    }

    public static <T extends d> T a(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }
}

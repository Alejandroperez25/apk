package com.google.android.gms.common.internal.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    private static void b(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | (-65536));
            parcel.writeInt(i3);
        } else {
            parcel.writeInt(i2 | (i3 << 16));
        }
    }

    private static int b(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void c(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static int a(Parcel parcel) {
        return b(parcel, 20293);
    }

    public static void a(Parcel parcel, int i2) {
        c(parcel, i2);
    }

    public static void a(Parcel parcel, int i2, boolean z) {
        b(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            b(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, int i3) {
        b(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void a(Parcel parcel, int i2, long j) {
        b(parcel, i2, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i2, Long l, boolean z) {
        if (l != null) {
            b(parcel, i2, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, float f2) {
        b(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void a(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                b(parcel, i2, 0);
            }
        } else {
            int iB = b(parcel, i2);
            parcel.writeString(str);
            c(parcel, iB);
        }
    }

    public static void a(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                b(parcel, i2, 0);
            }
        } else {
            int iB = b(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            c(parcel, iB);
        }
    }

    public static void a(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                b(parcel, i2, 0);
            }
        } else {
            int iB = b(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            c(parcel, iB);
        }
    }

    public static void a(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                b(parcel, i2, 0);
            }
        } else {
            int iB = b(parcel, i2);
            parcel.writeBundle(bundle);
            c(parcel, iB);
        }
    }

    public static void a(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                b(parcel, i2, 0);
            }
        } else {
            int iB = b(parcel, i2);
            parcel.writeStringList(list);
            c(parcel, iB);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                b(parcel, i2, 0);
                return;
            }
            return;
        }
        int iB = b(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, i3);
            }
        }
        c(parcel, iB);
    }

    public static <T extends Parcelable> void b(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                b(parcel, i2, 0);
                return;
            }
            return;
        }
        int iB = b(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, 0);
            }
        }
        c(parcel, iB);
    }

    private static <T extends Parcelable> void a(Parcel parcel, T t, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}

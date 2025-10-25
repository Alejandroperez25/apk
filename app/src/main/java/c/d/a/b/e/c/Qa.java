package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Qa implements Parcelable.Creator<Oa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Oa[] newArray(int i2) {
        return new Oa[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Oa createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        Long lG = null;
        String strI3 = null;
        Long lG2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 2:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 3:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    lG = com.google.android.gms.common.internal.a.b.g(parcel, iA);
                    break;
                case 5:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 6:
                    lG2 = com.google.android.gms.common.internal.a.b.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Oa(strI, strI2, lG, strI3, lG2);
    }
}

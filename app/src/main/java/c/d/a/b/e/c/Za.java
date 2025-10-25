package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Za implements Parcelable.Creator<Xa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Xa[] newArray(int i2) {
        return new Xa[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Xa createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
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
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Xa(strI, strI2, strI3);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W implements Parcelable.Creator<X> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ X[] newArray(int i2) {
        return new X[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ X createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new X(strI, strI2);
    }
}

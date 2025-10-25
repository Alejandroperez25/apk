package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class _a implements Parcelable.Creator<Ya> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ya[] newArray(int i2) {
        return new Ya[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ya createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        long jF = 0;
        boolean zC = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    jF = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 4:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ya(strI, jF, zC, strI2, strI3);
    }
}

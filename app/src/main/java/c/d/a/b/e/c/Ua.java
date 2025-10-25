package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Ua implements Parcelable.Creator<Ra> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ra[] newArray(int i2) {
        return new Ra[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ra createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        String strI5 = null;
        String strI6 = null;
        String strI7 = null;
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
                case 5:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 6:
                    strI5 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 7:
                    strI6 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 8:
                    strI7 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ra(strI, strI2, strI3, strI4, strI5, strI6, strI7);
    }
}

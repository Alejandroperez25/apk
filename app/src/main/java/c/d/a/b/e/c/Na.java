package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Na implements Parcelable.Creator<Ma> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ma[] newArray(int i2) {
        return new Ma[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ma createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        long jF = 0;
        long jF2 = 0;
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        Ta ta = null;
        String strI5 = null;
        String strI6 = null;
        com.google.firebase.auth.T t = null;
        ArrayList arrayListC = null;
        boolean zC = false;
        boolean zC2 = false;
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
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 5:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 6:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 7:
                    ta = (Ta) com.google.android.gms.common.internal.a.b.a(parcel, iA, Ta.CREATOR);
                    break;
                case 8:
                    strI5 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 9:
                    strI6 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 10:
                    jF = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 11:
                    jF2 = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 12:
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 13:
                    t = (com.google.firebase.auth.T) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.T.CREATOR);
                    break;
                case 14:
                    arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, Pa.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ma(strI, strI2, zC, strI3, strI4, ta, strI5, strI6, jF, jF2, zC2, t, arrayListC);
    }
}

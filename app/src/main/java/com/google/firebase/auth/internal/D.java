package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.Oa;
import com.google.firebase.auth.T;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D implements Parcelable.Creator<E> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E[] newArray(int i2) {
        return new E[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        Oa oa = null;
        A a2 = null;
        String strI = null;
        String strI2 = null;
        ArrayList arrayListC = null;
        ArrayList<String> arrayListL = null;
        String strI3 = null;
        Boolean boolD = null;
        G g2 = null;
        T t = null;
        C0420k c0420k = null;
        boolean zC = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    oa = (Oa) com.google.android.gms.common.internal.a.b.a(parcel, iA, Oa.CREATOR);
                    break;
                case 2:
                    a2 = (A) com.google.android.gms.common.internal.a.b.a(parcel, iA, A.CREATOR);
                    break;
                case 3:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, A.CREATOR);
                    break;
                case 6:
                    arrayListL = com.google.android.gms.common.internal.a.b.l(parcel, iA);
                    break;
                case 7:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 8:
                    boolD = com.google.android.gms.common.internal.a.b.d(parcel, iA);
                    break;
                case 9:
                    g2 = (G) com.google.android.gms.common.internal.a.b.a(parcel, iA, G.CREATOR);
                    break;
                case 10:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 11:
                    t = (T) com.google.android.gms.common.internal.a.b.a(parcel, iA, T.CREATOR);
                    break;
                case 12:
                    c0420k = (C0420k) com.google.android.gms.common.internal.a.b.a(parcel, iA, C0420k.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new E(oa, a2, strI, strI2, arrayListC, arrayListL, strI3, boolD, g2, zC, t, c0420k);
    }
}

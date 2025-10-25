package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O implements Parcelable.Creator<H> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H[] newArray(int i2) {
        return new H[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
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
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new H(strI, strI2, zC, zC2);
    }
}

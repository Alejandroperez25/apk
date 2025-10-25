package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class J implements Parcelable.Creator<A> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ A[] newArray(int i2) {
        return new A[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ A createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        boolean zC = false;
        boolean zC2 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 4:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 6:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new A(strI, strI2, zC, strI3, zC2, strI4);
    }
}

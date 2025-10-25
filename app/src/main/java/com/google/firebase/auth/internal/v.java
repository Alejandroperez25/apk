package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<w> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w[] newArray(int i2) {
        return new w[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        boolean zC = false;
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
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new w(strI, strI2, zC);
    }
}

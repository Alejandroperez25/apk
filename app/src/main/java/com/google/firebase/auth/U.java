package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U implements Parcelable.Creator<C0405e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0405e[] newArray(int i2) {
        return new C0405e[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0405e createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
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
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0405e(strI, strI2, strI3, strI4, zC);
    }
}

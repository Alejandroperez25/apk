package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements Parcelable.Creator<J> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ J[] newArray(int i2) {
        return new J[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ J createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        ArrayList arrayListC = null;
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
                    arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, com.google.firebase.auth.L.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new J(strI, strI2, arrayListC);
    }
}

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E implements Parcelable.Creator<D> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ D[] newArray(int i2) {
        return new D[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ D createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        Bundle bundleK = null;
        c.d.a.b.b.c[] cVarArr = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    bundleK = com.google.android.gms.common.internal.a.b.k(parcel, iA);
                    break;
                case 2:
                    cVarArr = (c.d.a.b.b.c[]) com.google.android.gms.common.internal.a.b.b(parcel, iA, c.d.a.b.b.c.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new D(bundleK, cVarArr);
    }
}

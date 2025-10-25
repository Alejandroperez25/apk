package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator<G> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ G[] newArray(int i2) {
        return new G[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ G createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        long jF = 0;
        long jF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    jF = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 2:
                    jF2 = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new G(jF, jF2);
    }
}

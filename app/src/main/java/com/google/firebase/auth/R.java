package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.B;

/* loaded from: classes.dex */
public final class R implements Parcelable.Creator<B.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ B.a[] newArray(int i2) {
        return new B.a[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ B.a createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            com.google.android.gms.common.internal.a.b.a(iA);
            com.google.android.gms.common.internal.a.b.b(parcel, iA);
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new B.a();
    }
}

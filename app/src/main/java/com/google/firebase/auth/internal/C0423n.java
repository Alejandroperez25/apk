package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.firebase.auth.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423n implements Parcelable.Creator<C0420k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0420k[] newArray(int i2) {
        return new C0420k[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0420k createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 1) {
                arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, com.google.firebase.auth.L.CREATOR);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0420k(arrayListC);
    }
}

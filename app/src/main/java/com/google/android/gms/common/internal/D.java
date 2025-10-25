package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<D> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    Bundle f4971a;

    /* renamed from: b, reason: collision with root package name */
    c.d.a.b.b.c[] f4972b;

    D(Bundle bundle, c.d.a.b.b.c[] cVarArr) {
        this.f4971a = bundle;
        this.f4972b = cVarArr;
    }

    public D() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f4971a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable[]) this.f4972b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

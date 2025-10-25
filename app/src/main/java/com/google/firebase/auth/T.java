package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* loaded from: classes.dex */
public class T extends AbstractC0444z {
    public static final Parcelable.Creator<T> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private final String f5209a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5210b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5211c;

    /* renamed from: d, reason: collision with root package name */
    private final bb f5212d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5213e;

    T(String str, String str2, String str3, bb bbVar, String str4) {
        this.f5209a = str;
        this.f5210b = str2;
        this.f5211c = str3;
        this.f5212d = bbVar;
        this.f5213e = str4;
    }

    public static T a(bb bbVar) {
        com.google.android.gms.common.internal.t.a(bbVar, "Must specify a non-null webSignInCredential");
        return new T(null, null, null, bbVar, null);
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return this.f5209a;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return this.f5209a;
    }

    @Override // com.google.firebase.auth.AbstractC0444z
    public String r() {
        return this.f5210b;
    }

    @Override // com.google.firebase.auth.AbstractC0444z
    public String q() {
        return this.f5211c;
    }

    public static bb a(T t, String str) {
        com.google.android.gms.common.internal.t.a(t);
        if (t.f5212d != null) {
            return t.f5212d;
        }
        return new bb(t.r(), t.q(), t.o(), null, null, null, str, t.f5213e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, o(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, r(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, q(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, (Parcelable) this.f5212d, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5213e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

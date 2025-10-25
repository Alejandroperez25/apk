package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* loaded from: classes.dex */
public class E extends AbstractC0403c {
    public static final Parcelable.Creator<E> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    private String f5176a;

    /* renamed from: b, reason: collision with root package name */
    private String f5177b;

    E(String str, String str2) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5176a = str;
        com.google.android.gms.common.internal.t.a(str2);
        this.f5177b = str2;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "twitter.com";
    }

    public static bb a(E e2, String str) {
        com.google.android.gms.common.internal.t.a(e2);
        return new bb(null, e2.f5176a, e2.o(), null, e2.f5177b, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5176a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5177b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

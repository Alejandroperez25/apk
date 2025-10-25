package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* renamed from: com.google.firebase.auth.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0407g extends AbstractC0403c {
    public static final Parcelable.Creator<C0407g> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private final String f5320a;

    C0407g(String str) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5320a = str;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "facebook.com";
    }

    public static bb a(C0407g c0407g, String str) {
        com.google.android.gms.common.internal.t.a(c0407g);
        return new bb(null, c0407g.f5320a, c0407g.o(), null, null, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5320a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

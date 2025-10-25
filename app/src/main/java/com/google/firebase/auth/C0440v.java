package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* renamed from: com.google.firebase.auth.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0440v extends AbstractC0403c {
    public static final Parcelable.Creator<C0440v> CREATOR = new ea();

    /* renamed from: a, reason: collision with root package name */
    private String f5403a;

    C0440v(String str) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5403a = str;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "github.com";
    }

    public static bb a(C0440v c0440v, String str) {
        com.google.android.gms.common.internal.t.a(c0440v);
        return new bb(null, c0440v.f5403a, c0440v.o(), null, null, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5403a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

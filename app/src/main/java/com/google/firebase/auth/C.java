package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* loaded from: classes.dex */
public class C extends AbstractC0403c {
    public static final Parcelable.Creator<C> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private final String f5175a;

    C(String str) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5175a = str;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "playgames.google.com";
    }

    public static bb a(C c2, String str) {
        com.google.android.gms.common.internal.t.a(c2);
        return new bb(null, null, c2.o(), null, null, c2.f5175a, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5175a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

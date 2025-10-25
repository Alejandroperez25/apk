package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.d.a.b.e.c.bb;

/* renamed from: com.google.firebase.auth.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0442x extends AbstractC0403c {
    public static final Parcelable.Creator<C0442x> CREATOR = new fa();

    /* renamed from: a, reason: collision with root package name */
    private final String f5404a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5405b;

    C0442x(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        a(str, "idToken");
        this.f5404a = str;
        a(str2, "accessToken");
        this.f5405b = str2;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "google.com";
    }

    public static bb a(C0442x c0442x, String str) {
        com.google.android.gms.common.internal.t.a(c0442x);
        return new bb(c0442x.f5404a, c0442x.f5405b, c0442x.o(), null, null, null, str, null);
    }

    private static String a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5404a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5405b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

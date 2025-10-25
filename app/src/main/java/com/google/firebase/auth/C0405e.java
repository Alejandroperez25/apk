package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: com.google.firebase.auth.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0405e extends AbstractC0403c {
    public static final Parcelable.Creator<C0405e> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    private String f5315a;

    /* renamed from: b, reason: collision with root package name */
    private String f5316b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5317c;

    /* renamed from: d, reason: collision with root package name */
    private String f5318d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5319e;

    C0405e(String str, String str2, String str3, String str4, boolean z) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5315a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f5316b = str2;
        this.f5317c = str3;
        this.f5318d = str4;
        this.f5319e = z;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "password";
    }

    C0405e(String str, String str2) {
        this(str, str2, null, null, false);
    }

    public final String n() {
        return this.f5315a;
    }

    public final String q() {
        return this.f5316b;
    }

    public final String r() {
        return this.f5317c;
    }

    public final C0405e a(AbstractC0437s abstractC0437s) {
        this.f5318d = abstractC0437s.y();
        this.f5319e = true;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return !TextUtils.isEmpty(this.f5316b) ? "password" : "emailLink";
    }

    public final boolean s() {
        return !TextUtils.isEmpty(this.f5317c);
    }

    public static boolean a(String str) {
        P pA;
        return (TextUtils.isEmpty(str) || (pA = P.a(str)) == null || pA.a() != 4) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5315a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5316b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5317c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5318d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5319e);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

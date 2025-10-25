package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.fb;

/* renamed from: com.google.firebase.auth.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0354a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0354a> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    private final String f5221a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5222b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5223c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5224d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5225e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5226f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5227g;

    /* renamed from: h, reason: collision with root package name */
    private String f5228h;

    /* renamed from: i, reason: collision with root package name */
    private int f5229i;
    private String j;

    C0354a(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i2, String str7) {
        this.f5221a = str;
        this.f5222b = str2;
        this.f5223c = str3;
        this.f5224d = str4;
        this.f5225e = z;
        this.f5226f = str5;
        this.f5227g = z2;
        this.f5228h = str6;
        this.f5229i = i2;
        this.j = str7;
    }

    /* renamed from: com.google.firebase.auth.a$a, reason: collision with other inner class name */
    public static class C0066a {

        /* renamed from: a, reason: collision with root package name */
        private String f5230a;

        /* renamed from: b, reason: collision with root package name */
        private String f5231b;

        /* renamed from: c, reason: collision with root package name */
        private String f5232c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5233d;

        /* renamed from: e, reason: collision with root package name */
        private String f5234e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5235f;

        /* renamed from: g, reason: collision with root package name */
        private String f5236g;

        private C0066a() {
            this.f5235f = false;
        }

        public C0066a a(String str) {
            this.f5230a = str;
            return this;
        }

        public C0066a b(String str) {
            this.f5231b = str;
            return this;
        }

        public C0066a a(String str, boolean z, String str2) {
            this.f5232c = str;
            this.f5233d = z;
            this.f5234e = str2;
            return this;
        }

        public C0066a a(boolean z) {
            this.f5235f = z;
            return this;
        }

        public C0354a a() {
            if (this.f5230a == null) {
                throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
            }
            return new C0354a(this);
        }
    }

    private C0354a(C0066a c0066a) {
        this.f5221a = c0066a.f5230a;
        this.f5222b = c0066a.f5231b;
        this.f5223c = null;
        this.f5224d = c0066a.f5232c;
        this.f5225e = c0066a.f5233d;
        this.f5226f = c0066a.f5234e;
        this.f5227g = c0066a.f5235f;
        this.j = c0066a.f5236g;
    }

    public static C0354a o() {
        return new C0354a(new C0066a());
    }

    public String q() {
        return this.f5221a;
    }

    public String r() {
        return this.f5222b;
    }

    public String s() {
        return this.f5224d;
    }

    public boolean t() {
        return this.f5225e;
    }

    public String u() {
        return this.f5226f;
    }

    public boolean v() {
        return this.f5227g;
    }

    public final void a(String str) {
        this.f5228h = str;
    }

    public final void a(fb fbVar) {
        this.f5229i = fbVar.a();
    }

    public static C0066a p() {
        return new C0066a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, q(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, r(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5223c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, s(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, t());
        com.google.android.gms.common.internal.a.c.a(parcel, 6, u(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, v());
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f5228h, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 9, this.f5229i);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, this.j, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

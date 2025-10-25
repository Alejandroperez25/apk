package com.google.firebase.iid;

/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private final String f5514a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5515b;

    X(String str, long j) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5514a = str;
        this.f5515b = j;
    }

    final String a() {
        return this.f5514a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x = (X) obj;
        return this.f5515b == x.f5515b && this.f5514a.equals(x.f5514a);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.s.a(this.f5514a, Long.valueOf(this.f5515b));
    }
}

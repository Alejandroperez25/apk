package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class M<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4901a = false;

    /* renamed from: b, reason: collision with root package name */
    private final int f4902b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f4903c;

    /* renamed from: d, reason: collision with root package name */
    private final O f4904d;

    private M(com.google.android.gms.common.api.a<O> aVar, O o) {
        this.f4903c = aVar;
        this.f4904d = o;
        this.f4902b = com.google.android.gms.common.internal.s.a(this.f4903c, this.f4904d);
    }

    public static <O extends a.d> M<O> a(com.google.android.gms.common.api.a<O> aVar, O o) {
        return new M<>(aVar, o);
    }

    public final String a() {
        return this.f4903c.b();
    }

    public final int hashCode() {
        return this.f4902b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return !this.f4901a && !m.f4901a && com.google.android.gms.common.internal.s.a(this.f4903c, m.f4903c) && com.google.android.gms.common.internal.s.a(this.f4904d, m.f4904d);
    }
}

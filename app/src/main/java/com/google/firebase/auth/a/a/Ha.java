package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class Ha extends AbstractC0357b implements a.d.c {

    /* renamed from: b, reason: collision with root package name */
    private final String f5245b;

    private Ha(String str) {
        com.google.android.gms.common.internal.t.a(str, (Object) "A valid API key must be provided");
        this.f5245b = str;
    }

    public final String c() {
        return this.f5245b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ha) {
            return com.google.android.gms.common.internal.s.a(this.f5245b, ((Ha) obj).f5245b);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.s.a(this.f5245b);
    }

    @Override // com.google.firebase.auth.a.a.AbstractC0357b
    public final /* synthetic */ Object clone() {
        return new Ga(this.f5245b).a();
    }

    /* synthetic */ Ha(String str, Ea ea) {
        this(str);
    }
}

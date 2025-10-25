package com.google.firebase.auth.internal;

import c.d.a.b.h.InterfaceC0230d;

/* loaded from: classes.dex */
final class P implements InterfaceC0230d {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Q f5361a;

    P(Q q) {
        this.f5361a = q;
    }

    @Override // c.d.a.b.h.InterfaceC0230d
    public final void a(Exception exc) {
        if (exc instanceof c.d.b.h) {
            N.f5352a.a("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f5361a.f5363b.c();
        }
    }
}

package com.google.firebase.auth;

import c.d.a.b.h.InterfaceC0227a;

/* loaded from: classes.dex */
final class da implements InterfaceC0227a<C0439u, c.d.a.b.h.h<Void>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractC0437s f5314a;

    da(AbstractC0437s abstractC0437s) {
        this.f5314a = abstractC0437s;
    }

    @Override // c.d.a.b.h.InterfaceC0227a
    public final /* synthetic */ c.d.a.b.h.h<Void> a(c.d.a.b.h.h<C0439u> hVar) {
        return FirebaseAuth.getInstance(this.f5314a.s()).a((C0354a) null, hVar.d().a());
    }
}

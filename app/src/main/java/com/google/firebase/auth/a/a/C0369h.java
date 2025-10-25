package com.google.firebase.auth.a.a;

import c.d.a.b.h.InterfaceC0227a;

/* JADX INFO: Add missing generic type declarations: [ResultT] */
/* renamed from: com.google.firebase.auth.a.a.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0369h<ResultT> implements InterfaceC0227a<ResultT, c.d.a.b.h.h<ResultT>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC0367g f5286a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0371i f5287b;

    C0369h(C0371i c0371i, InterfaceC0367g interfaceC0367g) {
        this.f5287b = c0371i;
        this.f5286a = interfaceC0367g;
    }

    @Override // c.d.a.b.h.InterfaceC0227a
    public final /* synthetic */ Object a(c.d.a.b.h.h hVar) {
        if (!(hVar.e() instanceof com.google.android.gms.common.api.k)) {
            return hVar;
        }
        C0371i c0371i = this.f5287b;
        InterfaceC0367g interfaceC0367g = this.f5286a;
        interfaceC0367g.a();
        return c0371i.a(interfaceC0367g);
    }
}

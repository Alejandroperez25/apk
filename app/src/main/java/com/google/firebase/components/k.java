package com.google.firebase.components;

/* loaded from: classes.dex */
final /* synthetic */ class k implements c.d.b.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final n f5422a;

    /* renamed from: b, reason: collision with root package name */
    private final e f5423b;

    private k(n nVar, e eVar) {
        this.f5422a = nVar;
        this.f5423b = eVar;
    }

    public static c.d.b.c.a a(n nVar, e eVar) {
        return new k(nVar, eVar);
    }

    @Override // c.d.b.c.a
    public Object get() {
        n nVar = this.f5422a;
        e eVar = this.f5423b;
        return eVar.c().a(new x(eVar, nVar));
    }
}

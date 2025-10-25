package c.d.a.a;

import c.d.a.a.m.InterfaceC0171f;

/* renamed from: c.d.a.a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0143f implements c.d.a.a.m.q {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.A f2361a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2362b;

    /* renamed from: c, reason: collision with root package name */
    private E f2363c;

    /* renamed from: d, reason: collision with root package name */
    private c.d.a.a.m.q f2364d;

    /* renamed from: c.d.a.a.f$a */
    public interface a {
        void a(z zVar);
    }

    public C0143f(a aVar, InterfaceC0171f interfaceC0171f) {
        this.f2362b = aVar;
        this.f2361a = new c.d.a.a.m.A(interfaceC0171f);
    }

    public void b() {
        this.f2361a.b();
    }

    public void c() {
        this.f2361a.c();
    }

    public void a(long j) {
        this.f2361a.a(j);
    }

    public void a(E e2) throws C0145h {
        c.d.a.a.m.q qVarN = e2.n();
        if (qVarN == null || qVarN == this.f2364d) {
            return;
        }
        if (this.f2364d != null) {
            throw C0145h.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f2364d = qVarN;
        this.f2363c = e2;
        this.f2364d.a(this.f2361a.d());
        f();
    }

    public void b(E e2) {
        if (e2 == this.f2363c) {
            this.f2364d = null;
            this.f2363c = null;
        }
    }

    public long e() {
        if (g()) {
            f();
            return this.f2364d.a();
        }
        return this.f2361a.a();
    }

    @Override // c.d.a.a.m.q
    public long a() {
        if (g()) {
            return this.f2364d.a();
        }
        return this.f2361a.a();
    }

    @Override // c.d.a.a.m.q
    public z a(z zVar) {
        if (this.f2364d != null) {
            zVar = this.f2364d.a(zVar);
        }
        this.f2361a.a(zVar);
        this.f2362b.a(zVar);
        return zVar;
    }

    @Override // c.d.a.a.m.q
    public z d() {
        return this.f2364d != null ? this.f2364d.d() : this.f2361a.d();
    }

    private void f() {
        this.f2361a.a(this.f2364d.a());
        z zVarD = this.f2364d.d();
        if (zVarD.equals(this.f2361a.d())) {
            return;
        }
        this.f2361a.a(zVarD);
        this.f2362b.a(zVarD);
    }

    private boolean g() {
        return (this.f2363c == null || this.f2363c.b() || (!this.f2363c.c() && this.f2363c.h())) ? false : true;
    }
}

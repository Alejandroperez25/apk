package c.d.a.a.e.h;

import c.d.a.a.e.h.G;

/* loaded from: classes.dex */
public final class C implements z {

    /* renamed from: a, reason: collision with root package name */
    private c.d.a.a.m.E f2097a;

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.a.e.q f2098b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2099c;

    @Override // c.d.a.a.e.h.z
    public void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, G.d dVar) {
        this.f2097a = e2;
        dVar.a();
        this.f2098b = iVar.a(dVar.b(), 4);
        this.f2098b.a(c.d.a.a.q.a(dVar.c(), "application/x-scte35", (String) null, -1, (c.d.a.a.d.f) null));
    }

    @Override // c.d.a.a.e.h.z
    public void a(c.d.a.a.m.u uVar) {
        if (!this.f2099c) {
            if (this.f2097a.c() == -9223372036854775807L) {
                return;
            }
            this.f2098b.a(c.d.a.a.q.a(null, "application/x-scte35", this.f2097a.c()));
            this.f2099c = true;
        }
        int iB = uVar.b();
        this.f2098b.a(uVar, iB);
        this.f2098b.a(this.f2097a.b(), 1, iB, 0, null);
    }
}

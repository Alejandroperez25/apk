package c.d.a.a.i.d;

import c.d.a.a.i.A;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class n implements A {

    /* renamed from: a, reason: collision with root package name */
    private final int f2854a;

    /* renamed from: b, reason: collision with root package name */
    private final o f2855b;

    /* renamed from: c, reason: collision with root package name */
    private int f2856c = -1;

    public n(o oVar, int i2) {
        this.f2855b = oVar;
        this.f2854a = i2;
    }

    public void b() {
        AbstractC0170e.a(this.f2856c == -1);
        this.f2856c = this.f2855b.a(this.f2854a);
    }

    public void d() {
        if (this.f2856c != -1) {
            this.f2855b.b(this.f2854a);
            this.f2856c = -1;
        }
    }

    @Override // c.d.a.a.i.A
    public boolean c() {
        return this.f2856c == -3 || (e() && this.f2855b.c(this.f2856c));
    }

    @Override // c.d.a.a.i.A
    public void a() throws p {
        if (this.f2856c == -2) {
            throw new p(this.f2855b.f().a(this.f2854a).a(0).f3682g);
        }
        this.f2855b.j();
    }

    @Override // c.d.a.a.i.A
    public int a(c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z) {
        if (this.f2856c == -3) {
            fVar.c(4);
            return -4;
        }
        if (e()) {
            return this.f2855b.a(this.f2856c, rVar, fVar, z);
        }
        return -3;
    }

    @Override // c.d.a.a.i.A
    public int d(long j) {
        if (e()) {
            return this.f2855b.a(this.f2856c, j);
        }
        return 0;
    }

    private boolean e() {
        return (this.f2856c == -1 || this.f2856c == -3 || this.f2856c == -2) ? false : true;
    }
}

package c.d.a.a.e.i;

import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    private final int f2326a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2327b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2328c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2329d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2330e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2331f;

    /* renamed from: g, reason: collision with root package name */
    private long f2332g;

    /* renamed from: h, reason: collision with root package name */
    private long f2333h;

    @Override // c.d.a.a.e.o
    public boolean c() {
        return true;
    }

    public c(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f2326a = i2;
        this.f2327b = i3;
        this.f2328c = i4;
        this.f2329d = i5;
        this.f2330e = i6;
        this.f2331f = i7;
    }

    public void a(long j, long j2) {
        this.f2332g = j;
        this.f2333h = j2;
    }

    public long a() {
        if (e()) {
            return this.f2332g + this.f2333h;
        }
        return -1L;
    }

    public boolean e() {
        return (this.f2332g == 0 || this.f2333h == 0) ? false : true;
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return ((this.f2333h / this.f2329d) * 1000000) / this.f2327b;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        long jA = H.a((((this.f2328c * j) / 1000000) / this.f2329d) * this.f2329d, 0L, this.f2333h - this.f2329d);
        long j2 = this.f2332g + jA;
        long jA2 = a(j2);
        p pVar = new p(jA2, j2);
        if (jA2 >= j || jA == this.f2333h - this.f2329d) {
            return new o.a(pVar);
        }
        long j3 = j2 + this.f2329d;
        return new o.a(pVar, new p(a(j3), j3));
    }

    public long a(long j) {
        return (Math.max(0L, j - this.f2332g) * 1000000) / this.f2328c;
    }

    public int f() {
        return this.f2329d;
    }

    public int g() {
        return this.f2327b * this.f2330e * this.f2326a;
    }

    public int h() {
        return this.f2327b;
    }

    public int i() {
        return this.f2326a;
    }

    public int j() {
        return this.f2331f;
    }
}

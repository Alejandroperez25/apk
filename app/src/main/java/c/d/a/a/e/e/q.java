package c.d.a.a.e.e;

import c.d.a.a.m.u;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public e f1988a;

    /* renamed from: b, reason: collision with root package name */
    public long f1989b;

    /* renamed from: c, reason: collision with root package name */
    public long f1990c;

    /* renamed from: d, reason: collision with root package name */
    public long f1991d;

    /* renamed from: e, reason: collision with root package name */
    public int f1992e;

    /* renamed from: f, reason: collision with root package name */
    public int f1993f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f1994g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1995h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1996i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public p o;
    public int p;
    public u q;
    public boolean r;
    public long s;

    q() {
    }

    public void a() {
        this.f1992e = 0;
        this.s = 0L;
        this.m = false;
        this.r = false;
        this.o = null;
    }

    public void a(int i2, int i3) {
        this.f1992e = i2;
        this.f1993f = i3;
        if (this.f1995h == null || this.f1995h.length < i2) {
            this.f1994g = new long[i2];
            this.f1995h = new int[i2];
        }
        if (this.f1996i == null || this.f1996i.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.f1996i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.l = new boolean[i4];
            this.n = new boolean[i4];
        }
    }

    public void a(int i2) {
        if (this.q == null || this.q.c() < i2) {
            this.q = new u(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public void a(c.d.a.a.e.h hVar) {
        hVar.readFully(this.q.f3567a, 0, this.p);
        this.q.c(0);
        this.r = false;
    }

    public void a(u uVar) {
        uVar.a(this.q.f3567a, 0, this.p);
        this.q.c(0);
        this.r = false;
    }

    public long b(int i2) {
        return this.k[i2] + this.j[i2];
    }

    public boolean c(int i2) {
        return this.m && this.n[i2];
    }
}

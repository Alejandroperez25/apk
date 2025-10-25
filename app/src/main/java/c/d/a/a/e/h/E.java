package c.d.a.a.e.h;

/* loaded from: classes.dex */
final class E {

    /* renamed from: c, reason: collision with root package name */
    private boolean f2105c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2106d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2107e;

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.E f2103a = new c.d.a.a.m.E(0);

    /* renamed from: f, reason: collision with root package name */
    private long f2108f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f2109g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f2110h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.u f2104b = new c.d.a.a.m.u();

    E() {
    }

    public boolean a() {
        return this.f2105c;
    }

    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar, int i2) {
        if (i2 <= 0) {
            return a(hVar);
        }
        if (!this.f2107e) {
            return c(hVar, nVar, i2);
        }
        if (this.f2109g == -9223372036854775807L) {
            return a(hVar);
        }
        if (!this.f2106d) {
            return b(hVar, nVar, i2);
        }
        if (this.f2108f == -9223372036854775807L) {
            return a(hVar);
        }
        this.f2110h = this.f2103a.d(this.f2109g) - this.f2103a.d(this.f2108f);
        return a(hVar);
    }

    public long b() {
        return this.f2110h;
    }

    public c.d.a.a.m.E c() {
        return this.f2103a;
    }

    private int a(c.d.a.a.e.h hVar) {
        this.f2104b.a(c.d.a.a.m.H.f3504f);
        this.f2105c = true;
        hVar.b();
        return 0;
    }

    private int b(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar, int i2) {
        int iMin = (int) Math.min(112800L, hVar.getLength());
        long j = 0;
        if (hVar.c() != j) {
            nVar.f2349a = j;
            return 1;
        }
        this.f2104b.a(iMin);
        hVar.b();
        hVar.a(this.f2104b.f3567a, 0, iMin);
        this.f2108f = a(this.f2104b, i2);
        this.f2106d = true;
        return 0;
    }

    private long a(c.d.a.a.m.u uVar, int i2) {
        int iC = uVar.c();
        for (int iD = uVar.d(); iD < iC; iD++) {
            if (uVar.f3567a[iD] == 71) {
                long jA = H.a(uVar, iD, i2);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar, int i2) {
        long length = hVar.getLength();
        int iMin = (int) Math.min(112800L, length);
        long j = length - iMin;
        if (hVar.c() != j) {
            nVar.f2349a = j;
            return 1;
        }
        this.f2104b.a(iMin);
        hVar.b();
        hVar.a(this.f2104b.f3567a, 0, iMin);
        this.f2109g = b(this.f2104b, i2);
        this.f2107e = true;
        return 0;
    }

    private long b(c.d.a.a.m.u uVar, int i2) {
        int iD = uVar.d();
        int iC = uVar.c();
        while (true) {
            iC--;
            if (iC < iD) {
                return -9223372036854775807L;
            }
            if (uVar.f3567a[iC] == 71) {
                long jA = H.a(uVar, iC, i2);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
    }
}

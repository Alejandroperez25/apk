package c.d.a.a.e.f;

import c.d.a.a.e.o;
import c.d.a.a.e.q;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private final f f2039a = new f();

    /* renamed from: b, reason: collision with root package name */
    private q f2040b;

    /* renamed from: c, reason: collision with root package name */
    private c.d.a.a.e.i f2041c;

    /* renamed from: d, reason: collision with root package name */
    private h f2042d;

    /* renamed from: e, reason: collision with root package name */
    private long f2043e;

    /* renamed from: f, reason: collision with root package name */
    private long f2044f;

    /* renamed from: g, reason: collision with root package name */
    private long f2045g;

    /* renamed from: h, reason: collision with root package name */
    private int f2046h;

    /* renamed from: i, reason: collision with root package name */
    private int f2047i;
    private a j;
    private long k;
    private boolean l;
    private boolean m;

    protected abstract long a(u uVar);

    protected abstract boolean a(u uVar, long j, a aVar);

    static class a {

        /* renamed from: a, reason: collision with root package name */
        c.d.a.a.q f2048a;

        /* renamed from: b, reason: collision with root package name */
        h f2049b;

        a() {
        }
    }

    void a(c.d.a.a.e.i iVar, q qVar) {
        this.f2041c = iVar;
        this.f2040b = qVar;
        a(true);
    }

    protected void a(boolean z) {
        if (z) {
            this.j = new a();
            this.f2044f = 0L;
            this.f2046h = 0;
        } else {
            this.f2046h = 1;
        }
        this.f2043e = -1L;
        this.f2045g = 0L;
    }

    final void a(long j, long j2) {
        this.f2039a.a();
        if (j == 0) {
            a(!this.l);
        } else if (this.f2046h != 0) {
            this.f2043e = this.f2042d.c(j2);
            this.f2046h = 2;
        }
    }

    final int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        switch (this.f2046h) {
            case 0:
                return a(hVar);
            case 1:
                hVar.c((int) this.f2044f);
                this.f2046h = 2;
                return 0;
            case 2:
                return b(hVar, nVar);
            default:
                throw new IllegalStateException();
        }
    }

    private int a(c.d.a.a.e.h hVar) {
        boolean zA = true;
        while (zA) {
            if (!this.f2039a.a(hVar)) {
                this.f2046h = 3;
                return -1;
            }
            this.k = hVar.c() - this.f2044f;
            zA = a(this.f2039a.c(), this.f2044f, this.j);
            if (zA) {
                this.f2044f = hVar.c();
            }
        }
        this.f2047i = this.j.f2048a.u;
        if (!this.m) {
            this.f2040b.a(this.j.f2048a);
            this.m = true;
        }
        if (this.j.f2049b != null) {
            this.f2042d = this.j.f2049b;
        } else if (hVar.getLength() == -1) {
            this.f2042d = new b();
        } else {
            g gVarB = this.f2039a.b();
            this.f2042d = new c(this.f2044f, hVar.getLength(), this, gVarB.f2038i + gVarB.j, gVarB.f2033d, (gVarB.f2032c & 4) != 0);
        }
        this.j = null;
        this.f2046h = 2;
        this.f2039a.d();
        return 0;
    }

    private int b(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        long jA = this.f2042d.a(hVar);
        if (jA >= 0) {
            nVar.f2349a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.l) {
            this.f2041c.a(this.f2042d.a());
            this.l = true;
        }
        if (this.k > 0 || this.f2039a.a(hVar)) {
            this.k = 0L;
            u uVarC = this.f2039a.c();
            long jA2 = a(uVarC);
            if (jA2 >= 0 && this.f2045g + jA2 >= this.f2043e) {
                long jA3 = a(this.f2045g);
                this.f2040b.a(uVarC, uVarC.c());
                this.f2040b.a(jA3, 1, uVarC.c(), 0, null);
                this.f2043e = -1L;
            }
            this.f2045g += jA2;
            return 0;
        }
        this.f2046h = 3;
        return -1;
    }

    protected long a(long j) {
        return (j * 1000000) / this.f2047i;
    }

    protected long b(long j) {
        return (this.f2047i * j) / 1000000;
    }

    protected void c(long j) {
        this.f2045g = j;
    }

    private static final class b implements h {
        @Override // c.d.a.a.e.f.h
        public long a(c.d.a.a.e.h hVar) {
            return -1L;
        }

        @Override // c.d.a.a.e.f.h
        public long c(long j) {
            return 0L;
        }

        private b() {
        }

        @Override // c.d.a.a.e.f.h
        public o a() {
            return new o.b(-9223372036854775807L);
        }
    }
}

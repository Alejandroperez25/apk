package c.d.a.a.e.b;

import c.d.a.a.e.g;
import c.d.a.a.e.h;
import c.d.a.a.e.i;
import c.d.a.a.e.j;
import c.d.a.a.e.n;
import c.d.a.a.e.o;
import c.d.a.a.m.H;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1767a = new j() { // from class: c.d.a.a.e.b.a
        @Override // c.d.a.a.e.j
        public final g[] a() {
            return c.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int f1768b = H.h("FLV");

    /* renamed from: h, reason: collision with root package name */
    private i f1774h;
    private int k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private b p;
    private f q;

    /* renamed from: c, reason: collision with root package name */
    private final u f1769c = new u(4);

    /* renamed from: d, reason: collision with root package name */
    private final u f1770d = new u(9);

    /* renamed from: e, reason: collision with root package name */
    private final u f1771e = new u(11);

    /* renamed from: f, reason: collision with root package name */
    private final u f1772f = new u();

    /* renamed from: g, reason: collision with root package name */
    private final d f1773g = new d();

    /* renamed from: i, reason: collision with root package name */
    private int f1775i = 1;
    private long j = -9223372036854775807L;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ g[] b() {
        return new g[]{new c()};
    }

    @Override // c.d.a.a.e.g
    public boolean a(h hVar) {
        hVar.a(this.f1769c.f3567a, 0, 3);
        this.f1769c.c(0);
        if (this.f1769c.l() != f1768b) {
            return false;
        }
        hVar.a(this.f1769c.f3567a, 0, 2);
        this.f1769c.c(0);
        if ((this.f1769c.i() & 250) != 0) {
            return false;
        }
        hVar.a(this.f1769c.f3567a, 0, 4);
        this.f1769c.c(0);
        int iP = this.f1769c.p();
        hVar.b();
        hVar.a(iP);
        hVar.a(this.f1769c.f3567a, 0, 4);
        this.f1769c.c(0);
        return this.f1769c.p() == 0;
    }

    @Override // c.d.a.a.e.g
    public void a(i iVar) {
        this.f1774h = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.f1775i = 1;
        this.j = -9223372036854775807L;
        this.k = 0;
    }

    @Override // c.d.a.a.e.g
    public int a(h hVar, n nVar) {
        while (true) {
            switch (this.f1775i) {
                case 1:
                    if (!b(hVar)) {
                        return -1;
                    }
                    break;
                case 2:
                    c(hVar);
                    break;
                case 3:
                    if (!d(hVar)) {
                        return -1;
                    }
                    break;
                case 4:
                    if (!e(hVar)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private boolean b(h hVar) {
        if (!hVar.a(this.f1770d.f3567a, 0, 9, true)) {
            return false;
        }
        this.f1770d.c(0);
        this.f1770d.d(4);
        int iH = this.f1770d.h();
        boolean z = (iH & 4) != 0;
        boolean z2 = (iH & 1) != 0;
        if (z && this.p == null) {
            this.p = new b(this.f1774h.a(8, 1));
        }
        if (z2 && this.q == null) {
            this.q = new f(this.f1774h.a(9, 2));
        }
        this.f1774h.a();
        this.k = (this.f1770d.p() - 9) + 4;
        this.f1775i = 2;
        return true;
    }

    private void c(h hVar) {
        hVar.c(this.k);
        this.k = 0;
        this.f1775i = 3;
    }

    private boolean d(h hVar) {
        if (!hVar.a(this.f1771e.f3567a, 0, 11, true)) {
            return false;
        }
        this.f1771e.c(0);
        this.l = this.f1771e.h();
        this.m = this.f1771e.l();
        this.n = this.f1771e.l();
        this.n = ((this.f1771e.h() << 24) | this.n) * 1000;
        this.f1771e.d(3);
        this.f1775i = 4;
        return true;
    }

    private boolean e(h hVar) {
        boolean z = true;
        if (this.l == 8 && this.p != null) {
            c();
            this.p.a(f(hVar), this.j + this.n);
        } else if (this.l == 9 && this.q != null) {
            c();
            this.q.a(f(hVar), this.j + this.n);
        } else if (this.l == 18 && !this.o) {
            this.f1773g.a(f(hVar), this.n);
            long jA = this.f1773g.a();
            if (jA != -9223372036854775807L) {
                this.f1774h.a(new o.b(jA));
                this.o = true;
            }
        } else {
            hVar.c(this.m);
            z = false;
        }
        this.k = 4;
        this.f1775i = 2;
        return z;
    }

    private u f(h hVar) {
        if (this.m > this.f1772f.e()) {
            this.f1772f.a(new byte[Math.max(this.f1772f.e() * 2, this.m)], 0);
        } else {
            this.f1772f.c(0);
        }
        this.f1772f.b(this.m);
        hVar.readFully(this.f1772f.f3567a, 0, this.m);
        return this.f1772f;
    }

    private void c() {
        if (!this.o) {
            this.f1774h.a(new o.b(-9223372036854775807L));
            this.o = true;
        }
        if (this.j == -9223372036854775807L) {
            this.j = this.f1773g.a() == -9223372036854775807L ? -this.n : 0L;
        }
    }
}

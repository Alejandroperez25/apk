package c.d.a.a.i.b;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;

/* loaded from: classes.dex */
public class i extends a {
    private static final c.d.a.a.e.n n = new c.d.a.a.e.n();
    private final int o;
    private final long p;
    private final e q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public i(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, q qVar, int i2, Object obj, long j, long j2, long j3, long j4, long j5, int i3, long j6, e eVar) {
        super(kVar, nVar, qVar, i2, obj, j, j2, j3, j4, j5);
        this.o = i3;
        this.p = j6;
        this.q = eVar;
    }

    @Override // c.d.a.a.i.b.l
    public long g() {
        return this.f2568i + this.o;
    }

    @Override // c.d.a.a.i.b.l
    public boolean h() {
        return this.t;
    }

    @Override // c.d.a.a.l.B.d
    public final void b() {
        this.s = true;
    }

    @Override // c.d.a.a.l.B.d
    public final void a() {
        c.d.a.a.l.n nVarA = this.f2526a.a(this.r);
        try {
            c.d.a.a.e.d dVar = new c.d.a.a.e.d(this.f2533h, nVarA.f3421e, this.f2533h.a(nVarA));
            if (this.r == 0) {
                c cVarI = i();
                cVarI.a(this.p);
                e eVar = this.q;
                long j = -9223372036854775807L;
                long j2 = this.j == -9223372036854775807L ? -9223372036854775807L : this.j - this.p;
                if (this.k != -9223372036854775807L) {
                    j = this.k - this.p;
                }
                eVar.a(cVarI, j2, j);
            }
            try {
                c.d.a.a.e.g gVar = this.q.f2534a;
                int iA = 0;
                while (iA == 0 && !this.s) {
                    iA = gVar.a(dVar, n);
                }
                AbstractC0170e.b(iA != 1);
                H.a((c.d.a.a.l.k) this.f2533h);
                this.t = true;
            } finally {
                this.r = dVar.c() - this.f2526a.f3421e;
            }
        } catch (Throwable th) {
            H.a((c.d.a.a.l.k) this.f2533h);
            throw th;
        }
    }
}

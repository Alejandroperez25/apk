package c.d.a.a.i.b;

import c.d.a.a.m.H;
import c.d.a.a.q;

/* loaded from: classes.dex */
public final class o extends a {
    private final int n;
    private final q o;
    private long p;
    private boolean q;

    @Override // c.d.a.a.l.B.d
    public void b() {
    }

    public o(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, q qVar, int i2, Object obj, long j, long j2, long j3, int i3, q qVar2) {
        super(kVar, nVar, qVar, i2, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i3;
        this.o = qVar2;
    }

    @Override // c.d.a.a.i.b.l
    public boolean h() {
        return this.q;
    }

    @Override // c.d.a.a.l.B.d
    public void a() {
        try {
            long jA = this.f2533h.a(this.f2526a.a(this.p));
            if (jA != -1) {
                jA += this.p;
            }
            c.d.a.a.e.d dVar = new c.d.a.a.e.d(this.f2533h, this.p, jA);
            c cVarI = i();
            cVarI.a(0L);
            c.d.a.a.e.q qVarA = cVarI.a(0, this.n);
            qVarA.a(this.o);
            for (int iA = 0; iA != -1; iA = qVarA.a(dVar, Integer.MAX_VALUE, true)) {
                this.p += iA;
            }
            qVarA.a(this.f2531f, 1, (int) this.p, 0, null);
            H.a((c.d.a.a.l.k) this.f2533h);
            this.q = true;
        } catch (Throwable th) {
            H.a((c.d.a.a.l.k) this.f2533h);
            throw th;
        }
    }
}

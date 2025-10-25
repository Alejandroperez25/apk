package c.d.a.a.i.b;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: i, reason: collision with root package name */
    private static final c.d.a.a.e.n f2567i = new c.d.a.a.e.n();
    private final e j;
    private long k;
    private volatile boolean l;

    public k(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, q qVar, int i2, Object obj, e eVar) {
        super(kVar, nVar, 2, qVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = eVar;
    }

    @Override // c.d.a.a.l.B.d
    public void b() {
        this.l = true;
    }

    @Override // c.d.a.a.l.B.d
    public void a() {
        c.d.a.a.l.n nVarA = this.f2526a.a(this.k);
        try {
            c.d.a.a.e.d dVar = new c.d.a.a.e.d(this.f2533h, nVarA.f3421e, this.f2533h.a(nVarA));
            if (this.k == 0) {
                this.j.a(null, -9223372036854775807L, -9223372036854775807L);
            }
            try {
                c.d.a.a.e.g gVar = this.j.f2534a;
                int iA = 0;
                while (iA == 0 && !this.l) {
                    iA = gVar.a(dVar, f2567i);
                }
                boolean z = true;
                if (iA == 1) {
                    z = false;
                }
                AbstractC0170e.b(z);
            } finally {
                this.k = dVar.c() - this.f2526a.f3421e;
            }
        } finally {
            H.a((c.d.a.a.l.k) this.f2533h);
        }
    }
}

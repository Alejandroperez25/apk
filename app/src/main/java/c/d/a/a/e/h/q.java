package c.d.a.a.e.h;

import c.d.a.a.e.h.G;

/* loaded from: classes.dex */
public final class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.u f2254a = new c.d.a.a.m.u(10);

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.a.e.q f2255b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2256c;

    /* renamed from: d, reason: collision with root package name */
    private long f2257d;

    /* renamed from: e, reason: collision with root package name */
    private int f2258e;

    /* renamed from: f, reason: collision with root package name */
    private int f2259f;

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2256c = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2255b = iVar.a(dVar.b(), 4);
        this.f2255b.a(c.d.a.a.q.a(dVar.c(), "application/id3", (String) null, -1, (c.d.a.a.d.f) null));
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f2256c = true;
        this.f2257d = j;
        this.f2258e = 0;
        this.f2259f = 0;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        if (this.f2256c) {
            int iB = uVar.b();
            if (this.f2259f < 10) {
                int iMin = Math.min(iB, 10 - this.f2259f);
                System.arraycopy(uVar.f3567a, uVar.d(), this.f2254a.f3567a, this.f2259f, iMin);
                if (this.f2259f + iMin == 10) {
                    this.f2254a.c(0);
                    if (73 != this.f2254a.h() || 68 != this.f2254a.h() || 51 != this.f2254a.h()) {
                        c.d.a.a.m.o.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f2256c = false;
                        return;
                    } else {
                        this.f2254a.d(3);
                        this.f2258e = this.f2254a.u() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iB, this.f2258e - this.f2259f);
            this.f2255b.a(uVar, iMin2);
            this.f2259f += iMin2;
        }
    }

    @Override // c.d.a.a.e.h.l
    public void b() {
        if (this.f2256c && this.f2258e != 0 && this.f2259f == this.f2258e) {
            this.f2255b.a(this.f2257d, 1, this.f2258e, 0, null);
            this.f2256c = false;
        }
    }
}

package c.d.a.a.e.h;

import c.d.a.a.e.h.G;

/* loaded from: classes.dex */
public final class A implements G {

    /* renamed from: a, reason: collision with root package name */
    private final z f2089a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.u f2090b = new c.d.a.a.m.u(32);

    /* renamed from: c, reason: collision with root package name */
    private int f2091c;

    /* renamed from: d, reason: collision with root package name */
    private int f2092d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2093e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2094f;

    public A(z zVar) {
        this.f2089a = zVar;
    }

    @Override // c.d.a.a.e.h.G
    public void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, G.d dVar) {
        this.f2089a.a(e2, iVar, dVar);
        this.f2094f = true;
    }

    @Override // c.d.a.a.e.h.G
    public void a() {
        this.f2094f = true;
    }

    @Override // c.d.a.a.e.h.G
    public void a(c.d.a.a.m.u uVar, int i2) {
        boolean z = (i2 & 1) != 0;
        int iH = z ? uVar.h() + uVar.d() : -1;
        if (this.f2094f) {
            if (!z) {
                return;
            }
            this.f2094f = false;
            uVar.c(iH);
            this.f2092d = 0;
        }
        while (uVar.b() > 0) {
            if (this.f2092d < 3) {
                if (this.f2092d == 0) {
                    int iH2 = uVar.h();
                    uVar.c(uVar.d() - 1);
                    if (iH2 == 255) {
                        this.f2094f = true;
                        return;
                    }
                }
                int iMin = Math.min(uVar.b(), 3 - this.f2092d);
                uVar.a(this.f2090b.f3567a, this.f2092d, iMin);
                this.f2092d += iMin;
                if (this.f2092d == 3) {
                    this.f2090b.a(3);
                    this.f2090b.d(1);
                    int iH3 = this.f2090b.h();
                    int iH4 = this.f2090b.h();
                    this.f2093e = (iH3 & 128) != 0;
                    this.f2091c = (((iH3 & 15) << 8) | iH4) + 3;
                    if (this.f2090b.e() < this.f2091c) {
                        byte[] bArr = this.f2090b.f3567a;
                        this.f2090b.a(Math.min(4098, Math.max(this.f2091c, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f2090b.f3567a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(uVar.b(), this.f2091c - this.f2092d);
                uVar.a(this.f2090b.f3567a, this.f2092d, iMin2);
                this.f2092d += iMin2;
                if (this.f2092d != this.f2091c) {
                    continue;
                } else {
                    if (this.f2093e) {
                        if (c.d.a.a.m.H.a(this.f2090b.f3567a, 0, this.f2091c, -1) != 0) {
                            this.f2094f = true;
                            return;
                        }
                        this.f2090b.a(this.f2091c - 4);
                    } else {
                        this.f2090b.a(this.f2091c);
                    }
                    this.f2089a.a(this.f2090b);
                    this.f2092d = 0;
                }
            }
        }
    }
}

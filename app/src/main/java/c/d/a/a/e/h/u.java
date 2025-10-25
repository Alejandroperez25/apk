package c.d.a.a.e.h;

import c.d.a.a.e.h.G;

/* loaded from: classes.dex */
public final class u implements G {

    /* renamed from: a, reason: collision with root package name */
    private final l f2283a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.t f2284b = new c.d.a.a.m.t(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f2285c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f2286d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.m.E f2287e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2288f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2289g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2290h;

    /* renamed from: i, reason: collision with root package name */
    private int f2291i;
    private int j;
    private boolean k;
    private long l;

    public u(l lVar) {
        this.f2283a = lVar;
    }

    @Override // c.d.a.a.e.h.G
    public void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, G.d dVar) {
        this.f2287e = e2;
        this.f2283a.a(iVar, dVar);
    }

    @Override // c.d.a.a.e.h.G
    public final void a() {
        this.f2285c = 0;
        this.f2286d = 0;
        this.f2290h = false;
        this.f2283a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // c.d.a.a.e.h.G
    public final void a(c.d.a.a.m.u uVar, int i2) {
        if ((i2 & 1) != 0) {
            switch (this.f2285c) {
                case 0:
                case 1:
                    a(1);
                    break;
                case 2:
                    c.d.a.a.m.o.c("PesReader", "Unexpected start indicator reading extended header");
                    a(1);
                    break;
                case 3:
                    if (this.j != -1) {
                        c.d.a.a.m.o.c("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.f2283a.b();
                    a(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (uVar.b() > 0) {
            switch (this.f2285c) {
                case 0:
                    uVar.d(uVar.b());
                    break;
                case 1:
                    if (!a(uVar, this.f2284b.f3563a, 9)) {
                        break;
                    } else {
                        a(b() ? 2 : 0);
                        break;
                    }
                case 2:
                    if (!a(uVar, this.f2284b.f3563a, Math.min(10, this.f2291i)) || !a(uVar, (byte[]) null, this.f2291i)) {
                        break;
                    } else {
                        c();
                        i2 |= this.k ? 4 : 0;
                        this.f2283a.a(this.l, i2);
                        a(3);
                        break;
                    }
                    break;
                case 3:
                    int iB = uVar.b();
                    int i3 = this.j != -1 ? iB - this.j : 0;
                    if (i3 > 0) {
                        iB -= i3;
                        uVar.b(uVar.d() + iB);
                    }
                    this.f2283a.a(uVar);
                    if (this.j == -1) {
                        break;
                    } else {
                        this.j -= iB;
                        if (this.j != 0) {
                            break;
                        } else {
                            this.f2283a.b();
                            a(1);
                            break;
                        }
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private void a(int i2) {
        this.f2285c = i2;
        this.f2286d = 0;
    }

    private boolean a(c.d.a.a.m.u uVar, byte[] bArr, int i2) {
        int iMin = Math.min(uVar.b(), i2 - this.f2286d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.d(iMin);
        } else {
            uVar.a(bArr, this.f2286d, iMin);
        }
        this.f2286d += iMin;
        return this.f2286d == i2;
    }

    private boolean b() {
        this.f2284b.a(0);
        int iC = this.f2284b.c(24);
        if (iC != 1) {
            c.d.a.a.m.o.c("PesReader", "Unexpected start code prefix: " + iC);
            this.j = -1;
            return false;
        }
        this.f2284b.b(8);
        int iC2 = this.f2284b.c(16);
        this.f2284b.b(5);
        this.k = this.f2284b.e();
        this.f2284b.b(2);
        this.f2288f = this.f2284b.e();
        this.f2289g = this.f2284b.e();
        this.f2284b.b(6);
        this.f2291i = this.f2284b.c(8);
        if (iC2 == 0) {
            this.j = -1;
        } else {
            this.j = ((iC2 + 6) - 9) - this.f2291i;
        }
        return true;
    }

    private void c() {
        this.f2284b.a(0);
        this.l = -9223372036854775807L;
        if (this.f2288f) {
            this.f2284b.b(4);
            this.f2284b.b(1);
            this.f2284b.b(1);
            long jC = (this.f2284b.c(3) << 30) | (this.f2284b.c(15) << 15) | this.f2284b.c(15);
            this.f2284b.b(1);
            if (!this.f2290h && this.f2289g) {
                this.f2284b.b(4);
                this.f2284b.b(1);
                this.f2284b.b(1);
                this.f2284b.b(1);
                this.f2287e.d((this.f2284b.c(3) << 30) | (this.f2284b.c(15) << 15) | this.f2284b.c(15));
                this.f2290h = true;
            }
            this.l = this.f2287e.d(jC);
        }
    }
}

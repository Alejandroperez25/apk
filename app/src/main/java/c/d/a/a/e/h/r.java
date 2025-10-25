package c.d.a.a.e.h;

import android.util.Pair;
import c.d.a.a.e.h.G;
import c.d.a.a.m.AbstractC0172g;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f2260a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.u f2261b = new c.d.a.a.m.u(1024);

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.m.t f2262c = new c.d.a.a.m.t(this.f2261b.f3567a);

    /* renamed from: d, reason: collision with root package name */
    private c.d.a.a.e.q f2263d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.q f2264e;

    /* renamed from: f, reason: collision with root package name */
    private String f2265f;

    /* renamed from: g, reason: collision with root package name */
    private int f2266g;

    /* renamed from: h, reason: collision with root package name */
    private int f2267h;

    /* renamed from: i, reason: collision with root package name */
    private int f2268i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public r(String str) {
        this.f2260a = str;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2266g = 0;
        this.l = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2263d = iVar.a(dVar.b(), 1);
        this.f2265f = dVar.c();
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.k = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) throws c.d.a.a.x {
        while (uVar.b() > 0) {
            switch (this.f2266g) {
                case 0:
                    if (uVar.h() != 86) {
                        break;
                    } else {
                        this.f2266g = 1;
                        break;
                    }
                case 1:
                    int iH = uVar.h();
                    if ((iH & 224) != 224) {
                        if (iH == 86) {
                            break;
                        } else {
                            this.f2266g = 0;
                            break;
                        }
                    } else {
                        this.j = iH;
                        this.f2266g = 2;
                        break;
                    }
                case 2:
                    this.f2268i = ((this.j & (-225)) << 8) | uVar.h();
                    if (this.f2268i > this.f2261b.f3567a.length) {
                        a(this.f2268i);
                    }
                    this.f2267h = 0;
                    this.f2266g = 3;
                    break;
                case 3:
                    int iMin = Math.min(uVar.b(), this.f2268i - this.f2267h);
                    uVar.a(this.f2262c.f3563a, this.f2267h, iMin);
                    this.f2267h += iMin;
                    if (this.f2267h != this.f2268i) {
                        break;
                    } else {
                        this.f2262c.a(0);
                        a(this.f2262c);
                        this.f2266g = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private void a(c.d.a.a.m.t tVar) throws c.d.a.a.x {
        if (!tVar.e()) {
            this.l = true;
            b(tVar);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.n != 0) {
                throw new c.d.a.a.x();
            }
            a(tVar, e(tVar));
            if (this.p) {
                tVar.b((int) this.q);
                return;
            }
            return;
        }
        throw new c.d.a.a.x();
    }

    private void b(c.d.a.a.m.t tVar) throws c.d.a.a.x {
        boolean zE;
        int iC = tVar.c(1);
        this.m = iC == 1 ? tVar.c(1) : 0;
        if (this.m == 0) {
            if (iC == 1) {
                f(tVar);
            }
            if (!tVar.e()) {
                throw new c.d.a.a.x();
            }
            this.n = tVar.c(6);
            int iC2 = tVar.c(4);
            int iC3 = tVar.c(3);
            if (iC2 != 0 || iC3 != 0) {
                throw new c.d.a.a.x();
            }
            if (iC == 0) {
                int iB = tVar.b();
                int iD = d(tVar);
                tVar.a(iB);
                byte[] bArr = new byte[(iD + 7) / 8];
                tVar.a(bArr, 0, iD);
                c.d.a.a.q qVarA = c.d.a.a.q.a(this.f2265f, "audio/mp4a-latm", (String) null, -1, -1, this.t, this.r, (List<byte[]>) Collections.singletonList(bArr), (c.d.a.a.d.f) null, 0, this.f2260a);
                if (!qVarA.equals(this.f2264e)) {
                    this.f2264e = qVarA;
                    this.s = 1024000000 / qVarA.u;
                    this.f2263d.a(qVarA);
                }
            } else {
                tVar.b(((int) f(tVar)) - d(tVar));
            }
            c(tVar);
            this.p = tVar.e();
            this.q = 0L;
            if (this.p) {
                if (iC == 1) {
                    this.q = f(tVar);
                } else {
                    do {
                        zE = tVar.e();
                        this.q = (this.q << 8) + tVar.c(8);
                    } while (zE);
                }
            }
            if (tVar.e()) {
                tVar.b(8);
                return;
            }
            return;
        }
        throw new c.d.a.a.x();
    }

    private void c(c.d.a.a.m.t tVar) {
        this.o = tVar.c(3);
        switch (this.o) {
            case 0:
                tVar.b(8);
                return;
            case 1:
                tVar.b(9);
                return;
            case 2:
            default:
                throw new IllegalStateException();
            case 3:
            case 4:
            case 5:
                tVar.b(6);
                return;
            case 6:
            case 7:
                tVar.b(1);
                return;
        }
    }

    private int d(c.d.a.a.m.t tVar) throws c.d.a.a.x {
        int iA = tVar.a();
        Pair<Integer, Integer> pairA = AbstractC0172g.a(tVar, true);
        this.r = ((Integer) pairA.first).intValue();
        this.t = ((Integer) pairA.second).intValue();
        return iA - tVar.a();
    }

    private int e(c.d.a.a.m.t tVar) throws c.d.a.a.x {
        int iC;
        if (this.o != 0) {
            throw new c.d.a.a.x();
        }
        int i2 = 0;
        do {
            iC = tVar.c(8);
            i2 += iC;
        } while (iC == 255);
        return i2;
    }

    private void a(c.d.a.a.m.t tVar, int i2) {
        int iB = tVar.b();
        if ((iB & 7) == 0) {
            this.f2261b.c(iB >> 3);
        } else {
            tVar.a(this.f2261b.f3567a, 0, i2 * 8);
            this.f2261b.c(0);
        }
        this.f2263d.a(this.f2261b, i2);
        this.f2263d.a(this.k, 1, i2, 0, null);
        this.k += this.s;
    }

    private void a(int i2) {
        this.f2261b.a(i2);
        this.f2262c.a(this.f2261b.f3567a);
    }

    private static long f(c.d.a.a.m.t tVar) {
        return tVar.c((tVar.c(2) + 1) * 8);
    }
}

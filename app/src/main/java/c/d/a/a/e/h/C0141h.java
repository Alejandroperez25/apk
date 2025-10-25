package c.d.a.a.e.h;

import android.util.Pair;
import c.d.a.a.e.h.G;
import c.d.a.a.m.AbstractC0172g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: c.d.a.a.e.h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141h implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f2169a = {73, 68, 51};

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2170b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.m.t f2171c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.a.a.m.u f2172d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2173e;

    /* renamed from: f, reason: collision with root package name */
    private String f2174f;

    /* renamed from: g, reason: collision with root package name */
    private c.d.a.a.e.q f2175g;

    /* renamed from: h, reason: collision with root package name */
    private c.d.a.a.e.q f2176h;

    /* renamed from: i, reason: collision with root package name */
    private int f2177i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private c.d.a.a.e.q u;
    private long v;

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public C0141h(boolean z) {
        this(z, null);
    }

    public C0141h(boolean z, String str) {
        this.f2171c = new c.d.a.a.m.t(new byte[7]);
        this.f2172d = new c.d.a.a.m.u(Arrays.copyOf(f2169a, 10));
        e();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.f2170b = z;
        this.f2173e = str;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        d();
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2174f = dVar.c();
        this.f2175g = iVar.a(dVar.b(), 1);
        if (this.f2170b) {
            dVar.a();
            this.f2176h = iVar.a(dVar.b(), 4);
            this.f2176h.a(c.d.a.a.q.a(dVar.c(), "application/id3", (String) null, -1, (c.d.a.a.d.f) null));
            return;
        }
        this.f2176h = new c.d.a.a.e.f();
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.t = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            switch (this.f2177i) {
                case 0:
                    b(uVar);
                    break;
                case 1:
                    c(uVar);
                    break;
                case 2:
                    if (!a(uVar, this.f2172d.f3567a, 10)) {
                        break;
                    } else {
                        i();
                        break;
                    }
                case 3:
                    if (!a(uVar, this.f2171c.f3563a, this.l ? 7 : 5)) {
                        break;
                    } else {
                        j();
                        break;
                    }
                case 4:
                    d(uVar);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public long c() {
        return this.r;
    }

    private void d() {
        this.m = false;
        e();
    }

    private boolean a(c.d.a.a.m.u uVar, byte[] bArr, int i2) {
        int iMin = Math.min(uVar.b(), i2 - this.j);
        uVar.a(bArr, this.j, iMin);
        this.j += iMin;
        return this.j == i2;
    }

    private void e() {
        this.f2177i = 0;
        this.j = 0;
        this.k = 256;
    }

    private void f() {
        this.f2177i = 2;
        this.j = f2169a.length;
        this.s = 0;
        this.f2172d.c(0);
    }

    private void a(c.d.a.a.e.q qVar, long j, int i2, int i3) {
        this.f2177i = 4;
        this.j = i2;
        this.u = qVar;
        this.v = j;
        this.s = i3;
    }

    private void g() {
        this.f2177i = 3;
        this.j = 0;
    }

    private void h() {
        this.f2177i = 1;
        this.j = 0;
    }

    private void b(c.d.a.a.m.u uVar) {
        byte[] bArr = uVar.f3567a;
        int iD = uVar.d();
        int iC = uVar.c();
        while (iD < iC) {
            int i2 = iD + 1;
            int i3 = bArr[iD] & 255;
            if (this.k == 512 && a((byte) -1, (byte) i3) && (this.m || a(uVar, i2 - 2))) {
                this.p = (i3 & 8) >> 3;
                this.l = (i3 & 1) == 0;
                if (!this.m) {
                    h();
                } else {
                    g();
                }
                uVar.c(i2);
                return;
            }
            int i4 = i3 | this.k;
            if (i4 == 329) {
                this.k = 768;
            } else if (i4 == 511) {
                this.k = 512;
            } else if (i4 == 836) {
                this.k = 1024;
            } else if (i4 == 1075) {
                f();
                uVar.c(i2);
                return;
            } else if (this.k != 256) {
                this.k = 256;
                i2--;
            }
            iD = i2;
        }
        uVar.c(iD);
    }

    private void c(c.d.a.a.m.u uVar) {
        if (uVar.b() == 0) {
            return;
        }
        this.f2171c.f3563a[0] = uVar.f3567a[uVar.d()];
        this.f2171c.a(2);
        int iC = this.f2171c.c(4);
        if (this.o != -1 && iC != this.o) {
            d();
            return;
        }
        if (!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = iC;
        }
        g();
    }

    private boolean a(c.d.a.a.m.u uVar, int i2) {
        uVar.c(i2 + 1);
        if (!b(uVar, this.f2171c.f3563a, 1)) {
            return false;
        }
        this.f2171c.a(4);
        int iC = this.f2171c.c(1);
        if (this.n != -1 && iC != this.n) {
            return false;
        }
        if (this.o != -1) {
            if (!b(uVar, this.f2171c.f3563a, 1)) {
                return true;
            }
            this.f2171c.a(2);
            if (this.f2171c.c(4) != this.o) {
                return false;
            }
            uVar.c(i2 + 2);
        }
        if (!b(uVar, this.f2171c.f3563a, 4)) {
            return true;
        }
        this.f2171c.a(14);
        int iC2 = this.f2171c.c(13);
        if (iC2 <= 6) {
            return false;
        }
        int i3 = i2 + iC2;
        int i4 = i3 + 1;
        if (i4 >= uVar.c()) {
            return true;
        }
        return a(uVar.f3567a[i3], uVar.f3567a[i4]) && (this.n == -1 || ((uVar.f3567a[i4] & 8) >> 3) == iC);
    }

    private boolean a(byte b2, byte b3) {
        return a(((b2 & 255) << 8) | (b3 & 255));
    }

    private boolean b(c.d.a.a.m.u uVar, byte[] bArr, int i2) {
        if (uVar.b() < i2) {
            return false;
        }
        uVar.a(bArr, 0, i2);
        return true;
    }

    private void i() {
        this.f2176h.a(this.f2172d, 10);
        this.f2172d.c(6);
        a(this.f2176h, 0L, 10, this.f2172d.u() + 10);
    }

    private void j() {
        this.f2171c.a(0);
        if (!this.q) {
            int iC = this.f2171c.c(2) + 1;
            if (iC != 2) {
                c.d.a.a.m.o.c("AdtsReader", "Detected audio object type: " + iC + ", but assuming AAC LC.");
                iC = 2;
            }
            this.f2171c.b(5);
            byte[] bArrA = AbstractC0172g.a(iC, this.o, this.f2171c.c(3));
            Pair<Integer, Integer> pairA = AbstractC0172g.a(bArrA);
            c.d.a.a.q qVarA = c.d.a.a.q.a(this.f2174f, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), (List<byte[]>) Collections.singletonList(bArrA), (c.d.a.a.d.f) null, 0, this.f2173e);
            this.r = 1024000000 / qVarA.u;
            this.f2175g.a(qVarA);
            this.q = true;
        } else {
            this.f2171c.b(10);
        }
        this.f2171c.b(4);
        int iC2 = (this.f2171c.c(13) - 2) - 5;
        if (this.l) {
            iC2 -= 2;
        }
        a(this.f2175g, this.r, 0, iC2);
    }

    private void d(c.d.a.a.m.u uVar) {
        int iMin = Math.min(uVar.b(), this.s - this.j);
        this.u.a(uVar, iMin);
        this.j += iMin;
        if (this.j == this.s) {
            this.u.a(this.t, 1, this.s, 0, null);
            this.t += this.v;
            e();
        }
    }
}

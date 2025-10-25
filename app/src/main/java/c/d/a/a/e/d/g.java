package c.d.a.a.e.d;

import c.d.a.a.e.d.e;
import c.d.a.a.e.m;
import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
final class g implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f1855a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1856b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1857c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1858d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1859e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f1860f;

    public static g a(long j, long j2, m mVar, u uVar) {
        int iV;
        int i2 = mVar.n;
        int i3 = mVar.k;
        int iP = uVar.p();
        if ((iP & 1) != 1 || (iV = uVar.v()) == 0) {
            return null;
        }
        long jD = H.d(iV, i2 * 1000000, i3);
        if ((iP & 6) != 6) {
            return new g(j2, mVar.j, jD);
        }
        long jV = uVar.v();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = uVar.h();
        }
        if (j != -1) {
            long j3 = j2 + jV;
            if (j != j3) {
                o.c("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new g(j2, mVar.j, jD, jV, jArr);
    }

    private g(long j, int i2, long j2) {
        this(j, i2, j2, -1L, null);
    }

    private g(long j, int i2, long j2, long j3, long[] jArr) {
        this.f1855a = j;
        this.f1856b = i2;
        this.f1857c = j2;
        this.f1860f = jArr;
        this.f1858d = j3;
        this.f1859e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // c.d.a.a.e.o
    public boolean c() {
        return this.f1860f != null;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        if (!c()) {
            return new o.a(new p(0L, this.f1855a + this.f1856b));
        }
        long jA = H.a(j, 0L, this.f1857c);
        double d2 = (jA * 100.0d) / this.f1857c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i2 = (int) d2;
                long[] jArr = this.f1860f;
                AbstractC0170e.a(jArr);
                double d4 = jArr[i2];
                d3 = d4 + ((d2 - i2) * ((i2 == 99 ? 256.0d : r3[i2 + 1]) - d4));
            }
        }
        return new o.a(new p(jA, this.f1855a + H.a(Math.round((d3 / 256.0d) * this.f1858d), this.f1856b, this.f1858d - 1)));
    }

    @Override // c.d.a.a.e.d.e.a
    public long a(long j) {
        long j2 = j - this.f1855a;
        if (!c() || j2 <= this.f1856b) {
            return 0L;
        }
        long[] jArr = this.f1860f;
        AbstractC0170e.a(jArr);
        long[] jArr2 = jArr;
        double d2 = (j2 * 256.0d) / this.f1858d;
        int iA = H.a(jArr2, (long) d2, true, true);
        long jA = a(iA);
        long j3 = jArr2[iA];
        int i2 = iA + 1;
        long jA2 = a(i2);
        return jA + Math.round((j3 == (iA == 99 ? 256L : jArr2[i2]) ? 0.0d : (d2 - j3) / (r0 - j3)) * (jA2 - jA));
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.f1857c;
    }

    @Override // c.d.a.a.e.d.e.a
    public long b() {
        return this.f1859e;
    }

    private long a(int i2) {
        return (this.f1857c * i2) / 100;
    }
}

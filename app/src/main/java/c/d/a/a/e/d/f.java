package c.d.a.a.e.d;

import c.d.a.a.e.d.e;
import c.d.a.a.e.m;
import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
final class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f1851a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f1852b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1853c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1854d;

    @Override // c.d.a.a.e.o
    public boolean c() {
        return true;
    }

    public static f a(long j, long j2, m mVar, u uVar) {
        int iH;
        uVar.d(10);
        int iP = uVar.p();
        if (iP <= 0) {
            return null;
        }
        int i2 = mVar.k;
        long jD = H.d(iP, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int i3 = uVar.i();
        int i4 = uVar.i();
        int i5 = uVar.i();
        uVar.d(2);
        long j3 = j2 + mVar.j;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i6 = 0;
        long j4 = j2;
        while (i6 < i3) {
            int i7 = i4;
            jArr[i6] = (i6 * jD) / i3;
            jArr2[i6] = Math.max(j4, j3);
            switch (i5) {
                case 1:
                    iH = uVar.h();
                    break;
                case 2:
                    iH = uVar.i();
                    break;
                case 3:
                    iH = uVar.l();
                    break;
                case 4:
                    iH = uVar.v();
                    break;
                default:
                    return null;
            }
            j4 += iH * i7;
            i6++;
            i4 = i7;
        }
        if (j != -1 && j != j4) {
            o.c("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new f(jArr, jArr2, jD, j4);
    }

    private f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f1851a = jArr;
        this.f1852b = jArr2;
        this.f1853c = j;
        this.f1854d = j2;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        int iA = H.a(this.f1851a, j, true, true);
        p pVar = new p(this.f1851a[iA], this.f1852b[iA]);
        if (pVar.f2355b >= j || iA == this.f1851a.length - 1) {
            return new o.a(pVar);
        }
        int i2 = iA + 1;
        return new o.a(pVar, new p(this.f1851a[i2], this.f1852b[i2]));
    }

    @Override // c.d.a.a.e.d.e.a
    public long a(long j) {
        return this.f1851a[H.a(this.f1852b, j, true, true)];
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.f1853c;
    }

    @Override // c.d.a.a.e.d.e.a
    public long b() {
        return this.f1854d;
    }
}

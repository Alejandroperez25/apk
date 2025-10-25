package c.d.a.a.e.e;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1998b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f1999c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2001e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2002f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2003g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2004h;

    public r(o oVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
        AbstractC0170e.a(iArr.length == jArr2.length);
        AbstractC0170e.a(jArr.length == jArr2.length);
        AbstractC0170e.a(iArr2.length == jArr2.length);
        this.f1997a = oVar;
        this.f1999c = jArr;
        this.f2000d = iArr;
        this.f2001e = i2;
        this.f2002f = jArr2;
        this.f2003g = iArr2;
        this.f2004h = j;
        this.f1998b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int iA = H.a(this.f2002f, j, true, false); iA >= 0; iA--) {
            if ((this.f2003g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iB = H.b(this.f2002f, j, true, false); iB < this.f2002f.length; iB++) {
            if ((this.f2003g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}

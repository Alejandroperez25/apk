package c.d.a.a.e.d;

import android.util.Pair;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.e.d.e;
import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.g.b.s;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
final class d implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f1839a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f1840b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1841c;

    @Override // c.d.a.a.e.d.e.a
    public long b() {
        return -1L;
    }

    @Override // c.d.a.a.e.o
    public boolean c() {
        return true;
    }

    public static d a(long j, s sVar) {
        int length = sVar.f2443d.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j += sVar.f2441b + sVar.f2443d[i4];
            j2 += sVar.f2442c + sVar.f2444e[i4];
            jArr[i3] = j;
            jArr2[i3] = j2;
        }
        return new d(jArr, jArr2);
    }

    private d(long[] jArr, long[] jArr2) {
        this.f1839a = jArr;
        this.f1840b = jArr2;
        this.f1841c = AbstractC0132d.b(jArr2[jArr2.length - 1]);
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        Pair<Long, Long> pairA = a(AbstractC0132d.a(H.a(j, 0L, this.f1841c)), this.f1840b, this.f1839a);
        return new o.a(new p(AbstractC0132d.b(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // c.d.a.a.e.d.e.a
    public long a(long j) {
        return AbstractC0132d.b(((Long) a(j, this.f1839a, this.f1840b).second).longValue());
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.f1841c;
    }

    private static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int iA = H.a(jArr, j, true, true);
        long j2 = jArr[iA];
        long j3 = jArr2[iA];
        int i2 = iA + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i2] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i2] - j3))) + j3));
    }
}

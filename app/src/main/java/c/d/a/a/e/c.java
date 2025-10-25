package c.d.a.a.e;

import c.d.a.a.e.o;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public class c implements o {

    /* renamed from: a, reason: collision with root package name */
    private final long f1783a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1784b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1785c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1786d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1787e;

    /* renamed from: f, reason: collision with root package name */
    private final long f1788f;

    public c(long j, long j2, int i2, int i3) {
        this.f1783a = j;
        this.f1784b = j2;
        this.f1785c = i3 == -1 ? 1 : i3;
        this.f1787e = i2;
        if (j == -1) {
            this.f1786d = -1L;
            this.f1788f = -9223372036854775807L;
        } else {
            this.f1786d = j - j2;
            this.f1788f = a(j, j2, i2);
        }
    }

    @Override // c.d.a.a.e.o
    public boolean c() {
        return this.f1786d != -1;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        if (this.f1786d == -1) {
            return new o.a(new p(0L, this.f1784b));
        }
        long jD = d(j);
        long jC = c(jD);
        p pVar = new p(jC, jD);
        if (jC >= j || this.f1785c + jD >= this.f1783a) {
            return new o.a(pVar);
        }
        long j2 = jD + this.f1785c;
        return new o.a(pVar, new p(c(j2), j2));
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.f1788f;
    }

    public long c(long j) {
        return a(j, this.f1784b, this.f1787e);
    }

    private static long a(long j, long j2, int i2) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i2;
    }

    private long d(long j) {
        return this.f1784b + H.a((((j * this.f1787e) / 8000000) / this.f1785c) * this.f1785c, 0L, this.f1786d - this.f1785c);
    }
}

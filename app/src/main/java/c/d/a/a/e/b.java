package c.d.a.a.e;

import c.d.a.a.e.o;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1756a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1757b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f1758c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f1759d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f1760e;

    /* renamed from: f, reason: collision with root package name */
    private final long f1761f;

    @Override // c.d.a.a.e.o
    public boolean c() {
        return true;
    }

    public b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f1757b = iArr;
        this.f1758c = jArr;
        this.f1759d = jArr2;
        this.f1760e = jArr3;
        this.f1756a = iArr.length;
        if (this.f1756a > 0) {
            this.f1761f = jArr2[this.f1756a - 1] + jArr3[this.f1756a - 1];
        } else {
            this.f1761f = 0L;
        }
    }

    public int c(long j) {
        return H.a(this.f1760e, j, true, true);
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.f1761f;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        int iC = c(j);
        p pVar = new p(this.f1760e[iC], this.f1758c[iC]);
        if (pVar.f2355b >= j || iC == this.f1756a - 1) {
            return new o.a(pVar);
        }
        int i2 = iC + 1;
        return new o.a(pVar, new p(this.f1760e[i2], this.f1758c[i2]));
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f1756a + ", sizes=" + Arrays.toString(this.f1757b) + ", offsets=" + Arrays.toString(this.f1758c) + ", timeUs=" + Arrays.toString(this.f1760e) + ", durationsUs=" + Arrays.toString(this.f1759d) + ")";
    }
}

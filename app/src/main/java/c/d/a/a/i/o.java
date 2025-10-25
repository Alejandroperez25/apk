package c.d.a.a.i;

/* loaded from: classes.dex */
public class o implements B {

    /* renamed from: a, reason: collision with root package name */
    protected final B[] f2985a;

    public o(B[] bArr) {
        this.f2985a = bArr;
    }

    @Override // c.d.a.a.i.B
    public final long g() {
        long jMin = Long.MAX_VALUE;
        for (B b2 : this.f2985a) {
            long jG = b2.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // c.d.a.a.i.B
    public final long b() {
        long jMin = Long.MAX_VALUE;
        for (B b2 : this.f2985a) {
            long jB = b2.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // c.d.a.a.i.B
    public final void c(long j) {
        for (B b2 : this.f2985a) {
            b2.c(j);
        }
    }

    @Override // c.d.a.a.i.B
    public boolean b(long j) {
        boolean zB;
        boolean z = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                break;
            }
            zB = false;
            for (B b2 : this.f2985a) {
                long jB2 = b2.b();
                boolean z2 = jB2 != Long.MIN_VALUE && jB2 <= j;
                if (jB2 == jB || z2) {
                    zB |= b2.b(j);
                }
            }
            z |= zB;
        } while (zB);
        return z;
    }
}

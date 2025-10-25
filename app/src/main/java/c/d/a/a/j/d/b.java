package c.d.a.a.j.d;

import c.d.a.a.j.d;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.j.a[] f3189a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f3190b;

    public b(c.d.a.a.j.a[] aVarArr, long[] jArr) {
        this.f3189a = aVarArr;
        this.f3190b = jArr;
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        int iB = H.b(this.f3190b, j, false, false);
        if (iB < this.f3190b.length) {
            return iB;
        }
        return -1;
    }

    @Override // c.d.a.a.j.d
    public int a() {
        return this.f3190b.length;
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        AbstractC0170e.a(i2 >= 0);
        AbstractC0170e.a(i2 < this.f3190b.length);
        return this.f3190b[i2];
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        int iA = H.a(this.f3190b, j, true, false);
        if (iA == -1 || this.f3189a[iA] == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.f3189a[iA]);
    }
}

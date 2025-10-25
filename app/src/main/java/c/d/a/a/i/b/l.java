package c.d.a.a.i.b;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.q;

/* loaded from: classes.dex */
public abstract class l extends d {

    /* renamed from: i, reason: collision with root package name */
    public final long f2568i;

    public abstract boolean h();

    public l(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, q qVar, int i2, Object obj, long j, long j2, long j3) {
        super(kVar, nVar, 1, qVar, i2, obj, j, j2);
        AbstractC0170e.a(qVar);
        this.f2568i = j3;
    }

    public long g() {
        if (this.f2568i != -1) {
            return 1 + this.f2568i;
        }
        return -1L;
    }
}

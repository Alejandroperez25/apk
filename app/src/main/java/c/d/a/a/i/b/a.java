package c.d.a.a.i.b;

import c.d.a.a.q;

/* loaded from: classes.dex */
public abstract class a extends l {
    public final long j;
    public final long k;
    private c l;
    private int[] m;

    public a(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, q qVar, int i2, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(kVar, nVar, qVar, i2, obj, j, j2, j5);
        this.j = j3;
        this.k = j4;
    }

    public void a(c cVar) {
        this.l = cVar;
        this.m = cVar.a();
    }

    public final int a(int i2) {
        return this.m[i2];
    }

    protected final c i() {
        return this.l;
    }
}

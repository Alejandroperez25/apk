package c.d.a.a;

import c.d.a.a.m.AbstractC0170e;

/* renamed from: c.d.a.a.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0131c implements E, F {

    /* renamed from: a, reason: collision with root package name */
    private final int f1653a;

    /* renamed from: b, reason: collision with root package name */
    private G f1654b;

    /* renamed from: c, reason: collision with root package name */
    private int f1655c;

    /* renamed from: d, reason: collision with root package name */
    private int f1656d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.i.A f1657e;

    /* renamed from: f, reason: collision with root package name */
    private q[] f1658f;

    /* renamed from: g, reason: collision with root package name */
    private long f1659g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1660h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1661i;

    @Override // c.d.a.a.E
    public /* synthetic */ void a(float f2) {
        D.a(this, f2);
    }

    @Override // c.d.a.a.C.b
    public void a(int i2, Object obj) {
    }

    protected abstract void a(long j, boolean z);

    protected void a(boolean z) {
    }

    protected void a(q[] qVarArr, long j) {
    }

    @Override // c.d.a.a.E
    public final F j() {
        return this;
    }

    @Override // c.d.a.a.E
    public c.d.a.a.m.q n() {
        return null;
    }

    @Override // c.d.a.a.F
    public int o() {
        return 0;
    }

    protected void p() {
    }

    protected void q() {
    }

    protected abstract void r();

    public AbstractC0131c(int i2) {
        this.f1653a = i2;
    }

    @Override // c.d.a.a.E, c.d.a.a.F
    public final int g() {
        return this.f1653a;
    }

    @Override // c.d.a.a.E
    public final void a(int i2) {
        this.f1655c = i2;
    }

    @Override // c.d.a.a.E
    public final int f() {
        return this.f1656d;
    }

    @Override // c.d.a.a.E
    public final void a(G g2, q[] qVarArr, c.d.a.a.i.A a2, long j, boolean z, long j2) {
        AbstractC0170e.b(this.f1656d == 0);
        this.f1654b = g2;
        this.f1656d = 1;
        a(z);
        a(qVarArr, a2, j2);
        a(j, z);
    }

    @Override // c.d.a.a.E
    public final void start() {
        AbstractC0170e.b(this.f1656d == 1);
        this.f1656d = 2;
        p();
    }

    @Override // c.d.a.a.E
    public final void a(q[] qVarArr, c.d.a.a.i.A a2, long j) {
        AbstractC0170e.b(!this.f1661i);
        this.f1657e = a2;
        this.f1660h = false;
        this.f1658f = qVarArr;
        this.f1659g = j;
        a(qVarArr, j);
    }

    @Override // c.d.a.a.E
    public final c.d.a.a.i.A k() {
        return this.f1657e;
    }

    @Override // c.d.a.a.E
    public final boolean h() {
        return this.f1660h;
    }

    @Override // c.d.a.a.E
    public final void i() {
        this.f1661i = true;
    }

    @Override // c.d.a.a.E
    public final boolean m() {
        return this.f1661i;
    }

    @Override // c.d.a.a.E
    public final void l() {
        this.f1657e.a();
    }

    @Override // c.d.a.a.E
    public final void a(long j) {
        this.f1661i = false;
        this.f1660h = false;
        a(j, false);
    }

    @Override // c.d.a.a.E
    public final void stop() {
        AbstractC0170e.b(this.f1656d == 2);
        this.f1656d = 1;
        q();
    }

    @Override // c.d.a.a.E
    public final void e() {
        AbstractC0170e.b(this.f1656d == 1);
        this.f1656d = 0;
        this.f1657e = null;
        this.f1658f = null;
        this.f1661i = false;
        r();
    }

    protected final q[] s() {
        return this.f1658f;
    }

    protected final G t() {
        return this.f1654b;
    }

    protected final int u() {
        return this.f1655c;
    }

    protected final int a(r rVar, c.d.a.a.c.f fVar, boolean z) {
        int iA = this.f1657e.a(rVar, fVar, z);
        if (iA == -4) {
            if (fVar.d()) {
                this.f1660h = true;
                return this.f1661i ? -4 : -3;
            }
            fVar.f1685d += this.f1659g;
        } else if (iA == -5) {
            q qVar = rVar.f3685a;
            if (qVar.k != Long.MAX_VALUE) {
                rVar.f3685a = qVar.a(qVar.k + this.f1659g);
            }
        }
        return iA;
    }

    protected int b(long j) {
        return this.f1657e.d(j - this.f1659g);
    }

    protected final boolean v() {
        return this.f1660h ? this.f1661i : this.f1657e.c();
    }

    protected static boolean a(c.d.a.a.d.h<?> hVar, c.d.a.a.d.f fVar) {
        if (fVar == null) {
            return true;
        }
        if (hVar == null) {
            return false;
        }
        return hVar.a(fVar);
    }
}

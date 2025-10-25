package c.d.a.a;

import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public final c.d.a.a.i.v f3689a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3690b;

    /* renamed from: c, reason: collision with root package name */
    public final c.d.a.a.i.A[] f3691c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f3692d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3693e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3694f;

    /* renamed from: g, reason: collision with root package name */
    public v f3695g;

    /* renamed from: h, reason: collision with root package name */
    public u f3696h;

    /* renamed from: i, reason: collision with root package name */
    public c.d.a.a.i.G f3697i;
    public c.d.a.a.k.l j;
    private final F[] k;
    private final c.d.a.a.k.k l;
    private final c.d.a.a.i.w m;
    private long n;
    private c.d.a.a.k.l o;

    public u(F[] fArr, long j, c.d.a.a.k.k kVar, InterfaceC0161d interfaceC0161d, c.d.a.a.i.w wVar, v vVar) {
        this.k = fArr;
        this.n = j - vVar.f3699b;
        this.l = kVar;
        this.m = wVar;
        Object obj = vVar.f3698a.f3024a;
        AbstractC0170e.a(obj);
        this.f3690b = obj;
        this.f3695g = vVar;
        this.f3691c = new c.d.a.a.i.A[fArr.length];
        this.f3692d = new boolean[fArr.length];
        c.d.a.a.i.v vVarA = wVar.a(vVar.f3698a, interfaceC0161d, vVar.f3699b);
        this.f3689a = vVar.f3698a.f3028e != Long.MIN_VALUE ? new c.d.a.a.i.n(vVarA, true, 0L, vVar.f3698a.f3028e) : vVarA;
    }

    public long a(long j) {
        return j + a();
    }

    public long b(long j) {
        return j - a();
    }

    public long a() {
        return this.n;
    }

    public long b() {
        return this.f3695g.f3699b + this.n;
    }

    public boolean c() {
        return this.f3693e && (!this.f3694f || this.f3689a.g() == Long.MIN_VALUE);
    }

    public long d() {
        if (!this.f3693e) {
            return this.f3695g.f3699b;
        }
        long jG = this.f3694f ? this.f3689a.g() : Long.MIN_VALUE;
        return jG == Long.MIN_VALUE ? this.f3695g.f3701d : jG;
    }

    public long e() {
        if (this.f3693e) {
            return this.f3689a.b();
        }
        return 0L;
    }

    public void a(float f2) {
        this.f3693e = true;
        this.f3697i = this.f3689a.f();
        b(f2);
        long jA = a(this.f3695g.f3699b, false);
        this.n += this.f3695g.f3699b - jA;
        this.f3695g = this.f3695g.a(jA);
    }

    public void c(long j) {
        if (this.f3693e) {
            this.f3689a.c(b(j));
        }
    }

    public void d(long j) {
        this.f3689a.b(b(j));
    }

    public boolean b(float f2) {
        c.d.a.a.k.l lVarA = this.l.a(this.k, this.f3697i);
        if (lVarA.a(this.o)) {
            return false;
        }
        this.j = lVarA;
        for (c.d.a.a.k.i iVar : this.j.f3335c.a()) {
            if (iVar != null) {
                iVar.a(f2);
            }
        }
        return true;
    }

    public long a(long j, boolean z) {
        return a(j, z, new boolean[this.k.length]);
    }

    public long a(long j, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= this.j.f3333a) {
                break;
            }
            boolean[] zArr2 = this.f3692d;
            if (z || !this.j.a(this.o, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        a(this.f3691c);
        a(this.j);
        c.d.a.a.k.j jVar = this.j.f3335c;
        long jA = this.f3689a.a(jVar.a(), this.f3692d, this.f3691c, zArr, j);
        b(this.f3691c);
        this.f3694f = false;
        for (int i3 = 0; i3 < this.f3691c.length; i3++) {
            if (this.f3691c[i3] != null) {
                AbstractC0170e.b(this.j.a(i3));
                if (this.k[i3].g() != 6) {
                    this.f3694f = true;
                }
            } else {
                AbstractC0170e.b(jVar.a(i3) == null);
            }
        }
        return jA;
    }

    public void f() {
        a((c.d.a.a.k.l) null);
        try {
            if (this.f3695g.f3698a.f3028e != Long.MIN_VALUE) {
                this.m.a(((c.d.a.a.i.n) this.f3689a).f2976a);
            } else {
                this.m.a(this.f3689a);
            }
        } catch (RuntimeException e2) {
            c.d.a.a.m.o.b("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    private void a(c.d.a.a.k.l lVar) {
        if (this.o != null) {
            c(this.o);
        }
        this.o = lVar;
        if (this.o != null) {
            b(this.o);
        }
    }

    private void b(c.d.a.a.k.l lVar) {
        for (int i2 = 0; i2 < lVar.f3333a; i2++) {
            boolean zA = lVar.a(i2);
            c.d.a.a.k.i iVarA = lVar.f3335c.a(i2);
            if (zA && iVarA != null) {
                iVarA.c();
            }
        }
    }

    private void c(c.d.a.a.k.l lVar) {
        for (int i2 = 0; i2 < lVar.f3333a; i2++) {
            boolean zA = lVar.a(i2);
            c.d.a.a.k.i iVarA = lVar.f3335c.a(i2);
            if (zA && iVarA != null) {
                iVarA.e();
            }
        }
    }

    private void a(c.d.a.a.i.A[] aArr) {
        for (int i2 = 0; i2 < this.k.length; i2++) {
            if (this.k[i2].g() == 6) {
                aArr[i2] = null;
            }
        }
    }

    private void b(c.d.a.a.i.A[] aArr) {
        for (int i2 = 0; i2 < this.k.length; i2++) {
            if (this.k[i2].g() == 6 && this.j.a(i2)) {
                aArr[i2] = new c.d.a.a.i.r();
            }
        }
    }
}

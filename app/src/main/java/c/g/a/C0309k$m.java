package c.g.a;

import b.a.a$i;
import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309k$m extends AbstractC0289o<C0309k$m, a> implements InterfaceC0310k$n {

    /* renamed from: d, reason: collision with root package name */
    private static final C0309k$m f4622d = new C0309k$m();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0309k$m> f4623e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4624f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4625g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4626h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4627i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    private C0309k$m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f4624f = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.f4625g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.f4626h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.f4627i = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z) {
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(boolean z) {
        this.o = z;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4624f) {
            abstractC0283i.b(1, this.f4624f);
        }
        if (this.f4625g) {
            abstractC0283i.b(2, this.f4625g);
        }
        if (this.f4626h) {
            abstractC0283i.b(3, this.f4626h);
        }
        if (this.f4627i) {
            abstractC0283i.b(4, this.f4627i);
        }
        if (this.j) {
            abstractC0283i.b(5, this.j);
        }
        if (this.k) {
            abstractC0283i.b(6, this.k);
        }
        if (this.l) {
            abstractC0283i.b(7, this.l);
        }
        if (this.m) {
            abstractC0283i.b(8, this.m);
        }
        if (this.n) {
            abstractC0283i.b(9, this.n);
        }
        if (this.o) {
            abstractC0283i.b(10, this.o);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4624f ? 0 + AbstractC0283i.a(1, this.f4624f) : 0;
        if (this.f4625g) {
            iA += AbstractC0283i.a(2, this.f4625g);
        }
        if (this.f4626h) {
            iA += AbstractC0283i.a(3, this.f4626h);
        }
        if (this.f4627i) {
            iA += AbstractC0283i.a(4, this.f4627i);
        }
        if (this.j) {
            iA += AbstractC0283i.a(5, this.j);
        }
        if (this.k) {
            iA += AbstractC0283i.a(6, this.k);
        }
        if (this.l) {
            iA += AbstractC0283i.a(7, this.l);
        }
        if (this.m) {
            iA += AbstractC0283i.a(8, this.m);
        }
        if (this.n) {
            iA += AbstractC0283i.a(9, this.n);
        }
        if (this.o) {
            iA += AbstractC0283i.a(10, this.o);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4622d.b();
    }

    /* renamed from: c.g.a.k$m$a */
    public static final class a extends AbstractC0289o.a<C0309k$m, a> implements InterfaceC0310k$n {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0309k$m.f4622d);
        }

        public a a(boolean z) {
            b();
            ((C0309k$m) this.f4426b).a(z);
            return this;
        }

        public a b(boolean z) {
            b();
            ((C0309k$m) this.f4426b).b(z);
            return this;
        }

        public a c(boolean z) {
            b();
            ((C0309k$m) this.f4426b).c(z);
            return this;
        }

        public a d(boolean z) {
            b();
            ((C0309k$m) this.f4426b).d(z);
            return this;
        }

        public a e(boolean z) {
            b();
            ((C0309k$m) this.f4426b).e(z);
            return this;
        }

        public a f(boolean z) {
            b();
            ((C0309k$m) this.f4426b).f(z);
            return this;
        }

        public a g(boolean z) {
            b();
            ((C0309k$m) this.f4426b).g(z);
            return this;
        }

        public a h(boolean z) {
            b();
            ((C0309k$m) this.f4426b).h(z);
            return this;
        }

        public a i(boolean z) {
            b();
            ((C0309k$m) this.f4426b).i(z);
            return this;
        }

        public a j(boolean z) {
            b();
            ((C0309k$m) this.f4426b).j(z);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0309k$m();
            case 2:
                return f4622d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0309k$m c0309k$m = (C0309k$m) obj2;
                this.f4624f = jVar2.a(this.f4624f, this.f4624f, c0309k$m.f4624f, c0309k$m.f4624f);
                this.f4625g = jVar2.a(this.f4625g, this.f4625g, c0309k$m.f4625g, c0309k$m.f4625g);
                this.f4626h = jVar2.a(this.f4626h, this.f4626h, c0309k$m.f4626h, c0309k$m.f4626h);
                this.f4627i = jVar2.a(this.f4627i, this.f4627i, c0309k$m.f4627i, c0309k$m.f4627i);
                this.j = jVar2.a(this.j, this.j, c0309k$m.j, c0309k$m.j);
                this.k = jVar2.a(this.k, this.k, c0309k$m.k, c0309k$m.k);
                this.l = jVar2.a(this.l, this.l, c0309k$m.l, c0309k$m.l);
                this.m = jVar2.a(this.m, this.m, c0309k$m.m, c0309k$m.m);
                this.n = jVar2.a(this.n, this.n, c0309k$m.n, c0309k$m.n);
                this.o = jVar2.a(this.o, this.o, c0309k$m.o, c0309k$m.o);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                boolean z = false;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        switch (iA) {
                            case 0:
                                z = true;
                            case 8:
                                this.f4624f = c0281g.j();
                            case 16:
                                this.f4625g = c0281g.j();
                            case 24:
                                this.f4626h = c0281g.j();
                            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                                this.f4627i = c0281g.j();
                            case a$i.AppCompatTheme_buttonBarNegativeButtonStyle /* 40 */:
                                this.j = c0281g.j();
                            case a$i.AppCompatTheme_colorAccent /* 48 */:
                                this.k = c0281g.j();
                            case a$i.AppCompatTheme_colorPrimaryDark /* 56 */:
                                this.l = c0281g.j();
                            case a$i.AppCompatTheme_dropDownListViewStyle /* 64 */:
                                this.m = c0281g.j();
                            case a$i.AppCompatTheme_listDividerAlertDialog /* 72 */:
                                this.n = c0281g.j();
                            case a$i.AppCompatTheme_panelBackground /* 80 */:
                                this.o = c0281g.j();
                            default:
                                if (!c0281g.c(iA)) {
                                    z = true;
                                }
                        }
                    } catch (C0291q e2) {
                        e2.a(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        C0291q c0291q = new C0291q(e3.getMessage());
                        c0291q.a(this);
                        throw new RuntimeException(c0291q);
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f4623e == null) {
                    synchronized (C0309k$m.class) {
                        if (f4623e == null) {
                            f4623e = new AbstractC0289o.b(f4622d);
                        }
                    }
                }
                return f4623e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4622d;
    }

    static {
        f4622d.i();
    }

    public static C0309k$m m() {
        return f4622d;
    }

    public static A<C0309k$m> n() {
        return f4622d.f();
    }
}

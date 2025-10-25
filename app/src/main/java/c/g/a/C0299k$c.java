package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.C0309k$m;
import java.io.IOException;

/* renamed from: c.g.a.k$c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299k$c extends AbstractC0289o<C0299k$c, a> implements InterfaceC0300k$d {

    /* renamed from: d, reason: collision with root package name */
    private static final C0299k$c f4579d = new C0299k$c();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0299k$c> f4580e;

    /* renamed from: f, reason: collision with root package name */
    private int f4581f;
    private C0309k$m l;

    /* renamed from: g, reason: collision with root package name */
    private String f4582g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4583h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4584i = "";
    private String j = "";
    private AbstractC0290p.c<C0301k$e> k = AbstractC0289o.e();
    private AbstractC0280f m = AbstractC0280f.f4390a;

    private C0299k$c() {
    }

    public String p() {
        return this.f4582g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4582g = str;
    }

    public String q() {
        return this.f4583h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4583h = str;
    }

    public String r() {
        return this.f4584i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4584i = str;
    }

    public String s() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.j = str;
    }

    private void u() {
        if (this.k.b()) {
            return;
        }
        this.k = AbstractC0289o.a(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0301k$e c0301k$e) {
        if (c0301k$e == null) {
            throw new NullPointerException();
        }
        u();
        this.k.add(c0301k$e);
    }

    public C0309k$m t() {
        return this.l == null ? C0309k$m.m() : this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0309k$m c0309k$m) {
        if (c0309k$m == null) {
            throw new NullPointerException();
        }
        this.l = c0309k$m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AbstractC0280f abstractC0280f) {
        if (abstractC0280f == null) {
            throw new NullPointerException();
        }
        this.m = abstractC0280f;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4582g.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (!this.f4583h.isEmpty()) {
            abstractC0283i.b(2, q());
        }
        if (!this.f4584i.isEmpty()) {
            abstractC0283i.b(3, r());
        }
        if (!this.j.isEmpty()) {
            abstractC0283i.b(4, s());
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            abstractC0283i.b(5, this.k.get(i2));
        }
        if (this.l != null) {
            abstractC0283i.b(6, t());
        }
        if (this.m.isEmpty()) {
            return;
        }
        abstractC0283i.b(7, this.m);
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = !this.f4582g.isEmpty() ? AbstractC0283i.a(1, p()) + 0 : 0;
        if (!this.f4583h.isEmpty()) {
            iA += AbstractC0283i.a(2, q());
        }
        if (!this.f4584i.isEmpty()) {
            iA += AbstractC0283i.a(3, r());
        }
        if (!this.j.isEmpty()) {
            iA += AbstractC0283i.a(4, s());
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            iA += AbstractC0283i.a(5, this.k.get(i3));
        }
        if (this.l != null) {
            iA += AbstractC0283i.a(6, t());
        }
        if (!this.m.isEmpty()) {
            iA += AbstractC0283i.a(7, this.m);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4579d.b();
    }

    /* renamed from: c.g.a.k$c$a */
    public static final class a extends AbstractC0289o.a<C0299k$c, a> implements InterfaceC0300k$d {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0299k$c.f4579d);
        }

        public a a(String str) {
            b();
            ((C0299k$c) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((C0299k$c) this.f4426b).c(str);
            return this;
        }

        public a c(String str) {
            b();
            ((C0299k$c) this.f4426b).d(str);
            return this;
        }

        public a d(String str) {
            b();
            ((C0299k$c) this.f4426b).e(str);
            return this;
        }

        public a a(C0301k$e c0301k$e) {
            b();
            ((C0299k$c) this.f4426b).a(c0301k$e);
            return this;
        }

        public a a(C0309k$m c0309k$m) {
            b();
            ((C0299k$c) this.f4426b).a(c0309k$m);
            return this;
        }

        public a a(AbstractC0280f abstractC0280f) {
            b();
            ((C0299k$c) this.f4426b).a(abstractC0280f);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0299k$c();
            case 2:
                return f4579d;
            case 3:
                this.k.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0299k$c c0299k$c = (C0299k$c) obj2;
                this.f4582g = jVar2.a(!this.f4582g.isEmpty(), this.f4582g, !c0299k$c.f4582g.isEmpty(), c0299k$c.f4582g);
                this.f4583h = jVar2.a(!this.f4583h.isEmpty(), this.f4583h, !c0299k$c.f4583h.isEmpty(), c0299k$c.f4583h);
                this.f4584i = jVar2.a(!this.f4584i.isEmpty(), this.f4584i, !c0299k$c.f4584i.isEmpty(), c0299k$c.f4584i);
                this.j = jVar2.a(!this.j.isEmpty(), this.j, !c0299k$c.j.isEmpty(), c0299k$c.j);
                this.k = jVar2.a(this.k, c0299k$c.k);
                this.l = (C0309k$m) jVar2.a(this.l, c0299k$c.l);
                this.m = jVar2.a(this.m != AbstractC0280f.f4390a, this.m, c0299k$c.m != AbstractC0280f.f4390a, c0299k$c.m);
                if (jVar2 == AbstractC0289o.h.f4433a) {
                    this.f4581f |= c0299k$c.f4581f;
                }
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                C0285k c0285k = (C0285k) obj2;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4582g = c0281g.l();
                                } else if (iA == 18) {
                                    this.f4583h = c0281g.l();
                                } else if (iA == 26) {
                                    this.f4584i = c0281g.l();
                                } else if (iA == 34) {
                                    this.j = c0281g.l();
                                } else if (iA == 42) {
                                    if (!this.k.b()) {
                                        this.k = AbstractC0289o.a(this.k);
                                    }
                                    this.k.add(c0281g.a(C0301k$e.m(), c0285k));
                                } else if (iA == 50) {
                                    C0309k$m.a aVarB = this.l != null ? this.l.b() : null;
                                    this.l = (C0309k$m) c0281g.a(C0309k$m.n(), c0285k);
                                    if (aVarB != null) {
                                        aVarB.b((C0309k$m.a) this.l);
                                        this.l = aVarB.g();
                                    }
                                } else if (iA != 58) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.m = c0281g.m();
                                }
                            }
                            z = true;
                        } catch (C0291q e2) {
                            e2.a(this);
                            throw new RuntimeException(e2);
                        }
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
                if (f4580e == null) {
                    synchronized (C0299k$c.class) {
                        if (f4580e == null) {
                            f4580e = new AbstractC0289o.b(f4579d);
                        }
                    }
                }
                return f4580e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4579d;
    }

    static {
        f4579d.i();
    }

    public static C0299k$c m() {
        return f4579d;
    }

    public static A<C0299k$c> n() {
        return f4579d.f();
    }
}

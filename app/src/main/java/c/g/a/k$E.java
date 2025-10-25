package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$E extends AbstractC0289o<k$E, a> implements k$F {

    /* renamed from: d, reason: collision with root package name */
    private static final k$E f4514d = new k$E();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$E> f4515e;

    /* renamed from: f, reason: collision with root package name */
    private String f4516f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4517g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4518h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4519i = "";
    private String j = "";

    private k$E() {
    }

    public String p() {
        return this.f4516f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4516f = str;
    }

    public String q() {
        return this.f4517g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4517g = str;
    }

    public String r() {
        return this.f4518h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4518h = str;
    }

    public String s() {
        return this.f4519i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4519i = str;
    }

    public String t() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.j = str;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4516f.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (!this.f4517g.isEmpty()) {
            abstractC0283i.b(2, q());
        }
        if (!this.f4518h.isEmpty()) {
            abstractC0283i.b(3, r());
        }
        if (!this.f4519i.isEmpty()) {
            abstractC0283i.b(4, s());
        }
        if (this.j.isEmpty()) {
            return;
        }
        abstractC0283i.b(5, t());
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4516f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, p());
        if (!this.f4517g.isEmpty()) {
            iA += AbstractC0283i.a(2, q());
        }
        if (!this.f4518h.isEmpty()) {
            iA += AbstractC0283i.a(3, r());
        }
        if (!this.f4519i.isEmpty()) {
            iA += AbstractC0283i.a(4, s());
        }
        if (!this.j.isEmpty()) {
            iA += AbstractC0283i.a(5, t());
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4514d.b();
    }

    public static final class a extends AbstractC0289o.a<k$E, a> implements k$F {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$E.f4514d);
        }

        public a a(String str) {
            b();
            ((k$E) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((k$E) this.f4426b).c(str);
            return this;
        }

        public a c(String str) {
            b();
            ((k$E) this.f4426b).d(str);
            return this;
        }

        public a d(String str) {
            b();
            ((k$E) this.f4426b).e(str);
            return this;
        }

        public a e(String str) {
            b();
            ((k$E) this.f4426b).f(str);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$E();
            case 2:
                return f4514d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$E k_e = (k$E) obj2;
                this.f4516f = jVar2.a(!this.f4516f.isEmpty(), this.f4516f, !k_e.f4516f.isEmpty(), k_e.f4516f);
                this.f4517g = jVar2.a(!this.f4517g.isEmpty(), this.f4517g, !k_e.f4517g.isEmpty(), k_e.f4517g);
                this.f4518h = jVar2.a(!this.f4518h.isEmpty(), this.f4518h, !k_e.f4518h.isEmpty(), k_e.f4518h);
                this.f4519i = jVar2.a(!this.f4519i.isEmpty(), this.f4519i, !k_e.f4519i.isEmpty(), k_e.f4519i);
                this.j = jVar2.a(!this.j.isEmpty(), this.j, true ^ k_e.j.isEmpty(), k_e.j);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4516f = c0281g.l();
                                } else if (iA == 18) {
                                    this.f4517g = c0281g.l();
                                } else if (iA == 26) {
                                    this.f4518h = c0281g.l();
                                } else if (iA == 34) {
                                    this.f4519i = c0281g.l();
                                } else if (iA != 42) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.j = c0281g.l();
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
                if (f4515e == null) {
                    synchronized (k$E.class) {
                        if (f4515e == null) {
                            f4515e = new AbstractC0289o.b(f4514d);
                        }
                    }
                }
                return f4515e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4514d;
    }

    static {
        f4514d.i();
    }

    public static k$E m() {
        return f4514d;
    }

    public static A<k$E> n() {
        return f4514d.f();
    }
}

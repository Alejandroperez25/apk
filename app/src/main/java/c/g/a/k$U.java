package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$U extends AbstractC0289o<k$U, a> implements k$V {

    /* renamed from: d, reason: collision with root package name */
    private static final k$U f4561d = new k$U();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$U> f4562e;

    /* renamed from: f, reason: collision with root package name */
    private String f4563f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4564g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4565h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4566i = "";
    private String j = "";
    private AbstractC0280f k = AbstractC0280f.f4390a;

    private k$U() {
    }

    public String p() {
        return this.f4563f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4563f = str;
    }

    public String q() {
        return this.f4564g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4564g = str;
    }

    public String r() {
        return this.f4565h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4565h = str;
    }

    public String s() {
        return this.f4566i;
    }

    public String t() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.j = str;
    }

    public AbstractC0280f u() {
        return this.k;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4563f.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (!this.f4564g.isEmpty()) {
            abstractC0283i.b(2, q());
        }
        if (!this.f4565h.isEmpty()) {
            abstractC0283i.b(3, r());
        }
        if (!this.f4566i.isEmpty()) {
            abstractC0283i.b(4, s());
        }
        if (!this.j.isEmpty()) {
            abstractC0283i.b(5, t());
        }
        if (this.k.isEmpty()) {
            return;
        }
        abstractC0283i.b(6, this.k);
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4563f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, p());
        if (!this.f4564g.isEmpty()) {
            iA += AbstractC0283i.a(2, q());
        }
        if (!this.f4565h.isEmpty()) {
            iA += AbstractC0283i.a(3, r());
        }
        if (!this.f4566i.isEmpty()) {
            iA += AbstractC0283i.a(4, s());
        }
        if (!this.j.isEmpty()) {
            iA += AbstractC0283i.a(5, t());
        }
        if (!this.k.isEmpty()) {
            iA += AbstractC0283i.a(6, this.k);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4561d.b();
    }

    public static final class a extends AbstractC0289o.a<k$U, a> implements k$V {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$U.f4561d);
        }

        public a a(String str) {
            b();
            ((k$U) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((k$U) this.f4426b).c(str);
            return this;
        }

        public a c(String str) {
            b();
            ((k$U) this.f4426b).d(str);
            return this;
        }

        public a d(String str) {
            b();
            ((k$U) this.f4426b).e(str);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$U();
            case 2:
                return f4561d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$U k_u = (k$U) obj2;
                this.f4563f = jVar2.a(!this.f4563f.isEmpty(), this.f4563f, !k_u.f4563f.isEmpty(), k_u.f4563f);
                this.f4564g = jVar2.a(!this.f4564g.isEmpty(), this.f4564g, !k_u.f4564g.isEmpty(), k_u.f4564g);
                this.f4565h = jVar2.a(!this.f4565h.isEmpty(), this.f4565h, !k_u.f4565h.isEmpty(), k_u.f4565h);
                this.f4566i = jVar2.a(!this.f4566i.isEmpty(), this.f4566i, !k_u.f4566i.isEmpty(), k_u.f4566i);
                this.j = jVar2.a(!this.j.isEmpty(), this.j, !k_u.j.isEmpty(), k_u.j);
                this.k = jVar2.a(this.k != AbstractC0280f.f4390a, this.k, k_u.k != AbstractC0280f.f4390a, k_u.k);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 10) {
                                this.f4563f = c0281g.l();
                            } else if (iA == 18) {
                                this.f4564g = c0281g.l();
                            } else if (iA == 26) {
                                this.f4565h = c0281g.l();
                            } else if (iA == 34) {
                                this.f4566i = c0281g.l();
                            } else if (iA == 42) {
                                this.j = c0281g.l();
                            } else if (iA != 50) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.k = c0281g.m();
                            }
                        }
                        z = true;
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
                if (f4562e == null) {
                    synchronized (k$U.class) {
                        if (f4562e == null) {
                            f4562e = new AbstractC0289o.b(f4561d);
                        }
                    }
                }
                return f4562e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4561d;
    }

    static {
        f4561d.i();
    }

    public static k$U m() {
        return f4561d;
    }

    public static A<k$U> n() {
        return f4561d.f();
    }
}

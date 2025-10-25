package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$Q extends AbstractC0289o<k$Q, a> implements k$R {

    /* renamed from: d, reason: collision with root package name */
    private static final k$Q f4545d = new k$Q();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$Q> f4546e;
    private int j;

    /* renamed from: f, reason: collision with root package name */
    private String f4547f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4548g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4549h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4550i = "";
    private AbstractC0280f k = AbstractC0280f.f4390a;

    private k$Q() {
    }

    public enum b implements AbstractC0290p.a {
        WITH_RESPONSE(0),
        WITHOUT_RESPONSE(1),
        UNRECOGNIZED(-1);


        /* renamed from: d, reason: collision with root package name */
        private static final AbstractC0290p.b<b> f4554d = new o();

        /* renamed from: f, reason: collision with root package name */
        private final int f4556f;

        @Override // c.d.d.AbstractC0290p.a
        public final int a() {
            return this.f4556f;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return WITH_RESPONSE;
                case 1:
                    return WITHOUT_RESPONSE;
                default:
                    return null;
            }
        }

        b(int i2) {
            this.f4556f = i2;
        }
    }

    public String p() {
        return this.f4547f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4547f = str;
    }

    public String q() {
        return this.f4548g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4548g = str;
    }

    public String r() {
        return this.f4549h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4549h = str;
    }

    public String s() {
        return this.f4550i;
    }

    public b t() {
        b bVarA = b.a(this.j);
        return bVarA == null ? b.UNRECOGNIZED : bVarA;
    }

    public AbstractC0280f u() {
        return this.k;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4547f.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (!this.f4548g.isEmpty()) {
            abstractC0283i.b(2, q());
        }
        if (!this.f4549h.isEmpty()) {
            abstractC0283i.b(3, r());
        }
        if (!this.f4550i.isEmpty()) {
            abstractC0283i.b(4, s());
        }
        if (this.j != b.WITH_RESPONSE.a()) {
            abstractC0283i.e(5, this.j);
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
        int iA = this.f4547f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, p());
        if (!this.f4548g.isEmpty()) {
            iA += AbstractC0283i.a(2, q());
        }
        if (!this.f4549h.isEmpty()) {
            iA += AbstractC0283i.a(3, r());
        }
        if (!this.f4550i.isEmpty()) {
            iA += AbstractC0283i.a(4, s());
        }
        if (this.j != b.WITH_RESPONSE.a()) {
            iA += AbstractC0283i.b(5, this.j);
        }
        if (!this.k.isEmpty()) {
            iA += AbstractC0283i.a(6, this.k);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4545d.b();
    }

    public static final class a extends AbstractC0289o.a<k$Q, a> implements k$R {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$Q.f4545d);
        }

        public a a(String str) {
            b();
            ((k$Q) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((k$Q) this.f4426b).c(str);
            return this;
        }

        public a c(String str) {
            b();
            ((k$Q) this.f4426b).d(str);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$Q();
            case 2:
                return f4545d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$Q k_q = (k$Q) obj2;
                this.f4547f = jVar2.a(!this.f4547f.isEmpty(), this.f4547f, !k_q.f4547f.isEmpty(), k_q.f4547f);
                this.f4548g = jVar2.a(!this.f4548g.isEmpty(), this.f4548g, !k_q.f4548g.isEmpty(), k_q.f4548g);
                this.f4549h = jVar2.a(!this.f4549h.isEmpty(), this.f4549h, !k_q.f4549h.isEmpty(), k_q.f4549h);
                this.f4550i = jVar2.a(!this.f4550i.isEmpty(), this.f4550i, !k_q.f4550i.isEmpty(), k_q.f4550i);
                this.j = jVar2.a(this.j != 0, this.j, k_q.j != 0, k_q.j);
                this.k = jVar2.a(this.k != AbstractC0280f.f4390a, this.k, k_q.k != AbstractC0280f.f4390a, k_q.k);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 10) {
                                this.f4547f = c0281g.l();
                            } else if (iA == 18) {
                                this.f4548g = c0281g.l();
                            } else if (iA == 26) {
                                this.f4549h = c0281g.l();
                            } else if (iA == 34) {
                                this.f4550i = c0281g.l();
                            } else if (iA == 40) {
                                this.j = c0281g.o();
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
                if (f4546e == null) {
                    synchronized (k$Q.class) {
                        if (f4546e == null) {
                            f4546e = new AbstractC0289o.b(f4545d);
                        }
                    }
                }
                return f4546e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4545d;
    }

    static {
        f4545d.i();
    }

    public static k$Q m() {
        return f4545d;
    }

    public static A<k$Q> n() {
        return f4545d.f();
    }
}

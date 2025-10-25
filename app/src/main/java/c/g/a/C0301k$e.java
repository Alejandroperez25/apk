package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301k$e extends AbstractC0289o<C0301k$e, a> implements InterfaceC0302k$f {

    /* renamed from: d, reason: collision with root package name */
    private static final C0301k$e f4585d = new C0301k$e();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0301k$e> f4586e;

    /* renamed from: f, reason: collision with root package name */
    private String f4587f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4588g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4589h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4590i = "";
    private AbstractC0280f j = AbstractC0280f.f4390a;

    private C0301k$e() {
    }

    public String o() {
        return this.f4587f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4587f = str;
    }

    public String p() {
        return this.f4588g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4588g = str;
    }

    public String q() {
        return this.f4589h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4589h = str;
    }

    public String r() {
        return this.f4590i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4590i = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AbstractC0280f abstractC0280f) {
        if (abstractC0280f == null) {
            throw new NullPointerException();
        }
        this.j = abstractC0280f;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4587f.isEmpty()) {
            abstractC0283i.b(1, o());
        }
        if (!this.f4588g.isEmpty()) {
            abstractC0283i.b(2, p());
        }
        if (!this.f4589h.isEmpty()) {
            abstractC0283i.b(3, q());
        }
        if (!this.f4590i.isEmpty()) {
            abstractC0283i.b(4, r());
        }
        if (this.j.isEmpty()) {
            return;
        }
        abstractC0283i.b(5, this.j);
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4587f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, o());
        if (!this.f4588g.isEmpty()) {
            iA += AbstractC0283i.a(2, p());
        }
        if (!this.f4589h.isEmpty()) {
            iA += AbstractC0283i.a(3, q());
        }
        if (!this.f4590i.isEmpty()) {
            iA += AbstractC0283i.a(4, r());
        }
        if (!this.j.isEmpty()) {
            iA += AbstractC0283i.a(5, this.j);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4585d.b();
    }

    /* renamed from: c.g.a.k$e$a */
    public static final class a extends AbstractC0289o.a<C0301k$e, a> implements InterfaceC0302k$f {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0301k$e.f4585d);
        }

        public a a(String str) {
            b();
            ((C0301k$e) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((C0301k$e) this.f4426b).c(str);
            return this;
        }

        public a c(String str) {
            b();
            ((C0301k$e) this.f4426b).d(str);
            return this;
        }

        public a d(String str) {
            b();
            ((C0301k$e) this.f4426b).e(str);
            return this;
        }

        public a a(AbstractC0280f abstractC0280f) {
            b();
            ((C0301k$e) this.f4426b).a(abstractC0280f);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0301k$e();
            case 2:
                return f4585d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0301k$e c0301k$e = (C0301k$e) obj2;
                this.f4587f = jVar2.a(!this.f4587f.isEmpty(), this.f4587f, !c0301k$e.f4587f.isEmpty(), c0301k$e.f4587f);
                this.f4588g = jVar2.a(!this.f4588g.isEmpty(), this.f4588g, !c0301k$e.f4588g.isEmpty(), c0301k$e.f4588g);
                this.f4589h = jVar2.a(!this.f4589h.isEmpty(), this.f4589h, !c0301k$e.f4589h.isEmpty(), c0301k$e.f4589h);
                this.f4590i = jVar2.a(!this.f4590i.isEmpty(), this.f4590i, !c0301k$e.f4590i.isEmpty(), c0301k$e.f4590i);
                this.j = jVar2.a(this.j != AbstractC0280f.f4390a, this.j, c0301k$e.j != AbstractC0280f.f4390a, c0301k$e.j);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4587f = c0281g.l();
                                } else if (iA == 18) {
                                    this.f4588g = c0281g.l();
                                } else if (iA == 26) {
                                    this.f4589h = c0281g.l();
                                } else if (iA == 34) {
                                    this.f4590i = c0281g.l();
                                } else if (iA != 42) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.j = c0281g.m();
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
                if (f4586e == null) {
                    synchronized (C0301k$e.class) {
                        if (f4586e == null) {
                            f4586e = new AbstractC0289o.b(f4585d);
                        }
                    }
                }
                return f4586e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4585d;
    }

    static {
        f4585d.i();
    }

    public static A<C0301k$e> m() {
        return f4585d.f();
    }
}

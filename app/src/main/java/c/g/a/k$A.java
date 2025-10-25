package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$A extends AbstractC0289o<k$A, a> implements k$B {

    /* renamed from: d, reason: collision with root package name */
    private static final k$A f4504d = new k$A();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$A> f4505e;

    /* renamed from: f, reason: collision with root package name */
    private String f4506f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4507g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4508h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4509i = "";

    private k$A() {
    }

    public String n() {
        return this.f4506f;
    }

    public String o() {
        return this.f4507g;
    }

    public String p() {
        return this.f4508h;
    }

    public String q() {
        return this.f4509i;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4506f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (!this.f4507g.isEmpty()) {
            abstractC0283i.b(2, o());
        }
        if (!this.f4508h.isEmpty()) {
            abstractC0283i.b(3, p());
        }
        if (this.f4509i.isEmpty()) {
            return;
        }
        abstractC0283i.b(4, q());
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4506f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (!this.f4507g.isEmpty()) {
            iA += AbstractC0283i.a(2, o());
        }
        if (!this.f4508h.isEmpty()) {
            iA += AbstractC0283i.a(3, p());
        }
        if (!this.f4509i.isEmpty()) {
            iA += AbstractC0283i.a(4, q());
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4504d.b();
    }

    public static final class a extends AbstractC0289o.a<k$A, a> implements k$B {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$A.f4504d);
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$A();
            case 2:
                return f4504d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$A k_a = (k$A) obj2;
                this.f4506f = jVar2.a(!this.f4506f.isEmpty(), this.f4506f, !k_a.f4506f.isEmpty(), k_a.f4506f);
                this.f4507g = jVar2.a(!this.f4507g.isEmpty(), this.f4507g, !k_a.f4507g.isEmpty(), k_a.f4507g);
                this.f4508h = jVar2.a(!this.f4508h.isEmpty(), this.f4508h, !k_a.f4508h.isEmpty(), k_a.f4508h);
                this.f4509i = jVar2.a(!this.f4509i.isEmpty(), this.f4509i, true ^ k_a.f4509i.isEmpty(), k_a.f4509i);
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
                                    this.f4506f = c0281g.l();
                                } else if (iA == 18) {
                                    this.f4507g = c0281g.l();
                                } else if (iA == 26) {
                                    this.f4508h = c0281g.l();
                                } else if (iA != 34) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.f4509i = c0281g.l();
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
                if (f4505e == null) {
                    synchronized (k$A.class) {
                        if (f4505e == null) {
                            f4505e = new AbstractC0289o.b(f4504d);
                        }
                    }
                }
                return f4505e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4504d;
    }

    static {
        f4504d.i();
    }
}

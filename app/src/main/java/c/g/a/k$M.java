package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$M extends AbstractC0289o<k$M, a> implements k$N {

    /* renamed from: d, reason: collision with root package name */
    private static final k$M f4534d = new k$M();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$M> f4535e;

    /* renamed from: f, reason: collision with root package name */
    private String f4536f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4537g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4538h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f4539i = "";
    private boolean j;

    private k$M() {
    }

    public String n() {
        return this.f4536f;
    }

    public String o() {
        return this.f4537g;
    }

    public String p() {
        return this.f4538h;
    }

    public String q() {
        return this.f4539i;
    }

    public boolean r() {
        return this.j;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4536f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (!this.f4537g.isEmpty()) {
            abstractC0283i.b(2, o());
        }
        if (!this.f4538h.isEmpty()) {
            abstractC0283i.b(3, p());
        }
        if (!this.f4539i.isEmpty()) {
            abstractC0283i.b(4, q());
        }
        if (this.j) {
            abstractC0283i.b(5, this.j);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4536f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (!this.f4537g.isEmpty()) {
            iA += AbstractC0283i.a(2, o());
        }
        if (!this.f4538h.isEmpty()) {
            iA += AbstractC0283i.a(3, p());
        }
        if (!this.f4539i.isEmpty()) {
            iA += AbstractC0283i.a(4, q());
        }
        if (this.j) {
            iA += AbstractC0283i.a(5, this.j);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4534d.b();
    }

    public static final class a extends AbstractC0289o.a<k$M, a> implements k$N {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$M.f4534d);
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$M();
            case 2:
                return f4534d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$M k_m = (k$M) obj2;
                this.f4536f = jVar2.a(!this.f4536f.isEmpty(), this.f4536f, !k_m.f4536f.isEmpty(), k_m.f4536f);
                this.f4537g = jVar2.a(!this.f4537g.isEmpty(), this.f4537g, !k_m.f4537g.isEmpty(), k_m.f4537g);
                this.f4538h = jVar2.a(!this.f4538h.isEmpty(), this.f4538h, !k_m.f4538h.isEmpty(), k_m.f4538h);
                this.f4539i = jVar2.a(!this.f4539i.isEmpty(), this.f4539i, true ^ k_m.f4539i.isEmpty(), k_m.f4539i);
                this.j = jVar2.a(this.j, this.j, k_m.j, k_m.j);
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
                                    this.f4536f = c0281g.l();
                                } else if (iA == 18) {
                                    this.f4537g = c0281g.l();
                                } else if (iA == 26) {
                                    this.f4538h = c0281g.l();
                                } else if (iA == 34) {
                                    this.f4539i = c0281g.l();
                                } else if (iA != 40) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.j = c0281g.j();
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
                if (f4535e == null) {
                    synchronized (k$M.class) {
                        if (f4535e == null) {
                            f4535e = new AbstractC0289o.b(f4534d);
                        }
                    }
                }
                return f4535e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4534d;
    }

    static {
        f4534d.i();
    }
}

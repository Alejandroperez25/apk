package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.k$E;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$G extends AbstractC0289o<k$G, a> implements k$H {

    /* renamed from: d, reason: collision with root package name */
    private static final k$G f4520d = new k$G();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$G> f4521e;

    /* renamed from: f, reason: collision with root package name */
    private k$E f4522f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC0280f f4523g = AbstractC0280f.f4390a;

    private k$G() {
    }

    public k$E n() {
        return this.f4522f == null ? k$E.m() : this.f4522f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k$E.a aVar) {
        this.f4522f = aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AbstractC0280f abstractC0280f) {
        if (abstractC0280f == null) {
            throw new NullPointerException();
        }
        this.f4523g = abstractC0280f;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4522f != null) {
            abstractC0283i.b(1, n());
        }
        if (this.f4523g.isEmpty()) {
            return;
        }
        abstractC0283i.b(2, this.f4523g);
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4522f != null ? 0 + AbstractC0283i.a(1, n()) : 0;
        if (!this.f4523g.isEmpty()) {
            iA += AbstractC0283i.a(2, this.f4523g);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4520d.b();
    }

    public static final class a extends AbstractC0289o.a<k$G, a> implements k$H {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$G.f4520d);
        }

        public a a(k$E.a aVar) {
            b();
            ((k$G) this.f4426b).a(aVar);
            return this;
        }

        public a a(AbstractC0280f abstractC0280f) {
            b();
            ((k$G) this.f4426b).a(abstractC0280f);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$G();
            case 2:
                return f4520d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$G k_g = (k$G) obj2;
                this.f4522f = (k$E) jVar2.a(this.f4522f, k_g.f4522f);
                this.f4523g = jVar2.a(this.f4523g != AbstractC0280f.f4390a, this.f4523g, k_g.f4523g != AbstractC0280f.f4390a, k_g.f4523g);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                C0285k c0285k = (C0285k) obj2;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 10) {
                                k$E.a aVarB = this.f4522f != null ? this.f4522f.b() : null;
                                this.f4522f = (k$E) c0281g.a(k$E.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((k$E.a) this.f4522f);
                                    this.f4522f = aVarB.g();
                                }
                            } else if (iA != 18) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.f4523g = c0281g.m();
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
                if (f4521e == null) {
                    synchronized (k$G.class) {
                        if (f4521e == null) {
                            f4521e = new AbstractC0289o.b(f4520d);
                        }
                    }
                }
                return f4521e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4520d;
    }

    static {
        f4520d.i();
    }
}

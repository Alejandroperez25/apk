package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.k$U;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$W extends AbstractC0289o<k$W, a> implements k$X {

    /* renamed from: d, reason: collision with root package name */
    private static final k$W f4567d = new k$W();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$W> f4568e;

    /* renamed from: f, reason: collision with root package name */
    private k$U f4569f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4570g;

    private k$W() {
    }

    public k$U n() {
        return this.f4569f == null ? k$U.m() : this.f4569f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k$U.a aVar) {
        this.f4569f = aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f4570g = z;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4569f != null) {
            abstractC0283i.b(1, n());
        }
        if (this.f4570g) {
            abstractC0283i.b(2, this.f4570g);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4569f != null ? 0 + AbstractC0283i.a(1, n()) : 0;
        if (this.f4570g) {
            iA += AbstractC0283i.a(2, this.f4570g);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4567d.b();
    }

    public static final class a extends AbstractC0289o.a<k$W, a> implements k$X {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$W.f4567d);
        }

        public a a(k$U.a aVar) {
            b();
            ((k$W) this.f4426b).a(aVar);
            return this;
        }

        public a a(boolean z) {
            b();
            ((k$W) this.f4426b).a(z);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$W();
            case 2:
                return f4567d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$W k_w = (k$W) obj2;
                this.f4569f = (k$U) jVar2.a(this.f4569f, k_w.f4569f);
                this.f4570g = jVar2.a(this.f4570g, this.f4570g, k_w.f4570g, k_w.f4570g);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                C0285k c0285k = (C0285k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 10) {
                                k$U.a aVarB = this.f4569f != null ? this.f4569f.b() : null;
                                this.f4569f = (k$U) c0281g.a(k$U.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((k$U.a) this.f4569f);
                                    this.f4569f = aVarB.g();
                                }
                            } else if (iA != 16) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.f4570g = c0281g.j();
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
                if (f4568e == null) {
                    synchronized (k$W.class) {
                        if (f4568e == null) {
                            f4568e = new AbstractC0289o.b(f4567d);
                        }
                    }
                }
                return f4568e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4567d;
    }

    static {
        f4567d.i();
    }
}

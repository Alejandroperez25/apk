package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.k$Q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$S extends AbstractC0289o<k$S, a> implements k$T {

    /* renamed from: d, reason: collision with root package name */
    private static final k$S f4557d = new k$S();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$S> f4558e;

    /* renamed from: f, reason: collision with root package name */
    private k$Q f4559f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4560g;

    private k$S() {
    }

    public k$Q n() {
        return this.f4559f == null ? k$Q.m() : this.f4559f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k$Q.a aVar) {
        this.f4559f = aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f4560g = z;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4559f != null) {
            abstractC0283i.b(1, n());
        }
        if (this.f4560g) {
            abstractC0283i.b(2, this.f4560g);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4559f != null ? 0 + AbstractC0283i.a(1, n()) : 0;
        if (this.f4560g) {
            iA += AbstractC0283i.a(2, this.f4560g);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4557d.b();
    }

    public static final class a extends AbstractC0289o.a<k$S, a> implements k$T {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$S.f4557d);
        }

        public a a(k$Q.a aVar) {
            b();
            ((k$S) this.f4426b).a(aVar);
            return this;
        }

        public a a(boolean z) {
            b();
            ((k$S) this.f4426b).a(z);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$S();
            case 2:
                return f4557d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$S k_s = (k$S) obj2;
                this.f4559f = (k$Q) jVar2.a(this.f4559f, k_s.f4559f);
                this.f4560g = jVar2.a(this.f4560g, this.f4560g, k_s.f4560g, k_s.f4560g);
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
                                k$Q.a aVarB = this.f4559f != null ? this.f4559f.b() : null;
                                this.f4559f = (k$Q) c0281g.a(k$Q.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((k$Q.a) this.f4559f);
                                    this.f4559f = aVarB.g();
                                }
                            } else if (iA != 16) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.f4560g = c0281g.j();
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
                if (f4558e == null) {
                    synchronized (k$S.class) {
                        if (f4558e == null) {
                            f4558e = new AbstractC0289o.b(f4557d);
                        }
                    }
                }
                return f4558e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4557d;
    }

    static {
        f4557d.i();
    }
}

package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.C0299k$c;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$y extends AbstractC0289o<k$y, a> implements k$z {

    /* renamed from: d, reason: collision with root package name */
    private static final k$y f4655d = new k$y();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$y> f4656e;

    /* renamed from: f, reason: collision with root package name */
    private String f4657f = "";

    /* renamed from: g, reason: collision with root package name */
    private C0299k$c f4658g;

    private k$y() {
    }

    public String n() {
        return this.f4657f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4657f = str;
    }

    public C0299k$c o() {
        return this.f4658g == null ? C0299k$c.m() : this.f4658g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0299k$c c0299k$c) {
        if (c0299k$c == null) {
            throw new NullPointerException();
        }
        this.f4658g = c0299k$c;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4657f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (this.f4658g != null) {
            abstractC0283i.b(2, o());
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4657f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (this.f4658g != null) {
            iA += AbstractC0283i.a(2, o());
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4655d.b();
    }

    public static final class a extends AbstractC0289o.a<k$y, a> implements k$z {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$y.f4655d);
        }

        public a a(String str) {
            b();
            ((k$y) this.f4426b).b(str);
            return this;
        }

        public a a(C0299k$c c0299k$c) {
            b();
            ((k$y) this.f4426b).a(c0299k$c);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$y();
            case 2:
                return f4655d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$y k_y = (k$y) obj2;
                this.f4657f = jVar2.a(!this.f4657f.isEmpty(), this.f4657f, true ^ k_y.f4657f.isEmpty(), k_y.f4657f);
                this.f4658g = (C0299k$c) jVar2.a(this.f4658g, k_y.f4658g);
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
                                this.f4657f = c0281g.l();
                            } else if (iA != 18) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                C0299k$c.a aVarB = this.f4658g != null ? this.f4658g.b() : null;
                                this.f4658g = (C0299k$c) c0281g.a(C0299k$c.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((C0299k$c.a) this.f4658g);
                                    this.f4658g = aVarB.g();
                                }
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
                if (f4656e == null) {
                    synchronized (k$y.class) {
                        if (f4656e == null) {
                            f4656e = new AbstractC0289o.b(f4655d);
                        }
                    }
                }
                return f4656e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4655d;
    }

    static {
        f4655d.i();
    }
}

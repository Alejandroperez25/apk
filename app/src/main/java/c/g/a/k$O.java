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
public final class k$O extends AbstractC0289o<k$O, a> implements k$P {

    /* renamed from: d, reason: collision with root package name */
    private static final k$O f4540d = new k$O();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$O> f4541e;

    /* renamed from: f, reason: collision with root package name */
    private String f4542f = "";

    /* renamed from: g, reason: collision with root package name */
    private C0299k$c f4543g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4544h;

    private k$O() {
    }

    public String n() {
        return this.f4542f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4542f = str;
    }

    public C0299k$c o() {
        return this.f4543g == null ? C0299k$c.m() : this.f4543g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0299k$c c0299k$c) {
        if (c0299k$c == null) {
            throw new NullPointerException();
        }
        this.f4543g = c0299k$c;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4542f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (this.f4543g != null) {
            abstractC0283i.b(2, o());
        }
        if (this.f4544h) {
            abstractC0283i.b(3, this.f4544h);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4542f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (this.f4543g != null) {
            iA += AbstractC0283i.a(2, o());
        }
        if (this.f4544h) {
            iA += AbstractC0283i.a(3, this.f4544h);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4540d.b();
    }

    public static final class a extends AbstractC0289o.a<k$O, a> implements k$P {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$O.f4540d);
        }

        public a a(String str) {
            b();
            ((k$O) this.f4426b).b(str);
            return this;
        }

        public a a(C0299k$c c0299k$c) {
            b();
            ((k$O) this.f4426b).a(c0299k$c);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$O();
            case 2:
                return f4540d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$O k_o = (k$O) obj2;
                this.f4542f = jVar2.a(!this.f4542f.isEmpty(), this.f4542f, true ^ k_o.f4542f.isEmpty(), k_o.f4542f);
                this.f4543g = (C0299k$c) jVar2.a(this.f4543g, k_o.f4543g);
                this.f4544h = jVar2.a(this.f4544h, this.f4544h, k_o.f4544h, k_o.f4544h);
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
                                this.f4542f = c0281g.l();
                            } else if (iA == 18) {
                                C0299k$c.a aVarB = this.f4543g != null ? this.f4543g.b() : null;
                                this.f4543g = (C0299k$c) c0281g.a(C0299k$c.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((C0299k$c.a) this.f4543g);
                                    this.f4543g = aVarB.g();
                                }
                            } else if (iA != 24) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.f4544h = c0281g.j();
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
                if (f4541e == null) {
                    synchronized (k$O.class) {
                        if (f4541e == null) {
                            f4541e = new AbstractC0289o.b(f4540d);
                        }
                    }
                }
                return f4541e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4540d;
    }

    static {
        f4540d.i();
    }
}

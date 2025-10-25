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
public final class k$C extends AbstractC0289o<k$C, a> implements k$D {

    /* renamed from: d, reason: collision with root package name */
    private static final k$C f4510d = new k$C();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$C> f4511e;

    /* renamed from: f, reason: collision with root package name */
    private String f4512f = "";

    /* renamed from: g, reason: collision with root package name */
    private C0299k$c f4513g;

    private k$C() {
    }

    public String n() {
        return this.f4512f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4512f = str;
    }

    public C0299k$c o() {
        return this.f4513g == null ? C0299k$c.m() : this.f4513g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0299k$c c0299k$c) {
        if (c0299k$c == null) {
            throw new NullPointerException();
        }
        this.f4513g = c0299k$c;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4512f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (this.f4513g != null) {
            abstractC0283i.b(2, o());
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4512f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (this.f4513g != null) {
            iA += AbstractC0283i.a(2, o());
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4510d.b();
    }

    public static final class a extends AbstractC0289o.a<k$C, a> implements k$D {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$C.f4510d);
        }

        public a a(String str) {
            b();
            ((k$C) this.f4426b).b(str);
            return this;
        }

        public a a(C0299k$c c0299k$c) {
            b();
            ((k$C) this.f4426b).a(c0299k$c);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$C();
            case 2:
                return f4510d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$C k_c = (k$C) obj2;
                this.f4512f = jVar2.a(!this.f4512f.isEmpty(), this.f4512f, true ^ k_c.f4512f.isEmpty(), k_c.f4512f);
                this.f4513g = (C0299k$c) jVar2.a(this.f4513g, k_c.f4513g);
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
                                this.f4512f = c0281g.l();
                            } else if (iA != 18) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                C0299k$c.a aVarB = this.f4513g != null ? this.f4513g.b() : null;
                                this.f4513g = (C0299k$c) c0281g.a(C0299k$c.n(), c0285k);
                                if (aVarB != null) {
                                    aVarB.b((C0299k$c.a) this.f4513g);
                                    this.f4513g = aVarB.g();
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
                if (f4511e == null) {
                    synchronized (k$C.class) {
                        if (f4511e == null) {
                            f4511e = new AbstractC0289o.b(f4510d);
                        }
                    }
                }
                return f4511e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4510d;
    }

    static {
        f4510d.i();
    }
}

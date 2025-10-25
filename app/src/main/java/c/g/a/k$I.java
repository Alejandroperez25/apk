package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.g.a.C0297k$a;
import c.g.a.C0303k$g;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k$I extends AbstractC0289o<k$I, a> implements k$J {

    /* renamed from: d, reason: collision with root package name */
    private static final k$I f4524d = new k$I();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$I> f4525e;

    /* renamed from: f, reason: collision with root package name */
    private C0303k$g f4526f;

    /* renamed from: g, reason: collision with root package name */
    private C0297k$a f4527g;

    /* renamed from: h, reason: collision with root package name */
    private int f4528h;

    private k$I() {
    }

    public C0303k$g n() {
        return this.f4526f == null ? C0303k$g.m() : this.f4526f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0303k$g c0303k$g) {
        if (c0303k$g == null) {
            throw new NullPointerException();
        }
        this.f4526f = c0303k$g;
    }

    public C0297k$a o() {
        return this.f4527g == null ? C0297k$a.m() : this.f4527g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0297k$a c0297k$a) {
        if (c0297k$a == null) {
            throw new NullPointerException();
        }
        this.f4527g = c0297k$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        this.f4528h = i2;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4526f != null) {
            abstractC0283i.b(1, n());
        }
        if (this.f4527g != null) {
            abstractC0283i.b(2, o());
        }
        if (this.f4528h != 0) {
            abstractC0283i.d(3, this.f4528h);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4526f != null ? 0 + AbstractC0283i.a(1, n()) : 0;
        if (this.f4527g != null) {
            iA += AbstractC0283i.a(2, o());
        }
        if (this.f4528h != 0) {
            iA += AbstractC0283i.a(3, this.f4528h);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4524d.b();
    }

    public static final class a extends AbstractC0289o.a<k$I, a> implements k$J {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$I.f4524d);
        }

        public a a(C0303k$g c0303k$g) {
            b();
            ((k$I) this.f4426b).a(c0303k$g);
            return this;
        }

        public a a(C0297k$a c0297k$a) {
            b();
            ((k$I) this.f4426b).a(c0297k$a);
            return this;
        }

        public a a(int i2) {
            b();
            ((k$I) this.f4426b).a(i2);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$I();
            case 2:
                return f4524d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$I k_i = (k$I) obj2;
                this.f4526f = (C0303k$g) jVar2.a(this.f4526f, k_i.f4526f);
                this.f4527g = (C0297k$a) jVar2.a(this.f4527g, k_i.f4527g);
                this.f4528h = jVar2.a(this.f4528h != 0, this.f4528h, k_i.f4528h != 0, k_i.f4528h);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                C0285k c0285k = (C0285k) obj2;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    C0303k$g.a aVarB = this.f4526f != null ? this.f4526f.b() : null;
                                    this.f4526f = (C0303k$g) c0281g.a(C0303k$g.n(), c0285k);
                                    if (aVarB != null) {
                                        aVarB.b((C0303k$g.a) this.f4526f);
                                        this.f4526f = aVarB.g();
                                    }
                                } else if (iA == 18) {
                                    C0297k$a.a aVarB2 = this.f4527g != null ? this.f4527g.b() : null;
                                    this.f4527g = (C0297k$a) c0281g.a(C0297k$a.n(), c0285k);
                                    if (aVarB2 != null) {
                                        aVarB2.b((C0297k$a.a) this.f4527g);
                                        this.f4527g = aVarB2.g();
                                    }
                                } else if (iA != 24) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.f4528h = c0281g.g();
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
                if (f4525e == null) {
                    synchronized (k$I.class) {
                        if (f4525e == null) {
                            f4525e = new AbstractC0289o.b(f4524d);
                        }
                    }
                }
                return f4525e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4524d;
    }

    static {
        f4524d.i();
    }
}

package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class k$K extends AbstractC0289o<k$K, a> implements k$L {

    /* renamed from: d, reason: collision with root package name */
    private static final k$K f4529d = new k$K();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<k$K> f4530e;

    /* renamed from: f, reason: collision with root package name */
    private int f4531f;

    /* renamed from: g, reason: collision with root package name */
    private int f4532g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC0290p.c<String> f4533h = AbstractC0289o.e();

    private k$K() {
    }

    public int n() {
        return this.f4532g;
    }

    public List<String> o() {
        return this.f4533h;
    }

    public int p() {
        return this.f4533h.size();
    }

    public String a(int i2) {
        return this.f4533h.get(i2);
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4532g != 0) {
            abstractC0283i.d(1, this.f4532g);
        }
        for (int i2 = 0; i2 < this.f4533h.size(); i2++) {
            abstractC0283i.b(2, this.f4533h.get(i2));
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4532g != 0 ? AbstractC0283i.a(1, this.f4532g) + 0 : 0;
        int iA2 = 0;
        for (int i3 = 0; i3 < this.f4533h.size(); i3++) {
            iA2 += AbstractC0283i.a(this.f4533h.get(i3));
        }
        int size = iA + iA2 + (o().size() * 1);
        this.f4424c = size;
        return size;
    }

    public static a l() {
        return f4529d.b();
    }

    public static final class a extends AbstractC0289o.a<k$K, a> implements k$L {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k$K.f4529d);
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new k$K();
            case 2:
                return f4529d;
            case 3:
                this.f4533h.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                k$K k_k = (k$K) obj2;
                this.f4532g = jVar2.a(this.f4532g != 0, this.f4532g, k_k.f4532g != 0, k_k.f4532g);
                this.f4533h = jVar2.a(this.f4533h, k_k.f4533h);
                if (jVar2 == AbstractC0289o.h.f4433a) {
                    this.f4531f |= k_k.f4531f;
                }
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 8) {
                                this.f4532g = c0281g.g();
                            } else if (iA != 18) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                String strL = c0281g.l();
                                if (!this.f4533h.b()) {
                                    this.f4533h = AbstractC0289o.a(this.f4533h);
                                }
                                this.f4533h.add(strL);
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
                if (f4530e == null) {
                    synchronized (k$K.class) {
                        if (f4530e == null) {
                            f4530e = new AbstractC0289o.b(f4529d);
                        }
                    }
                }
                return f4530e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4529d;
    }

    static {
        f4529d.i();
    }
}

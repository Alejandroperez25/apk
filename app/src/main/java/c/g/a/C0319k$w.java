package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319k$w extends AbstractC0289o<C0319k$w, a> implements InterfaceC0320k$x {

    /* renamed from: d, reason: collision with root package name */
    private static final C0319k$w f4652d = new C0319k$w();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0319k$w> f4653e;

    /* renamed from: f, reason: collision with root package name */
    private int f4654f;

    private C0319k$w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        this.f4654f = i2;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4654f != 0) {
            abstractC0283i.d(1, this.f4654f);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4654f != 0 ? 0 + AbstractC0283i.a(1, this.f4654f) : 0;
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4652d.b();
    }

    /* renamed from: c.g.a.k$w$a */
    public static final class a extends AbstractC0289o.a<C0319k$w, a> implements InterfaceC0320k$x {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0319k$w.f4652d);
        }

        public a a(int i2) {
            b();
            ((C0319k$w) this.f4426b).a(i2);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0319k$w();
            case 2:
                return f4652d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                C0319k$w c0319k$w = (C0319k$w) obj2;
                this.f4654f = ((AbstractC0289o.j) obj).a(this.f4654f != 0, this.f4654f, c0319k$w.f4654f != 0, c0319k$w.f4654f);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA != 8) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.f4654f = c0281g.g();
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
                if (f4653e == null) {
                    synchronized (C0319k$w.class) {
                        if (f4653e == null) {
                            f4653e = new AbstractC0289o.b(f4652d);
                        }
                    }
                }
                return f4653e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4652d;
    }

    static {
        f4652d.i();
    }

    public static C0319k$w m() {
        return f4652d;
    }

    public static A<C0319k$w> n() {
        return f4652d.f();
    }
}

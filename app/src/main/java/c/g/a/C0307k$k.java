package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307k$k extends AbstractC0289o<C0307k$k, a> implements InterfaceC0308k$l {

    /* renamed from: d, reason: collision with root package name */
    private static final C0307k$k f4610d = new C0307k$k();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0307k$k> f4611e;

    /* renamed from: f, reason: collision with root package name */
    private int f4612f;

    private C0307k$k() {
    }

    /* renamed from: c.g.a.k$k$b */
    public enum b implements AbstractC0290p.a {
        UNKNOWN(0),
        UNAVAILABLE(1),
        UNAUTHORIZED(2),
        TURNING_ON(3),
        ON(4),
        TURNING_OFF(5),
        OFF(6),
        UNRECOGNIZED(-1);


        /* renamed from: i, reason: collision with root package name */
        private static final AbstractC0290p.b<b> f4621i = new m();
        private final int k;

        @Override // c.d.d.AbstractC0290p.a
        public final int a() {
            return this.k;
        }

        b(int i2) {
            this.k = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        }
        this.f4612f = bVar.a();
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (this.f4612f != b.UNKNOWN.a()) {
            abstractC0283i.e(1, this.f4612f);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iB = this.f4612f != b.UNKNOWN.a() ? 0 + AbstractC0283i.b(1, this.f4612f) : 0;
        this.f4424c = iB;
        return iB;
    }

    public static a l() {
        return f4610d.b();
    }

    /* renamed from: c.g.a.k$k$a */
    public static final class a extends AbstractC0289o.a<C0307k$k, a> implements InterfaceC0308k$l {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0307k$k.f4610d);
        }

        public a a(b bVar) {
            b();
            ((C0307k$k) this.f4426b).a(bVar);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0307k$k();
            case 2:
                return f4610d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                C0307k$k c0307k$k = (C0307k$k) obj2;
                this.f4612f = ((AbstractC0289o.j) obj).a(this.f4612f != 0, this.f4612f, c0307k$k.f4612f != 0, c0307k$k.f4612f);
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
                                    this.f4612f = c0281g.o();
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
                if (f4611e == null) {
                    synchronized (C0307k$k.class) {
                        if (f4611e == null) {
                            f4611e = new AbstractC0289o.b(f4610d);
                        }
                    }
                }
                return f4611e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4610d;
    }

    static {
        f4610d.i();
    }
}

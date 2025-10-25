package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315k$s extends AbstractC0289o<C0315k$s, b> implements InterfaceC0316k$t {

    /* renamed from: d, reason: collision with root package name */
    private static final C0315k$s f4635d = new C0315k$s();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0315k$s> f4636e;

    /* renamed from: f, reason: collision with root package name */
    private String f4637f = "";

    /* renamed from: g, reason: collision with root package name */
    private int f4638g;

    private C0315k$s() {
    }

    /* renamed from: c.g.a.k$s$a */
    public enum a implements AbstractC0290p.a {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        UNRECOGNIZED(-1);


        /* renamed from: f, reason: collision with root package name */
        private static final AbstractC0290p.b<a> f4644f = new n();

        /* renamed from: h, reason: collision with root package name */
        private final int f4646h;

        @Override // c.d.d.AbstractC0290p.a
        public final int a() {
            return this.f4646h;
        }

        a(int i2) {
            this.f4646h = i2;
        }
    }

    public String n() {
        return this.f4637f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4637f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar == null) {
            throw new NullPointerException();
        }
        this.f4638g = aVar.a();
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4637f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (this.f4638g != a.DISCONNECTED.a()) {
            abstractC0283i.e(2, this.f4638g);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4637f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (this.f4638g != a.DISCONNECTED.a()) {
            iA += AbstractC0283i.b(2, this.f4638g);
        }
        this.f4424c = iA;
        return iA;
    }

    public static b l() {
        return f4635d.b();
    }

    /* renamed from: c.g.a.k$s$b */
    public static final class b extends AbstractC0289o.a<C0315k$s, b> implements InterfaceC0316k$t {
        /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
            super(C0315k$s.f4635d);
        }

        public b a(String str) {
            b();
            ((C0315k$s) this.f4426b).b(str);
            return this;
        }

        public b a(a aVar) {
            b();
            ((C0315k$s) this.f4426b).a(aVar);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0315k$s();
            case 2:
                return f4635d;
            case 3:
                return null;
            case 4:
                return new b(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0315k$s c0315k$s = (C0315k$s) obj2;
                this.f4637f = jVar2.a(!this.f4637f.isEmpty(), this.f4637f, !c0315k$s.f4637f.isEmpty(), c0315k$s.f4637f);
                this.f4638g = jVar2.a(this.f4638g != 0, this.f4638g, c0315k$s.f4638g != 0, c0315k$s.f4638g);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4637f = c0281g.l();
                                } else if (iA != 16) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.f4638g = c0281g.o();
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
                if (f4636e == null) {
                    synchronized (C0315k$s.class) {
                        if (f4636e == null) {
                            f4636e = new AbstractC0289o.b(f4635d);
                        }
                    }
                }
                return f4636e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4635d;
    }

    static {
        f4635d.i();
    }
}

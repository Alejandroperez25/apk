package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303k$g extends AbstractC0289o<C0303k$g, a> implements InterfaceC0304k$h {

    /* renamed from: d, reason: collision with root package name */
    private static final C0303k$g f4591d = new C0303k$g();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0303k$g> f4592e;

    /* renamed from: f, reason: collision with root package name */
    private String f4593f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f4594g = "";

    /* renamed from: h, reason: collision with root package name */
    private int f4595h;

    private C0303k$g() {
    }

    /* renamed from: c.g.a.k$g$b */
    public enum b implements AbstractC0290p.a {
        UNKNOWN(0),
        CLASSIC(1),
        LE(2),
        DUAL(3),
        UNRECOGNIZED(-1);


        /* renamed from: f, reason: collision with root package name */
        private static final AbstractC0290p.b<b> f4601f = new l();

        /* renamed from: h, reason: collision with root package name */
        private final int f4603h;

        @Override // c.d.d.AbstractC0290p.a
        public final int a() {
            return this.f4603h;
        }

        b(int i2) {
            this.f4603h = i2;
        }
    }

    public String p() {
        return this.f4593f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4593f = str;
    }

    public String q() {
        return this.f4594g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4594g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        }
        this.f4595h = bVar.a();
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4593f.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (!this.f4594g.isEmpty()) {
            abstractC0283i.b(2, q());
        }
        if (this.f4595h != b.UNKNOWN.a()) {
            abstractC0283i.e(3, this.f4595h);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4593f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, p());
        if (!this.f4594g.isEmpty()) {
            iA += AbstractC0283i.a(2, q());
        }
        if (this.f4595h != b.UNKNOWN.a()) {
            iA += AbstractC0283i.b(3, this.f4595h);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4591d.b();
    }

    /* renamed from: c.g.a.k$g$a */
    public static final class a extends AbstractC0289o.a<C0303k$g, a> implements InterfaceC0304k$h {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0303k$g.f4591d);
        }

        public a a(String str) {
            b();
            ((C0303k$g) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((C0303k$g) this.f4426b).c(str);
            return this;
        }

        public a a(b bVar) {
            b();
            ((C0303k$g) this.f4426b).a(bVar);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0303k$g();
            case 2:
                return f4591d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0303k$g c0303k$g = (C0303k$g) obj2;
                this.f4593f = jVar2.a(!this.f4593f.isEmpty(), this.f4593f, !c0303k$g.f4593f.isEmpty(), c0303k$g.f4593f);
                this.f4594g = jVar2.a(!this.f4594g.isEmpty(), this.f4594g, !c0303k$g.f4594g.isEmpty(), c0303k$g.f4594g);
                this.f4595h = jVar2.a(this.f4595h != 0, this.f4595h, c0303k$g.f4595h != 0, c0303k$g.f4595h);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                while (!z) {
                    try {
                        int iA = c0281g.a();
                        if (iA != 0) {
                            if (iA == 10) {
                                this.f4593f = c0281g.l();
                            } else if (iA == 18) {
                                this.f4594g = c0281g.l();
                            } else if (iA != 24) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                this.f4595h = c0281g.o();
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
                if (f4592e == null) {
                    synchronized (C0303k$g.class) {
                        if (f4592e == null) {
                            f4592e = new AbstractC0289o.b(f4591d);
                        }
                    }
                }
                return f4592e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4591d;
    }

    static {
        f4591d.i();
    }

    public static C0303k$g m() {
        return f4591d;
    }

    public static A<C0303k$g> n() {
        return f4591d.f();
    }
}

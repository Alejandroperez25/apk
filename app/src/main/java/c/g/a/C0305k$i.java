package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305k$i extends AbstractC0289o<C0305k$i, a> implements InterfaceC0306k$j {

    /* renamed from: d, reason: collision with root package name */
    private static final C0305k$i f4604d = new C0305k$i();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0305k$i> f4605e;

    /* renamed from: f, reason: collision with root package name */
    private int f4606f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4609i;

    /* renamed from: g, reason: collision with root package name */
    private String f4607g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f4608h = "";
    private AbstractC0290p.c<C0299k$c> j = AbstractC0289o.e();
    private AbstractC0290p.c<C0305k$i> k = AbstractC0289o.e();

    private C0305k$i() {
    }

    public String o() {
        return this.f4607g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4607g = str;
    }

    public String p() {
        return this.f4608h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4608h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f4609i = z;
    }

    private void q() {
        if (this.j.b()) {
            return;
        }
        this.j = AbstractC0289o.a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0299k$c c0299k$c) {
        if (c0299k$c == null) {
            throw new NullPointerException();
        }
        q();
        this.j.add(c0299k$c);
    }

    private void r() {
        if (this.k.b()) {
            return;
        }
        this.k = AbstractC0289o.a(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0305k$i c0305k$i) {
        if (c0305k$i == null) {
            throw new NullPointerException();
        }
        r();
        this.k.add(c0305k$i);
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4607g.isEmpty()) {
            abstractC0283i.b(1, o());
        }
        if (!this.f4608h.isEmpty()) {
            abstractC0283i.b(2, p());
        }
        if (this.f4609i) {
            abstractC0283i.b(3, this.f4609i);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            abstractC0283i.b(4, this.j.get(i2));
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            abstractC0283i.b(5, this.k.get(i3));
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = !this.f4607g.isEmpty() ? AbstractC0283i.a(1, o()) + 0 : 0;
        if (!this.f4608h.isEmpty()) {
            iA += AbstractC0283i.a(2, p());
        }
        if (this.f4609i) {
            iA += AbstractC0283i.a(3, this.f4609i);
        }
        int iA2 = iA;
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            iA2 += AbstractC0283i.a(4, this.j.get(i3));
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            iA2 += AbstractC0283i.a(5, this.k.get(i4));
        }
        this.f4424c = iA2;
        return iA2;
    }

    public static a l() {
        return f4604d.b();
    }

    /* renamed from: c.g.a.k$i$a */
    public static final class a extends AbstractC0289o.a<C0305k$i, a> implements InterfaceC0306k$j {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0305k$i.f4604d);
        }

        public a a(String str) {
            b();
            ((C0305k$i) this.f4426b).b(str);
            return this;
        }

        public a b(String str) {
            b();
            ((C0305k$i) this.f4426b).c(str);
            return this;
        }

        public a a(boolean z) {
            b();
            ((C0305k$i) this.f4426b).a(z);
            return this;
        }

        public a a(C0299k$c c0299k$c) {
            b();
            ((C0305k$i) this.f4426b).a(c0299k$c);
            return this;
        }

        public a a(C0305k$i c0305k$i) {
            b();
            ((C0305k$i) this.f4426b).a(c0305k$i);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0305k$i();
            case 2:
                return f4604d;
            case 3:
                this.j.a();
                this.k.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0305k$i c0305k$i = (C0305k$i) obj2;
                this.f4607g = jVar2.a(!this.f4607g.isEmpty(), this.f4607g, !c0305k$i.f4607g.isEmpty(), c0305k$i.f4607g);
                this.f4608h = jVar2.a(!this.f4608h.isEmpty(), this.f4608h, true ^ c0305k$i.f4608h.isEmpty(), c0305k$i.f4608h);
                this.f4609i = jVar2.a(this.f4609i, this.f4609i, c0305k$i.f4609i, c0305k$i.f4609i);
                this.j = jVar2.a(this.j, c0305k$i.j);
                this.k = jVar2.a(this.k, c0305k$i.k);
                if (jVar2 == AbstractC0289o.h.f4433a) {
                    this.f4606f |= c0305k$i.f4606f;
                }
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
                                this.f4607g = c0281g.l();
                            } else if (iA == 18) {
                                this.f4608h = c0281g.l();
                            } else if (iA == 24) {
                                this.f4609i = c0281g.j();
                            } else if (iA == 34) {
                                if (!this.j.b()) {
                                    this.j = AbstractC0289o.a(this.j);
                                }
                                this.j.add(c0281g.a(C0299k$c.n(), c0285k));
                            } else if (iA != 42) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                if (!this.k.b()) {
                                    this.k = AbstractC0289o.a(this.k);
                                }
                                this.k.add(c0281g.a(m(), c0285k));
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
                if (f4605e == null) {
                    synchronized (C0305k$i.class) {
                        if (f4605e == null) {
                            f4605e = new AbstractC0289o.b(f4604d);
                        }
                    }
                }
                return f4605e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4604d;
    }

    static {
        f4604d.i();
    }

    public static A<C0305k$i> m() {
        return f4604d.f();
    }
}

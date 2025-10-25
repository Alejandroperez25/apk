package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0280f;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import c.d.d.C0296v;
import c.d.d.S;
import c.d.d.w;
import c.g.a.C0319k$w;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: c.g.a.k$a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297k$a extends AbstractC0289o<C0297k$a, a> implements InterfaceC0298k$b {

    /* renamed from: d, reason: collision with root package name */
    private static final C0297k$a f4571d = new C0297k$a();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0297k$a> f4572e;

    /* renamed from: f, reason: collision with root package name */
    private int f4573f;

    /* renamed from: h, reason: collision with root package name */
    private C0319k$w f4575h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4576i;
    private w<Integer, AbstractC0280f> j = w.a();
    private w<String, AbstractC0280f> k = w.a();

    /* renamed from: g, reason: collision with root package name */
    private String f4574g = "";
    private AbstractC0290p.c<String> l = AbstractC0289o.e();

    /* renamed from: c.g.a.k$a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final C0296v<Integer, AbstractC0280f> f4577a = C0296v.a(S.a.f4366e, 0, S.a.l, AbstractC0280f.f4390a);
    }

    /* renamed from: c.g.a.k$a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final C0296v<String, AbstractC0280f> f4578a = C0296v.a(S.a.f4370i, "", S.a.l, AbstractC0280f.f4390a);
    }

    private C0297k$a() {
    }

    public String p() {
        return this.f4574g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4574g = str;
    }

    public C0319k$w q() {
        return this.f4575h == null ? C0319k$w.m() : this.f4575h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0319k$w.a aVar) {
        this.f4575h = aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f4576i = z;
    }

    private w<Integer, AbstractC0280f> s() {
        return this.j;
    }

    private w<Integer, AbstractC0280f> t() {
        if (!this.j.d()) {
            this.j = this.j.b();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, AbstractC0280f> u() {
        return t();
    }

    private w<String, AbstractC0280f> v() {
        return this.k;
    }

    private w<String, AbstractC0280f> w() {
        if (!this.k.d()) {
            this.k = this.k.b();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, AbstractC0280f> x() {
        return w();
    }

    public List<String> r() {
        return this.l;
    }

    private void y() {
        if (this.l.b()) {
            return;
        }
        this.l = AbstractC0289o.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        y();
        this.l.add(str);
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4574g.isEmpty()) {
            abstractC0283i.b(1, p());
        }
        if (this.f4575h != null) {
            abstractC0283i.b(2, q());
        }
        if (this.f4576i) {
            abstractC0283i.b(3, this.f4576i);
        }
        for (Map.Entry<Integer, AbstractC0280f> entry : s().entrySet()) {
            b.f4577a.a(abstractC0283i, 4, (int) entry.getKey(), (Integer) entry.getValue());
        }
        for (Map.Entry<String, AbstractC0280f> entry2 : v().entrySet()) {
            c.f4578a.a(abstractC0283i, 5, (int) entry2.getKey(), (String) entry2.getValue());
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC0283i.b(6, this.l.get(i2));
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = !this.f4574g.isEmpty() ? AbstractC0283i.a(1, p()) + 0 : 0;
        if (this.f4575h != null) {
            iA += AbstractC0283i.a(2, q());
        }
        if (this.f4576i) {
            iA += AbstractC0283i.a(3, this.f4576i);
        }
        for (Map.Entry<Integer, AbstractC0280f> entry : s().entrySet()) {
            iA += b.f4577a.a(4, (int) entry.getKey(), (Integer) entry.getValue());
        }
        for (Map.Entry<String, AbstractC0280f> entry2 : v().entrySet()) {
            iA += c.f4578a.a(5, (int) entry2.getKey(), (String) entry2.getValue());
        }
        int iA2 = 0;
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            iA2 += AbstractC0283i.a(this.l.get(i3));
        }
        int size = iA + iA2 + (r().size() * 1);
        this.f4424c = size;
        return size;
    }

    public static a l() {
        return f4571d.b();
    }

    /* renamed from: c.g.a.k$a$a */
    public static final class a extends AbstractC0289o.a<C0297k$a, a> implements InterfaceC0298k$b {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0297k$a.f4571d);
        }

        public a a(String str) {
            b();
            ((C0297k$a) this.f4426b).b(str);
            return this;
        }

        public a a(C0319k$w.a aVar) {
            b();
            ((C0297k$a) this.f4426b).a(aVar);
            return this;
        }

        public a a(boolean z) {
            b();
            ((C0297k$a) this.f4426b).a(z);
            return this;
        }

        public a a(int i2, AbstractC0280f abstractC0280f) {
            if (abstractC0280f == null) {
                throw new NullPointerException();
            }
            b();
            ((C0297k$a) this.f4426b).u().put(Integer.valueOf(i2), abstractC0280f);
            return this;
        }

        public a a(String str, AbstractC0280f abstractC0280f) {
            if (str == null) {
                throw new NullPointerException();
            }
            if (abstractC0280f == null) {
                throw new NullPointerException();
            }
            b();
            ((C0297k$a) this.f4426b).x().put(str, abstractC0280f);
            return this;
        }

        public a b(String str) {
            b();
            ((C0297k$a) this.f4426b).c(str);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0297k$a();
            case 2:
                return f4571d;
            case 3:
                this.j.c();
                this.k.c();
                this.l.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0297k$a c0297k$a = (C0297k$a) obj2;
                this.f4574g = jVar2.a(!this.f4574g.isEmpty(), this.f4574g, true ^ c0297k$a.f4574g.isEmpty(), c0297k$a.f4574g);
                this.f4575h = (C0319k$w) jVar2.a(this.f4575h, c0297k$a.f4575h);
                this.f4576i = jVar2.a(this.f4576i, this.f4576i, c0297k$a.f4576i, c0297k$a.f4576i);
                this.j = jVar2.a(this.j, c0297k$a.s());
                this.k = jVar2.a(this.k, c0297k$a.v());
                this.l = jVar2.a(this.l, c0297k$a.l);
                if (jVar2 == AbstractC0289o.h.f4433a) {
                    this.f4573f |= c0297k$a.f4573f;
                }
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                C0285k c0285k = (C0285k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4574g = c0281g.l();
                                } else if (iA == 18) {
                                    C0319k$w.a aVarB = this.f4575h != null ? this.f4575h.b() : null;
                                    this.f4575h = (C0319k$w) c0281g.a(C0319k$w.n(), c0285k);
                                    if (aVarB != null) {
                                        aVarB.b((C0319k$w.a) this.f4575h);
                                        this.f4575h = aVarB.g();
                                    }
                                } else if (iA == 24) {
                                    this.f4576i = c0281g.j();
                                } else if (iA == 34) {
                                    if (!this.j.d()) {
                                        this.j = this.j.b();
                                    }
                                    b.f4577a.a(this.j, c0281g, c0285k);
                                } else if (iA == 42) {
                                    if (!this.k.d()) {
                                        this.k = this.k.b();
                                    }
                                    c.f4578a.a(this.k, c0281g, c0285k);
                                } else if (iA != 50) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    String strL = c0281g.l();
                                    if (!this.l.b()) {
                                        this.l = AbstractC0289o.a(this.l);
                                    }
                                    this.l.add(strL);
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
                if (f4572e == null) {
                    synchronized (C0297k$a.class) {
                        if (f4572e == null) {
                            f4572e = new AbstractC0289o.b(f4571d);
                        }
                    }
                }
                return f4572e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4571d;
    }

    static {
        f4571d.i();
    }

    public static C0297k$a m() {
        return f4571d;
    }

    public static A<C0297k$a> n() {
        return f4571d.f();
    }
}

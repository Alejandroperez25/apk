package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317k$u extends AbstractC0289o<C0317k$u, a> implements InterfaceC0318k$v {

    /* renamed from: d, reason: collision with root package name */
    private static final C0317k$u f4647d = new C0317k$u();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0317k$u> f4648e;

    /* renamed from: f, reason: collision with root package name */
    private int f4649f;

    /* renamed from: g, reason: collision with root package name */
    private String f4650g = "";

    /* renamed from: h, reason: collision with root package name */
    private AbstractC0290p.c<C0305k$i> f4651h = AbstractC0289o.e();

    private C0317k$u() {
    }

    public String n() {
        return this.f4650g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f4650g = str;
    }

    private void o() {
        if (this.f4651h.b()) {
            return;
        }
        this.f4651h = AbstractC0289o.a(this.f4651h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0305k$i c0305k$i) {
        if (c0305k$i == null) {
            throw new NullPointerException();
        }
        o();
        this.f4651h.add(c0305k$i);
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4650g.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        for (int i2 = 0; i2 < this.f4651h.size(); i2++) {
            abstractC0283i.b(2, this.f4651h.get(i2));
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = !this.f4650g.isEmpty() ? AbstractC0283i.a(1, n()) + 0 : 0;
        for (int i3 = 0; i3 < this.f4651h.size(); i3++) {
            iA += AbstractC0283i.a(2, this.f4651h.get(i3));
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4647d.b();
    }

    /* renamed from: c.g.a.k$u$a */
    public static final class a extends AbstractC0289o.a<C0317k$u, a> implements InterfaceC0318k$v {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0317k$u.f4647d);
        }

        public a a(String str) {
            b();
            ((C0317k$u) this.f4426b).b(str);
            return this;
        }

        public a a(C0305k$i c0305k$i) {
            b();
            ((C0317k$u) this.f4426b).a(c0305k$i);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0317k$u();
            case 2:
                return f4647d;
            case 3:
                this.f4651h.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0317k$u c0317k$u = (C0317k$u) obj2;
                this.f4650g = jVar2.a(!this.f4650g.isEmpty(), this.f4650g, true ^ c0317k$u.f4650g.isEmpty(), c0317k$u.f4650g);
                this.f4651h = jVar2.a(this.f4651h, c0317k$u.f4651h);
                if (jVar2 == AbstractC0289o.h.f4433a) {
                    this.f4649f |= c0317k$u.f4649f;
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
                                    this.f4650g = c0281g.l();
                                } else if (iA != 18) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    if (!this.f4651h.b()) {
                                        this.f4651h = AbstractC0289o.a(this.f4651h);
                                    }
                                    this.f4651h.add(c0281g.a(C0305k$i.m(), c0285k));
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
                if (f4648e == null) {
                    synchronized (C0317k$u.class) {
                        if (f4648e == null) {
                            f4648e = new AbstractC0289o.b(f4647d);
                        }
                    }
                }
                return f4648e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4647d;
    }

    static {
        f4647d.i();
    }
}

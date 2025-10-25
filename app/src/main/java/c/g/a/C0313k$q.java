package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0290p;
import c.d.d.C0281g;
import c.d.d.C0285k;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313k$q extends AbstractC0289o<C0313k$q, a> implements InterfaceC0314k$r {

    /* renamed from: d, reason: collision with root package name */
    private static final C0313k$q f4632d = new C0313k$q();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0313k$q> f4633e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC0290p.c<C0303k$g> f4634f = AbstractC0289o.e();

    private C0313k$q() {
    }

    private void n() {
        if (this.f4634f.b()) {
            return;
        }
        this.f4634f = AbstractC0289o.a(this.f4634f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0303k$g c0303k$g) {
        if (c0303k$g == null) {
            throw new NullPointerException();
        }
        n();
        this.f4634f.add(c0303k$g);
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        for (int i2 = 0; i2 < this.f4634f.size(); i2++) {
            abstractC0283i.b(1, this.f4634f.get(i2));
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = 0;
        for (int i3 = 0; i3 < this.f4634f.size(); i3++) {
            iA += AbstractC0283i.a(1, this.f4634f.get(i3));
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4632d.b();
    }

    /* renamed from: c.g.a.k$q$a */
    public static final class a extends AbstractC0289o.a<C0313k$q, a> implements InterfaceC0314k$r {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0313k$q.f4632d);
        }

        public a a(C0303k$g c0303k$g) {
            b();
            ((C0313k$q) this.f4426b).a(c0303k$g);
            return this;
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0313k$q();
            case 2:
                return f4632d;
            case 3:
                this.f4634f.a();
                return null;
            case 4:
                return new a(jVar);
            case 5:
                this.f4634f = ((AbstractC0289o.j) obj).a(this.f4634f, ((C0313k$q) obj2).f4634f);
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
                            if (iA != 10) {
                                if (!c0281g.c(iA)) {
                                }
                            } else {
                                if (!this.f4634f.b()) {
                                    this.f4634f = AbstractC0289o.a(this.f4634f);
                                }
                                this.f4634f.add(c0281g.a(C0303k$g.n(), c0285k));
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
                if (f4633e == null) {
                    synchronized (C0313k$q.class) {
                        if (f4633e == null) {
                            f4633e = new AbstractC0289o.b(f4632d);
                        }
                    }
                }
                return f4633e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4632d;
    }

    static {
        f4632d.i();
    }
}

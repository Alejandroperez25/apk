package c.g.a;

import c.d.d.A;
import c.d.d.AbstractC0283i;
import c.d.d.AbstractC0289o;
import c.d.d.C0281g;
import c.d.d.C0291q;
import java.io.IOException;

/* renamed from: c.g.a.k$o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311k$o extends AbstractC0289o<C0311k$o, a> implements InterfaceC0312k$p {

    /* renamed from: d, reason: collision with root package name */
    private static final C0311k$o f4628d = new C0311k$o();

    /* renamed from: e, reason: collision with root package name */
    private static volatile A<C0311k$o> f4629e;

    /* renamed from: f, reason: collision with root package name */
    private String f4630f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f4631g;

    private C0311k$o() {
    }

    public String n() {
        return this.f4630f;
    }

    public boolean o() {
        return this.f4631g;
    }

    @Override // c.d.d.x
    public void a(AbstractC0283i abstractC0283i) {
        if (!this.f4630f.isEmpty()) {
            abstractC0283i.b(1, n());
        }
        if (this.f4631g) {
            abstractC0283i.b(2, this.f4631g);
        }
    }

    @Override // c.d.d.x
    public int c() {
        int i2 = this.f4424c;
        if (i2 != -1) {
            return i2;
        }
        int iA = this.f4630f.isEmpty() ? 0 : 0 + AbstractC0283i.a(1, n());
        if (this.f4631g) {
            iA += AbstractC0283i.a(2, this.f4631g);
        }
        this.f4424c = iA;
        return iA;
    }

    public static a l() {
        return f4628d.b();
    }

    /* renamed from: c.g.a.k$o$a */
    public static final class a extends AbstractC0289o.a<C0311k$o, a> implements InterfaceC0312k$p {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(C0311k$o.f4628d);
        }
    }

    @Override // c.d.d.AbstractC0289o
    protected final Object a(AbstractC0289o.i iVar, Object obj, Object obj2) {
        j jVar = null;
        switch (j.f4503a[iVar.ordinal()]) {
            case 1:
                return new C0311k$o();
            case 2:
                return f4628d;
            case 3:
                return null;
            case 4:
                return new a(jVar);
            case 5:
                AbstractC0289o.j jVar2 = (AbstractC0289o.j) obj;
                C0311k$o c0311k$o = (C0311k$o) obj2;
                this.f4630f = jVar2.a(!this.f4630f.isEmpty(), this.f4630f, true ^ c0311k$o.f4630f.isEmpty(), c0311k$o.f4630f);
                this.f4631g = jVar2.a(this.f4631g, this.f4631g, c0311k$o.f4631g, c0311k$o.f4631g);
                AbstractC0289o.h hVar = AbstractC0289o.h.f4433a;
                return this;
            case 6:
                C0281g c0281g = (C0281g) obj;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iA = c0281g.a();
                            if (iA != 0) {
                                if (iA == 10) {
                                    this.f4630f = c0281g.l();
                                } else if (iA != 16) {
                                    if (!c0281g.c(iA)) {
                                    }
                                } else {
                                    this.f4631g = c0281g.j();
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
                if (f4629e == null) {
                    synchronized (C0311k$o.class) {
                        if (f4629e == null) {
                            f4629e = new AbstractC0289o.b(f4628d);
                        }
                    }
                }
                return f4629e;
            default:
                throw new UnsupportedOperationException();
        }
        return f4628d;
    }

    static {
        f4628d.i();
    }
}

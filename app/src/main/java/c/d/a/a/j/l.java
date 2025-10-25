package c.d.a.a.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.d.a.a.AbstractC0131c;
import c.d.a.a.C0145h;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;
import c.d.a.a.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends AbstractC0131c implements Handler.Callback {
    private final Handler j;
    private final k k;
    private final h l;
    private final r m;
    private boolean n;
    private boolean o;
    private int p;
    private q q;
    private e r;
    private i s;
    private j t;
    private j u;
    private int v;

    @Override // c.d.a.a.E
    public boolean c() {
        return true;
    }

    public l(k kVar, Looper looper) {
        this(kVar, looper, h.f3233a);
    }

    public l(k kVar, Looper looper, h hVar) {
        super(3);
        AbstractC0170e.a(kVar);
        this.k = kVar;
        this.j = looper == null ? null : H.a(looper, (Handler.Callback) this);
        this.l = hVar;
        this.m = new r();
    }

    @Override // c.d.a.a.F
    public int a(q qVar) {
        return this.l.a(qVar) ? AbstractC0131c.a((c.d.a.a.d.h<?>) null, qVar.j) ? 4 : 2 : c.d.a.a.m.r.c(qVar.f3682g) ? 1 : 0;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(q[] qVarArr, long j) {
        this.q = qVarArr[0];
        if (this.r != null) {
            this.p = 1;
        } else {
            this.r = this.l.b(this.q);
        }
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(long j, boolean z) {
        A();
        this.n = false;
        this.o = false;
        if (this.p != 0) {
            y();
        } else {
            w();
            this.r.flush();
        }
    }

    @Override // c.d.a.a.E
    public void a(long j, long j2) throws C0145h {
        boolean z;
        if (this.o) {
            return;
        }
        if (this.u == null) {
            this.r.a(j);
            try {
                this.u = this.r.b();
            } catch (f e2) {
                throw C0145h.a(e2, u());
            }
        }
        if (f() != 2) {
            return;
        }
        if (this.t != null) {
            long jZ = z();
            z = false;
            while (jZ <= j) {
                this.v++;
                jZ = z();
                z = true;
            }
        } else {
            z = false;
        }
        if (this.u != null) {
            if (this.u.d()) {
                if (!z && z() == Long.MAX_VALUE) {
                    if (this.p == 2) {
                        y();
                    } else {
                        w();
                        this.o = true;
                    }
                }
            } else if (this.u.f1687b <= j) {
                if (this.t != null) {
                    this.t.f();
                }
                this.t = this.u;
                this.u = null;
                this.v = this.t.a(j);
                z = true;
            }
        }
        if (z) {
            a(this.t.b(j));
        }
        if (this.p == 2) {
            return;
        }
        while (!this.n) {
            try {
                if (this.s == null) {
                    this.s = this.r.c();
                    if (this.s == null) {
                        return;
                    }
                }
                if (this.p == 1) {
                    this.s.b(4);
                    this.r.a((e) this.s);
                    this.s = null;
                    this.p = 2;
                    return;
                }
                int iA = a(this.m, (c.d.a.a.c.f) this.s, false);
                if (iA == -4) {
                    if (this.s.d()) {
                        this.n = true;
                    } else {
                        this.s.f3272f = this.m.f3685a.k;
                        this.s.l();
                    }
                    this.r.a((e) this.s);
                    this.s = null;
                } else if (iA == -3) {
                    return;
                }
            } catch (f e3) {
                throw C0145h.a(e3, u());
            }
        }
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void r() {
        this.q = null;
        A();
        x();
    }

    @Override // c.d.a.a.E
    public boolean b() {
        return this.o;
    }

    private void w() {
        this.s = null;
        this.v = -1;
        if (this.t != null) {
            this.t.f();
            this.t = null;
        }
        if (this.u != null) {
            this.u.f();
            this.u = null;
        }
    }

    private void x() {
        w();
        this.r.a();
        this.r = null;
        this.p = 0;
    }

    private void y() {
        x();
        this.r = this.l.b(this.q);
    }

    private long z() {
        if (this.v == -1 || this.v >= this.t.a()) {
            return Long.MAX_VALUE;
        }
        return this.t.a(this.v);
    }

    private void a(List<a> list) {
        if (this.j != null) {
            this.j.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void A() {
        a(Collections.emptyList());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List<a>) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void b(List<a> list) {
        this.k.a(list);
    }
}

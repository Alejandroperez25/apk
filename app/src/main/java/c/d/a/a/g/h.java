package c.d.a.a.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.d.a.a.AbstractC0131c;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;
import c.d.a.a.r;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends AbstractC0131c implements Handler.Callback {
    private final e j;
    private final g k;
    private final Handler l;
    private final r m;
    private final f n;
    private final b[] o;
    private final long[] p;
    private int q;
    private int r;
    private c s;
    private boolean t;

    @Override // c.d.a.a.E
    public boolean c() {
        return true;
    }

    public h(g gVar, Looper looper) {
        this(gVar, looper, e.f2483a);
    }

    public h(g gVar, Looper looper, e eVar) {
        super(4);
        AbstractC0170e.a(gVar);
        this.k = gVar;
        this.l = looper == null ? null : H.a(looper, (Handler.Callback) this);
        AbstractC0170e.a(eVar);
        this.j = eVar;
        this.m = new r();
        this.n = new f();
        this.o = new b[5];
        this.p = new long[5];
    }

    @Override // c.d.a.a.F
    public int a(q qVar) {
        if (this.j.a(qVar)) {
            return AbstractC0131c.a((c.d.a.a.d.h<?>) null, qVar.j) ? 4 : 2;
        }
        return 0;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(q[] qVarArr, long j) {
        this.s = this.j.b(qVarArr[0]);
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(long j, boolean z) {
        w();
        this.t = false;
    }

    @Override // c.d.a.a.E
    public void a(long j, long j2) {
        if (!this.t && this.r < 5) {
            this.n.b();
            if (a(this.m, (c.d.a.a.c.f) this.n, false) == -4) {
                if (this.n.d()) {
                    this.t = true;
                } else if (!this.n.c()) {
                    this.n.f2484f = this.m.f3685a.k;
                    this.n.l();
                    int i2 = (this.q + this.r) % 5;
                    b bVarA = this.s.a(this.n);
                    if (bVarA != null) {
                        this.o[i2] = bVarA;
                        this.p[i2] = this.n.f1685d;
                        this.r++;
                    }
                }
            }
        }
        if (this.r <= 0 || this.p[this.q] > j) {
            return;
        }
        a(this.o[this.q]);
        this.o[this.q] = null;
        this.q = (this.q + 1) % 5;
        this.r--;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void r() {
        w();
        this.s = null;
    }

    @Override // c.d.a.a.E
    public boolean b() {
        return this.t;
    }

    private void a(b bVar) {
        if (this.l != null) {
            this.l.obtainMessage(0, bVar).sendToTarget();
        } else {
            b(bVar);
        }
    }

    private void w() {
        Arrays.fill(this.o, (Object) null);
        this.q = 0;
        this.r = 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((b) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void b(b bVar) {
        this.k.a(bVar);
    }
}

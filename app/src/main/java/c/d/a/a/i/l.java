package c.d.a.a.i;

import android.os.Handler;
import android.os.Looper;
import c.d.a.a.M;
import c.d.a.a.i.w;
import c.d.a.a.i.x;
import c.d.a.a.m.AbstractC0170e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l implements w {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<w.b> f2971a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final x.a f2972b = new x.a();

    /* renamed from: c, reason: collision with root package name */
    private Looper f2973c;

    /* renamed from: d, reason: collision with root package name */
    private M f2974d;

    /* renamed from: e, reason: collision with root package name */
    private Object f2975e;

    protected abstract void a(c.d.a.a.l.G g2);

    protected abstract void b();

    protected final void a(M m, Object obj) {
        this.f2974d = m;
        this.f2975e = obj;
        Iterator<w.b> it = this.f2971a.iterator();
        while (it.hasNext()) {
            it.next().a(this, m, obj);
        }
    }

    protected final x.a a(w.a aVar) {
        return this.f2972b.a(0, aVar, 0L);
    }

    protected final x.a a(w.a aVar, long j) {
        AbstractC0170e.a(aVar != null);
        return this.f2972b.a(0, aVar, j);
    }

    @Override // c.d.a.a.i.w
    public final void a(Handler handler, x xVar) {
        this.f2972b.a(handler, xVar);
    }

    @Override // c.d.a.a.i.w
    public final void a(x xVar) {
        this.f2972b.a(xVar);
    }

    @Override // c.d.a.a.i.w
    public final void a(w.b bVar, c.d.a.a.l.G g2) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0170e.a(this.f2973c == null || this.f2973c == looperMyLooper);
        this.f2971a.add(bVar);
        if (this.f2973c == null) {
            this.f2973c = looperMyLooper;
            a(g2);
        } else if (this.f2974d != null) {
            bVar.a(this, this.f2974d, this.f2975e);
        }
    }

    @Override // c.d.a.a.i.w
    public final void a(w.b bVar) {
        this.f2971a.remove(bVar);
        if (this.f2971a.isEmpty()) {
            this.f2973c = null;
            this.f2974d = null;
            this.f2975e = null;
            b();
        }
    }
}

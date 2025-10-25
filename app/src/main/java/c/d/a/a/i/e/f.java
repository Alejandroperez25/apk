package c.d.a.a.i.e;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.i.e.a.a;
import c.d.a.a.i.e.c;
import c.d.a.a.i.l;
import c.d.a.a.i.p;
import c.d.a.a.i.q;
import c.d.a.a.i.w;
import c.d.a.a.i.x;
import c.d.a.a.l.B;
import c.d.a.a.l.C;
import c.d.a.a.l.D;
import c.d.a.a.l.G;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.k;
import c.d.a.a.l.v;
import c.d.a.a.l.z;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.o;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends l implements B.a<D<c.d.a.a.i.e.a.a>> {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2939f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f2940g;

    /* renamed from: h, reason: collision with root package name */
    private final k.a f2941h;

    /* renamed from: i, reason: collision with root package name */
    private final c.a f2942i;
    private final p j;
    private final z k;
    private final long l;
    private final x.a m;
    private final D.a<? extends c.d.a.a.i.e.a.a> n;
    private final ArrayList<d> o;
    private final Object p;
    private k q;
    private B r;
    private C s;
    private G t;
    private long u;
    private c.d.a.a.i.e.a.a v;
    private Handler w;

    static {
        o.a("goog.exo.smoothstreaming");
    }

    public static final class a implements c.d.a.a.i.a.b$a {

        /* renamed from: a, reason: collision with root package name */
        private final c.a f2943a;

        /* renamed from: b, reason: collision with root package name */
        private final k.a f2944b;

        /* renamed from: c, reason: collision with root package name */
        private D.a<? extends c.d.a.a.i.e.a.a> f2945c;

        /* renamed from: d, reason: collision with root package name */
        private p f2946d;

        /* renamed from: e, reason: collision with root package name */
        private z f2947e;

        /* renamed from: f, reason: collision with root package name */
        private long f2948f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2949g;

        /* renamed from: h, reason: collision with root package name */
        private Object f2950h;

        public a(c.a aVar, k.a aVar2) {
            AbstractC0170e.a(aVar);
            this.f2943a = aVar;
            this.f2944b = aVar2;
            this.f2947e = new v();
            this.f2948f = 30000L;
            this.f2946d = new q();
        }

        public f a(Uri uri) {
            this.f2949g = true;
            if (this.f2945c == null) {
                this.f2945c = new c.d.a.a.i.e.a.b();
            }
            AbstractC0170e.a(uri);
            return new f(null, uri, this.f2944b, this.f2945c, this.f2943a, this.f2946d, this.f2947e, this.f2948f, this.f2950h);
        }
    }

    private f(c.d.a.a.i.e.a.a aVar, Uri uri, k.a aVar2, D.a<? extends c.d.a.a.i.e.a.a> aVar3, c.a aVar4, p pVar, z zVar, long j, Object obj) {
        AbstractC0170e.b(aVar == null || !aVar.f2883d);
        this.v = aVar;
        this.f2940g = uri == null ? null : c.d.a.a.i.e.a.c.a(uri);
        this.f2941h = aVar2;
        this.n = aVar3;
        this.f2942i = aVar4;
        this.j = pVar;
        this.k = zVar;
        this.l = j;
        this.m = a((w.a) null);
        this.p = obj;
        this.f2939f = aVar != null;
        this.o = new ArrayList<>();
    }

    @Override // c.d.a.a.i.l
    public void a(G g2) {
        this.t = g2;
        if (this.f2939f) {
            this.s = new C.a();
            c();
            return;
        }
        this.q = this.f2941h.a();
        this.r = new B("Loader:Manifest");
        this.s = this.r;
        this.w = new Handler();
        e();
    }

    @Override // c.d.a.a.i.w
    public void a() {
        this.s.a();
    }

    @Override // c.d.a.a.i.w
    public c.d.a.a.i.v a(w.a aVar, InterfaceC0161d interfaceC0161d, long j) {
        d dVar = new d(this.v, this.f2942i, this.t, this.j, this.k, a(aVar), this.s, interfaceC0161d);
        this.o.add(dVar);
        return dVar;
    }

    @Override // c.d.a.a.i.w
    public void a(c.d.a.a.i.v vVar) {
        ((d) vVar).c();
        this.o.remove(vVar);
    }

    @Override // c.d.a.a.i.l
    public void b() {
        this.v = this.f2939f ? this.v : null;
        this.q = null;
        this.u = 0L;
        if (this.r != null) {
            this.r.d();
            this.r = null;
        }
        if (this.w != null) {
            this.w.removeCallbacksAndMessages(null);
            this.w = null;
        }
    }

    @Override // c.d.a.a.l.B.a
    public void a(D<c.d.a.a.i.e.a.a> d2, long j, long j2) {
        this.m.a(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d());
        this.v = d2.c();
        this.u = j - j2;
        c();
        d();
    }

    @Override // c.d.a.a.l.B.a
    public void a(D<c.d.a.a.i.e.a.a> d2, long j, long j2, boolean z) {
        this.m.b(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d());
    }

    @Override // c.d.a.a.l.B.a
    public B.b a(D<c.d.a.a.i.e.a.a> d2, long j, long j2, IOException iOException, int i2) {
        boolean z = iOException instanceof c.d.a.a.x;
        this.m.a(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d(), iOException, z);
        return z ? B.f3348d : B.f3345a;
    }

    private void c() {
        c.d.a.a.i.C c2;
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            this.o.get(i2).a(this.v);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (a.b bVar : this.v.f2885f) {
            if (bVar.k > 0) {
                long jMin = Math.min(jMax2, bVar.a(0));
                jMax = Math.max(jMax, bVar.a(bVar.k - 1) + bVar.b(bVar.k - 1));
                jMax2 = jMin;
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            c2 = new c.d.a.a.i.C(this.v.f2883d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.v.f2883d, this.p);
        } else if (this.v.f2883d) {
            if (this.v.f2887h != -9223372036854775807L && this.v.f2887h > 0) {
                jMax2 = Math.max(jMax2, jMax - this.v.f2887h);
            }
            long j = jMax2;
            long j2 = jMax - j;
            long jB = j2 - AbstractC0132d.b(this.l);
            if (jB < 5000000) {
                jB = Math.min(5000000L, j2 / 2);
            }
            c2 = new c.d.a.a.i.C(-9223372036854775807L, j2, j, jB, true, true, this.p);
        } else {
            long j3 = this.v.f2886g != -9223372036854775807L ? this.v.f2886g : jMax - jMax2;
            c2 = new c.d.a.a.i.C(jMax2 + j3, j3, jMax2, 0L, true, false, this.p);
        }
        a(c2, this.v);
    }

    private void d() {
        if (this.v.f2883d) {
            this.w.postDelayed(new Runnable() { // from class: c.d.a.a.i.e.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2879a.e();
                }
            }, Math.max(0L, (this.u + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        D d2 = new D(this.q, this.f2940g, 4, this.n);
        this.m.a(d2.f3364a, d2.f3365b, this.r.a(d2, this, this.k.a(d2.f3365b)));
    }
}

package c.d.a.a.i.d;

import android.net.Uri;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.i.C;
import c.d.a.a.i.a.b$a;
import c.d.a.a.i.d.a.e;
import c.d.a.a.i.d.a.i;
import c.d.a.a.i.w;
import c.d.a.a.l.G;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.k;
import c.d.a.a.l.v;
import c.d.a.a.l.z;
import c.d.a.a.m.AbstractC0170e;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends c.d.a.a.i.l implements i.e {

    /* renamed from: f, reason: collision with root package name */
    private final h f2841f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f2842g;

    /* renamed from: h, reason: collision with root package name */
    private final g f2843h;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.a.i.p f2844i;
    private final z j;
    private final boolean k;
    private final c.d.a.a.i.d.a.i l;
    private final Object m;
    private G n;

    static {
        c.d.a.a.o.a("goog.exo.hls");
    }

    public static final class a implements b$a {

        /* renamed from: a, reason: collision with root package name */
        private final g f2845a;

        /* renamed from: b, reason: collision with root package name */
        private h f2846b;

        /* renamed from: c, reason: collision with root package name */
        private c.d.a.a.i.d.a.h f2847c;

        /* renamed from: d, reason: collision with root package name */
        private i.a f2848d;

        /* renamed from: e, reason: collision with root package name */
        private c.d.a.a.i.p f2849e;

        /* renamed from: f, reason: collision with root package name */
        private z f2850f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2851g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2852h;

        /* renamed from: i, reason: collision with root package name */
        private Object f2853i;

        public a(k.a aVar) {
            this(new d(aVar));
        }

        public a(g gVar) {
            AbstractC0170e.a(gVar);
            this.f2845a = gVar;
            this.f2847c = new c.d.a.a.i.d.a.b();
            this.f2848d = c.d.a.a.i.d.a.c.f2749a;
            this.f2846b = h.f2829a;
            this.f2850f = new v();
            this.f2849e = new c.d.a.a.i.q();
        }

        public m a(Uri uri) {
            this.f2852h = true;
            return new m(uri, this.f2845a, this.f2846b, this.f2849e, this.f2850f, this.f2848d.a(this.f2845a, this.f2850f, this.f2847c), this.f2851g, this.f2853i);
        }
    }

    private m(Uri uri, g gVar, h hVar, c.d.a.a.i.p pVar, z zVar, c.d.a.a.i.d.a.i iVar, boolean z, Object obj) {
        this.f2842g = uri;
        this.f2843h = gVar;
        this.f2841f = hVar;
        this.f2844i = pVar;
        this.j = zVar;
        this.l = iVar;
        this.k = z;
        this.m = obj;
    }

    @Override // c.d.a.a.i.l
    public void a(G g2) {
        this.n = g2;
        this.l.a(this.f2842g, a((w.a) null), this);
    }

    @Override // c.d.a.a.i.w
    public void a() {
        this.l.d();
    }

    @Override // c.d.a.a.i.w
    public c.d.a.a.i.v a(w.a aVar, InterfaceC0161d interfaceC0161d, long j) {
        return new k(this.f2841f, this.l, this.f2843h, this.n, this.j, a(aVar), interfaceC0161d, this.f2844i, this.k);
    }

    @Override // c.d.a.a.i.w
    public void a(c.d.a.a.i.v vVar) {
        ((k) vVar).h();
    }

    @Override // c.d.a.a.i.l
    public void b() {
        this.l.stop();
    }

    @Override // c.d.a.a.i.d.a.i.e
    public void a(c.d.a.a.i.d.a.e eVar) {
        C c2;
        long j;
        long jA = eVar.m ? AbstractC0132d.a(eVar.f2777f) : -9223372036854775807L;
        long j2 = (eVar.f2775d == 2 || eVar.f2775d == 1) ? jA : -9223372036854775807L;
        long j3 = eVar.f2776e;
        if (this.l.b()) {
            long jA2 = eVar.f2777f - this.l.a();
            long j4 = eVar.l ? jA2 + eVar.p : -9223372036854775807L;
            List<e.a> list = eVar.o;
            if (j3 == -9223372036854775807L) {
                j = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).f2786f;
            } else {
                j = j3;
            }
            c2 = new C(j2, jA, j4, eVar.p, jA2, j, true, !eVar.l, this.m);
        } else {
            c2 = new C(j2, jA, eVar.p, eVar.p, 0L, j3 == -9223372036854775807L ? 0L : j3, true, false, this.m);
        }
        a(c2, new i(this.l.c(), eVar));
    }
}

package c.d.a.a.i;

import android.net.Uri;
import c.d.a.a.i.a.b$a;
import c.d.a.a.i.s;
import c.d.a.a.i.w;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.k;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class u extends l implements s.c {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f3013f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f3014g;

    /* renamed from: h, reason: collision with root package name */
    private final c.d.a.a.e.j f3015h;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.a.l.z f3016i;
    private final String j;
    private final int k;
    private final Object l;
    private long m;
    private boolean n;
    private c.d.a.a.l.G o;

    @Override // c.d.a.a.i.w
    public void a() {
    }

    @Override // c.d.a.a.i.l
    public void b() {
    }

    public static final class a implements b$a {

        /* renamed from: a, reason: collision with root package name */
        private final k.a f3017a;

        /* renamed from: b, reason: collision with root package name */
        private c.d.a.a.e.j f3018b;

        /* renamed from: c, reason: collision with root package name */
        private String f3019c;

        /* renamed from: d, reason: collision with root package name */
        private Object f3020d;

        /* renamed from: e, reason: collision with root package name */
        private c.d.a.a.l.z f3021e = new c.d.a.a.l.v();

        /* renamed from: f, reason: collision with root package name */
        private int f3022f = 1048576;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3023g;

        public a(k.a aVar) {
            this.f3017a = aVar;
        }

        public a a(c.d.a.a.e.j jVar) {
            AbstractC0170e.b(!this.f3023g);
            this.f3018b = jVar;
            return this;
        }

        public u a(Uri uri) {
            this.f3023g = true;
            if (this.f3018b == null) {
                this.f3018b = new c.d.a.a.e.e();
            }
            return new u(uri, this.f3017a, this.f3018b, this.f3021e, this.f3019c, this.f3022f, this.f3020d);
        }
    }

    private u(Uri uri, k.a aVar, c.d.a.a.e.j jVar, c.d.a.a.l.z zVar, String str, int i2, Object obj) {
        this.f3013f = uri;
        this.f3014g = aVar;
        this.f3015h = jVar;
        this.f3016i = zVar;
        this.j = str;
        this.k = i2;
        this.m = -9223372036854775807L;
        this.l = obj;
    }

    @Override // c.d.a.a.i.l
    public void a(c.d.a.a.l.G g2) {
        this.o = g2;
        b(this.m, this.n);
    }

    @Override // c.d.a.a.i.w
    public v a(w.a aVar, InterfaceC0161d interfaceC0161d, long j) {
        c.d.a.a.l.k kVarA = this.f3014g.a();
        if (this.o != null) {
            kVarA.a(this.o);
        }
        return new s(this.f3013f, kVarA, this.f3015h.a(), this.f3016i, a(aVar), this, interfaceC0161d, this.j, this.k);
    }

    @Override // c.d.a.a.i.w
    public void a(v vVar) {
        ((s) vVar).c();
    }

    @Override // c.d.a.a.i.s.c
    public void a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.m;
        }
        if (this.m == j && this.n == z) {
            return;
        }
        b(j, z);
    }

    private void b(long j, boolean z) {
        this.m = j;
        this.n = z;
        a(new C(this.m, this.n, false, this.l), (Object) null);
    }
}

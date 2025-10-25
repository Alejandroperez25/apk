package c.d.a.a.i.c;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.M;
import c.d.a.a.i.a.b$a;
import c.d.a.a.i.c.a.n;
import c.d.a.a.i.c.c;
import c.d.a.a.i.c.l;
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
import c.d.a.a.m.H;
import c.d.a.a.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g extends c.d.a.a.i.l {
    private Handler A;
    private Uri B;
    private Uri C;
    private c.d.a.a.i.c.a.b D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private int I;
    private long J;
    private int K;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2671f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f2672g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f2673h;

    /* renamed from: i, reason: collision with root package name */
    private final p f2674i;
    private final z j;
    private final long k;
    private final boolean l;
    private final x.a m;
    private final D.a<? extends c.d.a.a.i.c.a.b> n;
    private final e o;
    private final Object p;
    private final SparseArray<c.d.a.a.i.c.e> q;
    private final Runnable r;
    private final Runnable s;
    private final l.b t;
    private final C u;
    private final Object v;
    private c.d.a.a.l.k w;
    private B x;
    private G y;
    private IOException z;

    static {
        o.a("goog.exo.dash");
    }

    public static final class c implements b$a {

        /* renamed from: a, reason: collision with root package name */
        private final c.a f2684a;

        /* renamed from: b, reason: collision with root package name */
        private final k.a f2685b;

        /* renamed from: c, reason: collision with root package name */
        private D.a<? extends c.d.a.a.i.c.a.b> f2686c;

        /* renamed from: d, reason: collision with root package name */
        private p f2687d;

        /* renamed from: e, reason: collision with root package name */
        private z f2688e;

        /* renamed from: f, reason: collision with root package name */
        private long f2689f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2690g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2691h;

        /* renamed from: i, reason: collision with root package name */
        private Object f2692i;

        public c(c.a aVar, k.a aVar2) {
            AbstractC0170e.a(aVar);
            this.f2684a = aVar;
            this.f2685b = aVar2;
            this.f2688e = new v();
            this.f2689f = 30000L;
            this.f2687d = new q();
        }

        public g a(Uri uri) {
            this.f2691h = true;
            if (this.f2686c == null) {
                this.f2686c = new c.d.a.a.i.c.a.c();
            }
            AbstractC0170e.a(uri);
            return new g(null, uri, this.f2685b, this.f2686c, this.f2684a, this.f2687d, this.f2688e, this.f2689f, this.f2690g, this.f2692i);
        }
    }

    private g(c.d.a.a.i.c.a.b bVar, Uri uri, k.a aVar, D.a<? extends c.d.a.a.i.c.a.b> aVar2, c.a aVar3, p pVar, z zVar, long j, boolean z, Object obj) {
        this.B = uri;
        this.D = bVar;
        this.C = uri;
        this.f2672g = aVar;
        this.n = aVar2;
        this.f2673h = aVar3;
        this.j = zVar;
        this.k = j;
        this.l = z;
        this.f2674i = pVar;
        this.v = obj;
        this.f2671f = bVar != null;
        this.m = a((w.a) null);
        this.p = new Object();
        this.q = new SparseArray<>();
        this.t = new b();
        this.J = -9223372036854775807L;
        if (this.f2671f) {
            AbstractC0170e.b(!bVar.f2585d);
            this.o = null;
            this.r = null;
            this.s = null;
            this.u = new C.a();
            return;
        }
        this.o = new e();
        this.u = new f();
        this.r = new Runnable() { // from class: c.d.a.a.i.c.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2576a.d();
            }
        };
        this.s = new Runnable() { // from class: c.d.a.a.i.c.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f2654a.a(false);
            }
        };
    }

    @Override // c.d.a.a.i.l
    public void a(G g2) {
        this.y = g2;
        if (this.f2671f) {
            a(false);
            return;
        }
        this.w = this.f2672g.a();
        this.x = new B("Loader:DashMediaSource");
        this.A = new Handler();
        d();
    }

    @Override // c.d.a.a.i.w
    public void a() {
        this.u.a();
    }

    @Override // c.d.a.a.i.w
    public c.d.a.a.i.v a(w.a aVar, InterfaceC0161d interfaceC0161d, long j) {
        int iIntValue = ((Integer) aVar.f3024a).intValue() - this.K;
        c.d.a.a.i.c.e eVar = new c.d.a.a.i.c.e(this.K + iIntValue, this.D, iIntValue, this.f2673h, this.y, this.j, a(aVar, this.D.a(iIntValue).f2612b), this.H, this.u, interfaceC0161d, this.f2674i, this.t);
        this.q.put(eVar.f2655a, eVar);
        return eVar;
    }

    @Override // c.d.a.a.i.w
    public void a(c.d.a.a.i.v vVar) {
        c.d.a.a.i.c.e eVar = (c.d.a.a.i.c.e) vVar;
        eVar.c();
        this.q.remove(eVar.f2655a);
    }

    @Override // c.d.a.a.i.l
    public void b() {
        this.E = false;
        this.w = null;
        if (this.x != null) {
            this.x.d();
            this.x = null;
        }
        this.F = 0L;
        this.G = 0L;
        this.D = this.f2671f ? this.D : null;
        this.C = this.B;
        this.z = null;
        if (this.A != null) {
            this.A.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.H = 0L;
        this.I = 0;
        this.J = -9223372036854775807L;
        this.K = 0;
        this.q.clear();
    }

    void c() {
        this.A.removeCallbacks(this.s);
        d();
    }

    void a(long j) {
        if (this.J == -9223372036854775807L || this.J < j) {
            this.J = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(c.d.a.a.l.D<c.d.a.a.i.c.a.b> r16, long r17, long r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.c.g.a(c.d.a.a.l.D, long, long):void");
    }

    B.b a(D<c.d.a.a.i.c.a.b> d2, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof c.d.a.a.x;
        this.m.a(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d(), iOException, z);
        return z ? B.f3348d : B.f3345a;
    }

    void b(D<Long> d2, long j, long j2) {
        this.m.a(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d());
        b(d2.c().longValue() - j);
    }

    B.b b(D<Long> d2, long j, long j2, IOException iOException) {
        this.m.a(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d(), iOException, true);
        a(iOException);
        return B.f3347c;
    }

    void c(D<?> d2, long j, long j2) {
        this.m.b(d2.f3364a, d2.e(), d2.f(), d2.f3365b, j, j2, d2.d());
    }

    private void a(n nVar) {
        String str = nVar.f2652a;
        if (H.a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || H.a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
            b(nVar);
            return;
        }
        if (H.a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || H.a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
            a(nVar, new d());
        } else if (H.a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || H.a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
            a(nVar, new i());
        } else {
            a(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void b(n nVar) {
        try {
            b(H.g(nVar.f2653b) - this.G);
        } catch (c.d.a.a.x e2) {
            a(e2);
        }
    }

    private void a(n nVar, D.a<Long> aVar) {
        a(new D(this.w, Uri.parse(nVar.f2653b), 5, aVar), new h(), 1);
    }

    private void b(long j) {
        this.H = j;
        a(true);
    }

    private void a(IOException iOException) {
        c.d.a.a.m.o.b("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        long j;
        boolean z2;
        long j2;
        long jC;
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            int iKeyAt = this.q.keyAt(i2);
            if (iKeyAt >= this.K) {
                this.q.valueAt(i2).a(this.D, iKeyAt - this.K);
            }
        }
        int iA = this.D.a() - 1;
        C0031g c0031gA = C0031g.a(this.D.a(0), this.D.c(0));
        C0031g c0031gA2 = C0031g.a(this.D.a(iA), this.D.c(iA));
        long j3 = c0031gA.f2697b;
        long jMin = c0031gA2.f2698c;
        if (!this.D.f2585d || c0031gA2.f2696a) {
            j = j3;
            z2 = false;
        } else {
            jMin = Math.min((f() - AbstractC0132d.b(this.D.f2582a)) - AbstractC0132d.b(this.D.a(iA).f2612b), jMin);
            if (this.D.f2587f != -9223372036854775807L) {
                long jB = jMin - AbstractC0132d.b(this.D.f2587f);
                while (jB < 0 && iA > 0) {
                    iA--;
                    jB += this.D.c(iA);
                }
                if (iA == 0) {
                    jC = Math.max(j3, jB);
                } else {
                    jC = this.D.c(0);
                }
                j3 = jC;
            }
            j = j3;
            z2 = true;
        }
        long jC2 = jMin - j;
        for (int i3 = 0; i3 < this.D.a() - 1; i3++) {
            jC2 += this.D.c(i3);
        }
        if (this.D.f2585d) {
            long j4 = this.k;
            if (!this.l && this.D.f2588g != -9223372036854775807L) {
                j4 = this.D.f2588g;
            }
            long jB2 = jC2 - AbstractC0132d.b(j4);
            if (jB2 < 5000000) {
                jB2 = Math.min(5000000L, jC2 / 2);
            }
            j2 = jB2;
        } else {
            j2 = 0;
        }
        a(new a(this.D.f2582a, this.D.f2582a + this.D.a(0).f2612b + AbstractC0132d.a(j), this.K, j, jC2, j2, this.D, this.v), this.D);
        if (this.f2671f) {
            return;
        }
        this.A.removeCallbacks(this.s);
        if (z2) {
            this.A.postDelayed(this.s, 5000L);
        }
        if (this.E) {
            d();
            return;
        }
        if (z && this.D.f2585d && this.D.f2586e != -9223372036854775807L) {
            long j5 = this.D.f2586e;
            if (j5 == 0) {
                j5 = 5000;
            }
            c(Math.max(0L, (this.F + j5) - SystemClock.elapsedRealtime()));
        }
    }

    private void c(long j) {
        this.A.postDelayed(this.r, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Uri uri;
        this.A.removeCallbacks(this.r);
        if (this.x.b()) {
            this.E = true;
            return;
        }
        synchronized (this.p) {
            uri = this.C;
        }
        this.E = false;
        a(new D(this.w, uri, 4, this.n), this.o, this.j.a(4));
    }

    private long e() {
        return Math.min((this.I - 1) * 1000, 5000);
    }

    private <T> void a(D<T> d2, B.a<D<T>> aVar, int i2) {
        this.m.a(d2.f3364a, d2.f3365b, this.x.a(d2, aVar, i2));
    }

    private long f() {
        if (this.H != 0) {
            return AbstractC0132d.b(SystemClock.elapsedRealtime() + this.H);
        }
        return AbstractC0132d.b(System.currentTimeMillis());
    }

    /* renamed from: c.d.a.a.i.c.g$g, reason: collision with other inner class name */
    private static final class C0031g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2696a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2697b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2698c;

        public static C0031g a(c.d.a.a.i.c.a.f fVar, long j) {
            boolean z;
            int i2;
            boolean z2;
            c.d.a.a.i.c.a.f fVar2 = fVar;
            int size = fVar2.f2613c.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = fVar2.f2613c.get(i4).f2578b;
                if (i5 == 1 || i5 == 2) {
                    z = true;
                    break;
                }
            }
            z = false;
            long jMin = Long.MAX_VALUE;
            int i6 = 0;
            boolean z3 = false;
            boolean z4 = false;
            long j2 = 0;
            while (i6 < size) {
                c.d.a.a.i.c.a.a aVar = fVar2.f2613c.get(i6);
                if (z && aVar.f2578b == 3) {
                    i2 = size;
                    z2 = z;
                } else {
                    c.d.a.a.i.c.h hVarE = aVar.f2579c.get(i3).e();
                    if (hVarE == null) {
                        return new C0031g(true, 0L, j);
                    }
                    boolean zA = hVarE.a() | z4;
                    int iC = hVarE.c(j);
                    if (iC == 0) {
                        i2 = size;
                        z2 = z;
                        z4 = zA;
                        z3 = true;
                        j2 = 0;
                        jMin = 0;
                    } else {
                        if (z3) {
                            i2 = size;
                            z2 = z;
                        } else {
                            z2 = z;
                            long jB = hVarE.b();
                            i2 = size;
                            long jMax = Math.max(j2, hVarE.a(jB));
                            if (iC != -1) {
                                long j3 = (jB + iC) - 1;
                                j2 = jMax;
                                jMin = Math.min(jMin, hVarE.a(j3) + hVarE.a(j3, j));
                            } else {
                                j2 = jMax;
                            }
                        }
                        z4 = zA;
                    }
                }
                i6++;
                z = z2;
                size = i2;
                fVar2 = fVar;
                i3 = 0;
            }
            return new C0031g(z4, j2, jMin);
        }

        private C0031g(boolean z, long j, long j2) {
            this.f2696a = z;
            this.f2697b = j;
            this.f2698c = j2;
        }
    }

    private static final class a extends M {

        /* renamed from: b, reason: collision with root package name */
        private final long f2675b;

        /* renamed from: c, reason: collision with root package name */
        private final long f2676c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2677d;

        /* renamed from: e, reason: collision with root package name */
        private final long f2678e;

        /* renamed from: f, reason: collision with root package name */
        private final long f2679f;

        /* renamed from: g, reason: collision with root package name */
        private final long f2680g;

        /* renamed from: h, reason: collision with root package name */
        private final c.d.a.a.i.c.a.b f2681h;

        /* renamed from: i, reason: collision with root package name */
        private final Object f2682i;

        @Override // c.d.a.a.M
        public int b() {
            return 1;
        }

        public a(long j, long j2, int i2, long j3, long j4, long j5, c.d.a.a.i.c.a.b bVar, Object obj) {
            this.f2675b = j;
            this.f2676c = j2;
            this.f2677d = i2;
            this.f2678e = j3;
            this.f2679f = j4;
            this.f2680g = j5;
            this.f2681h = bVar;
            this.f2682i = obj;
        }

        @Override // c.d.a.a.M
        public int c() {
            return this.f2681h.a();
        }

        @Override // c.d.a.a.M
        public M.a a(int i2, M.a aVar, boolean z) {
            AbstractC0170e.a(i2, 0, c());
            aVar.a(z ? this.f2681h.a(i2).f2611a : null, z ? Integer.valueOf(this.f2677d + i2) : null, 0, this.f2681h.c(i2), AbstractC0132d.b(this.f2681h.a(i2).f2612b - this.f2681h.a(0).f2612b) - this.f2678e);
            return aVar;
        }

        @Override // c.d.a.a.M
        public M.b a(int i2, M.b bVar, boolean z, long j) {
            AbstractC0170e.a(i2, 0, 1);
            bVar.a(z ? this.f2682i : null, this.f2675b, this.f2676c, true, this.f2681h.f2585d && this.f2681h.f2586e != -9223372036854775807L && this.f2681h.f2583b == -9223372036854775807L, a(j), this.f2679f, 0, c() - 1, this.f2678e);
            return bVar;
        }

        @Override // c.d.a.a.M
        public int a(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f2677d) >= 0 && iIntValue < c()) {
                return iIntValue;
            }
            return -1;
        }

        private long a(long j) {
            c.d.a.a.i.c.h hVarE;
            long j2 = this.f2680g;
            if (!this.f2681h.f2585d) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f2679f) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f2678e + j2;
            long jC = this.f2681h.c(0);
            long j4 = j3;
            int i2 = 0;
            while (i2 < this.f2681h.a() - 1 && j4 >= jC) {
                j4 -= jC;
                i2++;
                jC = this.f2681h.c(i2);
            }
            c.d.a.a.i.c.a.f fVarA = this.f2681h.a(i2);
            int iA = fVarA.a(2);
            return (iA == -1 || (hVarE = fVarA.f2613c.get(iA).f2579c.get(0).e()) == null || hVarE.c(jC) == 0) ? j2 : (j2 + hVarE.a(hVarE.b(j4, jC))) - j4;
        }

        @Override // c.d.a.a.M
        public Object a(int i2) {
            AbstractC0170e.a(i2, 0, c());
            return Integer.valueOf(this.f2677d + i2);
        }
    }

    private final class b implements l.b {
        private b() {
        }

        @Override // c.d.a.a.i.c.l.b
        public void a() {
            g.this.c();
        }

        @Override // c.d.a.a.i.c.l.b
        public void a(long j) {
            g.this.a(j);
        }
    }

    private final class e implements B.a<D<c.d.a.a.i.c.a.b>> {
        private e() {
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<c.d.a.a.i.c.a.b> d2, long j, long j2) {
            g.this.a(d2, j, j2);
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<c.d.a.a.i.c.a.b> d2, long j, long j2, boolean z) {
            g.this.c(d2, j, j2);
        }

        @Override // c.d.a.a.l.B.a
        public B.b a(D<c.d.a.a.i.c.a.b> d2, long j, long j2, IOException iOException, int i2) {
            return g.this.a(d2, j, j2, iOException);
        }
    }

    private final class h implements B.a<D<Long>> {
        private h() {
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<Long> d2, long j, long j2) {
            g.this.b(d2, j, j2);
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<Long> d2, long j, long j2, boolean z) {
            g.this.c(d2, j, j2);
        }

        @Override // c.d.a.a.l.B.a
        public B.b a(D<Long> d2, long j, long j2, IOException iOException, int i2) {
            return g.this.b(d2, j, j2, iOException);
        }
    }

    private static final class i implements D.a<Long> {
        private i() {
        }

        @Override // c.d.a.a.l.D.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(H.g(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static final class d implements D.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        private static final Pattern f2693a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // c.d.a.a.l.D.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f2693a.matcher(line);
                if (!matcher.matches()) {
                    throw new c.d.a.a.x("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * ((((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e2) {
                throw new c.d.a.a.x(e2);
            }
        }
    }

    final class f implements C {
        f() {
        }

        @Override // c.d.a.a.l.C
        public void a() throws IOException {
            g.this.x.a();
            b();
        }

        private void b() throws IOException {
            if (g.this.z != null) {
                throw g.this.z;
            }
        }
    }
}

package c.d.a.a.i.d.a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.i.d.a.d;
import c.d.a.a.i.d.a.e;
import c.d.a.a.i.d.a.i;
import c.d.a.a.i.x;
import c.d.a.a.l.B;
import c.d.a.a.l.D;
import c.d.a.a.l.z;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.G;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements i, B.a<D<f>> {

    /* renamed from: a, reason: collision with root package name */
    public static final i.a f2749a = new i.a() { // from class: c.d.a.a.i.d.a.a
        @Override // c.d.a.a.i.d.a.i.a
        public final i a(c.d.a.a.i.d.g gVar, z zVar, h hVar) {
            return new c(gVar, zVar, hVar);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.i.d.g f2750b;

    /* renamed from: c, reason: collision with root package name */
    private final h f2751c;

    /* renamed from: d, reason: collision with root package name */
    private final z f2752d;

    /* renamed from: g, reason: collision with root package name */
    private D.a<f> f2755g;

    /* renamed from: h, reason: collision with root package name */
    private x.a f2756h;

    /* renamed from: i, reason: collision with root package name */
    private B f2757i;
    private Handler j;
    private i.e k;
    private d l;
    private d.a m;
    private e n;
    private boolean o;

    /* renamed from: f, reason: collision with root package name */
    private final List<i.b> f2754f = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final IdentityHashMap<d.a, a> f2753e = new IdentityHashMap<>();
    private long p = -9223372036854775807L;

    public c(c.d.a.a.i.d.g gVar, z zVar, h hVar) {
        this.f2750b = gVar;
        this.f2751c = hVar;
        this.f2752d = zVar;
    }

    @Override // c.d.a.a.i.d.a.i
    public void a(Uri uri, x.a aVar, i.e eVar) {
        this.j = new Handler();
        this.f2756h = aVar;
        this.k = eVar;
        D d2 = new D(this.f2750b.a(4), uri, 4, this.f2751c.a());
        AbstractC0170e.b(this.f2757i == null);
        this.f2757i = new B("DefaultHlsPlaylistTracker:MasterPlaylist");
        aVar.a(d2.f3364a, d2.f3365b, this.f2757i.a(d2, this, this.f2752d.a(d2.f3365b)));
    }

    @Override // c.d.a.a.i.d.a.i
    public void stop() {
        this.m = null;
        this.n = null;
        this.l = null;
        this.p = -9223372036854775807L;
        this.f2757i.d();
        this.f2757i = null;
        Iterator<a> it = this.f2753e.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.j.removeCallbacksAndMessages(null);
        this.j = null;
        this.f2753e.clear();
    }

    @Override // c.d.a.a.i.d.a.i
    public void b(i.b bVar) {
        this.f2754f.add(bVar);
    }

    @Override // c.d.a.a.i.d.a.i
    public void a(i.b bVar) {
        this.f2754f.remove(bVar);
    }

    @Override // c.d.a.a.i.d.a.i
    public d c() {
        return this.l;
    }

    @Override // c.d.a.a.i.d.a.i
    public e a(d.a aVar, boolean z) {
        e eVarA = this.f2753e.get(aVar).a();
        if (eVarA != null && z) {
            d(aVar);
        }
        return eVarA;
    }

    @Override // c.d.a.a.i.d.a.i
    public long a() {
        return this.p;
    }

    @Override // c.d.a.a.i.d.a.i
    public boolean b(d.a aVar) {
        return this.f2753e.get(aVar).b();
    }

    @Override // c.d.a.a.i.d.a.i
    public void d() throws IOException {
        if (this.f2757i != null) {
            this.f2757i.a();
        }
        if (this.m != null) {
            c(this.m);
        }
    }

    @Override // c.d.a.a.i.d.a.i
    public void c(d.a aVar) throws IOException {
        this.f2753e.get(aVar).e();
    }

    @Override // c.d.a.a.i.d.a.i
    public void a(d.a aVar) {
        this.f2753e.get(aVar).d();
    }

    @Override // c.d.a.a.i.d.a.i
    public boolean b() {
        return this.o;
    }

    @Override // c.d.a.a.l.B.a
    public void a(D<f> d2, long j, long j2) {
        d dVarA;
        f fVarC = d2.c();
        boolean z = fVarC instanceof e;
        if (z) {
            dVarA = d.a(fVarC.f2790a);
        } else {
            dVarA = (d) fVarC;
        }
        this.l = dVarA;
        this.f2755g = this.f2751c.a(dVarA);
        this.m = dVarA.f2768e.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVarA.f2768e);
        arrayList.addAll(dVarA.f2769f);
        arrayList.addAll(dVarA.f2770g);
        a(arrayList);
        a aVar = this.f2753e.get(this.m);
        if (!z) {
            aVar.d();
        } else {
            aVar.a((e) fVarC, j2);
        }
        this.f2756h.a(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d());
    }

    @Override // c.d.a.a.l.B.a
    public void a(D<f> d2, long j, long j2, boolean z) {
        this.f2756h.b(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d());
    }

    @Override // c.d.a.a.l.B.a
    public B.b a(D<f> d2, long j, long j2, IOException iOException, int i2) {
        long jA = this.f2752d.a(d2.f3365b, j2, iOException, i2);
        boolean z = jA == -9223372036854775807L;
        this.f2756h.a(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d(), iOException, z);
        if (z) {
            return B.f3348d;
        }
        return B.a(false, jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        List<d.a> list = this.l.f2768e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f2753e.get(list.get(i2));
            if (jElapsedRealtime > aVar.f2765h) {
                this.m = aVar.f2758a;
                aVar.d();
                return true;
            }
        }
        return false;
    }

    private void d(d.a aVar) {
        if (aVar == this.m || !this.l.f2768e.contains(aVar)) {
            return;
        }
        if (this.n == null || !this.n.l) {
            this.m = aVar;
            this.f2753e.get(this.m).d();
        }
    }

    private void a(List<d.a> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d.a aVar = list.get(i2);
            this.f2753e.put(aVar, new a(aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d.a aVar, e eVar) {
        if (aVar == this.m) {
            if (this.n == null) {
                this.o = !eVar.l;
                this.p = eVar.f2777f;
            }
            this.n = eVar;
            this.k.a(eVar);
        }
        int size = this.f2754f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2754f.get(i2).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d.a aVar, long j) {
        int size = this.f2754f.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            z |= !this.f2754f.get(i2).a(aVar, j);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e a(e eVar, e eVar2) {
        if (eVar2.a(eVar)) {
            return eVar2.a(b(eVar, eVar2), c(eVar, eVar2));
        }
        return eVar2.l ? eVar.b() : eVar;
    }

    private long b(e eVar, e eVar2) {
        if (eVar2.m) {
            return eVar2.f2777f;
        }
        long j = this.n != null ? this.n.f2777f : 0L;
        if (eVar == null) {
            return j;
        }
        int size = eVar.o.size();
        e.a aVarD = d(eVar, eVar2);
        if (aVarD != null) {
            return eVar.f2777f + aVarD.f2786f;
        }
        return ((long) size) == eVar2.f2780i - eVar.f2780i ? eVar.a() : j;
    }

    private int c(e eVar, e eVar2) {
        e.a aVarD;
        if (eVar2.f2778g) {
            return eVar2.f2779h;
        }
        int i2 = this.n != null ? this.n.f2779h : 0;
        return (eVar == null || (aVarD = d(eVar, eVar2)) == null) ? i2 : (eVar.f2779h + aVarD.f2785e) - eVar2.o.get(0).f2785e;
    }

    private static e.a d(e eVar, e eVar2) {
        int i2 = (int) (eVar2.f2780i - eVar.f2780i);
        List<e.a> list = eVar.o;
        if (i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    private final class a implements B.a<D<f>>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final d.a f2758a;

        /* renamed from: b, reason: collision with root package name */
        private final B f2759b = new B("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        private final D<f> f2760c;

        /* renamed from: d, reason: collision with root package name */
        private e f2761d;

        /* renamed from: e, reason: collision with root package name */
        private long f2762e;

        /* renamed from: f, reason: collision with root package name */
        private long f2763f;

        /* renamed from: g, reason: collision with root package name */
        private long f2764g;

        /* renamed from: h, reason: collision with root package name */
        private long f2765h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f2766i;
        private IOException j;

        public a(d.a aVar) {
            this.f2758a = aVar;
            this.f2760c = new D<>(c.this.f2750b.a(4), G.a(c.this.l.f2790a, aVar.f2773a), 4, c.this.f2755g);
        }

        public e a() {
            return this.f2761d;
        }

        public boolean b() {
            if (this.f2761d == null) {
                return false;
            }
            return this.f2761d.l || this.f2761d.f2775d == 2 || this.f2761d.f2775d == 1 || this.f2762e + Math.max(30000L, AbstractC0132d.a(this.f2761d.p)) > SystemClock.elapsedRealtime();
        }

        public void c() {
            this.f2759b.d();
        }

        public void d() {
            this.f2765h = 0L;
            if (this.f2766i || this.f2759b.b()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.f2764g) {
                this.f2766i = true;
                c.this.j.postDelayed(this, this.f2764g - jElapsedRealtime);
            } else {
                f();
            }
        }

        public void e() throws IOException {
            this.f2759b.a();
            if (this.j != null) {
                throw this.j;
            }
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<f> d2, long j, long j2) {
            f fVarC = d2.c();
            if (fVarC instanceof e) {
                a((e) fVarC, j2);
                c.this.f2756h.a(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d());
            } else {
                this.j = new c.d.a.a.x("Loaded playlist has unexpected type.");
            }
        }

        @Override // c.d.a.a.l.B.a
        public void a(D<f> d2, long j, long j2, boolean z) {
            c.this.f2756h.b(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d());
        }

        @Override // c.d.a.a.l.B.a
        public B.b a(D<f> d2, long j, long j2, IOException iOException, int i2) {
            B.b bVarA;
            long jB = c.this.f2752d.b(d2.f3365b, j2, iOException, i2);
            boolean z = jB != -9223372036854775807L;
            boolean zA = c.this.a(this.f2758a, jB) || !z;
            if (z) {
                zA |= a(jB);
            }
            if (zA) {
                long jA = c.this.f2752d.a(d2.f3365b, j2, iOException, i2);
                bVarA = jA != -9223372036854775807L ? B.a(false, jA) : B.f3348d;
            } else {
                bVarA = B.f3347c;
            }
            c.this.f2756h.a(d2.f3364a, d2.e(), d2.f(), 4, j, j2, d2.d(), iOException, !bVarA.a());
            return bVarA;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2766i = false;
            f();
        }

        private void f() {
            c.this.f2756h.a(this.f2760c.f3364a, this.f2760c.f3365b, this.f2759b.a(this.f2760c, this, c.this.f2752d.a(this.f2760c.f3365b)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(e eVar, long j) {
            e eVar2 = this.f2761d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f2762e = jElapsedRealtime;
            this.f2761d = c.this.a(eVar2, eVar);
            if (this.f2761d != eVar2) {
                this.j = null;
                this.f2763f = jElapsedRealtime;
                c.this.a(this.f2758a, this.f2761d);
            } else if (!this.f2761d.l) {
                if (eVar.f2780i + eVar.o.size() < this.f2761d.f2780i) {
                    this.j = new i.c(this.f2758a.f2773a);
                    c.this.a(this.f2758a, -9223372036854775807L);
                } else if (jElapsedRealtime - this.f2763f > AbstractC0132d.a(this.f2761d.k) * 3.5d) {
                    this.j = new i.d(this.f2758a.f2773a);
                    long jB = c.this.f2752d.b(4, j, this.j, 1);
                    c.this.a(this.f2758a, jB);
                    if (jB != -9223372036854775807L) {
                        a(jB);
                    }
                }
            }
            this.f2764g = jElapsedRealtime + AbstractC0132d.a(this.f2761d != eVar2 ? this.f2761d.k : this.f2761d.k / 2);
            if (this.f2758a != c.this.m || this.f2761d.l) {
                return;
            }
            d();
        }

        private boolean a(long j) {
            this.f2765h = SystemClock.elapsedRealtime() + j;
            return c.this.m == this.f2758a && !c.this.e();
        }
    }
}

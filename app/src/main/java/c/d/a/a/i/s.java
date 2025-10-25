package c.d.a.a.i;

import android.net.Uri;
import android.os.Handler;
import c.d.a.a.I;
import c.d.a.a.e.o;
import c.d.a.a.i.v;
import c.d.a.a.i.x;
import c.d.a.a.i.z;
import c.d.a.a.l.B;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.C0174i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class s implements v, c.d.a.a.e.i, B.a<a>, B.e, z.b {
    private int A;
    private long D;
    private boolean F;
    private int G;
    private boolean H;
    private boolean I;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f2986a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.l.k f2987b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.l.z f2988c;

    /* renamed from: d, reason: collision with root package name */
    private final x.a f2989d;

    /* renamed from: e, reason: collision with root package name */
    private final c f2990e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0161d f2991f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2992g;

    /* renamed from: h, reason: collision with root package name */
    private final long f2993h;
    private final b j;
    private v.a o;
    private c.d.a.a.e.o p;
    private boolean s;
    private boolean t;
    private d u;
    private boolean v;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.a.l.B f2994i = new c.d.a.a.l.B("Loader:ExtractorMediaPeriod");
    private final C0174i k = new C0174i();
    private final Runnable l = new Runnable() { // from class: c.d.a.a.i.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f2520a.k();
        }
    };
    private final Runnable m = new Runnable() { // from class: c.d.a.a.i.a
        @Override // java.lang.Runnable
        public final void run() {
            s.a(this.f2509a);
        }
    };
    private final Handler n = new Handler();
    private int[] r = new int[0];
    private z[] q = new z[0];
    private long E = -9223372036854775807L;
    private long C = -1;
    private long B = -9223372036854775807L;
    private int w = 1;

    interface c {
        void a(long j, boolean z);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public void c(long j) {
    }

    public s(Uri uri, c.d.a.a.l.k kVar, c.d.a.a.e.g[] gVarArr, c.d.a.a.l.z zVar, x.a aVar, c cVar, InterfaceC0161d interfaceC0161d, String str, int i2) {
        this.f2986a = uri;
        this.f2987b = kVar;
        this.f2988c = zVar;
        this.f2989d = aVar;
        this.f2990e = cVar;
        this.f2991f = interfaceC0161d;
        this.f2992g = str;
        this.f2993h = i2;
        this.j = new b(gVarArr);
        aVar.a();
    }

    public static /* synthetic */ void a(s sVar) {
        if (sVar.I) {
            return;
        }
        v.a aVar = sVar.o;
        AbstractC0170e.a(aVar);
        aVar.a((v.a) sVar);
    }

    public void c() {
        if (this.t) {
            for (z zVar : this.q) {
                zVar.n();
            }
        }
        this.f2994i.a(this);
        this.n.removeCallbacksAndMessages(null);
        this.o = null;
        this.I = true;
        this.f2989d.b();
    }

    @Override // c.d.a.a.l.B.e
    public void h() {
        for (z zVar : this.q) {
            zVar.a();
        }
        this.j.a();
    }

    @Override // c.d.a.a.i.v
    public void a(v.a aVar, long j) {
        this.o = aVar;
        this.k.a();
        m();
    }

    @Override // c.d.a.a.i.v
    public void d() throws IOException {
        i();
    }

    @Override // c.d.a.a.i.v
    public G f() {
        return l().f3007b;
    }

    @Override // c.d.a.a.i.v
    public long a(c.d.a.a.k.i[] iVarArr, boolean[] zArr, A[] aArr, boolean[] zArr2, long j) {
        d dVarL = l();
        G g2 = dVarL.f3007b;
        boolean[] zArr3 = dVarL.f3009d;
        int i2 = this.A;
        int i3 = 0;
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            if (aArr[i4] != null && (iVarArr[i4] == null || !zArr[i4])) {
                int i5 = ((e) aArr[i4]).f3011a;
                AbstractC0170e.b(zArr3[i5]);
                this.A--;
                zArr3[i5] = false;
                aArr[i4] = null;
            }
        }
        boolean z = !this.x ? j == 0 : i2 != 0;
        for (int i6 = 0; i6 < iVarArr.length; i6++) {
            if (aArr[i6] == null && iVarArr[i6] != null) {
                c.d.a.a.k.i iVar = iVarArr[i6];
                AbstractC0170e.b(iVar.length() == 1);
                AbstractC0170e.b(iVar.b(0) == 0);
                int iA = g2.a(iVar.a());
                AbstractC0170e.b(!zArr3[iA]);
                this.A++;
                zArr3[iA] = true;
                aArr[i6] = new e(iA);
                zArr2[i6] = true;
                if (!z) {
                    z zVar = this.q[iA];
                    zVar.l();
                    z = zVar.b(j, true, true) == -1 && zVar.f() != 0;
                }
            }
        }
        if (this.A == 0) {
            this.F = false;
            this.y = false;
            if (this.f2994i.b()) {
                z[] zVarArr = this.q;
                int length = zVarArr.length;
                while (i3 < length) {
                    zVarArr[i3].n();
                    i3++;
                }
                this.f2994i.c();
            } else {
                z[] zVarArr2 = this.q;
                int length2 = zVarArr2.length;
                while (i3 < length2) {
                    zVarArr2[i3].a();
                    i3++;
                }
            }
        } else if (z) {
            j = a(j);
            while (i3 < aArr.length) {
                if (aArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.x = true;
        return j;
    }

    @Override // c.d.a.a.i.v
    public void a(long j, boolean z) {
        if (p()) {
            return;
        }
        boolean[] zArr = l().f3009d;
        int length = this.q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.q[i2].a(j, z, zArr[i2]);
        }
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public boolean b(long j) {
        if (this.H || this.F) {
            return false;
        }
        if (this.t && this.A == 0) {
            return false;
        }
        boolean zA = this.k.a();
        if (this.f2994i.b()) {
            return zA;
        }
        m();
        return true;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long b() {
        if (this.A == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    @Override // c.d.a.a.i.v
    public long e() {
        if (!this.z) {
            this.f2989d.c();
            this.z = true;
        }
        if (!this.y) {
            return -9223372036854775807L;
        }
        if (!this.H && n() <= this.G) {
            return -9223372036854775807L;
        }
        this.y = false;
        return this.D;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long g() {
        long jO;
        boolean[] zArr = l().f3008c;
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.E;
        }
        if (this.v) {
            int length = this.q.length;
            jO = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.q[i2].j()) {
                    jO = Math.min(jO, this.q[i2].i());
                }
            }
        } else {
            jO = Long.MAX_VALUE;
        }
        if (jO == Long.MAX_VALUE) {
            jO = o();
        }
        return jO == Long.MIN_VALUE ? this.D : jO;
    }

    @Override // c.d.a.a.i.v
    public long a(long j) {
        d dVarL = l();
        c.d.a.a.e.o oVar = dVarL.f3006a;
        boolean[] zArr = dVarL.f3008c;
        if (!oVar.c()) {
            j = 0;
        }
        this.y = false;
        this.D = j;
        if (p()) {
            this.E = j;
            return j;
        }
        if (this.w != 7 && a(zArr, j)) {
            return j;
        }
        this.F = false;
        this.E = j;
        this.H = false;
        if (this.f2994i.b()) {
            this.f2994i.c();
        } else {
            for (z zVar : this.q) {
                zVar.a();
            }
        }
        return j;
    }

    @Override // c.d.a.a.i.v
    public long a(long j, I i2) {
        c.d.a.a.e.o oVar = l().f3006a;
        if (!oVar.c()) {
            return 0L;
        }
        o.a aVarB = oVar.b(j);
        return c.d.a.a.m.H.a(j, i2, aVarB.f2350a.f2355b, aVarB.f2351b.f2355b);
    }

    boolean a(int i2) {
        return !j() && (this.H || this.q[i2].d());
    }

    void i() throws IOException {
        this.f2994i.a(this.f2988c.a(this.w));
    }

    int a(int i2, c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z) {
        if (j()) {
            return -3;
        }
        b(i2);
        int iA = this.q[i2].a(rVar, fVar, z, this.H, this.D);
        if (iA == -3) {
            c(i2);
        }
        return iA;
    }

    int a(int i2, long j) {
        int iO = 0;
        if (j()) {
            return 0;
        }
        b(i2);
        z zVar = this.q[i2];
        if (this.H && j > zVar.i()) {
            iO = zVar.o();
        } else {
            int iB = zVar.b(j, true, true);
            if (iB != -1) {
                iO = iB;
            }
        }
        if (iO == 0) {
            c(i2);
        }
        return iO;
    }

    private void b(int i2) {
        d dVarL = l();
        boolean[] zArr = dVarL.f3010e;
        if (zArr[i2]) {
            return;
        }
        c.d.a.a.q qVarA = dVarL.f3007b.a(i2).a(0);
        this.f2989d.a(c.d.a.a.m.r.g(qVarA.f3682g), qVarA, 0, null, this.D);
        zArr[i2] = true;
    }

    private void c(int i2) {
        boolean[] zArr = l().f3008c;
        if (this.F && zArr[i2] && !this.q[i2].d()) {
            this.E = 0L;
            this.F = false;
            this.y = true;
            this.D = 0L;
            this.G = 0;
            for (z zVar : this.q) {
                zVar.a();
            }
            v.a aVar = this.o;
            AbstractC0170e.a(aVar);
            aVar.a((v.a) this);
        }
    }

    private boolean j() {
        return this.y || p();
    }

    @Override // c.d.a.a.l.B.a
    public void a(a aVar, long j, long j2) {
        if (this.B == -9223372036854775807L) {
            c.d.a.a.e.o oVar = this.p;
            AbstractC0170e.a(oVar);
            c.d.a.a.e.o oVar2 = oVar;
            long jO = o();
            this.B = jO == Long.MIN_VALUE ? 0L : jO + 10000;
            this.f2990e.a(this.B, oVar2.c());
        }
        this.f2989d.a(aVar.j, aVar.f2996b.e(), aVar.f2996b.f(), 1, -1, null, 0, null, aVar.f3003i, this.B, j, j2, aVar.f2996b.d());
        a(aVar);
        this.H = true;
        v.a aVar2 = this.o;
        AbstractC0170e.a(aVar2);
        aVar2.a((v.a) this);
    }

    @Override // c.d.a.a.l.B.a
    public void a(a aVar, long j, long j2, boolean z) {
        this.f2989d.b(aVar.j, aVar.f2996b.e(), aVar.f2996b.f(), 1, -1, null, 0, null, aVar.f3003i, this.B, j, j2, aVar.f2996b.d());
        if (z) {
            return;
        }
        a(aVar);
        for (z zVar : this.q) {
            zVar.a();
        }
        if (this.A > 0) {
            v.a aVar2 = this.o;
            AbstractC0170e.a(aVar2);
            aVar2.a((v.a) this);
        }
    }

    @Override // c.d.a.a.l.B.a
    public B.b a(a aVar, long j, long j2, IOException iOException, int i2) {
        a aVar2;
        boolean z;
        B.b bVarA;
        a(aVar);
        long jA = this.f2988c.a(this.w, this.B, iOException, i2);
        if (jA == -9223372036854775807L) {
            bVarA = c.d.a.a.l.B.f3348d;
        } else {
            int iN = n();
            if (iN > this.G) {
                aVar2 = aVar;
                z = true;
            } else {
                aVar2 = aVar;
                z = false;
            }
            bVarA = a(aVar2, iN) ? c.d.a.a.l.B.a(z, jA) : c.d.a.a.l.B.f3347c;
        }
        this.f2989d.a(aVar.j, aVar.f2996b.e(), aVar.f2996b.f(), 1, -1, null, 0, null, aVar.f3003i, this.B, j, j2, aVar.f2996b.d(), iOException, !bVarA.a());
        return bVarA;
    }

    @Override // c.d.a.a.e.i
    public c.d.a.a.e.q a(int i2, int i3) {
        int length = this.q.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.r[i4] == i2) {
                return this.q[i4];
            }
        }
        z zVar = new z(this.f2991f);
        zVar.a(this);
        int i5 = length + 1;
        this.r = Arrays.copyOf(this.r, i5);
        this.r[length] = i2;
        z[] zVarArr = (z[]) Arrays.copyOf(this.q, i5);
        zVarArr[length] = zVar;
        c.d.a.a.m.H.a((Object[]) zVarArr);
        this.q = zVarArr;
        return zVar;
    }

    @Override // c.d.a.a.e.i
    public void a() {
        this.s = true;
        this.n.post(this.l);
    }

    @Override // c.d.a.a.e.i
    public void a(c.d.a.a.e.o oVar) {
        this.p = oVar;
        this.n.post(this.l);
    }

    @Override // c.d.a.a.i.z.b
    public void a(c.d.a.a.q qVar) {
        this.n.post(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        c.d.a.a.e.o oVar = this.p;
        if (this.I || this.t || !this.s || oVar == null) {
            return;
        }
        for (z zVar : this.q) {
            if (zVar.h() == null) {
                return;
            }
        }
        this.k.b();
        int length = this.q.length;
        E[] eArr = new E[length];
        boolean[] zArr = new boolean[length];
        this.B = oVar.d();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            c.d.a.a.q qVarH = this.q[i2].h();
            eArr[i2] = new E(qVarH);
            String str = qVarH.f3682g;
            if (!c.d.a.a.m.r.b(str) && !c.d.a.a.m.r.a(str)) {
                z = false;
            }
            zArr[i2] = z;
            this.v = z | this.v;
            i2++;
        }
        this.w = (this.C == -1 && oVar.d() == -9223372036854775807L) ? 7 : 1;
        this.u = new d(oVar, new G(eArr), zArr);
        this.t = true;
        this.f2990e.a(this.B, oVar.c());
        v.a aVar = this.o;
        AbstractC0170e.a(aVar);
        aVar.a((v) this);
    }

    private d l() {
        d dVar = this.u;
        AbstractC0170e.a(dVar);
        return dVar;
    }

    private void a(a aVar) {
        if (this.C == -1) {
            this.C = aVar.k;
        }
    }

    private void m() {
        a aVar = new a(this.f2986a, this.f2987b, this.j, this, this.k);
        if (this.t) {
            c.d.a.a.e.o oVar = l().f3006a;
            AbstractC0170e.b(p());
            if (this.B != -9223372036854775807L && this.E >= this.B) {
                this.H = true;
                this.E = -9223372036854775807L;
                return;
            } else {
                aVar.a(oVar.b(this.E).f2350a.f2356c, this.E);
                this.E = -9223372036854775807L;
            }
        }
        this.G = n();
        this.f2989d.a(aVar.j, 1, -1, (c.d.a.a.q) null, 0, (Object) null, aVar.f3003i, this.B, this.f2994i.a(aVar, this, this.f2988c.a(this.w)));
    }

    private boolean a(a aVar, int i2) {
        if (this.C != -1 || (this.p != null && this.p.d() != -9223372036854775807L)) {
            this.G = i2;
            return true;
        }
        if (this.t && !j()) {
            this.F = true;
            return false;
        }
        this.y = this.t;
        this.D = 0L;
        this.G = 0;
        for (z zVar : this.q) {
            zVar.a();
        }
        aVar.a(0L, 0L);
        return true;
    }

    private boolean a(boolean[] zArr, long j) {
        int length = this.q.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            z zVar = this.q[i2];
            zVar.l();
            if (!(zVar.b(j, true, false) != -1) && (zArr[i2] || !this.v)) {
                break;
            }
            i2++;
        }
        return false;
    }

    private int n() {
        int iC = 0;
        for (z zVar : this.q) {
            iC += zVar.c();
        }
        return iC;
    }

    private long o() {
        long jMax = Long.MIN_VALUE;
        for (z zVar : this.q) {
            jMax = Math.max(jMax, zVar.i());
        }
        return jMax;
    }

    private boolean p() {
        return this.E != -9223372036854775807L;
    }

    private final class e implements A {

        /* renamed from: a, reason: collision with root package name */
        private final int f3011a;

        public e(int i2) {
            this.f3011a = i2;
        }

        @Override // c.d.a.a.i.A
        public boolean c() {
            return s.this.a(this.f3011a);
        }

        @Override // c.d.a.a.i.A
        public void a() throws IOException {
            s.this.i();
        }

        @Override // c.d.a.a.i.A
        public int a(c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z) {
            return s.this.a(this.f3011a, rVar, fVar, z);
        }

        @Override // c.d.a.a.i.A
        public int d(long j) {
            return s.this.a(this.f3011a, j);
        }
    }

    final class a implements B.d {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f2995a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.a.l.F f2996b;

        /* renamed from: c, reason: collision with root package name */
        private final b f2997c;

        /* renamed from: d, reason: collision with root package name */
        private final c.d.a.a.e.i f2998d;

        /* renamed from: e, reason: collision with root package name */
        private final C0174i f2999e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f3001g;

        /* renamed from: i, reason: collision with root package name */
        private long f3003i;
        private c.d.a.a.l.n j;

        /* renamed from: f, reason: collision with root package name */
        private final c.d.a.a.e.n f3000f = new c.d.a.a.e.n();

        /* renamed from: h, reason: collision with root package name */
        private boolean f3002h = true;
        private long k = -1;

        public a(Uri uri, c.d.a.a.l.k kVar, b bVar, c.d.a.a.e.i iVar, C0174i c0174i) {
            this.f2995a = uri;
            this.f2996b = new c.d.a.a.l.F(kVar);
            this.f2997c = bVar;
            this.f2998d = iVar;
            this.f2999e = c0174i;
            this.j = new c.d.a.a.l.n(uri, this.f3000f.f2349a, -1L, s.this.f2992g);
        }

        @Override // c.d.a.a.l.B.d
        public void b() {
            this.f3001g = true;
        }

        @Override // c.d.a.a.l.B.d
        public void a() throws Throwable {
            int i2 = 0;
            while (i2 == 0 && !this.f3001g) {
                c.d.a.a.e.d dVar = null;
                try {
                    long jC = this.f3000f.f2349a;
                    this.j = new c.d.a.a.l.n(this.f2995a, jC, -1L, s.this.f2992g);
                    this.k = this.f2996b.a(this.j);
                    if (this.k != -1) {
                        this.k += jC;
                    }
                    Uri uriB = this.f2996b.b();
                    AbstractC0170e.a(uriB);
                    Uri uri = uriB;
                    c.d.a.a.e.d dVar2 = new c.d.a.a.e.d(this.f2996b, jC, this.k);
                    try {
                        c.d.a.a.e.g gVarA = this.f2997c.a(dVar2, this.f2998d, uri);
                        if (this.f3002h) {
                            gVarA.a(jC, this.f3003i);
                            this.f3002h = false;
                        }
                        while (i2 == 0 && !this.f3001g) {
                            this.f2999e.c();
                            int iA = gVarA.a(dVar2, this.f3000f);
                            try {
                                if (dVar2.c() > s.this.f2993h + jC) {
                                    jC = dVar2.c();
                                    this.f2999e.b();
                                    s.this.n.post(s.this.m);
                                }
                                i2 = iA;
                            } catch (Throwable th) {
                                th = th;
                                i2 = iA;
                                dVar = dVar2;
                                if (i2 != 1 && dVar != null) {
                                    this.f3000f.f2349a = dVar.c();
                                }
                                c.d.a.a.m.H.a((c.d.a.a.l.k) this.f2996b);
                                throw th;
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.f3000f.f2349a = dVar2.c();
                        }
                        c.d.a.a.m.H.a((c.d.a.a.l.k) this.f2996b);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.f3000f.f2349a = j;
            this.f3003i = j2;
            this.f3002h = true;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.e.g[] f3004a;

        /* renamed from: b, reason: collision with root package name */
        private c.d.a.a.e.g f3005b;

        public b(c.d.a.a.e.g[] gVarArr) {
            this.f3004a = gVarArr;
        }

        public c.d.a.a.e.g a(c.d.a.a.e.h hVar, c.d.a.a.e.i iVar, Uri uri) throws H {
            if (this.f3005b != null) {
                return this.f3005b;
            }
            c.d.a.a.e.g[] gVarArr = this.f3004a;
            int length = gVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                c.d.a.a.e.g gVar = gVarArr[i2];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    hVar.b();
                    throw th;
                }
                if (gVar.a(hVar)) {
                    this.f3005b = gVar;
                    hVar.b();
                    break;
                }
                continue;
                hVar.b();
                i2++;
            }
            if (this.f3005b == null) {
                throw new H("None of the available extractors (" + c.d.a.a.m.H.b(this.f3004a) + ") could read the stream.", uri);
            }
            this.f3005b.a(iVar);
            return this.f3005b;
        }

        public void a() {
            if (this.f3005b != null) {
                this.f3005b.a();
                this.f3005b = null;
            }
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final c.d.a.a.e.o f3006a;

        /* renamed from: b, reason: collision with root package name */
        public final G f3007b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f3008c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f3009d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean[] f3010e;

        public d(c.d.a.a.e.o oVar, G g2, boolean[] zArr) {
            this.f3006a = oVar;
            this.f3007b = g2;
            this.f3008c = zArr;
            this.f3009d = new boolean[g2.f2505b];
            this.f3010e = new boolean[g2.f2505b];
        }
    }
}

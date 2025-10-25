package c.d.a.a.i.d;

import android.os.Handler;
import c.d.a.a.g.b;
import c.d.a.a.g.b.u;
import c.d.a.a.i.A;
import c.d.a.a.i.B;
import c.d.a.a.i.E;
import c.d.a.a.i.G;
import c.d.a.a.i.d.a.d;
import c.d.a.a.i.d.f;
import c.d.a.a.i.x;
import c.d.a.a.i.z;
import c.d.a.a.l.B;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class o implements B.a<c.d.a.a.i.b.d>, B.e, c.d.a.a.i.B, c.d.a.a.e.i, z.b {
    private c.d.a.a.q A;
    private c.d.a.a.q B;
    private boolean C;
    private G D;
    private G E;
    private int[] F;
    private int G;
    private boolean H;
    private long K;
    private long L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private long Q;
    private int R;

    /* renamed from: a, reason: collision with root package name */
    private final int f2857a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2858b;

    /* renamed from: c, reason: collision with root package name */
    private final f f2859c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0161d f2860d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.a.a.q f2861e;

    /* renamed from: f, reason: collision with root package name */
    private final c.d.a.a.l.z f2862f;

    /* renamed from: h, reason: collision with root package name */
    private final x.a f2864h;
    private boolean r;
    private boolean t;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    /* renamed from: g, reason: collision with root package name */
    private final B f2863g = new B("Loader:HlsSampleStreamWrapper");

    /* renamed from: i, reason: collision with root package name */
    private final f.b f2865i = new f.b();
    private int[] q = new int[0];
    private int s = -1;
    private int u = -1;
    private z[] p = new z[0];
    private boolean[] J = new boolean[0];
    private boolean[] I = new boolean[0];
    private final ArrayList<j> j = new ArrayList<>();
    private final List<j> k = Collections.unmodifiableList(this.j);
    private final ArrayList<n> o = new ArrayList<>();
    private final Runnable l = new Runnable() { // from class: c.d.a.a.i.d.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f2746a.m();
        }
    };
    private final Runnable m = new Runnable() { // from class: c.d.a.a.i.d.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f2807a.l();
        }
    };
    private final Handler n = new Handler();

    public interface a extends B.a<o> {
        void a();

        void a(d.a aVar);
    }

    private static int d(int i2) {
        switch (i2) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 1;
            default:
                return 0;
        }
    }

    @Override // c.d.a.a.e.i
    public void a(c.d.a.a.e.o oVar) {
    }

    @Override // c.d.a.a.i.B
    public void c(long j) {
    }

    public o(int i2, a aVar, f fVar, InterfaceC0161d interfaceC0161d, long j, c.d.a.a.q qVar, c.d.a.a.l.z zVar, x.a aVar2) {
        this.f2857a = i2;
        this.f2858b = aVar;
        this.f2859c = fVar;
        this.f2860d = interfaceC0161d;
        this.f2861e = qVar;
        this.f2862f = zVar;
        this.f2864h = aVar2;
        this.K = j;
        this.L = j;
    }

    public void c() {
        if (this.y) {
            return;
        }
        b(this.K);
    }

    public void a(G g2, int i2, G g3) {
        this.y = true;
        this.D = g2;
        this.E = g3;
        this.G = i2;
        this.f2858b.a();
    }

    public void d() {
        j();
    }

    public G f() {
        return this.D;
    }

    public int a(int i2) {
        int i3 = this.F[i2];
        if (i3 == -1) {
            return this.E.a(this.D.a(i2)) == -1 ? -2 : -3;
        }
        if (this.I[i3]) {
            return -2;
        }
        this.I[i3] = true;
        return i3;
    }

    public void b(int i2) {
        int i3 = this.F[i2];
        AbstractC0170e.b(this.I[i3]);
        this.I[i3] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(c.d.a.a.k.i[] r21, boolean[] r22, c.d.a.a.i.A[] r23, boolean[] r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.d.o.a(c.d.a.a.k.i[], boolean[], c.d.a.a.i.A[], boolean[], long, boolean):boolean");
    }

    public void a(long j, boolean z) {
        if (!this.x || q()) {
            return;
        }
        int length = this.p.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.p[i2].a(j, z, this.I[i2]);
        }
    }

    public boolean b(long j, boolean z) {
        this.K = j;
        if (q()) {
            this.L = j;
            return true;
        }
        if (this.x && !z && e(j)) {
            return false;
        }
        this.L = j;
        this.O = false;
        this.j.clear();
        if (this.f2863g.b()) {
            this.f2863g.c();
        } else {
            k();
        }
        return true;
    }

    public void i() {
        if (this.y) {
            for (z zVar : this.p) {
                zVar.n();
            }
        }
        this.f2863g.a(this);
        this.n.removeCallbacksAndMessages(null);
        this.C = true;
        this.o.clear();
    }

    @Override // c.d.a.a.l.B.e
    public void h() {
        k();
    }

    public void a(boolean z) {
        this.f2859c.a(z);
    }

    public boolean a(d.a aVar, long j) {
        return this.f2859c.a(aVar, j);
    }

    public boolean c(int i2) {
        return this.O || (!q() && this.p[i2].d());
    }

    public void j() {
        this.f2863g.a();
        this.f2859c.a();
    }

    public int a(int i2, c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z) {
        if (q()) {
            return -3;
        }
        int i3 = 0;
        if (!this.j.isEmpty()) {
            int i4 = 0;
            while (i4 < this.j.size() - 1 && a(this.j.get(i4))) {
                i4++;
            }
            H.a((List) this.j, 0, i4);
            j jVar = this.j.get(0);
            c.d.a.a.q qVar = jVar.f2528c;
            if (!qVar.equals(this.B)) {
                this.f2864h.a(this.f2857a, qVar, jVar.f2529d, jVar.f2530e, jVar.f2531f);
            }
            this.B = qVar;
        }
        int iA = this.p[i2].a(rVar, fVar, z, this.O, this.K);
        if (iA == -5 && i2 == this.w) {
            int iG = this.p[i2].g();
            while (i3 < this.j.size() && this.j.get(i3).k != iG) {
                i3++;
            }
            rVar.f3685a = rVar.f3685a.a(i3 < this.j.size() ? this.j.get(i3).f2528c : this.A);
        }
        return iA;
    }

    public int a(int i2, long j) {
        if (q()) {
            return 0;
        }
        z zVar = this.p[i2];
        if (this.O && j > zVar.i()) {
            return zVar.o();
        }
        int iB = zVar.b(j, true, true);
        if (iB == -1) {
            return 0;
        }
        return iB;
    }

    @Override // c.d.a.a.i.B
    public long g() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.L;
        }
        long jMax = this.K;
        j jVarP = p();
        if (!jVarP.h()) {
            jVarP = this.j.size() > 1 ? this.j.get(this.j.size() - 2) : null;
        }
        if (jVarP != null) {
            jMax = Math.max(jMax, jVarP.f2532g);
        }
        if (this.x) {
            for (z zVar : this.p) {
                jMax = Math.max(jMax, zVar.i());
            }
        }
        return jMax;
    }

    @Override // c.d.a.a.i.B
    public long b() {
        if (q()) {
            return this.L;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return p().f2532g;
    }

    @Override // c.d.a.a.i.B
    public boolean b(long j) {
        List<j> listEmptyList;
        long jMax;
        if (this.O || this.f2863g.b()) {
            return false;
        }
        if (q()) {
            listEmptyList = Collections.emptyList();
            jMax = this.L;
        } else {
            listEmptyList = this.k;
            j jVarP = p();
            jMax = jVarP.h() ? jVarP.f2532g : Math.max(this.K, jVarP.f2531f);
        }
        this.f2859c.a(j, jMax, listEmptyList, this.f2865i);
        boolean z = this.f2865i.f2824b;
        c.d.a.a.i.b.d dVar = this.f2865i.f2823a;
        d.a aVar = this.f2865i.f2825c;
        this.f2865i.a();
        if (z) {
            this.L = -9223372036854775807L;
            this.O = true;
            return true;
        }
        if (dVar == null) {
            if (aVar != null) {
                this.f2858b.a(aVar);
            }
            return false;
        }
        if (a(dVar)) {
            this.L = -9223372036854775807L;
            j jVar = (j) dVar;
            jVar.a(this);
            this.j.add(jVar);
            this.A = jVar.f2528c;
        }
        this.f2864h.a(dVar.f2526a, dVar.f2527b, this.f2857a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, this.f2863g.a(dVar, this, this.f2862f.a(dVar.f2527b)));
        return true;
    }

    @Override // c.d.a.a.l.B.a
    public void a(c.d.a.a.i.b.d dVar, long j, long j2) {
        this.f2859c.a(dVar);
        this.f2864h.a(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2857a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, dVar.d());
        if (!this.y) {
            b(this.K);
        } else {
            this.f2858b.a((a) this);
        }
    }

    @Override // c.d.a.a.l.B.a
    public void a(c.d.a.a.i.b.d dVar, long j, long j2, boolean z) {
        this.f2864h.b(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2857a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, dVar.d());
        if (z) {
            return;
        }
        k();
        if (this.z > 0) {
            this.f2858b.a((a) this);
        }
    }

    @Override // c.d.a.a.l.B.a
    public B.b a(c.d.a.a.i.b.d dVar, long j, long j2, IOException iOException, int i2) {
        B.b bVarA;
        long jD = dVar.d();
        boolean zA = a(dVar);
        long jB = this.f2862f.b(dVar.f2527b, j2, iOException, i2);
        boolean zA2 = jB != -9223372036854775807L ? this.f2859c.a(dVar, jB) : false;
        if (zA2) {
            if (zA && jD == 0) {
                AbstractC0170e.b(this.j.remove(this.j.size() - 1) == dVar);
                if (this.j.isEmpty()) {
                    this.L = this.K;
                }
            }
            bVarA = c.d.a.a.l.B.f3347c;
        } else {
            long jA = this.f2862f.a(dVar.f2527b, j2, iOException, i2);
            bVarA = jA != -9223372036854775807L ? c.d.a.a.l.B.a(false, jA) : c.d.a.a.l.B.f3348d;
        }
        B.b bVar = bVarA;
        this.f2864h.a(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2857a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, jD, iOException, !bVar.a());
        if (zA2) {
            if (!this.y) {
                b(this.K);
            } else {
                this.f2858b.a((a) this);
            }
        }
        return bVar;
    }

    public void a(int i2, boolean z, boolean z2) {
        if (!z2) {
            this.r = false;
            this.t = false;
        }
        this.R = i2;
        for (z zVar : this.p) {
            zVar.a(i2);
        }
        if (z) {
            for (z zVar2 : this.p) {
                zVar2.b();
            }
        }
    }

    @Override // c.d.a.a.e.i
    public c.d.a.a.e.q a(int i2, int i3) {
        int length = this.p.length;
        if (i3 == 1) {
            if (this.s != -1) {
                if (this.r) {
                    return this.q[this.s] == i2 ? this.p[this.s] : b(i2, i3);
                }
                this.r = true;
                this.q[this.s] = i2;
                return this.p[this.s];
            }
            if (this.P) {
                return b(i2, i3);
            }
        } else if (i3 == 2) {
            if (this.u != -1) {
                if (this.t) {
                    return this.q[this.u] == i2 ? this.p[this.u] : b(i2, i3);
                }
                this.t = true;
                this.q[this.u] = i2;
                return this.p[this.u];
            }
            if (this.P) {
                return b(i2, i3);
            }
        } else {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.q[i4] == i2) {
                    return this.p[i4];
                }
            }
            if (this.P) {
                return b(i2, i3);
            }
        }
        b bVar = new b(this.f2860d);
        bVar.a(this.Q);
        bVar.a(this.R);
        bVar.a(this);
        int i5 = length + 1;
        this.q = Arrays.copyOf(this.q, i5);
        this.q[length] = i2;
        this.p = (z[]) Arrays.copyOf(this.p, i5);
        this.p[length] = bVar;
        this.J = Arrays.copyOf(this.J, i5);
        this.J[length] = i3 == 1 || i3 == 2;
        this.H |= this.J[length];
        if (i3 == 1) {
            this.r = true;
            this.s = length;
        } else if (i3 == 2) {
            this.t = true;
            this.u = length;
        }
        if (d(i3) > d(this.v)) {
            this.w = length;
            this.v = i3;
        }
        this.I = Arrays.copyOf(this.I, i5);
        return bVar;
    }

    @Override // c.d.a.a.e.i
    public void a() {
        this.P = true;
        this.n.post(this.m);
    }

    @Override // c.d.a.a.i.z.b
    public void a(c.d.a.a.q qVar) {
        this.n.post(this.l);
    }

    public void d(long j) {
        this.Q = j;
        for (z zVar : this.p) {
            zVar.a(j);
        }
    }

    private void a(A[] aArr) {
        this.o.clear();
        for (A a2 : aArr) {
            if (a2 != null) {
                this.o.add((n) a2);
            }
        }
    }

    private boolean a(j jVar) {
        int i2 = jVar.k;
        int length = this.p.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.I[i3] && this.p[i3].g() == i2) {
                return false;
            }
        }
        return true;
    }

    private void k() {
        for (z zVar : this.p) {
            zVar.a(this.M);
        }
        this.M = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.x = true;
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (!this.C && this.F == null && this.x) {
            for (z zVar : this.p) {
                if (zVar.h() == null) {
                    return;
                }
            }
            if (this.D != null) {
                n();
                return;
            }
            o();
            this.y = true;
            this.f2858b.a();
        }
    }

    private void n() {
        int i2 = this.D.f2505b;
        this.F = new int[i2];
        Arrays.fill(this.F, -1);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.p.length) {
                    break;
                }
                if (a(this.p[i4].h(), this.D.a(i3).a(0))) {
                    this.F[i3] = i4;
                    break;
                }
                i4++;
            }
        }
        Iterator<n> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void o() {
        int length = this.p.length;
        int i2 = 0;
        int i3 = 6;
        int i4 = -1;
        while (true) {
            int i5 = 2;
            if (i2 >= length) {
                break;
            }
            String str = this.p[i2].h().f3682g;
            if (!c.d.a.a.m.r.b(str)) {
                if (c.d.a.a.m.r.a(str)) {
                    i5 = 1;
                } else {
                    i5 = c.d.a.a.m.r.c(str) ? 3 : 6;
                }
            }
            if (d(i5) > d(i3)) {
                i4 = i2;
                i3 = i5;
            } else if (i5 == i3 && i4 != -1) {
                i4 = -1;
            }
            i2++;
        }
        E eB = this.f2859c.b();
        int i6 = eB.f2501a;
        this.G = -1;
        this.F = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.F[i7] = i7;
        }
        E[] eArr = new E[length];
        for (int i8 = 0; i8 < length; i8++) {
            c.d.a.a.q qVarH = this.p[i8].h();
            if (i8 == i4) {
                c.d.a.a.q[] qVarArr = new c.d.a.a.q[i6];
                if (i6 == 1) {
                    qVarArr[0] = qVarH.a(eB.a(0));
                } else {
                    for (int i9 = 0; i9 < i6; i9++) {
                        qVarArr[i9] = a(eB.a(i9), qVarH, true);
                    }
                }
                eArr[i8] = new E(qVarArr);
                this.G = i8;
            } else {
                eArr[i8] = new E(a((i3 == 2 && c.d.a.a.m.r.a(qVarH.f3682g)) ? this.f2861e : null, qVarH, false));
            }
        }
        this.D = new G(eArr);
        AbstractC0170e.b(this.E == null);
        this.E = G.f2504a;
    }

    private j p() {
        return this.j.get(this.j.size() - 1);
    }

    private boolean q() {
        return this.L != -9223372036854775807L;
    }

    private boolean e(long j) {
        int length = this.p.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            z zVar = this.p[i2];
            zVar.l();
            if (!(zVar.b(j, true, false) != -1) && (this.J[i2] || !this.H)) {
                break;
            }
            i2++;
        }
        return false;
    }

    private static c.d.a.a.q a(c.d.a.a.q qVar, c.d.a.a.q qVar2, boolean z) {
        if (qVar == null) {
            return qVar2;
        }
        int i2 = z ? qVar.f3678c : -1;
        String strA = H.a(qVar.f3679d, c.d.a.a.m.r.g(qVar2.f3682g));
        String strF = c.d.a.a.m.r.f(strA);
        if (strF == null) {
            strF = qVar2.f3682g;
        }
        return qVar2.a(qVar.f3676a, qVar.f3677b, strF, strA, i2, qVar.l, qVar.m, qVar.y, qVar.z);
    }

    private static boolean a(c.d.a.a.i.b.d dVar) {
        return dVar instanceof j;
    }

    private static boolean a(c.d.a.a.q qVar, c.d.a.a.q qVar2) {
        String str = qVar.f3682g;
        String str2 = qVar2.f3682g;
        int iG = c.d.a.a.m.r.g(str);
        if (iG != 3) {
            return iG == c.d.a.a.m.r.g(str2);
        }
        if (H.a((Object) str, (Object) str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || qVar.A == qVar2.A;
        }
        return false;
    }

    private static c.d.a.a.e.f b(int i2, int i3) {
        c.d.a.a.m.o.c("HlsSampleStreamWrapper", "Unmapped track with id " + i2 + " of type " + i3);
        return new c.d.a.a.e.f();
    }

    private static final class b extends z {
        public b(InterfaceC0161d interfaceC0161d) {
            super(interfaceC0161d);
        }

        @Override // c.d.a.a.i.z, c.d.a.a.e.q
        public void a(c.d.a.a.q qVar) {
            super.a(qVar.a(a(qVar.f3680e)));
        }

        private c.d.a.a.g.b a(c.d.a.a.g.b bVar) {
            if (bVar == null) {
                return null;
            }
            int iF = bVar.f();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= iF) {
                    i3 = -1;
                    break;
                }
                b.a aVarA = bVar.a(i3);
                if ((aVarA instanceof u) && "com.apple.streaming.transportStreamTimestamp".equals(((u) aVarA).f2445a)) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return bVar;
            }
            if (iF == 1) {
                return null;
            }
            b.a[] aVarArr = new b.a[iF - 1];
            while (i2 < iF) {
                if (i2 != i3) {
                    aVarArr[i2 < i3 ? i2 : i2 - 1] = bVar.a(i2);
                }
                i2++;
            }
            return new c.d.a.a.g.b(aVarArr);
        }
    }
}

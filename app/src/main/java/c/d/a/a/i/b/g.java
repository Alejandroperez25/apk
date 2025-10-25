package c.d.a.a.i.b;

import c.d.a.a.I;
import c.d.a.a.i.A;
import c.d.a.a.i.B;
import c.d.a.a.i.b.h;
import c.d.a.a.i.x;
import c.d.a.a.l.B;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.z;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;
import c.d.a.a.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g<T extends h> implements A, B, B.a<d>, B.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f2552a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2553b;

    /* renamed from: c, reason: collision with root package name */
    private final q[] f2554c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f2555d;

    /* renamed from: e, reason: collision with root package name */
    private final T f2556e;

    /* renamed from: f, reason: collision with root package name */
    private final B.a<g<T>> f2557f;

    /* renamed from: g, reason: collision with root package name */
    private final x.a f2558g;

    /* renamed from: h, reason: collision with root package name */
    private final z f2559h;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.a.l.B f2560i = new c.d.a.a.l.B("Loader:ChunkSampleStream");
    private final f j = new f();
    private final ArrayList<c.d.a.a.i.b.a> k = new ArrayList<>();
    private final List<c.d.a.a.i.b.a> l = Collections.unmodifiableList(this.k);
    private final c.d.a.a.i.z m;
    private final c.d.a.a.i.z[] n;
    private final c o;
    private q p;
    private b<T> q;
    private long r;
    private long s;
    private int t;
    long u;
    boolean v;

    public interface b<T extends h> {
        void a(g<T> gVar);
    }

    public g(int i2, int[] iArr, q[] qVarArr, T t, B.a<g<T>> aVar, InterfaceC0161d interfaceC0161d, long j, z zVar, x.a aVar2) {
        this.f2552a = i2;
        this.f2553b = iArr;
        this.f2554c = qVarArr;
        this.f2556e = t;
        this.f2557f = aVar;
        this.f2558g = aVar2;
        this.f2559h = zVar;
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.n = new c.d.a.a.i.z[length];
        this.f2555d = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        c.d.a.a.i.z[] zVarArr = new c.d.a.a.i.z[i4];
        this.m = new c.d.a.a.i.z(interfaceC0161d);
        iArr2[0] = i2;
        zVarArr[0] = this.m;
        while (i3 < length) {
            c.d.a.a.i.z zVar2 = new c.d.a.a.i.z(interfaceC0161d);
            this.n[i3] = zVar2;
            int i5 = i3 + 1;
            zVarArr[i5] = zVar2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.o = new c(iArr2, zVarArr);
        this.r = j;
        this.s = j;
    }

    public void a(long j, boolean z) {
        if (k()) {
            return;
        }
        int iE = this.m.e();
        this.m.a(j, z, true);
        int iE2 = this.m.e();
        if (iE2 > iE) {
            long jK = this.m.k();
            for (int i2 = 0; i2 < this.n.length; i2++) {
                this.n[i2].a(jK, z, this.f2555d[i2]);
            }
        }
        b(iE2);
    }

    public g<T>.a a(long j, int i2) {
        for (int i3 = 0; i3 < this.n.length; i3++) {
            if (this.f2553b[i3] == i2) {
                AbstractC0170e.b(!this.f2555d[i3]);
                this.f2555d[i3] = true;
                this.n[i3].l();
                this.n[i3].b(j, true, true);
                return new a(this, this.n[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    public T i() {
        return this.f2556e;
    }

    @Override // c.d.a.a.i.B
    public long g() {
        if (this.v) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.r;
        }
        long jMax = this.s;
        c.d.a.a.i.b.a aVarM = m();
        if (!aVarM.h()) {
            aVarM = this.k.size() > 1 ? this.k.get(this.k.size() - 2) : null;
        }
        if (aVarM != null) {
            jMax = Math.max(jMax, aVarM.f2532g);
        }
        return Math.max(jMax, this.m.i());
    }

    public long a(long j, I i2) {
        return this.f2556e.a(j, i2);
    }

    public void e(long j) {
        boolean zC;
        this.s = j;
        if (k()) {
            this.r = j;
            return;
        }
        c.d.a.a.i.b.a aVar = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.k.size()) {
                break;
            }
            c.d.a.a.i.b.a aVar2 = this.k.get(i2);
            long j2 = aVar2.f2531f;
            if (j2 == j && aVar2.j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        this.m.l();
        if (aVar != null) {
            zC = this.m.c(aVar.a(0));
            this.u = 0L;
        } else {
            zC = this.m.b(j, true, (j > b() ? 1 : (j == b() ? 0 : -1)) < 0) != -1;
            this.u = this.s;
        }
        if (zC) {
            this.t = a(this.m.f(), 0);
            for (c.d.a.a.i.z zVar : this.n) {
                zVar.l();
                zVar.b(j, true, false);
            }
            return;
        }
        this.r = j;
        this.v = false;
        this.k.clear();
        this.t = 0;
        if (this.f2560i.b()) {
            this.f2560i.c();
            return;
        }
        this.m.a();
        for (c.d.a.a.i.z zVar2 : this.n) {
            zVar2.a();
        }
    }

    public void j() {
        a((b) null);
    }

    public void a(b<T> bVar) {
        this.q = bVar;
        this.m.n();
        for (c.d.a.a.i.z zVar : this.n) {
            zVar.n();
        }
        this.f2560i.a(this);
    }

    @Override // c.d.a.a.l.B.e
    public void h() {
        this.m.a();
        for (c.d.a.a.i.z zVar : this.n) {
            zVar.a();
        }
        if (this.q != null) {
            this.q.a(this);
        }
    }

    @Override // c.d.a.a.i.A
    public boolean c() {
        return this.v || (!k() && this.m.d());
    }

    @Override // c.d.a.a.i.A
    public void a() throws IOException {
        this.f2560i.a();
        if (this.f2560i.b()) {
            return;
        }
        this.f2556e.a();
    }

    @Override // c.d.a.a.i.A
    public int a(r rVar, c.d.a.a.c.f fVar, boolean z) {
        if (k()) {
            return -3;
        }
        l();
        return this.m.a(rVar, fVar, z, this.v, this.u);
    }

    @Override // c.d.a.a.i.A
    public int d(long j) {
        int iO = 0;
        if (k()) {
            return 0;
        }
        if (this.v && j > this.m.i()) {
            iO = this.m.o();
        } else {
            int iB = this.m.b(j, true, true);
            if (iB != -1) {
                iO = iB;
            }
        }
        l();
        return iO;
    }

    @Override // c.d.a.a.l.B.a
    public void a(d dVar, long j, long j2) {
        this.f2556e.a(dVar);
        this.f2558g.a(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2552a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, dVar.d());
        this.f2557f.a(this);
    }

    @Override // c.d.a.a.l.B.a
    public void a(d dVar, long j, long j2, boolean z) {
        this.f2558g.b(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2552a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, dVar.d());
        if (z) {
            return;
        }
        this.m.a();
        for (c.d.a.a.i.z zVar : this.n) {
            zVar.a();
        }
        this.f2557f.a(this);
    }

    @Override // c.d.a.a.l.B.a
    public B.b a(d dVar, long j, long j2, IOException iOException, int i2) {
        long jD = dVar.d();
        boolean zA = a(dVar);
        int size = this.k.size() - 1;
        boolean z = (jD != 0 && zA && a(size)) ? false : true;
        B.b bVarA = null;
        if (this.f2556e.a(dVar, z, iOException, z ? this.f2559h.b(dVar.f2527b, j2, iOException, i2) : -9223372036854775807L)) {
            if (z) {
                bVarA = c.d.a.a.l.B.f3347c;
                if (zA) {
                    AbstractC0170e.b(d(size) == dVar);
                    if (this.k.isEmpty()) {
                        this.r = this.s;
                    }
                }
            } else {
                c.d.a.a.m.o.c("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (bVarA == null) {
            long jA = this.f2559h.a(dVar.f2527b, j2, iOException, i2);
            bVarA = jA != -9223372036854775807L ? c.d.a.a.l.B.a(false, jA) : c.d.a.a.l.B.f3348d;
        }
        B.b bVar = bVarA;
        boolean z2 = !bVar.a();
        this.f2558g.a(dVar.f2526a, dVar.e(), dVar.f(), dVar.f2527b, this.f2552a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, j, j2, jD, iOException, z2);
        if (z2) {
            this.f2557f.a(this);
        }
        return bVar;
    }

    @Override // c.d.a.a.i.B
    public boolean b(long j) {
        List<c.d.a.a.i.b.a> listEmptyList;
        long j2;
        if (this.v || this.f2560i.b()) {
            return false;
        }
        boolean zK = k();
        if (zK) {
            listEmptyList = Collections.emptyList();
            j2 = this.r;
        } else {
            listEmptyList = this.l;
            j2 = m().f2532g;
        }
        this.f2556e.a(j, j2, listEmptyList, this.j);
        boolean z = this.j.f2551b;
        d dVar = this.j.f2550a;
        this.j.a();
        if (z) {
            this.r = -9223372036854775807L;
            this.v = true;
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (a(dVar)) {
            c.d.a.a.i.b.a aVar = (c.d.a.a.i.b.a) dVar;
            if (zK) {
                this.u = aVar.f2531f == this.r ? 0L : this.r;
                this.r = -9223372036854775807L;
            }
            aVar.a(this.o);
            this.k.add(aVar);
        }
        this.f2558g.a(dVar.f2526a, dVar.f2527b, this.f2552a, dVar.f2528c, dVar.f2529d, dVar.f2530e, dVar.f2531f, dVar.f2532g, this.f2560i.a(dVar, this, this.f2559h.a(dVar.f2527b)));
        return true;
    }

    @Override // c.d.a.a.i.B
    public long b() {
        if (k()) {
            return this.r;
        }
        if (this.v) {
            return Long.MIN_VALUE;
        }
        return m().f2532g;
    }

    @Override // c.d.a.a.i.B
    public void c(long j) {
        int size;
        int iA;
        if (this.f2560i.b() || k() || (size = this.k.size()) <= (iA = this.f2556e.a(j, this.l))) {
            return;
        }
        while (true) {
            if (iA >= size) {
                iA = size;
                break;
            } else if (!a(iA)) {
                break;
            } else {
                iA++;
            }
        }
        if (iA == size) {
            return;
        }
        long j2 = m().f2532g;
        c.d.a.a.i.b.a aVarD = d(iA);
        if (this.k.isEmpty()) {
            this.r = this.s;
        }
        this.v = false;
        this.f2558g.a(this.f2552a, aVarD.f2531f, j2);
    }

    private boolean a(d dVar) {
        return dVar instanceof c.d.a.a.i.b.a;
    }

    private boolean a(int i2) {
        c.d.a.a.i.b.a aVar = this.k.get(i2);
        if (this.m.f() > aVar.a(0)) {
            return true;
        }
        int i3 = 0;
        while (i3 < this.n.length) {
            int iF = this.n[i3].f();
            i3++;
            if (iF > aVar.a(i3)) {
                return true;
            }
        }
        return false;
    }

    boolean k() {
        return this.r != -9223372036854775807L;
    }

    private void b(int i2) {
        int iMin = Math.min(a(i2, 0), this.t);
        if (iMin > 0) {
            H.a((List) this.k, 0, iMin);
            this.t -= iMin;
        }
    }

    private void l() {
        int iA = a(this.m.f(), this.t - 1);
        while (this.t <= iA) {
            int i2 = this.t;
            this.t = i2 + 1;
            c(i2);
        }
    }

    private void c(int i2) {
        c.d.a.a.i.b.a aVar = this.k.get(i2);
        q qVar = aVar.f2528c;
        if (!qVar.equals(this.p)) {
            this.f2558g.a(this.f2552a, qVar, aVar.f2529d, aVar.f2530e, aVar.f2531f);
        }
        this.p = qVar;
    }

    private int a(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.k.size()) {
                return this.k.size() - 1;
            }
        } while (this.k.get(i3).a(0) <= i2);
        return i3 - 1;
    }

    private c.d.a.a.i.b.a m() {
        return this.k.get(this.k.size() - 1);
    }

    private c.d.a.a.i.b.a d(int i2) {
        c.d.a.a.i.b.a aVar = this.k.get(i2);
        H.a((List) this.k, i2, this.k.size());
        this.t = Math.max(this.t, this.k.size());
        int i3 = 0;
        this.m.b(aVar.a(0));
        while (i3 < this.n.length) {
            c.d.a.a.i.z zVar = this.n[i3];
            i3++;
            zVar.b(aVar.a(i3));
        }
        return aVar;
    }

    public final class a implements A {

        /* renamed from: a, reason: collision with root package name */
        public final g<T> f2561a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.a.i.z f2562b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2563c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2564d;

        @Override // c.d.a.a.i.A
        public void a() {
        }

        public a(g<T> gVar, c.d.a.a.i.z zVar, int i2) {
            this.f2561a = gVar;
            this.f2562b = zVar;
            this.f2563c = i2;
        }

        @Override // c.d.a.a.i.A
        public boolean c() {
            return g.this.v || (!g.this.k() && this.f2562b.d());
        }

        @Override // c.d.a.a.i.A
        public int d(long j) {
            if (g.this.k()) {
                return 0;
            }
            d();
            if (g.this.v && j > this.f2562b.i()) {
                return this.f2562b.o();
            }
            int iB = this.f2562b.b(j, true, true);
            if (iB == -1) {
                return 0;
            }
            return iB;
        }

        @Override // c.d.a.a.i.A
        public int a(r rVar, c.d.a.a.c.f fVar, boolean z) {
            if (g.this.k()) {
                return -3;
            }
            d();
            return this.f2562b.a(rVar, fVar, z, g.this.v, g.this.u);
        }

        public void b() {
            AbstractC0170e.b(g.this.f2555d[this.f2563c]);
            g.this.f2555d[this.f2563c] = false;
        }

        private void d() {
            if (this.f2564d) {
                return;
            }
            g.this.f2558g.a(g.this.f2553b[this.f2563c], g.this.f2554c[this.f2563c], 0, null, g.this.s);
            this.f2564d = true;
        }
    }
}

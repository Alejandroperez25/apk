package c.d.a.a.e.e;

import android.util.Pair;
import android.util.SparseArray;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.d.f;
import c.d.a.a.e.e.c;
import c.d.a.a.e.o;
import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.E;
import c.d.a.a.m.H;
import c.d.a.a.m.s;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f1924a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.e.a
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return h.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int f1925b = H.h("seig");

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f1926c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: d, reason: collision with root package name */
    private static final c.d.a.a.q f1927d = c.d.a.a.q.a(null, "application/x-emsg", Long.MAX_VALUE);
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private c.d.a.a.e.i H;
    private c.d.a.a.e.q[] I;
    private c.d.a.a.e.q[] J;
    private boolean K;

    /* renamed from: e, reason: collision with root package name */
    private final int f1928e;

    /* renamed from: f, reason: collision with root package name */
    private final o f1929f;

    /* renamed from: g, reason: collision with root package name */
    private final List<c.d.a.a.q> f1930g;

    /* renamed from: h, reason: collision with root package name */
    private final c.d.a.a.d.f f1931h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<b> f1932i;
    private final u j;
    private final u k;
    private final u l;
    private final E m;
    private final u n;
    private final byte[] o;
    private final ArrayDeque<c.a> p;
    private final ArrayDeque<a> q;
    private final c.d.a.a.e.q r;
    private int s;
    private int t;
    private long u;
    private int v;
    private u w;
    private long x;
    private int y;
    private long z;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new h()};
    }

    public h() {
        this(0);
    }

    public h(int i2) {
        this(i2, null);
    }

    public h(int i2, E e2) {
        this(i2, e2, null, null);
    }

    public h(int i2, E e2, o oVar, c.d.a.a.d.f fVar) {
        this(i2, e2, oVar, fVar, Collections.emptyList());
    }

    public h(int i2, E e2, o oVar, c.d.a.a.d.f fVar, List<c.d.a.a.q> list) {
        this(i2, e2, oVar, fVar, list, null);
    }

    public h(int i2, E e2, o oVar, c.d.a.a.d.f fVar, List<c.d.a.a.q> list, c.d.a.a.e.q qVar) {
        this.f1928e = i2 | (oVar != null ? 8 : 0);
        this.m = e2;
        this.f1929f = oVar;
        this.f1931h = fVar;
        this.f1930g = Collections.unmodifiableList(list);
        this.r = qVar;
        this.n = new u(16);
        this.j = new u(s.f3547a);
        this.k = new u(5);
        this.l = new u();
        this.o = new byte[16];
        this.p = new ArrayDeque<>();
        this.q = new ArrayDeque<>();
        this.f1932i = new SparseArray<>();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        c();
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        return n.a(hVar);
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.H = iVar;
        if (this.f1929f != null) {
            b bVar = new b(iVar.a(0, this.f1929f.f1975b));
            bVar.a(this.f1929f, new e(0, 0, 0, 0));
            this.f1932i.put(0, bVar);
            d();
            this.H.a();
        }
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        int size = this.f1932i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1932i.valueAt(i2).a();
        }
        this.q.clear();
        this.y = 0;
        this.z = j2;
        this.p.clear();
        c();
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws x {
        while (true) {
            switch (this.s) {
                case 0:
                    if (!b(hVar)) {
                        return -1;
                    }
                    break;
                case 1:
                    c(hVar);
                    break;
                case 2:
                    d(hVar);
                    break;
                default:
                    if (!e(hVar)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    private void c() {
        this.s = 0;
        this.v = 0;
    }

    private boolean b(c.d.a.a.e.h hVar) throws x {
        if (this.v == 0) {
            if (!hVar.a(this.n.f3567a, 0, 8, true)) {
                return false;
            }
            this.v = 8;
            this.n.c(0);
            this.u = this.n.n();
            this.t = this.n.p();
        }
        if (this.u == 1) {
            hVar.readFully(this.n.f3567a, 8, 8);
            this.v += 8;
            this.u = this.n.x();
        } else if (this.u == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.p.isEmpty()) {
                length = this.p.peek().Xa;
            }
            if (length != -1) {
                this.u = (length - hVar.c()) + this.v;
            }
        }
        if (this.u < this.v) {
            throw new x("Atom size less than header length (unsupported).");
        }
        long jC = hVar.c() - this.v;
        if (this.t == c.K) {
            int size = this.f1932i.size();
            for (int i2 = 0; i2 < size; i2++) {
                q qVar = this.f1932i.valueAt(i2).f1936b;
                qVar.f1989b = jC;
                qVar.f1991d = jC;
                qVar.f1990c = jC;
            }
        }
        if (this.t == c.f1879h) {
            this.C = null;
            this.x = this.u + jC;
            if (!this.K) {
                this.H.a(new o.b(this.A, jC));
                this.K = true;
            }
            this.s = 2;
            return true;
        }
        if (b(this.t)) {
            long jC2 = (hVar.c() + this.u) - 8;
            this.p.push(new c.a(this.t, jC2));
            if (this.u == this.v) {
                a(jC2);
            } else {
                c();
            }
        } else if (a(this.t)) {
            if (this.v != 8) {
                throw new x("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.u > 2147483647L) {
                throw new x("Leaf atom with length > 2147483647 (unsupported).");
            }
            this.w = new u((int) this.u);
            System.arraycopy(this.n.f3567a, 0, this.w.f3567a, 0, 8);
            this.s = 1;
        } else {
            if (this.u > 2147483647L) {
                throw new x("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.w = null;
            this.s = 1;
        }
        return true;
    }

    private void c(c.d.a.a.e.h hVar) throws x {
        int i2 = ((int) this.u) - this.v;
        if (this.w != null) {
            hVar.readFully(this.w.f3567a, 8, i2);
            a(new c.b(this.t, this.w), hVar.c());
        } else {
            hVar.c(i2);
        }
        a(hVar.c());
    }

    private void a(long j) throws x {
        while (!this.p.isEmpty() && this.p.peek().Xa == j) {
            a(this.p.pop());
        }
        c();
    }

    private void a(c.b bVar, long j) throws x {
        if (!this.p.isEmpty()) {
            this.p.peek().a(bVar);
            return;
        }
        if (bVar.Wa == c.A) {
            Pair<Long, c.d.a.a.e.b> pairA = a(bVar.Xa, j);
            this.B = ((Long) pairA.first).longValue();
            this.H.a((c.d.a.a.e.o) pairA.second);
            this.K = true;
            return;
        }
        if (bVar.Wa == c.Ha) {
            a(bVar.Xa);
        }
    }

    private void a(c.a aVar) throws x {
        if (aVar.Wa == c.B) {
            b(aVar);
        } else if (aVar.Wa == c.K) {
            c(aVar);
        } else {
            if (this.p.isEmpty()) {
                return;
            }
            this.p.peek().a(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(c.a aVar) {
        int i2;
        int i3;
        int i4 = 0;
        AbstractC0170e.b(this.f1929f == null, "Unexpected moov box.");
        c.d.a.a.d.f fVarA = this.f1931h != null ? this.f1931h : a(aVar.Ya);
        c.a aVarE = aVar.e(c.M);
        SparseArray sparseArray = new SparseArray();
        int size = aVarE.Ya.size();
        long jC = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            c.b bVar = aVarE.Ya.get(i5);
            if (bVar.Wa == c.y) {
                Pair<Integer, e> pairB = b(bVar.Xa);
                sparseArray.put(((Integer) pairB.first).intValue(), pairB.second);
            } else if (bVar.Wa == c.N) {
                jC = c(bVar.Xa);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar.Za.size();
        int i6 = 0;
        while (i6 < size2) {
            c.a aVar2 = aVar.Za.get(i6);
            if (aVar2.Wa == c.D) {
                i2 = i6;
                i3 = size2;
                o oVarA = d.a(aVar2, aVar.d(c.C), jC, fVarA, (this.f1928e & 16) != 0, false);
                if (oVarA != null) {
                    sparseArray2.put(oVarA.f1974a, oVarA);
                }
            } else {
                i2 = i6;
                i3 = size2;
            }
            i6 = i2 + 1;
            size2 = i3;
        }
        int size3 = sparseArray2.size();
        if (this.f1932i.size() == 0) {
            while (i4 < size3) {
                o oVar = (o) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.H.a(i4, oVar.f1975b));
                bVar2.a(oVar, a((SparseArray<e>) sparseArray, oVar.f1974a));
                this.f1932i.put(oVar.f1974a, bVar2);
                this.A = Math.max(this.A, oVar.f1978e);
                i4++;
            }
            d();
            this.H.a();
            return;
        }
        AbstractC0170e.b(this.f1932i.size() == size3);
        while (i4 < size3) {
            o oVar2 = (o) sparseArray2.valueAt(i4);
            this.f1932i.get(oVar2.f1974a).a(oVar2, a((SparseArray<e>) sparseArray, oVar2.f1974a));
            i4++;
        }
    }

    private e a(SparseArray<e> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        e eVar = sparseArray.get(i2);
        AbstractC0170e.a(eVar);
        return eVar;
    }

    private void c(c.a aVar) throws x {
        a(aVar, this.f1932i, this.f1928e, this.o);
        c.d.a.a.d.f fVarA = this.f1931h != null ? null : a(aVar.Ya);
        if (fVarA != null) {
            int size = this.f1932i.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1932i.valueAt(i2).a(fVarA);
            }
        }
        if (this.z != -9223372036854775807L) {
            int size2 = this.f1932i.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f1932i.valueAt(i3).a(this.z);
            }
            this.z = -9223372036854775807L;
        }
    }

    private void d() {
        int i2;
        if (this.I == null) {
            this.I = new c.d.a.a.e.q[2];
            if (this.r != null) {
                this.I[0] = this.r;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.f1928e & 4) != 0) {
                this.I[i2] = this.H.a(this.f1932i.size(), 4);
                i2++;
            }
            this.I = (c.d.a.a.e.q[]) Arrays.copyOf(this.I, i2);
            for (c.d.a.a.e.q qVar : this.I) {
                qVar.a(f1927d);
            }
        }
        if (this.J == null) {
            this.J = new c.d.a.a.e.q[this.f1930g.size()];
            for (int i3 = 0; i3 < this.J.length; i3++) {
                c.d.a.a.e.q qVarA = this.H.a(this.f1932i.size() + 1 + i3, 3);
                qVarA.a(this.f1930g.get(i3));
                this.J[i3] = qVarA;
            }
        }
    }

    private void a(u uVar) {
        if (this.I == null || this.I.length == 0) {
            return;
        }
        uVar.c(12);
        int iB = uVar.b();
        uVar.z();
        uVar.z();
        long jD = H.d(uVar.n(), 1000000L, uVar.n());
        int iD = uVar.d();
        uVar.f3567a[iD - 4] = 0;
        uVar.f3567a[iD - 3] = 0;
        uVar.f3567a[iD - 2] = 0;
        uVar.f3567a[iD - 1] = 0;
        for (c.d.a.a.e.q qVar : this.I) {
            uVar.c(12);
            qVar.a(uVar, iB);
        }
        if (this.B != -9223372036854775807L) {
            long j = this.B + jD;
            long jE = this.m != null ? this.m.e(j) : j;
            for (c.d.a.a.e.q qVar2 : this.I) {
                qVar2.a(jE, 1, iB, 0, null);
            }
            return;
        }
        this.q.addLast(new a(jD, iB));
        this.y += iB;
    }

    private static Pair<Integer, e> b(u uVar) {
        uVar.c(12);
        return Pair.create(Integer.valueOf(uVar.p()), new e(uVar.v() - 1, uVar.v(), uVar.v(), uVar.p()));
    }

    private static long c(u uVar) {
        uVar.c(8);
        return c.a(uVar.p()) == 0 ? uVar.n() : uVar.x();
    }

    private static void a(c.a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) throws x {
        int size = aVar.Za.size();
        for (int i3 = 0; i3 < size; i3++) {
            c.a aVar2 = aVar.Za.get(i3);
            if (aVar2.Wa == c.L) {
                b(aVar2, sparseArray, i2, bArr);
            }
        }
    }

    private static void b(c.a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) throws x {
        b bVarA = a(aVar.d(c.x).Xa, sparseArray);
        if (bVarA == null) {
            return;
        }
        q qVar = bVarA.f1936b;
        long jD = qVar.s;
        bVarA.a();
        if (aVar.d(c.w) != null && (i2 & 2) == 0) {
            jD = d(aVar.d(c.w).Xa);
        }
        a(aVar, bVarA, jD, i2);
        p pVarA = bVarA.f1937c.a(qVar.f1988a.f1914a);
        c.b bVarD = aVar.d(c.ca);
        if (bVarD != null) {
            a(pVarA, bVarD.Xa, qVar);
        }
        c.b bVarD2 = aVar.d(c.da);
        if (bVarD2 != null) {
            a(bVarD2.Xa, qVar);
        }
        c.b bVarD3 = aVar.d(c.ha);
        if (bVarD3 != null) {
            b(bVarD3.Xa, qVar);
        }
        c.b bVarD4 = aVar.d(c.ea);
        c.b bVarD5 = aVar.d(c.fa);
        if (bVarD4 != null && bVarD5 != null) {
            a(bVarD4.Xa, bVarD5.Xa, pVarA != null ? pVarA.f1984b : null, qVar);
        }
        int size = aVar.Ya.size();
        for (int i3 = 0; i3 < size; i3++) {
            c.b bVar = aVar.Ya.get(i3);
            if (bVar.Wa == c.ga) {
                a(bVar.Xa, qVar, bArr);
            }
        }
    }

    private static void a(c.a aVar, b bVar, long j, int i2) {
        List<c.b> list = aVar.Ya;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            c.b bVar2 = list.get(i5);
            if (bVar2.Wa == c.z) {
                u uVar = bVar2.Xa;
                uVar.c(12);
                int iV = uVar.v();
                if (iV > 0) {
                    i4 += iV;
                    i3++;
                }
            }
        }
        bVar.f1941g = 0;
        bVar.f1940f = 0;
        bVar.f1939e = 0;
        bVar.f1936b.a(i3, i4);
        int i6 = 0;
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            c.b bVar3 = list.get(i7);
            if (bVar3.Wa == c.z) {
                iA = a(bVar, i6, j, i2, bVar3.Xa, iA);
                i6++;
            }
        }
    }

    private static void a(p pVar, u uVar, q qVar) throws x {
        int i2;
        int i3 = pVar.f1986d;
        uVar.c(8);
        if ((c.b(uVar.p()) & 1) == 1) {
            uVar.d(8);
        }
        int iH = uVar.h();
        int iV = uVar.v();
        if (iV != qVar.f1993f) {
            throw new x("Length mismatch: " + iV + ", " + qVar.f1993f);
        }
        if (iH == 0) {
            boolean[] zArr = qVar.n;
            i2 = 0;
            for (int i4 = 0; i4 < iV; i4++) {
                int iH2 = uVar.h();
                i2 += iH2;
                zArr[i4] = iH2 > i3;
            }
        } else {
            i2 = (iH * iV) + 0;
            Arrays.fill(qVar.n, 0, iV, iH > i3);
        }
        qVar.a(i2);
    }

    private static void a(u uVar, q qVar) throws x {
        uVar.c(8);
        int iP = uVar.p();
        if ((c.b(iP) & 1) == 1) {
            uVar.d(8);
        }
        int iV = uVar.v();
        if (iV != 1) {
            throw new x("Unexpected saio entry count: " + iV);
        }
        qVar.f1991d += c.a(iP) == 0 ? uVar.n() : uVar.x();
    }

    private static b a(u uVar, SparseArray<b> sparseArray) {
        uVar.c(8);
        int iB = c.b(uVar.p());
        b bVarB = b(sparseArray, uVar.p());
        if (bVarB == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jX = uVar.x();
            bVarB.f1936b.f1990c = jX;
            bVarB.f1936b.f1991d = jX;
        }
        e eVar = bVarB.f1938d;
        bVarB.f1936b.f1988a = new e((iB & 2) != 0 ? uVar.v() - 1 : eVar.f1914a, (iB & 8) != 0 ? uVar.v() : eVar.f1915b, (iB & 16) != 0 ? uVar.v() : eVar.f1916c, (iB & 32) != 0 ? uVar.v() : eVar.f1917d);
        return bVarB;
    }

    private static b b(SparseArray<b> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i2);
    }

    private static long d(u uVar) {
        uVar.c(8);
        return c.a(uVar.p()) == 1 ? uVar.x() : uVar.n();
    }

    private static int a(b bVar, int i2, long j, int i3, u uVar, int i4) {
        long[] jArr;
        long j2;
        long j3;
        boolean z;
        int iV;
        boolean z2;
        int iP;
        e eVar;
        uVar.c(8);
        int iB = c.b(uVar.p());
        o oVar = bVar.f1937c;
        q qVar = bVar.f1936b;
        e eVar2 = qVar.f1988a;
        qVar.f1995h[i2] = uVar.v();
        qVar.f1994g[i2] = qVar.f1990c;
        if ((iB & 1) != 0) {
            long[] jArr2 = qVar.f1994g;
            jArr2[i2] = jArr2[i2] + uVar.p();
        }
        boolean z3 = (iB & 4) != 0;
        int iV2 = eVar2.f1917d;
        if (z3) {
            iV2 = uVar.v();
        }
        boolean z4 = (iB & 256) != 0;
        boolean z5 = (iB & 512) != 0;
        boolean z6 = (iB & 1024) != 0;
        boolean z7 = (iB & 2048) != 0;
        long jD = 0;
        if (oVar.f1981h != null && oVar.f1981h.length == 1 && oVar.f1981h[0] == 0) {
            jD = H.d(oVar.f1982i[0], 1000L, oVar.f1976c);
        }
        int[] iArr = qVar.f1996i;
        int[] iArr2 = qVar.j;
        long[] jArr3 = qVar.k;
        boolean[] zArr = qVar.l;
        int i5 = iV2;
        boolean z8 = oVar.f1975b == 2 && (i3 & 1) != 0;
        int i6 = i4 + qVar.f1995h[i2];
        boolean z9 = z8;
        long j4 = oVar.f1976c;
        if (i2 > 0) {
            jArr = jArr3;
            j2 = jD;
            j3 = qVar.s;
        } else {
            jArr = jArr3;
            j2 = jD;
            j3 = j;
        }
        int i7 = i4;
        while (i7 < i6) {
            int iV3 = z4 ? uVar.v() : eVar2.f1915b;
            if (z5) {
                z = z4;
                iV = uVar.v();
            } else {
                z = z4;
                iV = eVar2.f1916c;
            }
            if (i7 == 0 && z3) {
                z2 = z3;
                iP = i5;
            } else if (z6) {
                iP = uVar.p();
                z2 = z3;
            } else {
                z2 = z3;
                iP = eVar2.f1917d;
            }
            if (z7) {
                eVar = eVar2;
                iArr2[i7] = (int) ((uVar.p() * 1000) / j4);
            } else {
                eVar = eVar2;
                iArr2[i7] = 0;
            }
            jArr[i7] = H.d(j3, 1000L, j4) - j2;
            iArr[i7] = iV;
            zArr[i7] = ((iP >> 16) & 1) == 0 && (!z9 || i7 == 0);
            j3 += iV3;
            i7++;
            z4 = z;
            z3 = z2;
            eVar2 = eVar;
        }
        qVar.s = j3;
        return i6;
    }

    private static void a(u uVar, q qVar, byte[] bArr) throws x {
        uVar.c(8);
        uVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f1926c)) {
            a(uVar, 16, qVar);
        }
    }

    private static void b(u uVar, q qVar) throws x {
        a(uVar, 0, qVar);
    }

    private static void a(u uVar, int i2, q qVar) throws x {
        uVar.c(i2 + 8);
        int iB = c.b(uVar.p());
        if ((iB & 1) != 0) {
            throw new x("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iV = uVar.v();
        if (iV != qVar.f1993f) {
            throw new x("Length mismatch: " + iV + ", " + qVar.f1993f);
        }
        Arrays.fill(qVar.n, 0, iV, z);
        qVar.a(uVar.b());
        qVar.a(uVar);
    }

    private static void a(u uVar, u uVar2, String str, q qVar) throws x {
        byte[] bArr;
        uVar.c(8);
        int iP = uVar.p();
        if (uVar.p() != f1925b) {
            return;
        }
        if (c.a(iP) == 1) {
            uVar.d(4);
        }
        if (uVar.p() != 1) {
            throw new x("Entry count in sbgp != 1 (unsupported).");
        }
        uVar2.c(8);
        int iP2 = uVar2.p();
        if (uVar2.p() != f1925b) {
            return;
        }
        int iA = c.a(iP2);
        if (iA == 1) {
            if (uVar2.n() == 0) {
                throw new x("Variable length description in sgpd found (unsupported)");
            }
        } else if (iA >= 2) {
            uVar2.d(4);
        }
        if (uVar2.n() != 1) {
            throw new x("Entry count in sgpd != 1 (unsupported).");
        }
        uVar2.d(1);
        int iH = uVar2.h();
        int i2 = (iH & 240) >> 4;
        int i3 = iH & 15;
        boolean z = uVar2.h() == 1;
        if (z) {
            int iH2 = uVar2.h();
            byte[] bArr2 = new byte[16];
            uVar2.a(bArr2, 0, bArr2.length);
            if (z && iH2 == 0) {
                int iH3 = uVar2.h();
                byte[] bArr3 = new byte[iH3];
                uVar2.a(bArr3, 0, iH3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            qVar.m = true;
            qVar.o = new p(z, str, iH2, bArr2, i2, i3, bArr);
        }
    }

    private static Pair<Long, c.d.a.a.e.b> a(u uVar, long j) throws x {
        long jX;
        long jX2;
        uVar.c(8);
        int iA = c.a(uVar.p());
        uVar.d(4);
        long jN = uVar.n();
        if (iA == 0) {
            jX = uVar.n();
            jX2 = j + uVar.n();
        } else {
            jX = uVar.x();
            jX2 = j + uVar.x();
        }
        long j2 = jX2;
        long j3 = jX;
        long jD = H.d(j3, 1000000L, jN);
        uVar.d(2);
        int i2 = uVar.i();
        int[] iArr = new int[i2];
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        long[] jArr3 = new long[i2];
        long j4 = j3;
        long jD2 = jD;
        int i3 = 0;
        while (i3 < i2) {
            int iP = uVar.p();
            if ((iP & Integer.MIN_VALUE) != 0) {
                throw new x("Unhandled indirect reference");
            }
            long jN2 = uVar.n();
            iArr[i3] = iP & Integer.MAX_VALUE;
            jArr[i3] = j2;
            jArr3[i3] = jD2;
            j4 += jN2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i4 = i2;
            jD2 = H.d(j4, 1000000L, jN);
            jArr4[i3] = jD2 - jArr5[i3];
            uVar.d(4);
            j2 += r3[i3];
            i3++;
            jArr2 = jArr4;
            iArr = iArr;
            jArr3 = jArr5;
            i2 = i4;
            jArr = jArr;
        }
        return Pair.create(Long.valueOf(jD), new c.d.a.a.e.b(iArr, jArr, jArr2, jArr3));
    }

    private void d(c.d.a.a.e.h hVar) throws x {
        int size = this.f1932i.size();
        b bVarValueAt = null;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = this.f1932i.valueAt(i2).f1936b;
            if (qVar.r && qVar.f1991d < j) {
                long j2 = qVar.f1991d;
                bVarValueAt = this.f1932i.valueAt(i2);
                j = j2;
            }
        }
        if (bVarValueAt == null) {
            this.s = 3;
            return;
        }
        int iC = (int) (j - hVar.c());
        if (iC < 0) {
            throw new x("Offset to encryption data was negative.");
        }
        hVar.c(iC);
        bVarValueAt.f1936b.a(hVar);
    }

    private boolean e(c.d.a.a.e.h hVar) throws x {
        int i2;
        q.a aVar;
        int iA;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        if (this.s == 3) {
            if (this.C == null) {
                b bVarA = a(this.f1932i);
                if (bVarA == null) {
                    int iC = (int) (this.x - hVar.c());
                    if (iC < 0) {
                        throw new x("Offset to end of mdat was negative.");
                    }
                    hVar.c(iC);
                    c();
                    return false;
                }
                int iC2 = (int) (bVarA.f1936b.f1994g[bVarA.f1941g] - hVar.c());
                if (iC2 < 0) {
                    c.d.a.a.m.o.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    iC2 = 0;
                }
                hVar.c(iC2);
                this.C = bVarA;
            }
            this.D = this.C.f1936b.f1996i[this.C.f1939e];
            if (this.C.f1939e < this.C.f1942h) {
                hVar.c(this.D);
                this.C.d();
                if (!this.C.b()) {
                    this.C = null;
                }
                this.s = 3;
                return true;
            }
            if (this.C.f1937c.f1980g == 1) {
                this.D -= 8;
                hVar.c(8);
            }
            this.E = this.C.c();
            this.D += this.E;
            this.s = 4;
            this.F = 0;
        }
        q qVar = this.C.f1936b;
        o oVar = this.C.f1937c;
        c.d.a.a.e.q qVar2 = this.C.f1935a;
        int i6 = this.C.f1939e;
        long jB = qVar.b(i6) * 1000;
        if (this.m != null) {
            jB = this.m.e(jB);
        }
        long j = jB;
        if (oVar.j != 0) {
            byte[] bArr = this.k.f3567a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i7 = oVar.j + 1;
            int i8 = 4 - oVar.j;
            while (this.E < this.D) {
                if (this.F == 0) {
                    hVar.readFully(bArr, i8, i7);
                    this.k.c(i5);
                    this.F = this.k.v() - i4;
                    this.j.c(i5);
                    qVar2.a(this.j, i3);
                    qVar2.a(this.k, i4);
                    this.G = this.J.length > 0 && s.a(oVar.f1979f.f3682g, bArr[i3]);
                    this.E += 5;
                    this.D += i8;
                } else {
                    if (this.G) {
                        this.l.a(this.F);
                        hVar.readFully(this.l.f3567a, i5, this.F);
                        qVar2.a(this.l, this.F);
                        iA = this.F;
                        int iA2 = s.a(this.l.f3567a, this.l.c());
                        this.l.c("video/hevc".equals(oVar.f1979f.f3682g) ? 1 : 0);
                        this.l.b(iA2);
                        c.d.a.a.j.a.h.a(j, this.l, this.J);
                    } else {
                        iA = qVar2.a(hVar, this.F, false);
                    }
                    this.E += iA;
                    this.F -= iA;
                    i3 = 4;
                    i4 = 1;
                    i5 = 0;
                }
            }
        } else {
            while (this.E < this.D) {
                this.E += qVar2.a(hVar, this.D - this.E, false);
            }
        }
        boolean z = qVar.l[i6];
        p pVarE = this.C.e();
        if (pVarE != null) {
            i2 = (z ? 1 : 0) | 1073741824;
            aVar = pVarE.f1985c;
        } else {
            i2 = z ? 1 : 0;
            aVar = null;
        }
        qVar2.a(j, i2, this.D, 0, aVar);
        b(j);
        if (!this.C.b()) {
            this.C = null;
        }
        this.s = 3;
        return true;
    }

    private void b(long j) {
        while (!this.q.isEmpty()) {
            a aVarRemoveFirst = this.q.removeFirst();
            this.y -= aVarRemoveFirst.f1934b;
            long jE = aVarRemoveFirst.f1933a + j;
            if (this.m != null) {
                jE = this.m.e(jE);
            }
            for (c.d.a.a.e.q qVar : this.I) {
                qVar.a(jE, 1, aVarRemoveFirst.f1934b, this.y, null);
            }
        }
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b bVarValueAt = sparseArray.valueAt(i2);
            if (bVarValueAt.f1941g != bVarValueAt.f1936b.f1992e) {
                long j2 = bVarValueAt.f1936b.f1994g[bVarValueAt.f1941g];
                if (j2 < j) {
                    bVar = bVarValueAt;
                    j = j2;
                }
            }
        }
        return bVar;
    }

    private static c.d.a.a.d.f a(List<c.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            c.b bVar = list.get(i2);
            if (bVar.Wa == c.U) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.Xa.f3567a;
                UUID uuidA = m.a(bArr);
                if (uuidA == null) {
                    c.d.a.a.m.o.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new f.a(uuidA, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new c.d.a.a.d.f(arrayList);
    }

    private static boolean a(int i2) {
        return i2 == c.S || i2 == c.R || i2 == c.C || i2 == c.A || i2 == c.T || i2 == c.w || i2 == c.x || i2 == c.O || i2 == c.y || i2 == c.z || i2 == c.U || i2 == c.ca || i2 == c.da || i2 == c.ha || i2 == c.ga || i2 == c.ea || i2 == c.fa || i2 == c.Q || i2 == c.N || i2 == c.Ha;
    }

    private static boolean b(int i2) {
        return i2 == c.B || i2 == c.D || i2 == c.E || i2 == c.F || i2 == c.G || i2 == c.K || i2 == c.L || i2 == c.M || i2 == c.P;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1933a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1934b;

        public a(long j, int i2) {
            this.f1933a = j;
            this.f1934b = i2;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c.d.a.a.e.q f1935a;

        /* renamed from: c, reason: collision with root package name */
        public o f1937c;

        /* renamed from: d, reason: collision with root package name */
        public e f1938d;

        /* renamed from: e, reason: collision with root package name */
        public int f1939e;

        /* renamed from: f, reason: collision with root package name */
        public int f1940f;

        /* renamed from: g, reason: collision with root package name */
        public int f1941g;

        /* renamed from: h, reason: collision with root package name */
        public int f1942h;

        /* renamed from: b, reason: collision with root package name */
        public final q f1936b = new q();

        /* renamed from: i, reason: collision with root package name */
        private final u f1943i = new u(1);
        private final u j = new u();

        public b(c.d.a.a.e.q qVar) {
            this.f1935a = qVar;
        }

        public void a(o oVar, e eVar) {
            AbstractC0170e.a(oVar);
            this.f1937c = oVar;
            AbstractC0170e.a(eVar);
            this.f1938d = eVar;
            this.f1935a.a(oVar.f1979f);
            a();
        }

        public void a(c.d.a.a.d.f fVar) {
            p pVarA = this.f1937c.a(this.f1936b.f1988a.f1914a);
            this.f1935a.a(this.f1937c.f1979f.a(fVar.a(pVarA != null ? pVarA.f1984b : null)));
        }

        public void a() {
            this.f1936b.a();
            this.f1939e = 0;
            this.f1941g = 0;
            this.f1940f = 0;
            this.f1942h = 0;
        }

        public void a(long j) {
            long jA = AbstractC0132d.a(j);
            for (int i2 = this.f1939e; i2 < this.f1936b.f1993f && this.f1936b.b(i2) < jA; i2++) {
                if (this.f1936b.l[i2]) {
                    this.f1942h = i2;
                }
            }
        }

        public boolean b() {
            this.f1939e++;
            this.f1940f++;
            if (this.f1940f != this.f1936b.f1995h[this.f1941g]) {
                return true;
            }
            this.f1941g++;
            this.f1940f = 0;
            return false;
        }

        public int c() {
            u uVar;
            int length;
            p pVarE = e();
            if (pVarE == null) {
                return 0;
            }
            if (pVarE.f1986d != 0) {
                uVar = this.f1936b.q;
                length = pVarE.f1986d;
            } else {
                byte[] bArr = pVarE.f1987e;
                this.j.a(bArr, bArr.length);
                uVar = this.j;
                length = bArr.length;
            }
            boolean zC = this.f1936b.c(this.f1939e);
            this.f1943i.f3567a[0] = (byte) ((zC ? 128 : 0) | length);
            this.f1943i.c(0);
            this.f1935a.a(this.f1943i, 1);
            this.f1935a.a(uVar, length);
            if (!zC) {
                return length + 1;
            }
            u uVar2 = this.f1936b.q;
            int i2 = uVar2.i();
            uVar2.d(-2);
            int i3 = (i2 * 6) + 2;
            this.f1935a.a(uVar2, i3);
            return length + 1 + i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            p pVarE = e();
            if (pVarE == null) {
                return;
            }
            u uVar = this.f1936b.q;
            if (pVarE.f1986d != 0) {
                uVar.d(pVarE.f1986d);
            }
            if (this.f1936b.c(this.f1939e)) {
                uVar.d(uVar.i() * 6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public p e() {
            p pVarA = this.f1936b.o != null ? this.f1936b.o : this.f1937c.a(this.f1936b.f1988a.f1914a);
            if (pVarA == null || !pVarA.f1983a) {
                return null;
            }
            return pVarA;
        }
    }
}

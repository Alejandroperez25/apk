package c.d.a.a.e.e;

import c.d.a.a.e.e.c;
import c.d.a.a.e.o;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.s;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements c.d.a.a.e.g, c.d.a.a.e.o {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f1957a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.e.b
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return l.e();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int f1958b = H.h("qt  ");

    /* renamed from: c, reason: collision with root package name */
    private final int f1959c;

    /* renamed from: d, reason: collision with root package name */
    private final u f1960d;

    /* renamed from: e, reason: collision with root package name */
    private final u f1961e;

    /* renamed from: f, reason: collision with root package name */
    private final u f1962f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<c.a> f1963g;

    /* renamed from: h, reason: collision with root package name */
    private int f1964h;

    /* renamed from: i, reason: collision with root package name */
    private int f1965i;
    private long j;
    private int k;
    private u l;
    private int m;
    private int n;
    private int o;
    private c.d.a.a.e.i p;
    private a[] q;
    private long[][] r;
    private int s;
    private long t;
    private boolean u;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    @Override // c.d.a.a.e.o
    public boolean c() {
        return true;
    }

    static /* synthetic */ c.d.a.a.e.g[] e() {
        return new c.d.a.a.e.g[]{new l()};
    }

    public l() {
        this(0);
    }

    public l(int i2) {
        this.f1959c = i2;
        this.f1962f = new u(16);
        this.f1963g = new ArrayDeque<>();
        this.f1960d = new u(s.f3547a);
        this.f1961e = new u(4);
        this.m = -1;
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        return n.b(hVar);
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.p = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.f1963g.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        if (j == 0) {
            f();
        } else if (this.q != null) {
            e(j2);
        }
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        while (true) {
            switch (this.f1964h) {
                case 0:
                    if (!b(hVar)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!b(hVar, nVar)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return c(hVar, nVar);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // c.d.a.a.e.o
    public long d() {
        return this.t;
    }

    @Override // c.d.a.a.e.o
    public o.a b(long j) {
        long j2;
        long jA;
        long j3;
        long j4;
        int iB;
        if (this.q.length == 0) {
            return new o.a(c.d.a.a.e.p.f2354a);
        }
        if (this.s != -1) {
            r rVar = this.q[this.s].f1967b;
            int iA = a(rVar, j);
            if (iA == -1) {
                return new o.a(c.d.a.a.e.p.f2354a);
            }
            long j5 = rVar.f2002f[iA];
            j2 = rVar.f1999c[iA];
            if (j5 >= j || iA >= rVar.f1998b - 1 || (iB = rVar.b(j)) == -1 || iB == iA) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = rVar.f2002f[iB];
                j4 = rVar.f1999c[iB];
            }
            jA = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jA = -1;
            j3 = -9223372036854775807L;
        }
        for (int i2 = 0; i2 < this.q.length; i2++) {
            if (i2 != this.s) {
                r rVar2 = this.q[i2].f1967b;
                long jA2 = a(rVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jA = a(rVar2, j3, jA);
                }
                j2 = jA2;
            }
        }
        c.d.a.a.e.p pVar = new c.d.a.a.e.p(j, j2);
        if (j3 == -9223372036854775807L) {
            return new o.a(pVar);
        }
        return new o.a(pVar, new c.d.a.a.e.p(j3, jA));
    }

    private void f() {
        this.f1964h = 0;
        this.k = 0;
    }

    private boolean b(c.d.a.a.e.h hVar) throws x {
        if (this.k == 0) {
            if (!hVar.a(this.f1962f.f3567a, 0, 8, true)) {
                return false;
            }
            this.k = 8;
            this.f1962f.c(0);
            this.j = this.f1962f.n();
            this.f1965i = this.f1962f.p();
        }
        if (this.j == 1) {
            hVar.readFully(this.f1962f.f3567a, 8, 8);
            this.k += 8;
            this.j = this.f1962f.x();
        } else if (this.j == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.f1963g.isEmpty()) {
                length = this.f1963g.peek().Xa;
            }
            if (length != -1) {
                this.j = (length - hVar.c()) + this.k;
            }
        }
        if (this.j < this.k) {
            throw new x("Atom size less than header length (unsupported).");
        }
        if (b(this.f1965i)) {
            long jC = (hVar.c() + this.j) - this.k;
            this.f1963g.push(new c.a(this.f1965i, jC));
            if (this.j == this.k) {
                c(jC);
            } else {
                f();
            }
        } else if (a(this.f1965i)) {
            AbstractC0170e.b(this.k == 8);
            AbstractC0170e.b(this.j <= 2147483647L);
            this.l = new u((int) this.j);
            System.arraycopy(this.f1962f.f3567a, 0, this.l.f3567a, 0, 8);
            this.f1964h = 1;
        } else {
            this.l = null;
            this.f1964h = 1;
        }
        return true;
    }

    private boolean b(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws x {
        boolean z;
        long j = this.j - this.k;
        long jC = hVar.c() + j;
        if (this.l != null) {
            hVar.readFully(this.l.f3567a, this.k, (int) j);
            if (this.f1965i == c.f1872a) {
                this.u = a(this.l);
            } else if (!this.f1963g.isEmpty()) {
                this.f1963g.peek().a(new c.b(this.f1965i, this.l));
            }
        } else if (j < 262144) {
            hVar.c((int) j);
        } else {
            nVar.f2349a = hVar.c() + j;
            z = true;
            c(jC);
            return (z || this.f1964h == 2) ? false : true;
        }
        z = false;
        c(jC);
        if (z) {
        }
    }

    private void c(long j) throws x {
        while (!this.f1963g.isEmpty() && this.f1963g.peek().Xa == j) {
            c.a aVarPop = this.f1963g.pop();
            if (aVarPop.Wa == c.B) {
                a(aVarPop);
                this.f1963g.clear();
                this.f1964h = 2;
            } else if (!this.f1963g.isEmpty()) {
                this.f1963g.peek().a(aVarPop);
            }
        }
        if (this.f1964h != 2) {
            f();
        }
    }

    private void a(c.a aVar) throws x {
        c.d.a.a.g.b bVarA;
        ArrayList arrayList = new ArrayList();
        c.d.a.a.e.k kVar = new c.d.a.a.e.k();
        c.b bVarD = aVar.d(c.Aa);
        if (bVarD != null) {
            bVarA = d.a(bVarD, this.u);
            if (bVarA != null) {
                kVar.a(bVarA);
            }
        } else {
            bVarA = null;
        }
        c.a aVarE = aVar.e(c.Ba);
        c.d.a.a.g.b bVarA2 = aVarE != null ? d.a(aVarE) : null;
        ArrayList<r> arrayListA = a(aVar, kVar, (this.f1959c & 1) != 0);
        int size = arrayListA.size();
        long jMax = -9223372036854775807L;
        int size2 = -1;
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = arrayListA.get(i2);
            o oVar = rVar.f1997a;
            a aVar2 = new a(oVar, rVar, this.p.a(i2, oVar.f1975b));
            aVar2.f1968c.a(k.a(oVar.f1975b, oVar.f1979f.a(rVar.f2001e + 30), bVarA, bVarA2, kVar));
            jMax = Math.max(jMax, oVar.f1978e != -9223372036854775807L ? oVar.f1978e : rVar.f2004h);
            if (oVar.f1975b == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(aVar2);
        }
        this.s = size2;
        this.t = jMax;
        this.q = (a[]) arrayList.toArray(new a[arrayList.size()]);
        this.r = a(this.q);
        this.p.a();
        this.p.a(this);
    }

    private ArrayList<r> a(c.a aVar, c.d.a.a.e.k kVar, boolean z) throws x {
        o oVarA;
        ArrayList<r> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < aVar.Za.size(); i2++) {
            c.a aVar2 = aVar.Za.get(i2);
            if (aVar2.Wa == c.D && (oVarA = d.a(aVar2, aVar.d(c.C), -9223372036854775807L, (c.d.a.a.d.f) null, z, this.u)) != null) {
                r rVarA = d.a(oVarA, aVar2.e(c.E).e(c.F).e(c.G), kVar);
                if (rVarA.f1998b != 0) {
                    arrayList.add(rVarA);
                }
            }
        }
        return arrayList;
    }

    private int c(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        long jC = hVar.c();
        if (this.m == -1) {
            this.m = d(jC);
            if (this.m == -1) {
                return -1;
            }
        }
        a aVar = this.q[this.m];
        c.d.a.a.e.q qVar = aVar.f1968c;
        int i2 = aVar.f1969d;
        long j = aVar.f1967b.f1999c[i2];
        int i3 = aVar.f1967b.f2000d[i2];
        long j2 = (j - jC) + this.n;
        if (j2 < 0 || j2 >= 262144) {
            nVar.f2349a = j;
            return 1;
        }
        if (aVar.f1966a.f1980g == 1) {
            j2 += 8;
            i3 -= 8;
        }
        hVar.c((int) j2);
        if (aVar.f1966a.j != 0) {
            byte[] bArr = this.f1961e.f3567a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i4 = aVar.f1966a.j;
            int i5 = 4 - aVar.f1966a.j;
            while (this.n < i3) {
                if (this.o == 0) {
                    hVar.readFully(this.f1961e.f3567a, i5, i4);
                    this.f1961e.c(0);
                    this.o = this.f1961e.v();
                    this.f1960d.c(0);
                    qVar.a(this.f1960d, 4);
                    this.n += 4;
                    i3 += i5;
                } else {
                    int iA = qVar.a(hVar, this.o, false);
                    this.n += iA;
                    this.o -= iA;
                }
            }
        } else {
            while (this.n < i3) {
                int iA2 = qVar.a(hVar, i3 - this.n, false);
                this.n += iA2;
                this.o -= iA2;
            }
        }
        qVar.a(aVar.f1967b.f2002f[i2], aVar.f1967b.f2003g[i2], i3, 0, null);
        aVar.f1969d++;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        return 0;
    }

    private int d(long j) {
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < this.q.length; i4++) {
            a aVar = this.q[i4];
            int i5 = aVar.f1969d;
            if (i5 != aVar.f1967b.f1998b) {
                long j5 = aVar.f1967b.f1999c[i5];
                long j6 = this.r[i4][i5];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    i2 = i4;
                    j4 = j7;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i3 = i4;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i3;
    }

    private void e(long j) {
        for (a aVar : this.q) {
            r rVar = aVar.f1967b;
            int iA = rVar.a(j);
            if (iA == -1) {
                iA = rVar.b(j);
            }
            aVar.f1969d = iA;
        }
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].f1967b.f1998b];
            jArr2[i2] = aVarArr[i2].f1967b.f2002f[0];
        }
        long j = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            int i4 = -1;
            long j2 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j2) {
                    j2 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j;
            j += aVarArr[i4].f1967b.f2000d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].f1967b.f2002f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private static long a(r rVar, long j, long j2) {
        int iA = a(rVar, j);
        return iA == -1 ? j2 : Math.min(rVar.f1999c[iA], j2);
    }

    private static int a(r rVar, long j) {
        int iA = rVar.a(j);
        return iA == -1 ? rVar.b(j) : iA;
    }

    private static boolean a(u uVar) {
        uVar.c(8);
        if (uVar.p() == f1958b) {
            return true;
        }
        uVar.d(4);
        while (uVar.b() > 0) {
            if (uVar.p() == f1958b) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i2) {
        return i2 == c.R || i2 == c.C || i2 == c.S || i2 == c.T || i2 == c.ma || i2 == c.na || i2 == c.oa || i2 == c.Q || i2 == c.pa || i2 == c.qa || i2 == c.ra || i2 == c.sa || i2 == c.ta || i2 == c.O || i2 == c.f1872a || i2 == c.Aa || i2 == c.Ca || i2 == c.Da;
    }

    private static boolean b(int i2) {
        return i2 == c.B || i2 == c.D || i2 == c.E || i2 == c.F || i2 == c.G || i2 == c.P || i2 == c.Ba;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o f1966a;

        /* renamed from: b, reason: collision with root package name */
        public final r f1967b;

        /* renamed from: c, reason: collision with root package name */
        public final c.d.a.a.e.q f1968c;

        /* renamed from: d, reason: collision with root package name */
        public int f1969d;

        public a(o oVar, r rVar, c.d.a.a.e.q qVar) {
            this.f1966a = oVar;
            this.f1967b = rVar;
            this.f1968c = qVar;
        }
    }
}

package c.d.a.a.i;

import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class y {

    /* renamed from: i, reason: collision with root package name */
    private int f3056i;
    private int j;
    private int k;
    private int l;
    private boolean o;
    private c.d.a.a.q r;
    private int s;

    /* renamed from: a, reason: collision with root package name */
    private int f3048a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private int[] f3049b = new int[this.f3048a];

    /* renamed from: c, reason: collision with root package name */
    private long[] f3050c = new long[this.f3048a];

    /* renamed from: f, reason: collision with root package name */
    private long[] f3053f = new long[this.f3048a];

    /* renamed from: e, reason: collision with root package name */
    private int[] f3052e = new int[this.f3048a];

    /* renamed from: d, reason: collision with root package name */
    private int[] f3051d = new int[this.f3048a];

    /* renamed from: g, reason: collision with root package name */
    private q.a[] f3054g = new q.a[this.f3048a];

    /* renamed from: h, reason: collision with root package name */
    private c.d.a.a.q[] f3055h = new c.d.a.a.q[this.f3048a];
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean q = true;
    private boolean p = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3057a;

        /* renamed from: b, reason: collision with root package name */
        public long f3058b;

        /* renamed from: c, reason: collision with root package name */
        public q.a f3059c;
    }

    public void a(boolean z) {
        this.f3056i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.p = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.o = false;
        if (z) {
            this.r = null;
            this.q = true;
        }
    }

    public int a() {
        return this.j + this.f3056i;
    }

    public long a(int i2) {
        int iA = a() - i2;
        boolean z = false;
        AbstractC0170e.a(iA >= 0 && iA <= this.f3056i - this.l);
        this.f3056i -= iA;
        this.n = Math.max(this.m, e(this.f3056i));
        if (iA == 0 && this.o) {
            z = true;
        }
        this.o = z;
        if (this.f3056i == 0) {
            return 0L;
        }
        return this.f3050c[f(this.f3056i - 1)] + this.f3051d[r7];
    }

    public void b(int i2) {
        this.s = i2;
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.j + this.l;
    }

    public int d() {
        return e() ? this.f3049b[f(this.l)] : this.s;
    }

    public synchronized boolean e() {
        return this.l != this.f3056i;
    }

    public synchronized c.d.a.a.q f() {
        return this.q ? null : this.r;
    }

    public synchronized long g() {
        return this.n;
    }

    public synchronized boolean h() {
        return this.o;
    }

    public synchronized long i() {
        return this.f3056i == 0 ? Long.MIN_VALUE : this.f3053f[this.k];
    }

    public synchronized void j() {
        this.l = 0;
    }

    public synchronized int a(c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z, boolean z2, c.d.a.a.q qVar, a aVar) {
        if (!e()) {
            if (!z2 && !this.o) {
                if (this.r == null || (!z && this.r == qVar)) {
                    return -3;
                }
                rVar.f3685a = this.r;
                return -5;
            }
            fVar.b(4);
            return -4;
        }
        int iF = f(this.l);
        if (!z && this.f3055h[iF] == qVar) {
            if (fVar.g()) {
                return -3;
            }
            fVar.f1685d = this.f3053f[iF];
            fVar.b(this.f3052e[iF]);
            aVar.f3057a = this.f3051d[iF];
            aVar.f3058b = this.f3050c[iF];
            aVar.f3059c = this.f3054g[iF];
            this.l++;
            return -4;
        }
        rVar.f3685a = this.f3055h[iF];
        return -5;
    }

    public synchronized int a(long j, boolean z, boolean z2) {
        int iF = f(this.l);
        if (e() && j >= this.f3053f[iF] && (j <= this.n || z2)) {
            int iA = a(iF, this.f3056i - this.l, j, z);
            if (iA == -1) {
                return -1;
            }
            this.l += iA;
            return iA;
        }
        return -1;
    }

    public synchronized int k() {
        int i2;
        i2 = this.f3056i - this.l;
        this.l = this.f3056i;
        return i2;
    }

    public synchronized boolean c(int i2) {
        if (this.j > i2 || i2 > this.j + this.f3056i) {
            return false;
        }
        this.l = i2 - this.j;
        return true;
    }

    public synchronized long b(long j, boolean z, boolean z2) {
        if (this.f3056i != 0 && j >= this.f3053f[this.k]) {
            int iA = a(this.k, (!z2 || this.l == this.f3056i) ? this.f3056i : this.l + 1, j, z);
            if (iA == -1) {
                return -1L;
            }
            return d(iA);
        }
        return -1L;
    }

    public synchronized long l() {
        if (this.l == 0) {
            return -1L;
        }
        return d(this.l);
    }

    public synchronized long m() {
        if (this.f3056i == 0) {
            return -1L;
        }
        return d(this.f3056i);
    }

    public synchronized boolean a(c.d.a.a.q qVar) {
        if (qVar == null) {
            this.q = true;
            return false;
        }
        this.q = false;
        if (c.d.a.a.m.H.a(qVar, this.r)) {
            return false;
        }
        this.r = qVar;
        return true;
    }

    public synchronized void a(long j, int i2, long j2, int i3, q.a aVar) {
        if (this.p) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.p = false;
            }
        }
        AbstractC0170e.b(!this.q);
        this.o = (536870912 & i2) != 0;
        this.n = Math.max(this.n, j);
        int iF = f(this.f3056i);
        this.f3053f[iF] = j;
        this.f3050c[iF] = j2;
        this.f3051d[iF] = i3;
        this.f3052e[iF] = i2;
        this.f3054g[iF] = aVar;
        this.f3055h[iF] = this.r;
        this.f3049b[iF] = this.s;
        this.f3056i++;
        if (this.f3056i == this.f3048a) {
            int i4 = this.f3048a + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            q.a[] aVarArr = new q.a[i4];
            c.d.a.a.q[] qVarArr = new c.d.a.a.q[i4];
            int i5 = this.f3048a - this.k;
            System.arraycopy(this.f3050c, this.k, jArr, 0, i5);
            System.arraycopy(this.f3053f, this.k, jArr2, 0, i5);
            System.arraycopy(this.f3052e, this.k, iArr2, 0, i5);
            System.arraycopy(this.f3051d, this.k, iArr3, 0, i5);
            System.arraycopy(this.f3054g, this.k, aVarArr, 0, i5);
            System.arraycopy(this.f3055h, this.k, qVarArr, 0, i5);
            System.arraycopy(this.f3049b, this.k, iArr, 0, i5);
            int i6 = this.k;
            System.arraycopy(this.f3050c, 0, jArr, i5, i6);
            System.arraycopy(this.f3053f, 0, jArr2, i5, i6);
            System.arraycopy(this.f3052e, 0, iArr2, i5, i6);
            System.arraycopy(this.f3051d, 0, iArr3, i5, i6);
            System.arraycopy(this.f3054g, 0, aVarArr, i5, i6);
            System.arraycopy(this.f3055h, 0, qVarArr, i5, i6);
            System.arraycopy(this.f3049b, 0, iArr, i5, i6);
            this.f3050c = jArr;
            this.f3053f = jArr2;
            this.f3052e = iArr2;
            this.f3051d = iArr3;
            this.f3054g = aVarArr;
            this.f3055h = qVarArr;
            this.f3049b = iArr;
            this.k = 0;
            this.f3056i = this.f3048a;
            this.f3048a = i4;
        }
    }

    public synchronized boolean a(long j) {
        if (this.f3056i == 0) {
            return j > this.m;
        }
        if (Math.max(this.m, e(this.l)) >= j) {
            return false;
        }
        int i2 = this.f3056i;
        int iF = f(this.f3056i - 1);
        while (i2 > this.l && this.f3053f[iF] >= j) {
            i2--;
            iF--;
            if (iF == -1) {
                iF = this.f3048a - 1;
            }
        }
        a(this.j + i2);
        return true;
    }

    private int a(int i2, int i3, long j, boolean z) {
        int i4 = i2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && this.f3053f[i4] <= j; i6++) {
            if (!z || (this.f3052e[i4] & 1) != 0) {
                i5 = i6;
            }
            i4++;
            if (i4 == this.f3048a) {
                i4 = 0;
            }
        }
        return i5;
    }

    private long d(int i2) {
        this.m = Math.max(this.m, e(i2));
        this.f3056i -= i2;
        this.j += i2;
        this.k += i2;
        if (this.k >= this.f3048a) {
            this.k -= this.f3048a;
        }
        this.l -= i2;
        if (this.l < 0) {
            this.l = 0;
        }
        if (this.f3056i == 0) {
            return this.f3050c[(this.k == 0 ? this.f3048a : this.k) - 1] + this.f3051d[r6];
        }
        return this.f3050c[this.k];
    }

    private long e(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.f3053f[iF]);
            if ((this.f3052e[iF] & 1) != 0) {
                break;
            }
            iF--;
            if (iF == -1) {
                iF = this.f3048a - 1;
            }
        }
        return jMax;
    }

    private int f(int i2) {
        int i3 = this.k + i2;
        return i3 < this.f3048a ? i3 : i3 - this.f3048a;
    }
}

package c.d.a.a.i;

import c.d.a.a.I;
import c.d.a.a.i.v;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class n implements v, v.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f2976a;

    /* renamed from: b, reason: collision with root package name */
    private v.a f2977b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f2978c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f2979d;

    /* renamed from: e, reason: collision with root package name */
    long f2980e;

    /* renamed from: f, reason: collision with root package name */
    long f2981f;

    public n(v vVar, boolean z, long j, long j2) {
        this.f2976a = vVar;
        this.f2979d = z ? j : -9223372036854775807L;
        this.f2980e = j;
        this.f2981f = j2;
    }

    @Override // c.d.a.a.i.v
    public void a(v.a aVar, long j) {
        this.f2977b = aVar;
        this.f2976a.a(this, j);
    }

    @Override // c.d.a.a.i.v
    public void d() {
        this.f2976a.d();
    }

    @Override // c.d.a.a.i.v
    public G f() {
        return this.f2976a.f();
    }

    @Override // c.d.a.a.i.v
    public long a(c.d.a.a.k.i[] iVarArr, boolean[] zArr, A[] aArr, boolean[] zArr2, long j) {
        this.f2978c = new a[aArr.length];
        A[] aArr2 = new A[aArr.length];
        int i2 = 0;
        while (true) {
            A a2 = null;
            if (i2 >= aArr.length) {
                break;
            }
            this.f2978c[i2] = (a) aArr[i2];
            if (this.f2978c[i2] != null) {
                a2 = this.f2978c[i2].f2982a;
            }
            aArr2[i2] = a2;
            i2++;
        }
        long jA = this.f2976a.a(iVarArr, zArr, aArr2, zArr2, j);
        this.f2979d = (a() && j == this.f2980e && a(this.f2980e, iVarArr)) ? jA : -9223372036854775807L;
        AbstractC0170e.b(jA == j || (jA >= this.f2980e && (this.f2981f == Long.MIN_VALUE || jA <= this.f2981f)));
        for (int i3 = 0; i3 < aArr.length; i3++) {
            if (aArr2[i3] == null) {
                this.f2978c[i3] = null;
            } else if (aArr[i3] == null || this.f2978c[i3].f2982a != aArr2[i3]) {
                this.f2978c[i3] = new a(aArr2[i3]);
            }
            aArr[i3] = this.f2978c[i3];
        }
        return jA;
    }

    @Override // c.d.a.a.i.v
    public void a(long j, boolean z) {
        this.f2976a.a(j, z);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public void c(long j) {
        this.f2976a.c(j);
    }

    @Override // c.d.a.a.i.v
    public long e() {
        if (a()) {
            long j = this.f2979d;
            this.f2979d = -9223372036854775807L;
            long jE = e();
            return jE != -9223372036854775807L ? jE : j;
        }
        long jE2 = this.f2976a.e();
        if (jE2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC0170e.b(jE2 >= this.f2980e);
        AbstractC0170e.b(this.f2981f == Long.MIN_VALUE || jE2 <= this.f2981f);
        return jE2;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long g() {
        long jG = this.f2976a.g();
        if (jG == Long.MIN_VALUE || (this.f2981f != Long.MIN_VALUE && jG >= this.f2981f)) {
            return Long.MIN_VALUE;
        }
        return jG;
    }

    @Override // c.d.a.a.i.v
    public long a(long j) {
        this.f2979d = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.f2978c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jA = this.f2976a.a(j);
        if (jA == j || (jA >= this.f2980e && (this.f2981f == Long.MIN_VALUE || jA <= this.f2981f))) {
            z = true;
        }
        AbstractC0170e.b(z);
        return jA;
    }

    @Override // c.d.a.a.i.v
    public long a(long j, I i2) {
        if (j == this.f2980e) {
            return this.f2980e;
        }
        return this.f2976a.a(j, b(j, i2));
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long b() {
        long jB = this.f2976a.b();
        if (jB == Long.MIN_VALUE || (this.f2981f != Long.MIN_VALUE && jB >= this.f2981f)) {
            return Long.MIN_VALUE;
        }
        return jB;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public boolean b(long j) {
        return this.f2976a.b(j);
    }

    @Override // c.d.a.a.i.v.a
    public void a(v vVar) {
        this.f2977b.a((v) this);
    }

    @Override // c.d.a.a.i.B.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(v vVar) {
        this.f2977b.a((v.a) this);
    }

    boolean a() {
        return this.f2979d != -9223372036854775807L;
    }

    private I b(long j, I i2) {
        long jA = c.d.a.a.m.H.a(i2.f1440f, 0L, j - this.f2980e);
        long jA2 = c.d.a.a.m.H.a(i2.f1441g, 0L, this.f2981f == Long.MIN_VALUE ? Long.MAX_VALUE : this.f2981f - j);
        return (jA == i2.f1440f && jA2 == i2.f1441g) ? i2 : new I(jA, jA2);
    }

    private static boolean a(long j, c.d.a.a.k.i[] iVarArr) {
        if (j != 0) {
            for (c.d.a.a.k.i iVar : iVarArr) {
                if (iVar != null && !c.d.a.a.m.r.a(iVar.f().f3682g)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final class a implements A {

        /* renamed from: a, reason: collision with root package name */
        public final A f2982a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2983b;

        public a(A a2) {
            this.f2982a = a2;
        }

        public void b() {
            this.f2983b = false;
        }

        @Override // c.d.a.a.i.A
        public boolean c() {
            return !n.this.a() && this.f2982a.c();
        }

        @Override // c.d.a.a.i.A
        public void a() {
            this.f2982a.a();
        }

        @Override // c.d.a.a.i.A
        public int a(c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z) {
            if (n.this.a()) {
                return -3;
            }
            if (this.f2983b) {
                fVar.b(4);
                return -4;
            }
            int iA = this.f2982a.a(rVar, fVar, z);
            if (iA == -5) {
                c.d.a.a.q qVar = rVar.f3685a;
                if (qVar.w != 0 || qVar.x != 0) {
                    rVar.f3685a = qVar.a(n.this.f2980e != 0 ? 0 : qVar.w, n.this.f2981f == Long.MIN_VALUE ? qVar.x : 0);
                }
                return -5;
            }
            if (n.this.f2981f == Long.MIN_VALUE || ((iA != -4 || fVar.f1685d < n.this.f2981f) && !(iA == -3 && n.this.g() == Long.MIN_VALUE))) {
                return iA;
            }
            fVar.b();
            fVar.b(4);
            this.f2983b = true;
            return -4;
        }

        @Override // c.d.a.a.i.A
        public int d(long j) {
            if (n.this.a()) {
                return -3;
            }
            return this.f2982a.d(j);
        }
    }
}

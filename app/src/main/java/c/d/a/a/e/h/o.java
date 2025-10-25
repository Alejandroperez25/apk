package c.d.a.a.e.h;

import android.util.SparseArray;
import c.d.a.a.e.h.G;
import c.d.a.a.m.AbstractC0172g;
import c.d.a.a.m.s;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private final B f2209a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2210b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2211c;

    /* renamed from: g, reason: collision with root package name */
    private long f2215g;

    /* renamed from: i, reason: collision with root package name */
    private String f2217i;
    private c.d.a.a.e.q j;
    private a k;
    private boolean l;
    private long m;
    private boolean n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f2216h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final t f2212d = new t(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final t f2213e = new t(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final t f2214f = new t(6, 128);
    private final c.d.a.a.m.u o = new c.d.a.a.m.u();

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public o(B b2, boolean z, boolean z2) {
        this.f2209a = b2;
        this.f2210b = z;
        this.f2211c = z2;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        c.d.a.a.m.s.a(this.f2216h);
        this.f2212d.a();
        this.f2213e.a();
        this.f2214f.a();
        this.k.b();
        this.f2215g = 0L;
        this.n = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2217i = dVar.c();
        this.j = iVar.a(dVar.b(), 2);
        this.k = new a(this.j, this.f2210b, this.f2211c);
        this.f2209a.a(iVar, dVar);
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.m = j;
        this.n |= (i2 & 2) != 0;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        int iD = uVar.d();
        int iC = uVar.c();
        byte[] bArr = uVar.f3567a;
        this.f2215g += uVar.b();
        this.j.a(uVar, uVar.b());
        while (true) {
            int iA = c.d.a.a.m.s.a(bArr, iD, iC, this.f2216h);
            if (iA == iC) {
                a(bArr, iD, iC);
                return;
            }
            int iB = c.d.a.a.m.s.b(bArr, iA);
            int i2 = iA - iD;
            if (i2 > 0) {
                a(bArr, iD, iA);
            }
            int i3 = iC - iA;
            long j = this.f2215g - i3;
            a(j, i3, i2 < 0 ? -i2 : 0, this.m);
            a(j, iB, this.m);
            iD = iA + 3;
        }
    }

    private void a(long j, int i2, long j2) {
        if (!this.l || this.k.a()) {
            this.f2212d.a(i2);
            this.f2213e.a(i2);
        }
        this.f2214f.a(i2);
        this.k.a(j, i2, j2);
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.a()) {
            this.f2212d.a(bArr, i2, i3);
            this.f2213e.a(bArr, i2, i3);
        }
        this.f2214f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void a(long j, int i2, int i3, long j2) {
        if (!this.l || this.k.a()) {
            this.f2212d.b(i3);
            this.f2213e.b(i3);
            if (!this.l) {
                if (this.f2212d.b() && this.f2213e.b()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.f2212d.f2281d, this.f2212d.f2282e));
                    arrayList.add(Arrays.copyOf(this.f2213e.f2281d, this.f2213e.f2282e));
                    s.b bVarA = c.d.a.a.m.s.a(this.f2212d.f2281d, 3, this.f2212d.f2282e);
                    s.a aVarB = c.d.a.a.m.s.b(this.f2213e.f2281d, 3, this.f2213e.f2282e);
                    this.j.a(c.d.a.a.q.a(this.f2217i, "video/avc", AbstractC0172g.b(bVarA.f3554a, bVarA.f3555b, bVarA.f3556c), -1, -1, bVarA.f3558e, bVarA.f3559f, -1.0f, arrayList, -1, bVarA.f3560g, (c.d.a.a.d.f) null));
                    this.l = true;
                    this.k.a(bVarA);
                    this.k.a(aVarB);
                    this.f2212d.a();
                    this.f2213e.a();
                }
            } else if (this.f2212d.b()) {
                this.k.a(c.d.a.a.m.s.a(this.f2212d.f2281d, 3, this.f2212d.f2282e));
                this.f2212d.a();
            } else if (this.f2213e.b()) {
                this.k.a(c.d.a.a.m.s.b(this.f2213e.f2281d, 3, this.f2213e.f2282e));
                this.f2213e.a();
            }
        }
        if (this.f2214f.b(i3)) {
            this.o.a(this.f2214f.f2281d, c.d.a.a.m.s.a(this.f2214f.f2281d, this.f2214f.f2282e));
            this.o.c(4);
            this.f2209a.a(j2, this.o);
        }
        if (this.k.a(j, i2, this.l, this.n)) {
            this.n = false;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.e.q f2218a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2219b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2220c;

        /* renamed from: h, reason: collision with root package name */
        private int f2225h;

        /* renamed from: i, reason: collision with root package name */
        private int f2226i;
        private long j;
        private boolean k;
        private long l;
        private C0028a m;
        private C0028a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<s.b> f2221d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<s.a> f2222e = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        private byte[] f2224g = new byte[128];

        /* renamed from: f, reason: collision with root package name */
        private final c.d.a.a.m.v f2223f = new c.d.a.a.m.v(this.f2224g, 0, 0);

        public a(c.d.a.a.e.q qVar, boolean z, boolean z2) {
            this.f2218a = qVar;
            this.f2219b = z;
            this.f2220c = z2;
            this.m = new C0028a();
            this.n = new C0028a();
            b();
        }

        public boolean a() {
            return this.f2220c;
        }

        public void a(s.b bVar) {
            this.f2221d.append(bVar.f3557d, bVar);
        }

        public void a(s.a aVar) {
            this.f2222e.append(aVar.f3551a, aVar);
        }

        public void b() {
            this.k = false;
            this.o = false;
            this.n.a();
        }

        public void a(long j, int i2, long j2) {
            this.f2226i = i2;
            this.l = j2;
            this.j = j;
            if (!this.f2219b || this.f2226i != 1) {
                if (!this.f2220c) {
                    return;
                }
                if (this.f2226i != 5 && this.f2226i != 1 && this.f2226i != 2) {
                    return;
                }
            }
            C0028a c0028a = this.m;
            this.m = this.n;
            this.n = c0028a;
            this.n.a();
            this.f2225h = 0;
            this.k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r22, int r23, int r24) {
            /*
                Method dump skipped, instructions count: 411
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.h.o.a.a(byte[], int, int):void");
        }

        public boolean a(long j, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f2226i == 9 || (this.f2220c && this.n.a(this.m))) {
                if (z && this.o) {
                    a(i2 + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.f2219b) {
                z2 = this.n.b();
            }
            boolean z4 = this.r;
            if (this.f2226i == 5 || (z2 && this.f2226i == 1)) {
                z3 = true;
            }
            this.r = z4 | z3;
            return this.r;
        }

        private void a(int i2) {
            boolean z = this.r;
            this.f2218a.a(this.q, z ? 1 : 0, (int) (this.j - this.p), i2, null);
        }

        /* renamed from: c.d.a.a.e.h.o$a$a, reason: collision with other inner class name */
        private static final class C0028a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f2227a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f2228b;

            /* renamed from: c, reason: collision with root package name */
            private s.b f2229c;

            /* renamed from: d, reason: collision with root package name */
            private int f2230d;

            /* renamed from: e, reason: collision with root package name */
            private int f2231e;

            /* renamed from: f, reason: collision with root package name */
            private int f2232f;

            /* renamed from: g, reason: collision with root package name */
            private int f2233g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f2234h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f2235i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private C0028a() {
            }

            public void a() {
                this.f2228b = false;
                this.f2227a = false;
            }

            public void a(int i2) {
                this.f2231e = i2;
                this.f2228b = true;
            }

            public void a(s.b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.f2229c = bVar;
                this.f2230d = i2;
                this.f2231e = i3;
                this.f2232f = i4;
                this.f2233g = i5;
                this.f2234h = z;
                this.f2235i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.f2227a = true;
                this.f2228b = true;
            }

            public boolean b() {
                return this.f2228b && (this.f2231e == 7 || this.f2231e == 2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(C0028a c0028a) {
                if (this.f2227a) {
                    if (!c0028a.f2227a || this.f2232f != c0028a.f2232f || this.f2233g != c0028a.f2233g || this.f2234h != c0028a.f2234h) {
                        return true;
                    }
                    if (this.f2235i && c0028a.f2235i && this.j != c0028a.j) {
                        return true;
                    }
                    if (this.f2230d != c0028a.f2230d && (this.f2230d == 0 || c0028a.f2230d == 0)) {
                        return true;
                    }
                    if (this.f2229c.k == 0 && c0028a.f2229c.k == 0 && (this.m != c0028a.m || this.n != c0028a.n)) {
                        return true;
                    }
                    if ((this.f2229c.k == 1 && c0028a.f2229c.k == 1 && (this.o != c0028a.o || this.p != c0028a.p)) || this.k != c0028a.k) {
                        return true;
                    }
                    if (this.k && c0028a.k && this.l != c0028a.l) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}

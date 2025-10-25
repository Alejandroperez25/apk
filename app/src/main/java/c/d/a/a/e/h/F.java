package c.d.a.a.e.h;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c.d.a.a.e.a;
import c.d.a.a.e.h.G;
import c.d.a.a.e.o;
import c.d.a.a.m.AbstractC0170e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f2111a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.h.d
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return F.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final long f2112b = c.d.a.a.m.H.h("AC-3");

    /* renamed from: c, reason: collision with root package name */
    private static final long f2113c = c.d.a.a.m.H.h("EAC3");

    /* renamed from: d, reason: collision with root package name */
    private static final long f2114d = c.d.a.a.m.H.h("HEVC");

    /* renamed from: e, reason: collision with root package name */
    private final int f2115e;

    /* renamed from: f, reason: collision with root package name */
    private final List<c.d.a.a.m.E> f2116f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.m.u f2117g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseIntArray f2118h;

    /* renamed from: i, reason: collision with root package name */
    private final G.c f2119i;
    private final SparseArray<G> j;
    private final SparseBooleanArray k;
    private final SparseBooleanArray l;
    private final E m;
    private D n;
    private c.d.a.a.e.i o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private G t;
    private int u;
    private int v;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ int b(F f2) {
        int i2 = f2.p;
        f2.p = i2 + 1;
        return i2;
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new F()};
    }

    public F() {
        this(0);
    }

    public F(int i2) {
        this(1, i2);
    }

    public F(int i2, int i3) {
        this(i2, new c.d.a.a.m.E(0L), new C0142i(i3));
    }

    public F(int i2, c.d.a.a.m.E e2, G.c cVar) {
        AbstractC0170e.a(cVar);
        this.f2119i = cVar;
        this.f2115e = i2;
        if (i2 == 1 || i2 == 2) {
            this.f2116f = Collections.singletonList(e2);
        } else {
            this.f2116f = new ArrayList();
            this.f2116f.add(e2);
        }
        this.f2117g = new c.d.a.a.m.u(new byte[9400], 0);
        this.k = new SparseBooleanArray();
        this.l = new SparseBooleanArray();
        this.j = new SparseArray<>();
        this.f2118h = new SparseIntArray();
        this.m = new E();
        this.v = -1;
        g();
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        boolean z;
        byte[] bArr = this.f2117g.f3567a;
        hVar.a(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                hVar.c(i2);
                return true;
            }
        }
        return false;
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.o = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        AbstractC0170e.b(this.f2115e != 2);
        int size = this.f2116f.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.d.a.a.m.E e2 = this.f2116f.get(i2);
            if ((e2.c() == -9223372036854775807L) || (e2.c() != 0 && e2.a() != j2)) {
                e2.d();
                e2.c(j2);
            }
        }
        if (j2 != 0 && this.n != null) {
            this.n.a(j2);
        }
        this.f2117g.a();
        this.f2118h.clear();
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            this.j.valueAt(i3).a();
        }
        this.u = 0;
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws c.d.a.a.x {
        long length = hVar.getLength();
        if (this.q) {
            if (((length == -1 || this.f2115e == 2) ? false : true) && !this.m.a()) {
                return this.m.a(hVar, nVar, this.v);
            }
            a(length);
            if (this.s) {
                this.s = false;
                a(0L, 0L);
                if (hVar.c() != 0) {
                    nVar.f2349a = 0L;
                    return 1;
                }
            }
            if (this.n != null && this.n.b()) {
                return this.n.a(hVar, nVar, (a.c) null);
            }
        }
        if (!b(hVar)) {
            return -1;
        }
        int iF = f();
        int iC = this.f2117g.c();
        if (iF > iC) {
            return 0;
        }
        int iP = this.f2117g.p();
        if ((8388608 & iP) != 0) {
            this.f2117g.c(iF);
            return 0;
        }
        int i2 = ((4194304 & iP) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & iP) >> 8;
        boolean z = (iP & 32) != 0;
        G g2 = (iP & 16) != 0 ? this.j.get(i3) : null;
        if (g2 == null) {
            this.f2117g.c(iF);
            return 0;
        }
        if (this.f2115e != 2) {
            int i4 = iP & 15;
            int i5 = this.f2118h.get(i3, i4 - 1);
            this.f2118h.put(i3, i4);
            if (i5 == i4) {
                this.f2117g.c(iF);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                g2.a();
            }
        }
        if (z) {
            int iH = this.f2117g.h();
            i2 |= (this.f2117g.h() & 64) != 0 ? 2 : 0;
            this.f2117g.d(iH - 1);
        }
        boolean z2 = this.q;
        if (a(i3)) {
            this.f2117g.b(iF);
            g2.a(this.f2117g, i2);
            this.f2117g.b(iC);
        }
        if (this.f2115e != 2 && !z2 && this.q && length != -1) {
            this.s = true;
        }
        this.f2117g.c(iF);
        return 0;
    }

    private void a(long j) {
        if (this.r) {
            return;
        }
        this.r = true;
        if (this.m.b() != -9223372036854775807L) {
            this.n = new D(this.m.c(), this.m.b(), j, this.v);
            this.o.a(this.n.a());
        } else {
            this.o.a(new o.b(this.m.b()));
        }
    }

    private boolean b(c.d.a.a.e.h hVar) {
        byte[] bArr = this.f2117g.f3567a;
        if (9400 - this.f2117g.d() < 188) {
            int iB = this.f2117g.b();
            if (iB > 0) {
                System.arraycopy(bArr, this.f2117g.d(), bArr, 0, iB);
            }
            this.f2117g.a(bArr, iB);
        }
        while (this.f2117g.b() < 188) {
            int iC = this.f2117g.c();
            int i2 = hVar.read(bArr, iC, 9400 - iC);
            if (i2 == -1) {
                return false;
            }
            this.f2117g.b(iC + i2);
        }
        return true;
    }

    private int f() throws c.d.a.a.x {
        int iD = this.f2117g.d();
        int iC = this.f2117g.c();
        int iA = H.a(this.f2117g.f3567a, iD, iC);
        this.f2117g.c(iA);
        int i2 = iA + 188;
        if (i2 > iC) {
            this.u += iA - iD;
            if (this.f2115e == 2 && this.u > 376) {
                throw new c.d.a.a.x("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.u = 0;
        }
        return i2;
    }

    private boolean a(int i2) {
        return this.f2115e == 2 || this.q || !this.l.get(i2, false);
    }

    private void g() {
        this.k.clear();
        this.j.clear();
        SparseArray<G> sparseArrayA = this.f2119i.a();
        int size = sparseArrayA.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.j.put(sparseArrayA.keyAt(i2), sparseArrayA.valueAt(i2));
        }
        this.j.put(0, new A(new a()));
        this.t = null;
    }

    private class a implements z {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.m.t f2120a = new c.d.a.a.m.t(new byte[4]);

        @Override // c.d.a.a.e.h.z
        public void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, G.d dVar) {
        }

        public a() {
        }

        @Override // c.d.a.a.e.h.z
        public void a(c.d.a.a.m.u uVar) {
            if (uVar.h() != 0) {
                return;
            }
            uVar.d(7);
            int iB = uVar.b() / 4;
            for (int i2 = 0; i2 < iB; i2++) {
                uVar.a(this.f2120a, 4);
                int iC = this.f2120a.c(16);
                this.f2120a.b(3);
                if (iC == 0) {
                    this.f2120a.b(13);
                } else {
                    int iC2 = this.f2120a.c(13);
                    F.this.j.put(iC2, new A(F.this.new b(iC2)));
                    F.b(F.this);
                }
            }
            if (F.this.f2115e != 2) {
                F.this.j.remove(0);
            }
        }
    }

    private class b implements z {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.m.t f2122a = new c.d.a.a.m.t(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<G> f2123b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f2124c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f2125d;

        @Override // c.d.a.a.e.h.z
        public void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, G.d dVar) {
        }

        public b(int i2) {
            this.f2125d = i2;
        }

        @Override // c.d.a.a.e.h.z
        public void a(c.d.a.a.m.u uVar) {
            c.d.a.a.m.E e2;
            if (uVar.h() != 2) {
                return;
            }
            if (F.this.f2115e == 1 || F.this.f2115e == 2 || F.this.p == 1) {
                e2 = (c.d.a.a.m.E) F.this.f2116f.get(0);
            } else {
                e2 = new c.d.a.a.m.E(((c.d.a.a.m.E) F.this.f2116f.get(0)).a());
                F.this.f2116f.add(e2);
            }
            uVar.d(2);
            int i2 = uVar.i();
            int i3 = 3;
            uVar.d(3);
            uVar.a(this.f2122a, 2);
            this.f2122a.b(3);
            int i4 = 13;
            F.this.v = this.f2122a.c(13);
            uVar.a(this.f2122a, 2);
            int i5 = 4;
            this.f2122a.b(4);
            uVar.d(this.f2122a.c(12));
            if (F.this.f2115e == 2 && F.this.t == null) {
                F.this.t = F.this.f2119i.a(21, new G.b(21, null, null, c.d.a.a.m.H.f3504f));
                F.this.t.a(e2, F.this.o, new G.d(i2, 21, 8192));
            }
            this.f2123b.clear();
            this.f2124c.clear();
            int iB = uVar.b();
            while (iB > 0) {
                uVar.a(this.f2122a, 5);
                int iC = this.f2122a.c(8);
                this.f2122a.b(i3);
                int iC2 = this.f2122a.c(i4);
                this.f2122a.b(i5);
                int iC3 = this.f2122a.c(12);
                G.b bVarA = a(uVar, iC3);
                if (iC == 6) {
                    iC = bVarA.f2130a;
                }
                iB -= iC3 + 5;
                int i6 = F.this.f2115e == 2 ? iC : iC2;
                if (!F.this.k.get(i6)) {
                    G gA = (F.this.f2115e == 2 && iC == 21) ? F.this.t : F.this.f2119i.a(iC, bVarA);
                    if (F.this.f2115e != 2 || iC2 < this.f2124c.get(i6, 8192)) {
                        this.f2124c.put(i6, iC2);
                        this.f2123b.put(i6, gA);
                    }
                }
                i3 = 3;
                i5 = 4;
                i4 = 13;
            }
            int size = this.f2124c.size();
            for (int i7 = 0; i7 < size; i7++) {
                int iKeyAt = this.f2124c.keyAt(i7);
                int iValueAt = this.f2124c.valueAt(i7);
                F.this.k.put(iKeyAt, true);
                F.this.l.put(iValueAt, true);
                G gValueAt = this.f2123b.valueAt(i7);
                if (gValueAt != null) {
                    if (gValueAt != F.this.t) {
                        gValueAt.a(e2, F.this.o, new G.d(i2, iKeyAt, 8192));
                    }
                    F.this.j.put(iValueAt, gValueAt);
                }
            }
            if (F.this.f2115e == 2) {
                if (F.this.q) {
                    return;
                }
                F.this.o.a();
                F.this.p = 0;
                F.this.q = true;
                return;
            }
            F.this.j.remove(this.f2125d);
            F.this.p = F.this.f2115e != 1 ? F.this.p - 1 : 0;
            if (F.this.p == 0) {
                F.this.o.a();
                F.this.q = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private c.d.a.a.e.h.G.b a(c.d.a.a.m.u r13, int r14) {
            /*
                r12 = this;
                int r0 = r13.d()
                int r14 = r14 + r0
                r1 = 0
                r2 = -1
                r3 = r1
            L8:
                int r4 = r13.d()
                if (r4 >= r14) goto L9e
                int r4 = r13.h()
                int r5 = r13.h()
                int r6 = r13.d()
                int r6 = r6 + r5
                r5 = 5
                r7 = 89
                r8 = 135(0x87, float:1.89E-43)
                r9 = 129(0x81, float:1.81E-43)
                if (r4 != r5) goto L45
                long r4 = r13.n()
                long r10 = c.d.a.a.e.h.F.c()
                int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r7 != 0) goto L31
                goto L49
            L31:
                long r9 = c.d.a.a.e.h.F.d()
                int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r7 != 0) goto L3a
                goto L50
            L3a:
                long r7 = c.d.a.a.e.h.F.e()
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto L94
                r2 = 36
                goto L94
            L45:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L4c
            L49:
                r2 = 129(0x81, float:1.81E-43)
                goto L94
            L4c:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L53
            L50:
                r2 = 135(0x87, float:1.89E-43)
                goto L94
            L53:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L5a
                r2 = 138(0x8a, float:1.93E-43)
                goto L94
            L5a:
                r5 = 10
                r8 = 3
                if (r4 != r5) goto L68
                java.lang.String r1 = r13.e(r8)
                java.lang.String r1 = r1.trim()
                goto L94
            L68:
                if (r4 != r7) goto L94
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L6f:
                int r3 = r13.d()
                if (r3 >= r6) goto L91
                java.lang.String r3 = r13.e(r8)
                java.lang.String r3 = r3.trim()
                int r4 = r13.h()
                r5 = 4
                byte[] r9 = new byte[r5]
                r10 = 0
                r13.a(r9, r10, r5)
                c.d.a.a.e.h.G$a r5 = new c.d.a.a.e.h.G$a
                r5.<init>(r3, r4, r9)
                r2.add(r5)
                goto L6f
            L91:
                r3 = r2
                r2 = 89
            L94:
                int r4 = r13.d()
                int r6 = r6 - r4
                r13.d(r6)
                goto L8
            L9e:
                r13.c(r14)
                c.d.a.a.e.h.G$b r4 = new c.d.a.a.e.h.G$b
                byte[] r13 = r13.f3567a
                byte[] r13 = java.util.Arrays.copyOfRange(r13, r0, r14)
                r4.<init>(r2, r1, r3, r13)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.h.F.b.a(c.d.a.a.m.u, int):c.d.a.a.e.h.G$b");
        }
    }
}

package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import c.d.a.a.e.o;
import c.d.a.a.m.AbstractC0170e;

/* renamed from: c.d.a.a.e.h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140g implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f2160a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.h.b
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return C0140g.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int f2161b = c.d.a.a.m.H.h("ID3");

    /* renamed from: c, reason: collision with root package name */
    private final int f2162c;

    /* renamed from: d, reason: collision with root package name */
    private final C0141h f2163d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.a.a.m.u f2164e;

    /* renamed from: f, reason: collision with root package name */
    private final c.d.a.a.m.u f2165f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.m.t f2166g;

    /* renamed from: h, reason: collision with root package name */
    private final long f2167h;

    /* renamed from: i, reason: collision with root package name */
    private c.d.a.a.e.i f2168i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new C0140g()};
    }

    public C0140g() {
        this(0L);
    }

    public C0140g(long j) {
        this(j, 0);
    }

    public C0140g(long j, int i2) {
        this.f2167h = j;
        this.j = j;
        this.f2162c = i2;
        this.f2163d = new C0141h(true);
        this.f2164e = new c.d.a.a.m.u(2048);
        this.l = -1;
        this.k = -1L;
        this.f2165f = new c.d.a.a.m.u(10);
        this.f2166g = new c.d.a.a.m.t(this.f2165f.f3567a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        r9.b();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if ((r2 - r0) < 8192) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return false;
     */
    @Override // c.d.a.a.e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(c.d.a.a.e.h r9) {
        /*
            r8 = this;
            int r0 = r8.b(r9)
            r1 = 0
            r2 = r0
        L6:
            r3 = 0
            r4 = 0
        L8:
            c.d.a.a.m.u r5 = r8.f2165f
            byte[] r5 = r5.f3567a
            r6 = 2
            r9.a(r5, r1, r6)
            c.d.a.a.m.u r5 = r8.f2165f
            r5.c(r1)
            c.d.a.a.m.u r5 = r8.f2165f
            int r5 = r5.i()
            boolean r5 = c.d.a.a.e.h.C0141h.a(r5)
            if (r5 != 0) goto L31
            r9.b()
            int r2 = r2 + 1
            int r3 = r2 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r3 < r4) goto L2d
            return r1
        L2d:
            r9.a(r2)
            goto L6
        L31:
            r5 = 1
            int r3 = r3 + r5
            r6 = 4
            if (r3 < r6) goto L3b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3b
            return r5
        L3b:
            c.d.a.a.m.u r5 = r8.f2165f
            byte[] r5 = r5.f3567a
            r9.a(r5, r1, r6)
            c.d.a.a.m.t r5 = r8.f2166g
            r6 = 14
            r5.a(r6)
            c.d.a.a.m.t r5 = r8.f2166g
            r6 = 13
            int r5 = r5.c(r6)
            r6 = 6
            if (r5 > r6) goto L55
            return r1
        L55:
            int r6 = r5 + (-6)
            r9.a(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.h.C0140g.a(c.d.a.a.e.h):boolean");
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.f2168i = iVar;
        this.f2163d.a(iVar, new G.d(0, 1));
        iVar.a();
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.n = false;
        this.f2163d.a();
        this.j = this.f2167h + j2;
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws c.d.a.a.x {
        long length = hVar.getLength();
        boolean z = ((this.f2162c & 1) == 0 || length == -1) ? false : true;
        if (z) {
            c(hVar);
        }
        int i2 = hVar.read(this.f2164e.f3567a, 0, 2048);
        boolean z2 = i2 == -1;
        a(length, z, z2);
        if (z2) {
            return -1;
        }
        this.f2164e.c(0);
        this.f2164e.b(i2);
        if (!this.n) {
            this.f2163d.a(this.j, 4);
            this.n = true;
        }
        this.f2163d.a(this.f2164e);
        return 0;
    }

    private int b(c.d.a.a.e.h hVar) {
        int i2 = 0;
        while (true) {
            hVar.a(this.f2165f.f3567a, 0, 10);
            this.f2165f.c(0);
            if (this.f2165f.l() != f2161b) {
                break;
            }
            this.f2165f.d(3);
            int iU = this.f2165f.u();
            i2 += iU + 10;
            hVar.a(iU);
        }
        hVar.b();
        hVar.a(i2);
        if (this.k == -1) {
            this.k = i2;
        }
        return i2;
    }

    private void a(long j, boolean z, boolean z2) {
        if (this.o) {
            return;
        }
        boolean z3 = z && this.l > 0;
        if (z3 && this.f2163d.c() == -9223372036854775807L && !z2) {
            return;
        }
        c.d.a.a.e.i iVar = this.f2168i;
        AbstractC0170e.a(iVar);
        c.d.a.a.e.i iVar2 = iVar;
        if (z3 && this.f2163d.c() != -9223372036854775807L) {
            iVar2.a(a(j));
        } else {
            iVar2.a(new o.b(-9223372036854775807L));
        }
        this.o = true;
    }

    private void c(c.d.a.a.e.h hVar) throws c.d.a.a.x {
        if (this.m) {
            return;
        }
        this.l = -1;
        hVar.b();
        long j = 0;
        if (hVar.c() == 0) {
            b(hVar);
        }
        int i2 = 0;
        while (true) {
            if (!hVar.b(this.f2165f.f3567a, 0, 2, true)) {
                break;
            }
            this.f2165f.c(0);
            if (!C0141h.a(this.f2165f.i())) {
                i2 = 0;
                break;
            }
            if (!hVar.b(this.f2165f.f3567a, 0, 4, true)) {
                break;
            }
            this.f2166g.a(14);
            int iC = this.f2166g.c(13);
            if (iC <= 6) {
                this.m = true;
                throw new c.d.a.a.x("Malformed ADTS stream");
            }
            j += iC;
            i2++;
            if (i2 == 1000 || !hVar.a(iC - 6, true)) {
                break;
            }
        }
        hVar.b();
        if (i2 > 0) {
            this.l = (int) (j / i2);
        } else {
            this.l = -1;
        }
        this.m = true;
    }

    private c.d.a.a.e.o a(long j) {
        return new c.d.a.a.e.c(j, this.k, a(this.l, this.f2163d.c()), this.l);
    }

    private static int a(int i2, long j) {
        return (int) (((i2 * 8) * 1000000) / j);
    }
}

package c.d.a.a.e.d;

import c.d.a.a.e.h;
import c.d.a.a.e.i;
import c.d.a.a.e.j;
import c.d.a.a.e.k;
import c.d.a.a.e.l;
import c.d.a.a.e.m;
import c.d.a.a.e.o;
import c.d.a.a.e.q;
import c.d.a.a.g.b;
import c.d.a.a.g.b.n;
import c.d.a.a.g.b.s;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.io.EOFException;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1842a = new j() { // from class: c.d.a.a.e.d.a
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return e.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final n.a f1843b = new n.a() { // from class: c.d.a.a.e.d.b
        @Override // c.d.a.a.g.b.n.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return e.a(i2, i3, i4, i5, i6);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f1844c = H.h("Xing");

    /* renamed from: d, reason: collision with root package name */
    private static final int f1845d = H.h("Info");

    /* renamed from: e, reason: collision with root package name */
    private static final int f1846e = H.h("VBRI");

    /* renamed from: f, reason: collision with root package name */
    private final int f1847f;

    /* renamed from: g, reason: collision with root package name */
    private final long f1848g;

    /* renamed from: h, reason: collision with root package name */
    private final u f1849h;

    /* renamed from: i, reason: collision with root package name */
    private final m f1850i;
    private final k j;
    private final l k;
    private i l;
    private q m;
    private int n;
    private c.d.a.a.g.b o;
    private a p;
    private long q;
    private long r;
    private int s;

    interface a extends o {
        long a(long j);

        long b();
    }

    static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    private static boolean a(int i2, long j) {
        return ((long) (i2 & (-128000))) == (j & (-128000));
    }

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new e()};
    }

    public e() {
        this(0);
    }

    public e(int i2) {
        this(i2, -9223372036854775807L);
    }

    public e(int i2, long j) {
        this.f1847f = i2;
        this.f1848g = j;
        this.f1849h = new u(10);
        this.f1850i = new m();
        this.j = new k();
        this.q = -9223372036854775807L;
        this.k = new l();
    }

    @Override // c.d.a.a.e.g
    public boolean a(h hVar) {
        return a(hVar, true);
    }

    @Override // c.d.a.a.e.g
    public void a(i iVar) {
        this.l = iVar;
        this.m = this.l.a(0, 1);
        this.l.a();
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.n = 0;
        this.q = -9223372036854775807L;
        this.r = 0L;
        this.s = 0;
    }

    @Override // c.d.a.a.e.g
    public int a(h hVar, c.d.a.a.e.n nVar) throws x {
        if (this.n == 0) {
            try {
                a(hVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.p == null) {
            a aVarD = d(hVar);
            d dVarA = a(this.o, hVar.c());
            if (dVarA != null) {
                this.p = dVarA;
            } else if (aVarD != null) {
                this.p = aVarD;
            }
            if (this.p == null || (!this.p.c() && (this.f1847f & 1) != 0)) {
                this.p = e(hVar);
            }
            this.l.a(this.p);
            this.m.a(c.d.a.a.q.a((String) null, this.f1850i.f2348i, (String) null, -1, 4096, this.f1850i.l, this.f1850i.k, -1, this.j.f2337b, this.j.f2338c, (List<byte[]>) null, (c.d.a.a.d.f) null, 0, (String) null, (this.f1847f & 2) != 0 ? null : this.o));
        }
        return b(hVar);
    }

    private int b(h hVar) {
        if (this.s == 0) {
            hVar.b();
            if (c(hVar)) {
                return -1;
            }
            this.f1849h.c(0);
            int iP = this.f1849h.p();
            if (!a(iP, this.n) || m.a(iP) == -1) {
                hVar.c(1);
                this.n = 0;
                return 0;
            }
            m.a(iP, this.f1850i);
            if (this.q == -9223372036854775807L) {
                this.q = this.p.a(hVar.c());
                if (this.f1848g != -9223372036854775807L) {
                    this.q += this.f1848g - this.p.a(0L);
                }
            }
            this.s = this.f1850i.j;
        }
        int iA = this.m.a(hVar, this.s, true);
        if (iA == -1) {
            return -1;
        }
        this.s -= iA;
        if (this.s > 0) {
            return 0;
        }
        this.m.a(this.q + ((this.r * 1000000) / this.f1850i.k), 1, this.f1850i.j, 0, null);
        this.r += this.f1850i.n;
        this.s = 0;
        return 0;
    }

    private boolean a(h hVar, boolean z) throws x, EOFException {
        int i2;
        int i3;
        int i4;
        int i5;
        int iA;
        int i6 = z ? 16384 : 131072;
        hVar.b();
        if (hVar.c() == 0) {
            this.o = this.k.a(hVar, (this.f1847f & 2) == 0 ? null : f1843b);
            if (this.o != null) {
                this.j.a(this.o);
            }
            int iA2 = (int) hVar.a();
            if (!z) {
                hVar.c(iA2);
            }
            i5 = iA2;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        while (true) {
            if (!c(hVar)) {
                this.f1849h.c(0);
                int iP = this.f1849h.p();
                if ((i3 == 0 || a(iP, i3)) && (iA = m.a(iP)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        m.a(iP, this.f1850i);
                        i3 = iP;
                    }
                    hVar.a(iA - 4);
                } else {
                    int i7 = i4 + 1;
                    if (i4 == i6) {
                        if (z) {
                            return false;
                        }
                        throw new x("Searched too many bytes.");
                    }
                    if (z) {
                        hVar.b();
                        hVar.a(i5 + i7);
                    } else {
                        hVar.c(1);
                    }
                    i4 = i7;
                    i2 = 0;
                    i3 = 0;
                }
            } else if (i2 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            hVar.c(i5 + i4);
        } else {
            hVar.b();
        }
        this.n = i3;
        return true;
    }

    private boolean c(h hVar) {
        return (this.p != null && hVar.a() == this.p.b()) || !hVar.b(this.f1849h.f3567a, 0, 4, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.e.d.e.a d(c.d.a.a.e.h r10) {
        /*
            r9 = this;
            c.d.a.a.m.u r5 = new c.d.a.a.m.u
            c.d.a.a.e.m r0 = r9.f1850i
            int r0 = r0.j
            r5.<init>(r0)
            byte[] r0 = r5.f3567a
            c.d.a.a.e.m r1 = r9.f1850i
            int r1 = r1.j
            r6 = 0
            r10.a(r0, r6, r1)
            c.d.a.a.e.m r0 = r9.f1850i
            int r0 = r0.f2347h
            r1 = 1
            r0 = r0 & r1
            r2 = 21
            if (r0 == 0) goto L2b
            c.d.a.a.e.m r0 = r9.f1850i
            int r0 = r0.l
            if (r0 == r1) goto L28
            r2 = 36
            r7 = 36
            goto L36
        L28:
            r7 = 21
            goto L36
        L2b:
            c.d.a.a.e.m r0 = r9.f1850i
            int r0 = r0.l
            if (r0 == r1) goto L32
            goto L28
        L32:
            r2 = 13
            r7 = 13
        L36:
            int r8 = a(r5, r7)
            int r0 = c.d.a.a.e.d.e.f1844c
            if (r8 == r0) goto L62
            int r0 = c.d.a.a.e.d.e.f1845d
            if (r8 != r0) goto L43
            goto L62
        L43:
            int r0 = c.d.a.a.e.d.e.f1846e
            if (r8 != r0) goto L5d
            long r0 = r10.getLength()
            long r2 = r10.c()
            c.d.a.a.e.m r4 = r9.f1850i
            c.d.a.a.e.d.f r0 = c.d.a.a.e.d.f.a(r0, r2, r4, r5)
            c.d.a.a.e.m r1 = r9.f1850i
            int r1 = r1.j
            r10.c(r1)
            goto Lb2
        L5d:
            r0 = 0
            r10.b()
            goto Lb2
        L62:
            long r0 = r10.getLength()
            long r2 = r10.c()
            c.d.a.a.e.m r4 = r9.f1850i
            c.d.a.a.e.d.g r0 = c.d.a.a.e.d.g.a(r0, r2, r4, r5)
            if (r0 == 0) goto L9a
            c.d.a.a.e.k r1 = r9.j
            boolean r1 = r1.a()
            if (r1 != 0) goto L9a
            r10.b()
            int r7 = r7 + 141
            r10.a(r7)
            c.d.a.a.m.u r1 = r9.f1849h
            byte[] r1 = r1.f3567a
            r2 = 3
            r10.a(r1, r6, r2)
            c.d.a.a.m.u r1 = r9.f1849h
            r1.c(r6)
            c.d.a.a.e.k r1 = r9.j
            c.d.a.a.m.u r2 = r9.f1849h
            int r2 = r2.l()
            r1.a(r2)
        L9a:
            c.d.a.a.e.m r1 = r9.f1850i
            int r1 = r1.j
            r10.c(r1)
            if (r0 == 0) goto Lb2
            boolean r1 = r0.c()
            if (r1 != 0) goto Lb2
            int r1 = c.d.a.a.e.d.e.f1845d
            if (r8 != r1) goto Lb2
            c.d.a.a.e.d.e$a r10 = r9.e(r10)
            return r10
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.d.e.d(c.d.a.a.e.h):c.d.a.a.e.d.e$a");
    }

    private a e(h hVar) {
        hVar.a(this.f1849h.f3567a, 0, 4);
        this.f1849h.c(0);
        m.a(this.f1849h.p(), this.f1850i);
        return new c(hVar.getLength(), hVar.c(), this.f1850i);
    }

    private static int a(u uVar, int i2) {
        if (uVar.c() >= i2 + 4) {
            uVar.c(i2);
            int iP = uVar.p();
            if (iP == f1844c || iP == f1845d) {
                return iP;
            }
        }
        if (uVar.c() < 40) {
            return 0;
        }
        uVar.c(36);
        if (uVar.p() == f1846e) {
            return f1846e;
        }
        return 0;
    }

    private static d a(c.d.a.a.g.b bVar, long j) {
        if (bVar == null) {
            return null;
        }
        int iF = bVar.f();
        for (int i2 = 0; i2 < iF; i2++) {
            b.a aVarA = bVar.a(i2);
            if (aVarA instanceof s) {
                return d.a(j, (s) aVarA);
            }
        }
        return null;
    }
}

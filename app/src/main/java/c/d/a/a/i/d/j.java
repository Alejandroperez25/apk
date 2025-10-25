package c.d.a.a.i.d;

import android.util.Pair;
import c.d.a.a.g.b;
import c.d.a.a.i.d.a.d;
import c.d.a.a.m.E;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.io.EOFException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class j extends c.d.a.a.i.b.l {
    private static final AtomicInteger j = new AtomicInteger();
    private c.d.a.a.e.g A;
    private o B;
    private int C;
    private int D;
    private boolean E;
    private volatile boolean F;
    private boolean G;
    public final int k;
    public final int l;
    public final d.a m;
    private final c.d.a.a.l.k n;
    private final c.d.a.a.l.n o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final E s;
    private final boolean t;
    private final h u;
    private final List<c.d.a.a.q> v;
    private final c.d.a.a.d.f w;
    private final c.d.a.a.e.g x;
    private final c.d.a.a.g.b.n y;
    private final u z;

    public j(h hVar, c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, c.d.a.a.l.n nVar2, d.a aVar, List<c.d.a.a.q> list, int i2, Object obj, long j2, long j3, long j4, int i3, boolean z, boolean z2, E e2, j jVar, c.d.a.a.d.f fVar, byte[] bArr, byte[] bArr2) {
        super(a(kVar, bArr, bArr2), nVar, aVar.f2774b, i2, obj, j2, j3, j4);
        this.l = i3;
        this.o = nVar2;
        this.m = aVar;
        this.q = z2;
        this.s = e2;
        boolean z3 = true;
        this.p = bArr != null;
        this.r = z;
        this.u = hVar;
        this.v = list;
        this.w = fVar;
        c.d.a.a.e.g gVar = null;
        if (jVar != null) {
            this.y = jVar.y;
            this.z = jVar.z;
            if (jVar.m == aVar && jVar.G) {
                z3 = false;
            }
            this.t = z3;
            if (jVar.l == i3 && !this.t) {
                gVar = jVar.A;
            }
        } else {
            this.y = new c.d.a.a.g.b.n();
            this.z = new u(10);
            this.t = false;
        }
        this.x = gVar;
        this.n = kVar;
        this.k = j.getAndIncrement();
    }

    public void a(o oVar) {
        this.B = oVar;
    }

    @Override // c.d.a.a.i.b.l
    public boolean h() {
        return this.G;
    }

    @Override // c.d.a.a.l.B.d
    public void b() {
        this.F = true;
    }

    @Override // c.d.a.a.l.B.d
    public void a() {
        i();
        if (this.F) {
            return;
        }
        if (!this.r) {
            j();
        }
        this.G = true;
    }

    private void i() {
        if (this.E || this.o == null) {
            return;
        }
        try {
            c.d.a.a.e.d dVarA = a(this.n, this.o.a(this.C));
            int iA = 0;
            while (iA == 0) {
                try {
                    if (this.F) {
                        break;
                    } else {
                        iA = this.A.a(dVarA, (c.d.a.a.e.n) null);
                    }
                } finally {
                    this.C = (int) (dVarA.c() - this.o.f3421e);
                }
            }
            H.a(this.n);
            this.E = true;
        } catch (Throwable th) {
            H.a(this.n);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:15:0x0037, B:17:0x003f, B:26:0x0061, B:24:0x0053, B:25:0x0060, B:19:0x0046, B:21:0x004a), top: B:34:0x0037, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 == 0) goto Ld
            c.d.a.a.l.n r0 = r7.f2526a
            int r2 = r7.D
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        Ld:
            c.d.a.a.l.n r0 = r7.f2526a
            int r2 = r7.D
            long r2 = (long) r2
            c.d.a.a.l.n r0 = r0.a(r2)
        L16:
            r2 = 0
        L17:
            boolean r3 = r7.q
            if (r3 != 0) goto L21
            c.d.a.a.m.E r3 = r7.s
            r3.e()
            goto L37
        L21:
            c.d.a.a.m.E r3 = r7.s
            long r3 = r3.a()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L37
            c.d.a.a.m.E r3 = r7.s
            long r4 = r7.f2531f
            r3.c(r4)
        L37:
            c.d.a.a.l.F r3 = r7.f2533h     // Catch: java.lang.Throwable -> L74
            c.d.a.a.e.d r0 = r7.a(r3, r0)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L44
            int r2 = r7.D     // Catch: java.lang.Throwable -> L74
            r0.c(r2)     // Catch: java.lang.Throwable -> L74
        L44:
            if (r1 != 0) goto L61
            boolean r1 = r7.F     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L61
            c.d.a.a.e.g r1 = r7.A     // Catch: java.lang.Throwable -> L52
            r2 = 0
            int r1 = r1.a(r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L44
        L52:
            r1 = move-exception
            long r2 = r0.c()     // Catch: java.lang.Throwable -> L74
            c.d.a.a.l.n r0 = r7.f2526a     // Catch: java.lang.Throwable -> L74
            long r4 = r0.f3421e     // Catch: java.lang.Throwable -> L74
            r0 = 0
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L74
            r7.D = r0     // Catch: java.lang.Throwable -> L74
            throw r1     // Catch: java.lang.Throwable -> L74
        L61:
            long r0 = r0.c()     // Catch: java.lang.Throwable -> L74
            c.d.a.a.l.n r2 = r7.f2526a     // Catch: java.lang.Throwable -> L74
            long r2 = r2.f3421e     // Catch: java.lang.Throwable -> L74
            r4 = 0
            long r0 = r0 - r2
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L74
            r7.D = r0     // Catch: java.lang.Throwable -> L74
            c.d.a.a.l.F r0 = r7.f2533h
            c.d.a.a.m.H.a(r0)
            return
        L74:
            r0 = move-exception
            c.d.a.a.l.F r1 = r7.f2533h
            c.d.a.a.m.H.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.d.j.j():void");
    }

    private c.d.a.a.e.d a(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar) {
        c.d.a.a.e.d dVar = new c.d.a.a.e.d(kVar, nVar.f3421e, kVar.a(nVar));
        if (this.A != null) {
            return dVar;
        }
        long jA = a(dVar);
        dVar.b();
        Pair<c.d.a.a.e.g, Boolean> pairA = this.u.a(this.x, nVar.f3417a, this.f2528c, this.v, this.w, this.s, kVar.a(), dVar);
        this.A = (c.d.a.a.e.g) pairA.first;
        boolean z = false;
        boolean z2 = this.A == this.x;
        if (((Boolean) pairA.second).booleanValue()) {
            this.B.d(jA != -9223372036854775807L ? this.s.d(jA) : this.f2531f);
        }
        if (z2 && this.o != null) {
            z = true;
        }
        this.E = z;
        this.B.a(this.k, this.t, z2);
        if (z2) {
            return dVar;
        }
        this.A.a(this.B);
        return dVar;
    }

    private long a(c.d.a.a.e.h hVar) {
        hVar.b();
        try {
            hVar.a(this.z.f3567a, 0, 10);
            this.z.a(10);
            if (this.z.l() != c.d.a.a.g.b.n.f2431b) {
                return -9223372036854775807L;
            }
            this.z.d(3);
            int iU = this.z.u();
            int i2 = iU + 10;
            if (i2 > this.z.e()) {
                byte[] bArr = this.z.f3567a;
                this.z.a(i2);
                System.arraycopy(bArr, 0, this.z.f3567a, 0, 10);
            }
            hVar.a(this.z.f3567a, 10, iU);
            c.d.a.a.g.b bVarA = this.y.a(this.z.f3567a, iU);
            if (bVarA == null) {
                return -9223372036854775807L;
            }
            int iF = bVarA.f();
            for (int i3 = 0; i3 < iF; i3++) {
                b.a aVarA = bVarA.a(i3);
                if (aVarA instanceof c.d.a.a.g.b.u) {
                    c.d.a.a.g.b.u uVar = (c.d.a.a.g.b.u) aVarA;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(uVar.f2445a)) {
                        System.arraycopy(uVar.f2446b, 0, this.z.f3567a, 0, 8);
                        this.z.a(8);
                        return this.z.r() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
            return -9223372036854775807L;
        }
    }

    private static c.d.a.a.l.k a(c.d.a.a.l.k kVar, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new c(kVar, bArr, bArr2) : kVar;
    }
}

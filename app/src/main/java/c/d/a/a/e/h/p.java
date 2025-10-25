package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private final B f2236a;

    /* renamed from: b, reason: collision with root package name */
    private String f2237b;

    /* renamed from: c, reason: collision with root package name */
    private c.d.a.a.e.q f2238c;

    /* renamed from: d, reason: collision with root package name */
    private a f2239d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2240e;
    private long l;
    private long m;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f2241f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final t f2242g = new t(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final t f2243h = new t(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final t f2244i = new t(34, 128);
    private final t j = new t(39, 128);
    private final t k = new t(40, 128);
    private final c.d.a.a.m.u n = new c.d.a.a.m.u();

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public p(B b2) {
        this.f2236a = b2;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        c.d.a.a.m.s.a(this.f2241f);
        this.f2242g.a();
        this.f2243h.a();
        this.f2244i.a();
        this.j.a();
        this.k.a();
        this.f2239d.a();
        this.l = 0L;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2237b = dVar.c();
        this.f2238c = iVar.a(dVar.b(), 2);
        this.f2239d = new a(this.f2238c);
        this.f2236a.a(iVar, dVar);
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.m = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            int iD = uVar.d();
            int iC = uVar.c();
            byte[] bArr = uVar.f3567a;
            this.l += uVar.b();
            this.f2238c.a(uVar, uVar.b());
            while (iD < iC) {
                int iA = c.d.a.a.m.s.a(bArr, iD, iC, this.f2241f);
                if (iA == iC) {
                    a(bArr, iD, iC);
                    return;
                }
                int iC2 = c.d.a.a.m.s.c(bArr, iA);
                int i2 = iA - iD;
                if (i2 > 0) {
                    a(bArr, iD, iA);
                }
                int i3 = iC - iA;
                long j = this.l - i3;
                b(j, i3, i2 < 0 ? -i2 : 0, this.m);
                a(j, i3, iC2, this.m);
                iD = iA + 3;
            }
        }
    }

    private void a(long j, int i2, int i3, long j2) {
        if (this.f2240e) {
            this.f2239d.a(j, i2, i3, j2);
        } else {
            this.f2242g.a(i3);
            this.f2243h.a(i3);
            this.f2244i.a(i3);
        }
        this.j.a(i3);
        this.k.a(i3);
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (this.f2240e) {
            this.f2239d.a(bArr, i2, i3);
        } else {
            this.f2242g.a(bArr, i2, i3);
            this.f2243h.a(bArr, i2, i3);
            this.f2244i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void b(long j, int i2, int i3, long j2) {
        if (this.f2240e) {
            this.f2239d.a(j, i2);
        } else {
            this.f2242g.b(i3);
            this.f2243h.b(i3);
            this.f2244i.b(i3);
            if (this.f2242g.b() && this.f2243h.b() && this.f2244i.b()) {
                this.f2238c.a(a(this.f2237b, this.f2242g, this.f2243h, this.f2244i));
                this.f2240e = true;
            }
        }
        if (this.j.b(i3)) {
            this.n.a(this.j.f2281d, c.d.a.a.m.s.a(this.j.f2281d, this.j.f2282e));
            this.n.d(5);
            this.f2236a.a(j2, this.n);
        }
        if (this.k.b(i3)) {
            this.n.a(this.k.f2281d, c.d.a.a.m.s.a(this.k.f2281d, this.k.f2282e));
            this.n.d(5);
            this.f2236a.a(j2, this.n);
        }
    }

    private static c.d.a.a.q a(String str, t tVar, t tVar2, t tVar3) {
        float f2;
        byte[] bArr = new byte[tVar.f2282e + tVar2.f2282e + tVar3.f2282e];
        System.arraycopy(tVar.f2281d, 0, bArr, 0, tVar.f2282e);
        System.arraycopy(tVar2.f2281d, 0, bArr, tVar.f2282e, tVar2.f2282e);
        System.arraycopy(tVar3.f2281d, 0, bArr, tVar.f2282e + tVar2.f2282e, tVar3.f2282e);
        c.d.a.a.m.v vVar = new c.d.a.a.m.v(tVar2.f2281d, 0, tVar2.f2282e);
        vVar.a(44);
        int iC = vVar.c(3);
        vVar.a();
        vVar.a(88);
        vVar.a(8);
        int i2 = 0;
        for (int i3 = 0; i3 < iC; i3++) {
            if (vVar.b()) {
                i2 += 89;
            }
            if (vVar.b()) {
                i2 += 8;
            }
        }
        vVar.a(i2);
        if (iC > 0) {
            vVar.a((8 - iC) * 2);
        }
        vVar.d();
        int iD = vVar.d();
        if (iD == 3) {
            vVar.a();
        }
        int iD2 = vVar.d();
        int iD3 = vVar.d();
        if (vVar.b()) {
            int iD4 = vVar.d();
            int iD5 = vVar.d();
            int iD6 = vVar.d();
            int iD7 = vVar.d();
            iD2 -= ((iD == 1 || iD == 2) ? 2 : 1) * (iD4 + iD5);
            iD3 -= (iD == 1 ? 2 : 1) * (iD6 + iD7);
        }
        int i4 = iD2;
        int i5 = iD3;
        vVar.d();
        vVar.d();
        int iD8 = vVar.d();
        for (int i6 = vVar.b() ? 0 : iC; i6 <= iC; i6++) {
            vVar.d();
            vVar.d();
            vVar.d();
        }
        vVar.d();
        vVar.d();
        vVar.d();
        vVar.d();
        vVar.d();
        vVar.d();
        if (vVar.b() && vVar.b()) {
            a(vVar);
        }
        vVar.a(2);
        if (vVar.b()) {
            vVar.a(8);
            vVar.d();
            vVar.d();
            vVar.a();
        }
        b(vVar);
        if (vVar.b()) {
            for (int i7 = 0; i7 < vVar.d(); i7++) {
                vVar.a(iD8 + 4 + 1);
            }
        }
        vVar.a(2);
        float f3 = 1.0f;
        if (vVar.b() && vVar.b()) {
            int iC2 = vVar.c(8);
            if (iC2 == 255) {
                int iC3 = vVar.c(16);
                int iC4 = vVar.c(16);
                if (iC3 != 0 && iC4 != 0) {
                    f3 = iC3 / iC4;
                }
                f2 = f3;
            } else if (iC2 < c.d.a.a.m.s.f3548b.length) {
                f2 = c.d.a.a.m.s.f3548b[iC2];
            } else {
                c.d.a.a.m.o.c("H265Reader", "Unexpected aspect_ratio_idc value: " + iC2);
                f2 = 1.0f;
            }
        } else {
            f2 = 1.0f;
        }
        return c.d.a.a.q.a(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, (List<byte[]>) Collections.singletonList(bArr), -1, f2, (c.d.a.a.d.f) null);
    }

    private static void a(c.d.a.a.m.v vVar) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                if (!vVar.b()) {
                    vVar.d();
                } else {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        vVar.e();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        vVar.e();
                    }
                }
                int i5 = 3;
                if (i2 != 3) {
                    i5 = 1;
                }
                i3 += i5;
            }
        }
    }

    private static void b(c.d.a.a.m.v vVar) {
        int iD = vVar.d();
        boolean zB = false;
        int i2 = 0;
        for (int i3 = 0; i3 < iD; i3++) {
            if (i3 != 0) {
                zB = vVar.b();
            }
            if (zB) {
                vVar.a();
                vVar.d();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (vVar.b()) {
                        vVar.a();
                    }
                }
            } else {
                int iD2 = vVar.d();
                int iD3 = vVar.d();
                int i5 = iD2 + iD3;
                for (int i6 = 0; i6 < iD2; i6++) {
                    vVar.d();
                    vVar.a();
                }
                for (int i7 = 0; i7 < iD3; i7++) {
                    vVar.d();
                    vVar.a();
                }
                i2 = i5;
            }
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.e.q f2245a;

        /* renamed from: b, reason: collision with root package name */
        private long f2246b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2247c;

        /* renamed from: d, reason: collision with root package name */
        private int f2248d;

        /* renamed from: e, reason: collision with root package name */
        private long f2249e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2250f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2251g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2252h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f2253i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(c.d.a.a.e.q qVar) {
            this.f2245a = qVar;
        }

        public void a() {
            this.f2250f = false;
            this.f2251g = false;
            this.f2252h = false;
            this.f2253i = false;
            this.j = false;
        }

        public void a(long j, int i2, int i3, long j2) {
            this.f2251g = false;
            this.f2252h = false;
            this.f2249e = j2;
            this.f2248d = 0;
            this.f2246b = j;
            boolean z = true;
            if (i3 >= 32) {
                if (!this.j && this.f2253i) {
                    a(i2);
                    this.f2253i = false;
                }
                if (i3 <= 34) {
                    this.f2252h = !this.j;
                    this.j = true;
                }
            }
            this.f2247c = i3 >= 16 && i3 <= 21;
            if (!this.f2247c && i3 > 9) {
                z = false;
            }
            this.f2250f = z;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f2250f) {
                int i4 = (i2 + 2) - this.f2248d;
                if (i4 < i3) {
                    this.f2251g = (bArr[i4] & 128) != 0;
                    this.f2250f = false;
                } else {
                    this.f2248d += i3 - i2;
                }
            }
        }

        public void a(long j, int i2) {
            if (this.j && this.f2251g) {
                this.m = this.f2247c;
                this.j = false;
            } else if (this.f2252h || this.f2251g) {
                if (this.f2253i) {
                    a(i2 + ((int) (j - this.f2246b)));
                }
                this.k = this.f2246b;
                this.l = this.f2249e;
                this.f2253i = true;
                this.m = this.f2247c;
            }
        }

        private void a(int i2) {
            boolean z = this.m;
            this.f2245a.a(this.l, z ? 1 : 0, (int) (this.f2246b - this.k), i2, null);
        }
    }
}

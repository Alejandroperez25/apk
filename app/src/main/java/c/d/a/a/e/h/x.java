package c.d.a.a.e.h;

/* loaded from: classes.dex */
final class x {

    /* renamed from: c, reason: collision with root package name */
    private boolean f2296c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2297d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2298e;

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.E f2294a = new c.d.a.a.m.E(0);

    /* renamed from: f, reason: collision with root package name */
    private long f2299f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f2300g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f2301h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.u f2295b = new c.d.a.a.m.u();

    x() {
    }

    public boolean a() {
        return this.f2296c;
    }

    public c.d.a.a.m.E b() {
        return this.f2294a;
    }

    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        if (!this.f2298e) {
            return c(hVar, nVar);
        }
        if (this.f2300g == -9223372036854775807L) {
            return a(hVar);
        }
        if (!this.f2297d) {
            return b(hVar, nVar);
        }
        if (this.f2299f == -9223372036854775807L) {
            return a(hVar);
        }
        this.f2301h = this.f2294a.d(this.f2300g) - this.f2294a.d(this.f2299f);
        return a(hVar);
    }

    public long c() {
        return this.f2301h;
    }

    public static long a(c.d.a.a.m.u uVar) {
        int iD = uVar.d();
        if (uVar.b() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uVar.a(bArr, 0, bArr.length);
        uVar.c(iD);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    private int a(c.d.a.a.e.h hVar) {
        this.f2295b.a(c.d.a.a.m.H.f3504f);
        this.f2296c = true;
        hVar.b();
        return 0;
    }

    private int b(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        int iMin = (int) Math.min(20000L, hVar.getLength());
        long j = 0;
        if (hVar.c() != j) {
            nVar.f2349a = j;
            return 1;
        }
        this.f2295b.a(iMin);
        hVar.b();
        hVar.a(this.f2295b.f3567a, 0, iMin);
        this.f2299f = b(this.f2295b);
        this.f2297d = true;
        return 0;
    }

    private long b(c.d.a.a.m.u uVar) {
        int iC = uVar.c();
        for (int iD = uVar.d(); iD < iC - 3; iD++) {
            if (a(uVar.f3567a, iD) == 442) {
                uVar.c(iD + 4);
                long jA = a(uVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        long length = hVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - iMin;
        if (hVar.c() != j) {
            nVar.f2349a = j;
            return 1;
        }
        this.f2295b.a(iMin);
        hVar.b();
        hVar.a(this.f2295b.f3567a, 0, iMin);
        this.f2300g = c(this.f2295b);
        this.f2298e = true;
        return 0;
    }

    private long c(c.d.a.a.m.u uVar) {
        int iD = uVar.d();
        for (int iC = uVar.c() - 4; iC >= iD; iC--) {
            if (a(uVar.f3567a, iC) == 442) {
                uVar.c(iC + 4);
                long jA = a(uVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int a(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long b(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }
}

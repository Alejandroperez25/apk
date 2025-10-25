package c.d.a.a.e.h;

import android.util.SparseArray;
import c.d.a.a.e.a;
import c.d.a.a.e.h.G;
import c.d.a.a.e.o;

/* loaded from: classes.dex */
public final class y implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f2302a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.h.c
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return y.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.E f2303b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<a> f2304c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.a.a.m.u f2305d;

    /* renamed from: e, reason: collision with root package name */
    private final x f2306e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2307f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2308g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2309h;

    /* renamed from: i, reason: collision with root package name */
    private long f2310i;
    private w j;
    private c.d.a.a.e.i k;
    private boolean l;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new y()};
    }

    public y() {
        this(new c.d.a.a.m.E(0L));
    }

    public y(c.d.a.a.m.E e2) {
        this.f2303b = e2;
        this.f2305d = new c.d.a.a.m.u(4096);
        this.f2304c = new SparseArray<>();
        this.f2306e = new x();
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        byte[] bArr = new byte[14];
        hVar.a(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.a(bArr[13] & 7);
        hVar.a(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.k = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        if ((this.f2303b.c() == -9223372036854775807L) || (this.f2303b.a() != 0 && this.f2303b.a() != j2)) {
            this.f2303b.d();
            this.f2303b.c(j2);
        }
        if (this.j != null) {
            this.j.a(j2);
        }
        for (int i2 = 0; i2 < this.f2304c.size(); i2++) {
            this.f2304c.valueAt(i2).a();
        }
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        long length = hVar.getLength();
        if ((length != -1) && !this.f2306e.a()) {
            return this.f2306e.a(hVar, nVar);
        }
        a(length);
        l mVar = null;
        if (this.j != null && this.j.b()) {
            return this.j.a(hVar, nVar, (a.c) null);
        }
        hVar.b();
        long jA = length != -1 ? length - hVar.a() : -1L;
        if ((jA != -1 && jA < 4) || !hVar.b(this.f2305d.f3567a, 0, 4, true)) {
            return -1;
        }
        this.f2305d.c(0);
        int iP = this.f2305d.p();
        if (iP == 441) {
            return -1;
        }
        if (iP == 442) {
            hVar.a(this.f2305d.f3567a, 0, 10);
            this.f2305d.c(9);
            hVar.c((this.f2305d.h() & 7) + 14);
            return 0;
        }
        if (iP == 443) {
            hVar.a(this.f2305d.f3567a, 0, 2);
            this.f2305d.c(0);
            hVar.c(this.f2305d.i() + 6);
            return 0;
        }
        if (((iP & (-256)) >> 8) != 1) {
            hVar.c(1);
            return 0;
        }
        int i2 = iP & 255;
        a aVar = this.f2304c.get(i2);
        if (!this.f2307f) {
            if (aVar == null) {
                if (i2 == 189) {
                    mVar = new C0139f();
                    this.f2308g = true;
                    this.f2310i = hVar.c();
                } else if ((i2 & 224) == 192) {
                    mVar = new s();
                    this.f2308g = true;
                    this.f2310i = hVar.c();
                } else if ((i2 & 240) == 224) {
                    mVar = new m();
                    this.f2309h = true;
                    this.f2310i = hVar.c();
                }
                if (mVar != null) {
                    mVar.a(this.k, new G.d(i2, 256));
                    aVar = new a(mVar, this.f2303b);
                    this.f2304c.put(i2, aVar);
                }
            }
            if (hVar.c() > ((this.f2308g && this.f2309h) ? this.f2310i + 8192 : 1048576L)) {
                this.f2307f = true;
                this.k.a();
            }
        }
        hVar.a(this.f2305d.f3567a, 0, 2);
        this.f2305d.c(0);
        int i3 = this.f2305d.i() + 6;
        if (aVar == null) {
            hVar.c(i3);
        } else {
            this.f2305d.a(i3);
            hVar.readFully(this.f2305d.f3567a, 0, i3);
            this.f2305d.c(6);
            aVar.a(this.f2305d);
            this.f2305d.b(this.f2305d.e());
        }
        return 0;
    }

    private void a(long j) {
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.f2306e.c() != -9223372036854775807L) {
            this.j = new w(this.f2306e.b(), this.f2306e.c(), j);
            this.k.a(this.j.a());
        } else {
            this.k.a(new o.b(this.f2306e.c()));
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final l f2311a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.a.m.E f2312b;

        /* renamed from: c, reason: collision with root package name */
        private final c.d.a.a.m.t f2313c = new c.d.a.a.m.t(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f2314d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2315e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2316f;

        /* renamed from: g, reason: collision with root package name */
        private int f2317g;

        /* renamed from: h, reason: collision with root package name */
        private long f2318h;

        public a(l lVar, c.d.a.a.m.E e2) {
            this.f2311a = lVar;
            this.f2312b = e2;
        }

        public void a() {
            this.f2316f = false;
            this.f2311a.a();
        }

        public void a(c.d.a.a.m.u uVar) {
            uVar.a(this.f2313c.f3563a, 0, 3);
            this.f2313c.a(0);
            b();
            uVar.a(this.f2313c.f3563a, 0, this.f2317g);
            this.f2313c.a(0);
            c();
            this.f2311a.a(this.f2318h, 4);
            this.f2311a.a(uVar);
            this.f2311a.b();
        }

        private void b() {
            this.f2313c.b(8);
            this.f2314d = this.f2313c.e();
            this.f2315e = this.f2313c.e();
            this.f2313c.b(6);
            this.f2317g = this.f2313c.c(8);
        }

        private void c() {
            this.f2318h = 0L;
            if (this.f2314d) {
                this.f2313c.b(4);
                this.f2313c.b(1);
                this.f2313c.b(1);
                long jC = (this.f2313c.c(3) << 30) | (this.f2313c.c(15) << 15) | this.f2313c.c(15);
                this.f2313c.b(1);
                if (!this.f2316f && this.f2315e) {
                    this.f2313c.b(4);
                    this.f2313c.b(1);
                    this.f2313c.b(1);
                    this.f2313c.b(1);
                    this.f2312b.d((this.f2313c.c(3) << 30) | (this.f2313c.c(15) << 15) | this.f2313c.c(15));
                    this.f2316f = true;
                }
                this.f2318h = this.f2312b.d(jC);
            }
        }
    }
}

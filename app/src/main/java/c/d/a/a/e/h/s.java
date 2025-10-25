package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.u f2269a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.e.m f2270b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2271c;

    /* renamed from: d, reason: collision with root package name */
    private String f2272d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.e.q f2273e;

    /* renamed from: f, reason: collision with root package name */
    private int f2274f;

    /* renamed from: g, reason: collision with root package name */
    private int f2275g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2276h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2277i;
    private long j;
    private int k;
    private long l;

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public s() {
        this(null);
    }

    public s(String str) {
        this.f2274f = 0;
        this.f2269a = new c.d.a.a.m.u(4);
        this.f2269a.f3567a[0] = -1;
        this.f2270b = new c.d.a.a.e.m();
        this.f2271c = str;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2274f = 0;
        this.f2275g = 0;
        this.f2277i = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2272d = dVar.c();
        this.f2273e = iVar.a(dVar.b(), 1);
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.l = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            switch (this.f2274f) {
                case 0:
                    b(uVar);
                    break;
                case 1:
                    c(uVar);
                    break;
                case 2:
                    d(uVar);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private void b(c.d.a.a.m.u uVar) {
        byte[] bArr = uVar.f3567a;
        int iC = uVar.c();
        for (int iD = uVar.d(); iD < iC; iD++) {
            boolean z = (bArr[iD] & 255) == 255;
            boolean z2 = this.f2277i && (bArr[iD] & 224) == 224;
            this.f2277i = z;
            if (z2) {
                uVar.c(iD + 1);
                this.f2277i = false;
                this.f2269a.f3567a[1] = bArr[iD];
                this.f2275g = 2;
                this.f2274f = 1;
                return;
            }
        }
        uVar.c(iC);
    }

    private void c(c.d.a.a.m.u uVar) {
        int iMin = Math.min(uVar.b(), 4 - this.f2275g);
        uVar.a(this.f2269a.f3567a, this.f2275g, iMin);
        this.f2275g += iMin;
        if (this.f2275g < 4) {
            return;
        }
        this.f2269a.c(0);
        if (!c.d.a.a.e.m.a(this.f2269a.p(), this.f2270b)) {
            this.f2275g = 0;
            this.f2274f = 1;
            return;
        }
        this.k = this.f2270b.j;
        if (!this.f2276h) {
            this.j = (this.f2270b.n * 1000000) / this.f2270b.k;
            this.f2273e.a(c.d.a.a.q.a(this.f2272d, this.f2270b.f2348i, (String) null, -1, 4096, this.f2270b.l, this.f2270b.k, (List<byte[]>) null, (c.d.a.a.d.f) null, 0, this.f2271c));
            this.f2276h = true;
        }
        this.f2269a.c(0);
        this.f2273e.a(this.f2269a, 4);
        this.f2274f = 2;
    }

    private void d(c.d.a.a.m.u uVar) {
        int iMin = Math.min(uVar.b(), this.k - this.f2275g);
        this.f2273e.a(uVar, iMin);
        this.f2275g += iMin;
        if (this.f2275g < this.k) {
            return;
        }
        this.f2273e.a(this.l, 1, this.k, 0, null);
        this.l += this.j;
        this.f2275g = 0;
        this.f2274f = 0;
    }
}

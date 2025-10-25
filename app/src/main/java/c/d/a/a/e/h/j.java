package c.d.a.a.e.h;

import c.d.a.a.e.h.G;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: b, reason: collision with root package name */
    private final String f2181b;

    /* renamed from: c, reason: collision with root package name */
    private String f2182c;

    /* renamed from: d, reason: collision with root package name */
    private c.d.a.a.e.q f2183d;

    /* renamed from: f, reason: collision with root package name */
    private int f2185f;

    /* renamed from: g, reason: collision with root package name */
    private int f2186g;

    /* renamed from: h, reason: collision with root package name */
    private long f2187h;

    /* renamed from: i, reason: collision with root package name */
    private c.d.a.a.q f2188i;
    private int j;
    private long k;

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.u f2180a = new c.d.a.a.m.u(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f2184e = 0;

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public j(String str) {
        this.f2181b = str;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2184e = 0;
        this.f2185f = 0;
        this.f2186g = 0;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2182c = dVar.c();
        this.f2183d = iVar.a(dVar.b(), 1);
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.k = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            switch (this.f2184e) {
                case 0:
                    if (!b(uVar)) {
                        break;
                    } else {
                        this.f2184e = 1;
                        break;
                    }
                case 1:
                    if (!a(uVar, this.f2180a.f3567a, 18)) {
                        break;
                    } else {
                        c();
                        this.f2180a.c(0);
                        this.f2183d.a(this.f2180a, 18);
                        this.f2184e = 2;
                        break;
                    }
                case 2:
                    int iMin = Math.min(uVar.b(), this.j - this.f2185f);
                    this.f2183d.a(uVar, iMin);
                    this.f2185f += iMin;
                    if (this.f2185f != this.j) {
                        break;
                    } else {
                        this.f2183d.a(this.k, 1, this.j, 0, null);
                        this.k += this.f2187h;
                        this.f2184e = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private boolean a(c.d.a.a.m.u uVar, byte[] bArr, int i2) {
        int iMin = Math.min(uVar.b(), i2 - this.f2185f);
        uVar.a(bArr, this.f2185f, iMin);
        this.f2185f += iMin;
        return this.f2185f == i2;
    }

    private boolean b(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            this.f2186g <<= 8;
            this.f2186g |= uVar.h();
            if (c.d.a.a.b.y.a(this.f2186g)) {
                this.f2180a.f3567a[0] = (byte) ((this.f2186g >> 24) & 255);
                this.f2180a.f3567a[1] = (byte) ((this.f2186g >> 16) & 255);
                this.f2180a.f3567a[2] = (byte) ((this.f2186g >> 8) & 255);
                this.f2180a.f3567a[3] = (byte) (this.f2186g & 255);
                this.f2185f = 4;
                this.f2186g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] bArr = this.f2180a.f3567a;
        if (this.f2188i == null) {
            this.f2188i = c.d.a.a.b.y.a(bArr, this.f2182c, this.f2181b, null);
            this.f2183d.a(this.f2188i);
        }
        this.j = c.d.a.a.b.y.b(bArr);
        this.f2187h = (int) ((c.d.a.a.b.y.a(bArr) * 1000000) / this.f2188i.u);
    }
}

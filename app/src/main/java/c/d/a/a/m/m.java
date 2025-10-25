package c.d.a.a.m;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3536c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3537d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3540g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3541h;

    public m(byte[] bArr, int i2) {
        t tVar = new t(bArr);
        tVar.a(i2 * 8);
        this.f3534a = tVar.c(16);
        this.f3535b = tVar.c(16);
        this.f3536c = tVar.c(24);
        this.f3537d = tVar.c(24);
        this.f3538e = tVar.c(20);
        this.f3539f = tVar.c(3) + 1;
        this.f3540g = tVar.c(5) + 1;
        this.f3541h = ((tVar.c(4) & 15) << 32) | (tVar.c(32) & 4294967295L);
    }

    public int a() {
        return this.f3540g * this.f3538e;
    }

    public long b() {
        return (this.f3541h * 1000000) / this.f3538e;
    }
}

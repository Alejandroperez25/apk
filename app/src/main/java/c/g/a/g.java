package c.g.a;

/* loaded from: classes.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f4482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f4483c;

    g(h hVar, String str, byte[] bArr) {
        this.f4483c = hVar;
        this.f4481a = str;
        this.f4482b = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4483c.f4487d.a(this.f4481a, this.f4482b);
    }
}

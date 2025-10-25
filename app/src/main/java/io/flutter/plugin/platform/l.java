package io.flutter.plugin.platform;

/* loaded from: classes.dex */
class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f6160a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f6161b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f6162c;

    l(m mVar, r rVar, Runnable runnable) {
        this.f6162c = mVar;
        this.f6160a = rVar;
        this.f6161b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6162c.f6163a.b(this.f6160a);
        this.f6161b.run();
    }
}

package h.a.a;

/* loaded from: classes.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f5867a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f5868b;

    g(h hVar, b bVar) {
        this.f5868b = hVar;
        this.f5867a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5868b.a(this.f5867a);
    }
}

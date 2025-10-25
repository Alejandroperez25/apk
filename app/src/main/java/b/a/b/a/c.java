package b.a.b.a;

/* loaded from: classes.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f914a;

    c(d dVar) {
        this.f914a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f914a.a(true);
        this.f914a.invalidateSelf();
    }
}

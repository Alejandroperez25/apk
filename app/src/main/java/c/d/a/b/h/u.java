package c.d.a.b.h;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4050a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t f4051b;

    u(t tVar, h hVar) {
        this.f4051b = tVar;
        this.f4050a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4051b.f4048b) {
            if (this.f4051b.f4049c != null) {
                this.f4051b.f4049c.a(this.f4050a.e());
            }
        }
    }
}

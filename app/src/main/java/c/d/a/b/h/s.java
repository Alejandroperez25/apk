package c.d.a.b.h;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4045a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r f4046b;

    s(r rVar, h hVar) {
        this.f4046b = rVar;
        this.f4045a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4046b.f4043b) {
            if (this.f4046b.f4044c != null) {
                this.f4046b.f4044c.a(this.f4045a);
            }
        }
    }
}

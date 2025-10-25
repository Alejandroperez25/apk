package c.d.a.b.h;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p f4041a;

    q(p pVar) {
        this.f4041a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4041a.f4039b) {
            if (this.f4041a.f4040c != null) {
                this.f4041a.f4040c.a();
            }
        }
    }
}

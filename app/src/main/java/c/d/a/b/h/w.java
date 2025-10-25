package c.d.a.b.h;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4055a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v f4056b;

    w(v vVar, h hVar) {
        this.f4056b = vVar;
        this.f4055a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4056b.f4053b) {
            if (this.f4056b.f4054c != null) {
                this.f4056b.f4054c.a(this.f4055a.d());
            }
        }
    }
}

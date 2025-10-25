package c.d.a.b.h;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4036a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ n f4037b;

    o(n nVar, h hVar) {
        this.f4037b = nVar;
        this.f4036a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVar = (h) this.f4037b.f4034b.a(this.f4036a);
            if (hVar == null) {
                this.f4037b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.a(j.f4025b, (e) this.f4037b);
            hVar.a(j.f4025b, (InterfaceC0230d) this.f4037b);
            hVar.a(j.f4025b, (InterfaceC0228b) this.f4037b);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4037b.f4035c.a((Exception) e2.getCause());
            } else {
                this.f4037b.f4035c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4037b.f4035c.a(e3);
        }
    }
}

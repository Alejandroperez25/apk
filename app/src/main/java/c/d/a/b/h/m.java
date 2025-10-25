package c.d.a.b.h;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4031a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ l f4032b;

    m(l lVar, h hVar) {
        this.f4032b = lVar;
        this.f4031a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4031a.c()) {
            this.f4032b.f4030c.f();
            return;
        }
        try {
            this.f4032b.f4030c.a((C) this.f4032b.f4029b.a(this.f4031a));
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4032b.f4030c.a((Exception) e2.getCause());
            } else {
                this.f4032b.f4030c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4032b.f4030c.a(e3);
        }
    }
}

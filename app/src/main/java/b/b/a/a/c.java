package b.b.a.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f954a;

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f955b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final Executor f956c = new b();

    /* renamed from: e, reason: collision with root package name */
    private f f958e = new e();

    /* renamed from: d, reason: collision with root package name */
    private f f957d = this.f958e;

    private c() {
    }

    public static c b() {
        if (f954a != null) {
            return f954a;
        }
        synchronized (c.class) {
            if (f954a == null) {
                f954a = new c();
            }
        }
        return f954a;
    }

    @Override // b.b.a.a.f
    public void a(Runnable runnable) {
        this.f957d.a(runnable);
    }

    @Override // b.b.a.a.f
    public void b(Runnable runnable) {
        this.f957d.b(runnable);
    }

    @Override // b.b.a.a.f
    public boolean a() {
        return this.f957d.a();
    }
}

package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class t<TResult> implements z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4047a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4048b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0230d f4049c;

    public t(Executor executor, InterfaceC0230d interfaceC0230d) {
        this.f4047a = executor;
        this.f4049c = interfaceC0230d;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        if (hVar.b() || hVar.c()) {
            return;
        }
        synchronized (this.f4048b) {
            if (this.f4049c == null) {
                return;
            }
            this.f4047a.execute(new u(this, hVar));
        }
    }
}

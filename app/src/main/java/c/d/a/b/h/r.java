package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r<TResult> implements z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4042a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4043b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0229c<TResult> f4044c;

    public r(Executor executor, InterfaceC0229c<TResult> interfaceC0229c) {
        this.f4042a = executor;
        this.f4044c = interfaceC0229c;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        synchronized (this.f4043b) {
            if (this.f4044c == null) {
                return;
            }
            this.f4042a.execute(new s(this, hVar));
        }
    }
}

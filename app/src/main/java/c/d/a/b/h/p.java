package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class p<TResult> implements z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4038a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4039b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0228b f4040c;

    public p(Executor executor, InterfaceC0228b interfaceC0228b) {
        this.f4038a = executor;
        this.f4040c = interfaceC0228b;
    }

    @Override // c.d.a.b.h.z
    public final void a(h hVar) {
        if (hVar.c()) {
            synchronized (this.f4039b) {
                if (this.f4040c == null) {
                    return;
                }
                this.f4038a.execute(new q(this));
            }
        }
    }
}

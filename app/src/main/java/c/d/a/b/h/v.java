package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class v<TResult> implements z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4052a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4053b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e<? super TResult> f4054c;

    public v(Executor executor, e<? super TResult> eVar) {
        this.f4052a = executor;
        this.f4054c = eVar;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        if (hVar.b()) {
            synchronized (this.f4053b) {
                if (this.f4054c == null) {
                    return;
                }
                this.f4052a.execute(new w(this, hVar));
            }
        }
    }
}

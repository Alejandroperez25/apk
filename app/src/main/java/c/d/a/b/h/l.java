package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class l<TResult, TContinuationResult> implements z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4028a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0227a<TResult, TContinuationResult> f4029b;

    /* renamed from: c, reason: collision with root package name */
    private final C<TContinuationResult> f4030c;

    public l(Executor executor, InterfaceC0227a<TResult, TContinuationResult> interfaceC0227a, C<TContinuationResult> c2) {
        this.f4028a = executor;
        this.f4029b = interfaceC0227a;
        this.f4030c = c2;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        this.f4028a.execute(new m(this, hVar));
    }
}

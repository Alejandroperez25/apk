package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class n<TResult, TContinuationResult> implements InterfaceC0228b, InterfaceC0230d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4033a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0227a<TResult, h<TContinuationResult>> f4034b;

    /* renamed from: c, reason: collision with root package name */
    private final C<TContinuationResult> f4035c;

    public n(Executor executor, InterfaceC0227a<TResult, h<TContinuationResult>> interfaceC0227a, C<TContinuationResult> c2) {
        this.f4033a = executor;
        this.f4034b = interfaceC0227a;
        this.f4035c = c2;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        this.f4033a.execute(new o(this, hVar));
    }

    @Override // c.d.a.b.h.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f4035c.a((C<TContinuationResult>) tcontinuationresult);
    }

    @Override // c.d.a.b.h.InterfaceC0230d
    public final void a(Exception exc) {
        this.f4035c.a(exc);
    }

    @Override // c.d.a.b.h.InterfaceC0228b
    public final void a() {
        this.f4035c.f();
    }
}

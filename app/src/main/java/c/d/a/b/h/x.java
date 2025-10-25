package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class x<TResult, TContinuationResult> implements InterfaceC0228b, InterfaceC0230d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4057a;

    /* renamed from: b, reason: collision with root package name */
    private final g<TResult, TContinuationResult> f4058b;

    /* renamed from: c, reason: collision with root package name */
    private final C<TContinuationResult> f4059c;

    public x(Executor executor, g<TResult, TContinuationResult> gVar, C<TContinuationResult> c2) {
        this.f4057a = executor;
        this.f4058b = gVar;
        this.f4059c = c2;
    }

    @Override // c.d.a.b.h.z
    public final void a(h<TResult> hVar) {
        this.f4057a.execute(new y(this, hVar));
    }

    @Override // c.d.a.b.h.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f4059c.a((C<TContinuationResult>) tcontinuationresult);
    }

    @Override // c.d.a.b.h.InterfaceC0230d
    public final void a(Exception exc) {
        this.f4059c.a(exc);
    }

    @Override // c.d.a.b.h.InterfaceC0228b
    public final void a() {
        this.f4059c.f();
    }
}

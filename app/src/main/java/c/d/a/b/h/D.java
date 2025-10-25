package c.d.a.b.h;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C f4021a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Callable f4022b;

    D(C c2, Callable callable) {
        this.f4021a = c2;
        this.f4022b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4021a.a((C) this.f4022b.call());
        } catch (Exception e2) {
            this.f4021a.a(e2);
        }
    }
}

package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f4912a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f4913b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ T f4914c;

    U(T t, LifecycleCallback lifecycleCallback, String str) {
        this.f4914c = t;
        this.f4912a = lifecycleCallback;
        this.f4913b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4914c.aa > 0) {
            this.f4912a.a(this.f4914c.ba != null ? this.f4914c.ba.getBundle(this.f4913b) : null);
        }
        if (this.f4914c.aa >= 2) {
            this.f4912a.a();
        }
        if (this.f4914c.aa >= 3) {
            this.f4912a.b();
        }
        if (this.f4914c.aa >= 4) {
            this.f4912a.c();
        }
        if (this.f4914c.aa >= 5) {
            this.f4912a.d();
        }
    }
}

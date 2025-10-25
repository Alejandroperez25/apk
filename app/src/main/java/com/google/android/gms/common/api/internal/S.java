package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f4909a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f4910b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ R f4911c;

    S(R r, LifecycleCallback lifecycleCallback, String str) {
        this.f4911c = r;
        this.f4909a = lifecycleCallback;
        this.f4910b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4911c.f4907c > 0) {
            this.f4909a.a(this.f4911c.f4908d != null ? this.f4911c.f4908d.getBundle(this.f4910b) : null);
        }
        if (this.f4911c.f4907c >= 2) {
            this.f4909a.a();
        }
        if (this.f4911c.f4907c >= 3) {
            this.f4909a.b();
        }
        if (this.f4911c.f4907c >= 4) {
            this.f4909a.c();
        }
        if (this.f4911c.f4907c >= 5) {
            this.f4909a.d();
        }
    }
}

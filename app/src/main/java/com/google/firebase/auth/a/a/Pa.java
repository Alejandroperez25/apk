package com.google.firebase.auth.a.a;

/* loaded from: classes.dex */
final class Pa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Sa f5264a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Ma f5265b;

    Pa(Ma ma, Sa sa) {
        this.f5265b = ma;
        this.f5264a = sa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5265b.f5259a.f5254h) {
            if (!this.f5265b.f5259a.f5254h.isEmpty()) {
                this.f5264a.a(this.f5265b.f5259a.f5254h.get(0), new Object[0]);
            }
        }
    }
}

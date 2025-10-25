package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c.d.a.b.f.a.k f4890a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ B f4891b;

    D(B b2, c.d.a.b.f.a.k kVar) {
        this.f4891b = b2;
        this.f4890a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4891b.b(this.f4890a);
    }
}

package com.google.firebase.auth.internal;

/* renamed from: com.google.firebase.auth.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0415f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FederatedSignInActivity f5366a;

    RunnableC0415f(FederatedSignInActivity federatedSignInActivity) {
        this.f5366a = federatedSignInActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5366a.j();
        FederatedSignInActivity.a((Runnable) null);
    }
}

package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f5214a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5215b;

    W(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f5215b = firebaseAuth;
        this.f5214a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5214a.a(this.f5215b);
    }
}

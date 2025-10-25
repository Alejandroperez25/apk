package com.google.firebase.auth;

import com.google.firebase.auth.B;

/* loaded from: classes.dex */
final class Z extends B.b {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ B.b f5219b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5220c;

    Z(FirebaseAuth firebaseAuth, B.b bVar) {
        this.f5220c = firebaseAuth;
        this.f5219b = bVar;
    }

    @Override // com.google.firebase.auth.B.b
    public final void a(String str) {
    }

    @Override // com.google.firebase.auth.B.b
    public final void a(A a2) {
        this.f5219b.a(a2);
    }

    @Override // com.google.firebase.auth.B.b
    public final void a(String str, B.a aVar) {
        this.f5219b.a(B.a(str, this.f5220c.f5184g.b()));
    }

    @Override // com.google.firebase.auth.B.b
    public final void a(c.d.b.f fVar) {
        this.f5219b.a(fVar);
    }
}

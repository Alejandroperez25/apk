package com.google.firebase.iid;

import com.google.firebase.iid.Registrar;

/* renamed from: com.google.firebase.iid.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C0458n implements com.google.firebase.components.i {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.firebase.components.i f5551a = new C0458n();

    private C0458n() {
    }

    @Override // com.google.firebase.components.i
    public final Object a(com.google.firebase.components.f fVar) {
        return new Registrar.a((FirebaseInstanceId) fVar.a(FirebaseInstanceId.class));
    }
}

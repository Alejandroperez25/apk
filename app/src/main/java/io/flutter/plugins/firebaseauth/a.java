package io.flutter.plugins.firebaseauth;

import c.d.b.f;
import c.d.c.p;
import com.google.firebase.auth.A;
import com.google.firebase.auth.B;
import java.util.HashMap;

/* loaded from: classes.dex */
class a extends B.b {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6189b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f6190c;

    a(d dVar, int i2) {
        this.f6190c = dVar;
        this.f6189b = i2;
    }

    @Override // com.google.firebase.auth.B.b
    public void a(A a2) {
        HashMap map = new HashMap();
        map.put("handle", Integer.valueOf(this.f6189b));
        map.put("phoneAuthCredential", new p().a(a2));
        this.f6190c.f6198d.a("phoneVerificationCompleted", map);
    }

    @Override // com.google.firebase.auth.B.b
    public void a(f fVar) {
        HashMap map = new HashMap();
        map.put("handle", Integer.valueOf(this.f6189b));
        map.put("exception", this.f6190c.a(fVar));
        this.f6190c.f6198d.a("phoneVerificationFailed", map);
    }

    @Override // com.google.firebase.auth.B.b
    public void a(String str, B.a aVar) {
        HashMap map = new HashMap();
        map.put("handle", Integer.valueOf(this.f6189b));
        map.put("verificationId", str);
        map.put("forceResendingToken", Integer.valueOf(aVar.hashCode()));
        this.f6190c.f6198d.a("phoneCodeSent", map);
    }

    @Override // com.google.firebase.auth.B.b
    public void a(String str) {
        HashMap map = new HashMap();
        map.put("handle", Integer.valueOf(this.f6189b));
        map.put("verificationId", str);
        this.f6190c.f6198d.a("phoneCodeAutoRetrievalTimeout", map);
    }
}

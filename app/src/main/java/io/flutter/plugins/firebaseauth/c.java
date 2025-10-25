package io.flutter.plugins.firebaseauth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class c implements FirebaseAuth.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f6194b;

    c(d dVar, int i2) {
        this.f6194b = dVar;
        this.f6193a = i2;
    }

    @Override // com.google.firebase.auth.FirebaseAuth.a
    public void a(FirebaseAuth firebaseAuth) {
        Map mapA = this.f6194b.a(firebaseAuth.a());
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(this.f6193a));
        if (mapA != null) {
            map.put("user", mapA);
        }
        this.f6194b.f6198d.a("onAuthStateChanged", Collections.unmodifiableMap(map));
    }
}

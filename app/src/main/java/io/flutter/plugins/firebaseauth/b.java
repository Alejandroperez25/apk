package io.flutter.plugins.firebaseauth;

import c.d.a.b.h.InterfaceC0229c;
import c.d.a.b.h.h;
import com.google.firebase.auth.C0439u;
import f.a.a.a.o;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
class b implements InterfaceC0229c<C0439u> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f6191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f6192b;

    b(d dVar, o.d dVar2) {
        this.f6192b = dVar;
        this.f6191a = dVar2;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public void a(h<C0439u> hVar) {
        if (!hVar.b() || hVar.d() == null) {
            this.f6192b.a(this.f6191a, hVar.e());
            return;
        }
        HashMap map = new HashMap();
        map.put("token", hVar.d().a());
        map.put("expirationTimestamp", Long.valueOf(hVar.d().b()));
        map.put("authTimestamp", Long.valueOf(hVar.d().c()));
        map.put("issuedAtTimestamp", Long.valueOf(hVar.d().d()));
        map.put("claims", hVar.d().f());
        if (hVar.d().e() != null) {
            map.put("signInProvider", hVar.d().e());
        }
        this.f6191a.a(Collections.unmodifiableMap(map));
    }
}

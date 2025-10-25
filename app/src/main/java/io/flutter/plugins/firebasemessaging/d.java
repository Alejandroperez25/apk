package io.flutter.plugins.firebasemessaging;

import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;
import com.google.firebase.iid.InterfaceC0445a;
import f.a.a.a.o;

/* loaded from: classes.dex */
class d implements InterfaceC0229c<InterfaceC0445a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f6214a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f6215b;

    d(h hVar, o.d dVar) {
        this.f6215b = hVar;
        this.f6214a = dVar;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public void a(c.d.a.b.h.h<InterfaceC0445a> hVar) {
        if (!hVar.b()) {
            Log.w("FirebaseMessagingPlugin", "getToken, error fetching instanceID: ", hVar.e());
            this.f6214a.a(null);
        } else {
            this.f6214a.a(hVar.d().a());
        }
    }
}

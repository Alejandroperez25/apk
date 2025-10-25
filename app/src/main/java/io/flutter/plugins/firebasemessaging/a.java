package io.flutter.plugins.firebasemessaging;

import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;
import com.google.firebase.iid.InterfaceC0445a;

/* loaded from: classes.dex */
class a implements InterfaceC0229c<InterfaceC0445a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f6209a;

    a(h hVar) {
        this.f6209a = hVar;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public void a(c.d.a.b.h.h<InterfaceC0445a> hVar) {
        if (hVar.b()) {
            this.f6209a.f6221b.a("onToken", hVar.d().a());
        } else {
            Log.w("FirebaseMessagingPlugin", "getToken, error fetching instanceID: ", hVar.e());
        }
    }
}

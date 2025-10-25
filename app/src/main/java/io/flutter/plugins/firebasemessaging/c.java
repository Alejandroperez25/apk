package io.flutter.plugins.firebasemessaging;

import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;
import f.a.a.a.o;

/* loaded from: classes.dex */
class c implements InterfaceC0229c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f6212a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f6213b;

    c(h hVar, o.d dVar) {
        this.f6213b = hVar;
        this.f6212a = dVar;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public void a(c.d.a.b.h.h<Void> hVar) {
        if (!hVar.b()) {
            Exception excE = hVar.e();
            Log.w("FirebaseMessagingPlugin", "unsubscribeFromTopic error", excE);
            this.f6212a.a("unsubscribeFromTopic", excE.getMessage(), null);
            return;
        }
        this.f6212a.a(null);
    }
}

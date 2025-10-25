package io.flutter.plugins.firebasemessaging;

import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;
import f.a.a.a.o;

/* loaded from: classes.dex */
class b implements InterfaceC0229c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f6210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f6211b;

    b(h hVar, o.d dVar) {
        this.f6211b = hVar;
        this.f6210a = dVar;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public void a(c.d.a.b.h.h<Void> hVar) {
        if (!hVar.b()) {
            Exception excE = hVar.e();
            Log.w("FirebaseMessagingPlugin", "subscribeToTopic error", excE);
            this.f6210a.a("subscribeToTopic", excE.getMessage(), null);
            return;
        }
        this.f6210a.a(null);
    }
}

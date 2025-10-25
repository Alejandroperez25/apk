package b.d.d;

import android.os.Handler;
import androidx.core.content.a.h;
import b.d.d.f;
import b.d.d.k;

/* loaded from: classes.dex */
class c implements k.a<f.c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.a f1065a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Handler f1066b;

    c(h.a aVar, Handler handler) {
        this.f1065a = aVar;
        this.f1066b = handler;
    }

    @Override // b.d.d.k.a
    public void a(f.c cVar) {
        if (cVar == null) {
            this.f1065a.a(1, this.f1066b);
        } else if (cVar.f1081b == 0) {
            this.f1065a.a(cVar.f1080a, this.f1066b);
        } else {
            this.f1065a.a(cVar.f1081b, this.f1066b);
        }
    }
}

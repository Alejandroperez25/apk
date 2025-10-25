package c.b;

import android.webkit.ValueCallback;
import f.a.a.a.o;

/* loaded from: classes.dex */
class l implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f1307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f1308b;

    l(m mVar, o.d dVar) {
        this.f1308b = mVar;
        this.f1307a = dVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(String str) {
        this.f1307a.a(str);
    }
}

package c.b;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import f.a.a.a.o;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final o f1297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1298b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f1299c;

    e(o oVar, String str, Handler handler) {
        this.f1297a = oVar;
        this.f1298b = str;
        this.f1299c = handler;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        d dVar = new d(this, str);
        if (this.f1299c.getLooper() == Looper.myLooper()) {
            dVar.run();
        } else {
            this.f1299c.post(dVar);
        }
    }
}

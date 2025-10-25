package f.a.b.e;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final f.a.a.a.o f5836a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5837b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f5838c;

    m(f.a.a.a.o oVar, String str, Handler handler) {
        this.f5836a = oVar;
        this.f5837b = str;
        this.f5838c = handler;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        l lVar = new l(this, str);
        if (this.f5838c.getLooper() == Looper.myLooper()) {
            lVar.run();
        } else {
            this.f5838c.post(lVar);
        }
    }
}

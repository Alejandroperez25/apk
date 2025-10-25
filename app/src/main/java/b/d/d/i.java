package b.d.d;

import android.os.Handler;
import b.d.d.k;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callable f1085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Handler f1086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k.a f1087c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f1088d;

    i(k kVar, Callable callable, Handler handler, k.a aVar) {
        this.f1088d = kVar;
        this.f1085a = callable;
        this.f1086b = handler;
        this.f1087c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Exception {
        Object objCall;
        try {
            objCall = this.f1085a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f1086b.post(new h(this, objCall));
    }
}

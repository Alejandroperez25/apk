package c.c.a.a.b;

import android.util.Log;
import java.net.SocketException;

/* loaded from: classes.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f1346a;

    b(e eVar) {
        this.f1346a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() throws SocketException {
        Log.d("RtmpConnection", "starting main rx handler loop");
        this.f1346a.h();
    }
}

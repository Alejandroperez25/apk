package c.d.a.a.m;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
final class B implements InterfaceC0171f {
    B() {
    }

    @Override // c.d.a.a.m.InterfaceC0171f
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // c.d.a.a.m.InterfaceC0171f
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // c.d.a.a.m.InterfaceC0171f
    public n a(Looper looper, Handler.Callback callback) {
        return new C(new Handler(looper, callback));
    }
}

package b.d.d;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1082a;

    g(k kVar) {
        this.f1082a = kVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f1082a.a();
                break;
            case 1:
                this.f1082a.a((Runnable) message.obj);
                break;
        }
        return true;
    }
}

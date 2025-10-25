package b.j.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f1200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, Looper looper) {
        super(looper);
        this.f1200a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.f1200a.a();
        } else {
            super.handleMessage(message);
        }
    }
}

package c.d.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.d.a.a.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class HandlerC0156k extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0157l f3275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC0156k(C0157l c0157l, Looper looper) {
        super(looper);
        this.f3275a = c0157l;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.f3275a.a(message);
    }
}

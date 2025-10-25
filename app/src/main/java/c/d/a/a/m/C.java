package c.d.a.a.m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class C implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f3491a;

    public C(Handler handler) {
        this.f3491a = handler;
    }

    @Override // c.d.a.a.m.n
    public Looper a() {
        return this.f3491a.getLooper();
    }

    @Override // c.d.a.a.m.n
    public Message a(int i2, Object obj) {
        return this.f3491a.obtainMessage(i2, obj);
    }

    @Override // c.d.a.a.m.n
    public Message a(int i2, int i3, int i4) {
        return this.f3491a.obtainMessage(i2, i3, i4);
    }

    @Override // c.d.a.a.m.n
    public Message a(int i2, int i3, int i4, Object obj) {
        return this.f3491a.obtainMessage(i2, i3, i4, obj);
    }

    @Override // c.d.a.a.m.n
    public boolean a(int i2) {
        return this.f3491a.sendEmptyMessage(i2);
    }

    @Override // c.d.a.a.m.n
    public boolean a(int i2, long j) {
        return this.f3491a.sendEmptyMessageAtTime(i2, j);
    }

    @Override // c.d.a.a.m.n
    public void b(int i2) {
        this.f3491a.removeMessages(i2);
    }
}

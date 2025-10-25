package b.b.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f961a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f962b = Executors.newFixedThreadPool(2, new d(this));

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f963c;

    @Override // b.b.a.a.f
    public void a(Runnable runnable) {
        this.f962b.execute(runnable);
    }

    @Override // b.b.a.a.f
    public void b(Runnable runnable) {
        if (this.f963c == null) {
            synchronized (this.f961a) {
                if (this.f963c == null) {
                    this.f963c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f963c.post(runnable);
    }

    @Override // b.b.a.a.f
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

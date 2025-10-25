package b.d.d;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f1096b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f1097c;

    /* renamed from: f, reason: collision with root package name */
    private final int f1100f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1101g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1102h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1095a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f1099e = new g(this);

    /* renamed from: d, reason: collision with root package name */
    private int f1098d = 0;

    public interface a<T> {
        void a(T t);
    }

    public k(String str, int i2, int i3) {
        this.f1102h = str;
        this.f1101g = i2;
        this.f1100f = i3;
    }

    private void b(Runnable runnable) {
        synchronized (this.f1095a) {
            if (this.f1096b == null) {
                this.f1096b = new HandlerThread(this.f1102h, this.f1101g);
                this.f1096b.start();
                this.f1097c = new Handler(this.f1096b.getLooper(), this.f1099e);
                this.f1098d++;
            }
            this.f1097c.removeMessages(0);
            this.f1097c.sendMessage(this.f1097c.obtainMessage(1, runnable));
        }
    }

    public <T> void a(Callable<T> callable, a<T> aVar) {
        b(new i(this, callable, new Handler(), aVar));
    }

    public <T> T a(Callable<T> callable, int i2) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new j(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f1095a) {
            this.f1097c.removeMessages(0);
            this.f1097c.sendMessageDelayed(this.f1097c.obtainMessage(0), this.f1100f);
        }
    }

    void a() {
        synchronized (this.f1095a) {
            if (this.f1097c.hasMessages(1)) {
                return;
            }
            this.f1096b.quit();
            this.f1096b = null;
            this.f1097c = null;
        }
    }
}

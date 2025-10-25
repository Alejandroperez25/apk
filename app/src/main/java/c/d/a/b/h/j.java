package c.d.a.b.h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f4024a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final Executor f4025b = new B();

    private static final class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f4026a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f4026a.post(runnable);
        }
    }
}

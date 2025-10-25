package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class B implements Executor {
    B() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

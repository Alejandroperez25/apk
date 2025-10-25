package c.d.a.b.e.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public interface b {
    ExecutorService a(ThreadFactory threadFactory, int i2);

    ScheduledExecutorService a(int i2, ThreadFactory threadFactory, int i3);
}

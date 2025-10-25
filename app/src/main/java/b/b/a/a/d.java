package b.b.a.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f959a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f960b;

    d(e eVar) {
        this.f960b = eVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f959a.getAndIncrement())));
        return thread;
    }
}

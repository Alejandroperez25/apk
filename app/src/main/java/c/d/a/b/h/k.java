package c.d.a.b.h;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class k {

    interface b extends InterfaceC0228b, InterfaceC0230d, e<Object> {
    }

    public static <TResult> h<TResult> a(TResult tresult) {
        C c2 = new C();
        c2.a((C) tresult);
        return c2;
    }

    private static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f4027a;

        private a() {
            this.f4027a = new CountDownLatch(1);
        }

        @Override // c.d.a.b.h.e
        public final void a(Object obj) {
            this.f4027a.countDown();
        }

        @Override // c.d.a.b.h.InterfaceC0230d
        public final void a(Exception exc) {
            this.f4027a.countDown();
        }

        @Override // c.d.a.b.h.InterfaceC0228b
        public final void a() {
            this.f4027a.countDown();
        }

        public final void b() throws InterruptedException {
            this.f4027a.await();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.f4027a.await(j, timeUnit);
        }

        /* synthetic */ a(D d2) {
            this();
        }
    }

    public static <TResult> h<TResult> a(Exception exc) {
        C c2 = new C();
        c2.a(exc);
        return c2;
    }

    public static <TResult> h<TResult> a(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.t.a(executor, "Executor must not be null");
        com.google.android.gms.common.internal.t.a(callable, "Callback must not be null");
        C c2 = new C();
        executor.execute(new D(c2, callable));
        return c2;
    }

    public static <TResult> TResult a(h<TResult> hVar) throws InterruptedException {
        com.google.android.gms.common.internal.t.a();
        com.google.android.gms.common.internal.t.a(hVar, "Task must not be null");
        if (hVar.a()) {
            return (TResult) b(hVar);
        }
        a aVar = new a(null);
        a((h<?>) hVar, (b) aVar);
        aVar.b();
        return (TResult) b(hVar);
    }

    public static <TResult> TResult a(h<TResult> hVar, long j, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.t.a();
        com.google.android.gms.common.internal.t.a(hVar, "Task must not be null");
        com.google.android.gms.common.internal.t.a(timeUnit, "TimeUnit must not be null");
        if (hVar.a()) {
            return (TResult) b(hVar);
        }
        a aVar = new a(null);
        a((h<?>) hVar, (b) aVar);
        if (!aVar.a(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return (TResult) b(hVar);
    }

    private static <TResult> TResult b(h<TResult> hVar) throws ExecutionException {
        if (hVar.b()) {
            return hVar.d();
        }
        if (hVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.e());
    }

    private static void a(h<?> hVar, b bVar) {
        hVar.a(j.f4025b, (e<? super Object>) bVar);
        hVar.a(j.f4025b, (InterfaceC0230d) bVar);
        hVar.a(j.f4025b, (InterfaceC0228b) bVar);
    }
}

package c.d.a.b.b.b;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0043a f3738a;

    /* renamed from: c.d.a.b.b.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0043a {
        ScheduledExecutorService a();
    }

    public static synchronized InterfaceC0043a a() {
        if (f3738a == null) {
            f3738a = new b();
        }
        return f3738a;
    }
}

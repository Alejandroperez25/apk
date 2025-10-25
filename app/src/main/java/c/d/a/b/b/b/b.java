package c.d.a.b.b.b;

import c.d.a.b.b.b.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class b implements a.InterfaceC0043a {
    b() {
    }

    @Override // c.d.a.b.b.b.a.InterfaceC0043a
    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}

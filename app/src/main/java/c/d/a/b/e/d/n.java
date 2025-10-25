package c.d.a.b.e.d;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<q, List<Throwable>> f3969a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f3970b = new ReferenceQueue<>();

    n() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.f3970b.poll();
        while (referencePoll != null) {
            this.f3969a.remove(referencePoll);
            referencePoll = this.f3970b.poll();
        }
        List<Throwable> list = this.f3969a.get(new q(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f3969a.putIfAbsent(new q(th, this.f3970b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}

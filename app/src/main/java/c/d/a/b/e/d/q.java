package c.d.a.b.e.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class q extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3973a;

    public q(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f3973a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.f3973a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        q qVar = (q) obj;
        return this.f3973a == qVar.f3973a && get() == qVar.get();
    }
}

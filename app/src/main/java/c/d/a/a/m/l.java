package c.d.a.a.m;

import android.os.Handler;
import c.d.a.a.m.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b<T>> f3530a = new CopyOnWriteArrayList<>();

    public interface a<T> {
        void a(T t);
    }

    public void a(Handler handler, T t) {
        AbstractC0170e.a((handler == null || t == null) ? false : true);
        a((l<T>) t);
        this.f3530a.add(new b<>(handler, t));
    }

    public void a(T t) {
        Iterator<b<T>> it = this.f3530a.iterator();
        while (it.hasNext()) {
            b<T> next = it.next();
            if (((b) next).f3532b == t) {
                next.a();
                this.f3530a.remove(next);
            }
        }
    }

    public void a(a<T> aVar) {
        Iterator<b<T>> it = this.f3530a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f3531a;

        /* renamed from: b, reason: collision with root package name */
        private final T f3532b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3533c;

        public b(Handler handler, T t) {
            this.f3531a = handler;
            this.f3532b = t;
        }

        public void a() {
            this.f3533c = true;
        }

        public void a(final a<T> aVar) {
            this.f3531a.post(new Runnable() { // from class: c.d.a.a.m.a
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.a(this.f3508a, aVar);
                }
            });
        }

        public static /* synthetic */ void a(b bVar, a aVar) {
            if (bVar.f3533c) {
                return;
            }
            aVar.a(bVar.f3532b);
        }
    }
}

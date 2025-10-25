package c.d.a.a.i;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.i.w;
import c.d.a.a.i.x;
import c.d.a.a.m.AbstractC0170e;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface x {
    void a(int i2, w.a aVar);

    void a(int i2, w.a aVar, b bVar, c cVar);

    void a(int i2, w.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i2, w.a aVar, c cVar);

    void b(int i2, w.a aVar);

    void b(int i2, w.a aVar, b bVar, c cVar);

    void b(int i2, w.a aVar, c cVar);

    void c(int i2, w.a aVar);

    void c(int i2, w.a aVar, b bVar, c cVar);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c.d.a.a.l.n f3035a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f3036b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f3037c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3038d;

        /* renamed from: e, reason: collision with root package name */
        public final long f3039e;

        /* renamed from: f, reason: collision with root package name */
        public final long f3040f;

        public b(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.f3035a = nVar;
            this.f3036b = uri;
            this.f3037c = map;
            this.f3038d = j;
            this.f3039e = j2;
            this.f3040f = j3;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f3041a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3042b;

        /* renamed from: c, reason: collision with root package name */
        public final c.d.a.a.q f3043c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3044d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f3045e;

        /* renamed from: f, reason: collision with root package name */
        public final long f3046f;

        /* renamed from: g, reason: collision with root package name */
        public final long f3047g;

        public c(int i2, int i3, c.d.a.a.q qVar, int i4, Object obj, long j, long j2) {
            this.f3041a = i2;
            this.f3042b = i3;
            this.f3043c = qVar;
            this.f3044d = i4;
            this.f3045e = obj;
            this.f3046f = j;
            this.f3047g = j2;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3029a;

        /* renamed from: b, reason: collision with root package name */
        public final w.a f3030b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0035a> f3031c;

        /* renamed from: d, reason: collision with root package name */
        private final long f3032d;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0035a> copyOnWriteArrayList, int i2, w.a aVar, long j) {
            this.f3031c = copyOnWriteArrayList;
            this.f3029a = i2;
            this.f3030b = aVar;
            this.f3032d = j;
        }

        public a a(int i2, w.a aVar, long j) {
            return new a(this.f3031c, i2, aVar, j);
        }

        public void a(Handler handler, x xVar) {
            AbstractC0170e.a((handler == null || xVar == null) ? false : true);
            this.f3031c.add(new C0035a(handler, xVar));
        }

        public void a(x xVar) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                if (next.f3034b == xVar) {
                    this.f3031c.remove(next);
                }
            }
        }

        public void a() {
            w.a aVar = this.f3030b;
            AbstractC0170e.a(aVar);
            final w.a aVar2 = aVar;
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.c(this.f2958a.f3029a, aVar2);
                    }
                });
            }
        }

        public void b() {
            w.a aVar = this.f3030b;
            AbstractC0170e.a(aVar);
            final w.a aVar2 = aVar;
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.b(this.f2968a.f3029a, aVar2);
                    }
                });
            }
        }

        public void a(c.d.a.a.l.n nVar, int i2, long j) {
            a(nVar, i2, -1, (c.d.a.a.q) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public void a(c.d.a.a.l.n nVar, int i2, int i3, c.d.a.a.q qVar, int i4, Object obj, long j, long j2, long j3) {
            a(new b(nVar, nVar.f3417a, Collections.emptyMap(), j3, 0L, 0L), new c(i2, i3, qVar, i4, obj, a(j), a(j2)));
        }

        public void a(final b bVar, final c cVar) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a aVar = this.f2964a;
                        xVar.c(aVar.f3029a, aVar.f3030b, bVar, cVar);
                    }
                });
            }
        }

        public void a(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, long j, long j2, long j3) {
            a(nVar, uri, map, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void a(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, int i3, c.d.a.a.q qVar, int i4, Object obj, long j, long j2, long j3, long j4, long j5) {
            b(new b(nVar, uri, map, j3, j4, j5), new c(i2, i3, qVar, i4, obj, a(j), a(j2)));
        }

        public void b(final b bVar, final c cVar) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a aVar = this.f2954a;
                        xVar.a(aVar.f3029a, aVar.f3030b, bVar, cVar);
                    }
                });
            }
        }

        public void b(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, long j, long j2, long j3) {
            b(nVar, uri, map, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void b(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, int i3, c.d.a.a.q qVar, int i4, Object obj, long j, long j2, long j3, long j4, long j5) {
            c(new b(nVar, uri, map, j3, j4, j5), new c(i2, i3, qVar, i4, obj, a(j), a(j2)));
        }

        public void c(final b bVar, final c cVar) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a aVar = this.f2742a;
                        xVar.b(aVar.f3029a, aVar.f3030b, bVar, cVar);
                    }
                });
            }
        }

        public void a(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, long j, long j2, long j3, IOException iOException, boolean z) {
            a(nVar, uri, map, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public void a(c.d.a.a.l.n nVar, Uri uri, Map<String, List<String>> map, int i2, int i3, c.d.a.a.q qVar, int i4, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            a(new b(nVar, uri, map, j3, j4, j5), new c(i2, i3, qVar, i4, obj, a(j), a(j2)), iOException, z);
        }

        public void a(final b bVar, final c cVar, final IOException iOException, final boolean z) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a aVar = this.f2570a;
                        xVar.a(aVar.f3029a, aVar.f3030b, bVar, cVar, iOException, z);
                    }
                });
            }
        }

        public void c() {
            w.a aVar = this.f3030b;
            AbstractC0170e.a(aVar);
            final w.a aVar2 = aVar;
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.a(this.f2961a.f3029a, aVar2);
                    }
                });
            }
        }

        public void a(int i2, long j, long j2) {
            a(new c(1, i2, null, 3, null, a(j), a(j2)));
        }

        public void a(final c cVar) {
            w.a aVar = this.f3030b;
            AbstractC0170e.a(aVar);
            final w.a aVar2 = aVar;
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.a(this.f2875a.f3029a, aVar2, cVar);
                    }
                });
            }
        }

        public void a(int i2, c.d.a.a.q qVar, int i3, Object obj, long j) {
            b(new c(1, i2, qVar, i3, obj, a(j), -9223372036854775807L));
        }

        public void b(final c cVar) {
            Iterator<C0035a> it = this.f3031c.iterator();
            while (it.hasNext()) {
                C0035a next = it.next();
                final x xVar = next.f3034b;
                a(next.f3033a, new Runnable() { // from class: c.d.a.a.i.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a aVar = this.f2951a;
                        xVar.b(aVar.f3029a, aVar.f3030b, cVar);
                    }
                });
            }
        }

        private long a(long j) {
            long jA = AbstractC0132d.a(j);
            if (jA == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f3032d + jA;
        }

        private void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: c.d.a.a.i.x$a$a, reason: collision with other inner class name */
        private static final class C0035a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f3033a;

            /* renamed from: b, reason: collision with root package name */
            public final x f3034b;

            public C0035a(Handler handler, x xVar) {
                this.f3033a = handler;
                this.f3034b = xVar;
            }
        }
    }
}

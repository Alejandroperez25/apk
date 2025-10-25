package c.d.a.a.i;

import android.os.Handler;
import c.d.a.a.M;
import c.d.a.a.l.InterfaceC0161d;

/* loaded from: classes.dex */
public interface w {

    public interface b {
        void a(w wVar, M m, Object obj);
    }

    v a(a aVar, InterfaceC0161d interfaceC0161d, long j);

    void a();

    void a(Handler handler, x xVar);

    void a(v vVar);

    void a(b bVar);

    void a(b bVar, c.d.a.a.l.G g2);

    void a(x xVar);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3024a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3026c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3027d;

        /* renamed from: e, reason: collision with root package name */
        public final long f3028e;

        public a(Object obj) {
            this(obj, -1L);
        }

        public a(Object obj, long j) {
            this(obj, -1, -1, j, Long.MIN_VALUE);
        }

        public a(Object obj, long j, long j2) {
            this(obj, -1, -1, j, j2);
        }

        public a(Object obj, int i2, int i3, long j) {
            this(obj, i2, i3, j, Long.MIN_VALUE);
        }

        private a(Object obj, int i2, int i3, long j, long j2) {
            this.f3024a = obj;
            this.f3025b = i2;
            this.f3026c = i3;
            this.f3027d = j;
            this.f3028e = j2;
        }

        public boolean a() {
            return this.f3025b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3024a.equals(aVar.f3024a) && this.f3025b == aVar.f3025b && this.f3026c == aVar.f3026c && this.f3027d == aVar.f3027d && this.f3028e == aVar.f3028e;
        }

        public int hashCode() {
            return ((((((((527 + this.f3024a.hashCode()) * 31) + this.f3025b) * 31) + this.f3026c) * 31) + ((int) this.f3027d)) * 31) + ((int) this.f3028e);
        }
    }
}

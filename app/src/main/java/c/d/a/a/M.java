package c.d.a.a;

import android.util.Pair;
import c.d.a.a.i.a.a;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f1451a = new L();

    public abstract int a(Object obj);

    public abstract a a(int i2, a aVar, boolean z);

    public abstract b a(int i2, b bVar, boolean z, long j);

    public abstract Object a(int i2);

    public abstract int b();

    public abstract int c();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f1458a;

        /* renamed from: b, reason: collision with root package name */
        public long f1459b;

        /* renamed from: c, reason: collision with root package name */
        public long f1460c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1461d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1462e;

        /* renamed from: f, reason: collision with root package name */
        public int f1463f;

        /* renamed from: g, reason: collision with root package name */
        public int f1464g;

        /* renamed from: h, reason: collision with root package name */
        public long f1465h;

        /* renamed from: i, reason: collision with root package name */
        public long f1466i;
        public long j;

        public b a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i2, int i3, long j5) {
            this.f1458a = obj;
            this.f1459b = j;
            this.f1460c = j2;
            this.f1461d = z;
            this.f1462e = z2;
            this.f1465h = j3;
            this.f1466i = j4;
            this.f1463f = i2;
            this.f1464g = i3;
            this.j = j5;
            return this;
        }

        public long a() {
            return AbstractC0132d.a(this.f1465h);
        }

        public long b() {
            return this.f1465h;
        }

        public long c() {
            return AbstractC0132d.a(this.f1466i);
        }

        public long d() {
            return this.j;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f1452a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1453b;

        /* renamed from: c, reason: collision with root package name */
        public int f1454c;

        /* renamed from: d, reason: collision with root package name */
        public long f1455d;

        /* renamed from: e, reason: collision with root package name */
        private long f1456e;

        /* renamed from: f, reason: collision with root package name */
        private c.d.a.a.i.a.a f1457f;

        public a a(Object obj, Object obj2, int i2, long j, long j2) {
            a(obj, obj2, i2, j, j2, c.d.a.a.i.a.a.f2510a);
            return this;
        }

        public a a(Object obj, Object obj2, int i2, long j, long j2, c.d.a.a.i.a.a aVar) {
            this.f1452a = obj;
            this.f1453b = obj2;
            this.f1454c = i2;
            this.f1455d = j;
            this.f1456e = j2;
            this.f1457f = aVar;
            return this;
        }

        public long a() {
            return this.f1455d;
        }

        public long b() {
            return AbstractC0132d.a(this.f1456e);
        }

        public int c() {
            return this.f1457f.f2511b;
        }

        public long a(int i2) {
            return this.f1457f.f2512c[i2];
        }

        public int b(int i2) {
            return this.f1457f.f2513d[i2].a();
        }

        public int a(int i2, int i3) {
            return this.f1457f.f2513d[i2].a(i3);
        }

        public boolean c(int i2) {
            return !this.f1457f.f2513d[i2].b();
        }

        public int a(long j) {
            return this.f1457f.a(j);
        }

        public int b(long j) {
            return this.f1457f.b(j);
        }

        public int d(int i2) {
            return this.f1457f.f2513d[i2].f2516a;
        }

        public boolean b(int i2, int i3) {
            a.C0030a c0030a = this.f1457f.f2513d[i2];
            return (c0030a.f2516a == -1 || c0030a.f2518c[i3] == 0) ? false : true;
        }

        public long c(int i2, int i3) {
            a.C0030a c0030a = this.f1457f.f2513d[i2];
            if (c0030a.f2516a != -1) {
                return c0030a.f2519d[i3];
            }
            return -9223372036854775807L;
        }

        public long d() {
            return this.f1457f.f2514e;
        }
    }

    public final boolean a() {
        return b() == 0;
    }

    public int a(int i2, int i3, boolean z) {
        switch (i3) {
            case 0:
                if (i2 == a(z)) {
                    return -1;
                }
                return i2 + 1;
            case 1:
                return i2;
            case 2:
                return i2 == a(z) ? b(z) : i2 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public int a(boolean z) {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(boolean z) {
        return a() ? -1 : 0;
    }

    public final b a(int i2, b bVar) {
        return a(i2, bVar, false);
    }

    public final b a(int i2, b bVar, boolean z) {
        return a(i2, bVar, z, 0L);
    }

    public final int a(int i2, a aVar, b bVar, int i3, boolean z) {
        int i4 = a(i2, aVar).f1454c;
        if (a(i4, bVar).f1464g != i2) {
            return i2 + 1;
        }
        int iA = a(i4, i3, z);
        if (iA == -1) {
            return -1;
        }
        return a(iA, bVar).f1463f;
    }

    public final boolean b(int i2, a aVar, b bVar, int i3, boolean z) {
        return a(i2, aVar, bVar, i3, z) == -1;
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i2, long j) {
        return a(bVar, aVar, i2, j, 0L);
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i2, long j, long j2) {
        AbstractC0170e.a(i2, 0, b());
        a(i2, bVar, false, j2);
        if (j == -9223372036854775807L) {
            j = bVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = bVar.f1463f;
        long jD = bVar.d() + j;
        long jA = a(i3, aVar, true).a();
        while (jA != -9223372036854775807L && jD >= jA && i3 < bVar.f1464g) {
            jD -= jA;
            i3++;
            jA = a(i3, aVar, true).a();
        }
        return Pair.create(aVar.f1453b, Long.valueOf(jD));
    }

    public a a(Object obj, a aVar) {
        return a(a(obj), aVar, true);
    }

    public final a a(int i2, a aVar) {
        return a(i2, aVar, false);
    }
}

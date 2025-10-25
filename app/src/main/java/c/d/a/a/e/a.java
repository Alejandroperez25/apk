package c.d.a.a.e;

import c.d.a.a.e.o;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0026a f1723a;

    /* renamed from: b, reason: collision with root package name */
    protected final g f1724b;

    /* renamed from: c, reason: collision with root package name */
    protected d f1725c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1726d;

    public static final class b implements e {
        @Override // c.d.a.a.e.a.e
        public long a(long j) {
            return j;
        }
    }

    public static final class c {
    }

    protected interface e {
        long a(long j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface g {
        f a(h hVar, long j, c cVar);

        void a();
    }

    protected void b(boolean z, long j) {
    }

    protected a(e eVar, g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.f1724b = gVar;
        this.f1726d = i2;
        this.f1723a = new C0026a(eVar, j, j2, j3, j4, j5, j6);
    }

    public final o a() {
        return this.f1723a;
    }

    public final void a(long j) {
        if (this.f1725c == null || this.f1725c.d() != j) {
            this.f1725c = b(j);
        }
    }

    public final boolean b() {
        return this.f1725c != null;
    }

    public int a(h hVar, n nVar, c cVar) {
        g gVar = this.f1724b;
        AbstractC0170e.a(gVar);
        g gVar2 = gVar;
        while (true) {
            d dVar = this.f1725c;
            AbstractC0170e.a(dVar);
            d dVar2 = dVar;
            long jA = dVar2.a();
            long jB = dVar2.b();
            long jE = dVar2.e();
            if (jB - jA <= this.f1726d) {
                a(false, jA);
                return a(hVar, jA, nVar);
            }
            if (!a(hVar, jE)) {
                return a(hVar, jE, nVar);
            }
            hVar.b();
            f fVarA = gVar2.a(hVar, dVar2.c(), cVar);
            switch (fVarA.f1753b) {
                case -3:
                    a(false, jE);
                    return a(hVar, jE, nVar);
                case -2:
                    dVar2.a(fVarA.f1754c, fVarA.f1755d);
                    break;
                case -1:
                    dVar2.b(fVarA.f1754c, fVarA.f1755d);
                    break;
                case 0:
                    a(true, fVarA.f1755d);
                    a(hVar, fVarA.f1755d);
                    return a(hVar, fVarA.f1755d, nVar);
                default:
                    throw new IllegalStateException("Invalid case");
            }
        }
    }

    protected d b(long j) {
        this.f1723a.c(j);
        return new d(j, j, this.f1723a.f1729c, this.f1723a.f1730d, this.f1723a.f1731e, this.f1723a.f1732f, this.f1723a.f1733g);
    }

    protected final void a(boolean z, long j) {
        this.f1725c = null;
        this.f1724b.a();
        b(z, j);
    }

    protected final boolean a(h hVar, long j) {
        long jC = j - hVar.c();
        if (jC < 0 || jC > 262144) {
            return false;
        }
        hVar.c((int) jC);
        return true;
    }

    protected final int a(h hVar, long j, n nVar) {
        if (j == hVar.c()) {
            return 0;
        }
        nVar.f2349a = j;
        return 1;
    }

    protected static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f1744a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1745b;

        /* renamed from: c, reason: collision with root package name */
        private final long f1746c;

        /* renamed from: d, reason: collision with root package name */
        private long f1747d;

        /* renamed from: e, reason: collision with root package name */
        private long f1748e;

        /* renamed from: f, reason: collision with root package name */
        private long f1749f;

        /* renamed from: g, reason: collision with root package name */
        private long f1750g;

        /* renamed from: h, reason: collision with root package name */
        private long f1751h;

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return H.a(((j4 + j7) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f1744a = j;
            this.f1745b = j2;
            this.f1747d = j3;
            this.f1748e = j4;
            this.f1749f = j5;
            this.f1750g = j6;
            this.f1746c = j7;
            this.f1751h = a(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f1749f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f1750g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f1745b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f1744a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.f1747d = j;
            this.f1749f = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j, long j2) {
            this.f1748e = j;
            this.f1750g = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.f1751h;
        }

        private void f() {
            this.f1751h = a(this.f1745b, this.f1747d, this.f1748e, this.f1749f, this.f1750g, this.f1746c);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1752a = new f(-3, -9223372036854775807L, -1);

        /* renamed from: b, reason: collision with root package name */
        private final int f1753b;

        /* renamed from: c, reason: collision with root package name */
        private final long f1754c;

        /* renamed from: d, reason: collision with root package name */
        private final long f1755d;

        private f(int i2, long j, long j2) {
            this.f1753b = i2;
            this.f1754c = j;
            this.f1755d = j2;
        }

        public static f a(long j, long j2) {
            return new f(-1, j, j2);
        }

        public static f b(long j, long j2) {
            return new f(-2, j, j2);
        }

        public static f a(long j) {
            return new f(0, -9223372036854775807L, j);
        }
    }

    /* renamed from: c.d.a.a.e.a$a, reason: collision with other inner class name */
    public static class C0026a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final e f1727a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1728b;

        /* renamed from: c, reason: collision with root package name */
        private final long f1729c;

        /* renamed from: d, reason: collision with root package name */
        private final long f1730d;

        /* renamed from: e, reason: collision with root package name */
        private final long f1731e;

        /* renamed from: f, reason: collision with root package name */
        private final long f1732f;

        /* renamed from: g, reason: collision with root package name */
        private final long f1733g;

        @Override // c.d.a.a.e.o
        public boolean c() {
            return true;
        }

        public C0026a(e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f1727a = eVar;
            this.f1728b = j;
            this.f1729c = j2;
            this.f1730d = j3;
            this.f1731e = j4;
            this.f1732f = j5;
            this.f1733g = j6;
        }

        @Override // c.d.a.a.e.o
        public o.a b(long j) {
            this.f1727a.a(j);
            return new o.a(new p(j, d.a(j, this.f1729c, this.f1730d, this.f1731e, this.f1732f, this.f1733g)));
        }

        @Override // c.d.a.a.e.o
        public long d() {
            return this.f1728b;
        }

        public long c(long j) {
            this.f1727a.a(j);
            return j;
        }
    }
}

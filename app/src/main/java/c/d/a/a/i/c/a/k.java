package c.d.a.a.i.c.a;

import c.d.a.a.m.H;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    final h f2634a;

    /* renamed from: b, reason: collision with root package name */
    final long f2635b;

    /* renamed from: c, reason: collision with root package name */
    final long f2636c;

    public k(h hVar, long j, long j2) {
        this.f2634a = hVar;
        this.f2635b = j;
        this.f2636c = j2;
    }

    public h a(j jVar) {
        return this.f2634a;
    }

    public long a() {
        return H.d(this.f2636c, 1000000L, this.f2635b);
    }

    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f2645d;

        /* renamed from: e, reason: collision with root package name */
        final long f2646e;

        public e(h hVar, long j, long j2, long j3, long j4) {
            super(hVar, j, j2);
            this.f2645d = j3;
            this.f2646e = j4;
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public h b() {
            if (this.f2646e <= 0) {
                return null;
            }
            return new h(null, this.f2645d, this.f2646e);
        }
    }

    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f2637d;

        /* renamed from: e, reason: collision with root package name */
        final long f2638e;

        /* renamed from: f, reason: collision with root package name */
        final List<d> f2639f;

        public abstract h a(j jVar, long j);

        public abstract int b(long j);

        public a(h hVar, long j, long j2, long j3, long j4, List<d> list) {
            super(hVar, j, j2);
            this.f2637d = j3;
            this.f2638e = j4;
            this.f2639f = list;
        }

        public long a(long j, long j2) {
            long jB = b();
            long jB2 = b(j2);
            if (jB2 == 0) {
                return jB;
            }
            if (this.f2639f == null) {
                long j3 = (j / ((this.f2638e * 1000000) / this.f2635b)) + this.f2637d;
                return j3 < jB ? jB : jB2 == -1 ? j3 : Math.min(j3, (jB + jB2) - 1);
            }
            long j4 = (jB2 + jB) - 1;
            long j5 = jB;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long jA = a(j6);
                if (jA < j) {
                    j5 = j6 + 1;
                } else {
                    if (jA <= j) {
                        return j6;
                    }
                    j4 = j6 - 1;
                }
            }
            return j5 == jB ? j5 : j4;
        }

        public final long b(long j, long j2) {
            if (this.f2639f != null) {
                return (this.f2639f.get((int) (j - this.f2637d)).f2644b * 1000000) / this.f2635b;
            }
            int iB = b(j2);
            return (iB == -1 || j != (b() + ((long) iB)) - 1) ? (this.f2638e * 1000000) / this.f2635b : j2 - a(j);
        }

        public final long a(long j) {
            long j2;
            if (this.f2639f != null) {
                j2 = this.f2639f.get((int) (j - this.f2637d)).f2643a - this.f2636c;
            } else {
                j2 = (j - this.f2637d) * this.f2638e;
            }
            return H.d(j2, 1000000L, this.f2635b);
        }

        public long b() {
            return this.f2637d;
        }

        public boolean c() {
            return this.f2639f != null;
        }
    }

    public static class b extends a {

        /* renamed from: g, reason: collision with root package name */
        final List<h> f2640g;

        @Override // c.d.a.a.i.c.a.k.a
        public boolean c() {
            return true;
        }

        public b(h hVar, long j, long j2, long j3, long j4, List<d> list, List<h> list2) {
            super(hVar, j, j2, j3, j4, list);
            this.f2640g = list2;
        }

        @Override // c.d.a.a.i.c.a.k.a
        public h a(j jVar, long j) {
            return this.f2640g.get((int) (j - this.f2637d));
        }

        @Override // c.d.a.a.i.c.a.k.a
        public int b(long j) {
            return this.f2640g.size();
        }
    }

    public static class c extends a {

        /* renamed from: g, reason: collision with root package name */
        final m f2641g;

        /* renamed from: h, reason: collision with root package name */
        final m f2642h;

        public c(h hVar, long j, long j2, long j3, long j4, List<d> list, m mVar, m mVar2) {
            super(hVar, j, j2, j3, j4, list);
            this.f2641g = mVar;
            this.f2642h = mVar2;
        }

        @Override // c.d.a.a.i.c.a.k
        public h a(j jVar) {
            if (this.f2641g != null) {
                return new h(this.f2641g.a(jVar.f2626c.f3676a, 0L, jVar.f2626c.f3678c, 0L), 0L, -1L);
            }
            return super.a(jVar);
        }

        @Override // c.d.a.a.i.c.a.k.a
        public h a(j jVar, long j) {
            long j2;
            if (this.f2639f != null) {
                j2 = this.f2639f.get((int) (j - this.f2637d)).f2643a;
            } else {
                j2 = (j - this.f2637d) * this.f2638e;
            }
            return new h(this.f2642h.a(jVar.f2626c.f3676a, j, jVar.f2626c.f3678c, j2), 0L, -1L);
        }

        @Override // c.d.a.a.i.c.a.k.a
        public int b(long j) {
            if (this.f2639f != null) {
                return this.f2639f.size();
            }
            if (j != -9223372036854775807L) {
                return (int) H.a(j, (this.f2638e * 1000000) / this.f2635b);
            }
            return -1;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final long f2643a;

        /* renamed from: b, reason: collision with root package name */
        final long f2644b;

        public d(long j, long j2) {
            this.f2643a = j;
            this.f2644b = j2;
        }
    }
}

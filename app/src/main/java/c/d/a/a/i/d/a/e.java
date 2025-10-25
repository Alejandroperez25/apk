package c.d.a.a.i.d.a;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public final int f2775d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2776e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2777f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2778g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2779h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2780i;
    public final int j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final c.d.a.a.d.f n;
    public final List<a> o;
    public final long p;

    public e b(List<c.d.a.a.h.c> list) {
        return this;
    }

    @Override // c.d.a.a.h.a
    public /* bridge */ /* synthetic */ f a(List list) {
        b(list);
        return this;
    }

    public static final class a implements Comparable<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final String f2781a;

        /* renamed from: b, reason: collision with root package name */
        public final a f2782b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2783c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2784d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2785e;

        /* renamed from: f, reason: collision with root package name */
        public final long f2786f;

        /* renamed from: g, reason: collision with root package name */
        public final c.d.a.a.d.f f2787g;

        /* renamed from: h, reason: collision with root package name */
        public final String f2788h;

        /* renamed from: i, reason: collision with root package name */
        public final String f2789i;
        public final long j;
        public final long k;
        public final boolean l;

        public a(String str, long j, long j2) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, null, null, j, j2, false);
        }

        public a(String str, a aVar, String str2, long j, int i2, long j2, c.d.a.a.d.f fVar, String str3, String str4, long j3, long j4, boolean z) {
            this.f2781a = str;
            this.f2782b = aVar;
            this.f2784d = str2;
            this.f2783c = j;
            this.f2785e = i2;
            this.f2786f = j2;
            this.f2787g = fVar;
            this.f2788h = str3;
            this.f2789i = str4;
            this.j = j3;
            this.k = j4;
            this.l = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.f2786f > l.longValue()) {
                return 1;
            }
            return this.f2786f < l.longValue() ? -1 : 0;
        }
    }

    public e(int i2, String str, List<String> list, long j, long j2, boolean z, int i3, long j3, int i4, long j4, boolean z2, boolean z3, boolean z4, c.d.a.a.d.f fVar, List<a> list2) {
        long j5;
        super(str, list, z2);
        this.f2775d = i2;
        this.f2777f = j2;
        this.f2778g = z;
        this.f2779h = i3;
        this.f2780i = j3;
        this.j = i4;
        this.k = j4;
        this.l = z3;
        this.m = z4;
        this.n = fVar;
        this.o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            a aVar = list2.get(list2.size() - 1);
            this.p = aVar.f2786f + aVar.f2783c;
        } else {
            this.p = 0L;
        }
        if (j == -9223372036854775807L) {
            j5 = -9223372036854775807L;
        } else {
            j5 = j >= 0 ? j : this.p + j;
        }
        this.f2776e = j5;
    }

    public boolean a(e eVar) {
        if (eVar == null || this.f2780i > eVar.f2780i) {
            return true;
        }
        if (this.f2780i < eVar.f2780i) {
            return false;
        }
        int size = this.o.size();
        int size2 = eVar.o.size();
        if (size <= size2) {
            return size == size2 && this.l && !eVar.l;
        }
        return true;
    }

    public long a() {
        return this.f2777f + this.p;
    }

    public e a(long j, int i2) {
        return new e(this.f2775d, this.f2790a, this.f2791b, this.f2776e, j, true, i2, this.f2780i, this.j, this.k, this.f2792c, this.l, this.m, this.n, this.o);
    }

    public e b() {
        return this.l ? this : new e(this.f2775d, this.f2790a, this.f2791b, this.f2776e, this.f2777f, this.f2778g, this.f2779h, this.f2780i, this.j, this.k, this.f2792c, true, this.m, this.n, this.o);
    }
}

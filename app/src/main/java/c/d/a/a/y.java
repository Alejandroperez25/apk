package c.d.a.a;

import c.d.a.a.M;
import c.d.a.a.i.w;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final w.a f3713a = new w.a(new Object());

    /* renamed from: b, reason: collision with root package name */
    public final M f3714b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3715c;

    /* renamed from: d, reason: collision with root package name */
    public final w.a f3716d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3717e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3718f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3719g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3720h;

    /* renamed from: i, reason: collision with root package name */
    public final c.d.a.a.i.G f3721i;
    public final c.d.a.a.k.l j;
    public final w.a k;
    public volatile long l;
    public volatile long m;
    public volatile long n;

    public static y a(long j, c.d.a.a.k.l lVar) {
        return new y(M.f1451a, null, f3713a, j, -9223372036854775807L, 1, false, c.d.a.a.i.G.f2504a, lVar, f3713a, j, 0L, j);
    }

    public y(M m, Object obj, w.a aVar, long j, long j2, int i2, boolean z, c.d.a.a.i.G g2, c.d.a.a.k.l lVar, w.a aVar2, long j3, long j4, long j5) {
        this.f3714b = m;
        this.f3715c = obj;
        this.f3716d = aVar;
        this.f3717e = j;
        this.f3718f = j2;
        this.f3719g = i2;
        this.f3720h = z;
        this.f3721i = g2;
        this.j = lVar;
        this.k = aVar2;
        this.l = j3;
        this.m = j4;
        this.n = j5;
    }

    public w.a a(boolean z, M.b bVar) {
        if (this.f3714b.a()) {
            return f3713a;
        }
        return new w.a(this.f3714b.a(this.f3714b.a(this.f3714b.b(z), bVar).f1463f));
    }

    public y a(w.a aVar, long j, long j2) {
        return new y(this.f3714b, this.f3715c, aVar, j, aVar.a() ? j2 : -9223372036854775807L, this.f3719g, this.f3720h, this.f3721i, this.j, aVar, j, 0L, j);
    }

    public y a(w.a aVar, long j, long j2, long j3) {
        return new y(this.f3714b, this.f3715c, aVar, j, aVar.a() ? j2 : -9223372036854775807L, this.f3719g, this.f3720h, this.f3721i, this.j, this.k, this.l, j3, j);
    }

    public y a(M m, Object obj) {
        return new y(m, obj, this.f3716d, this.f3717e, this.f3718f, this.f3719g, this.f3720h, this.f3721i, this.j, this.k, this.l, this.m, this.n);
    }

    public y a(int i2) {
        return new y(this.f3714b, this.f3715c, this.f3716d, this.f3717e, this.f3718f, i2, this.f3720h, this.f3721i, this.j, this.k, this.l, this.m, this.n);
    }

    public y a(boolean z) {
        return new y(this.f3714b, this.f3715c, this.f3716d, this.f3717e, this.f3718f, this.f3719g, z, this.f3721i, this.j, this.k, this.l, this.m, this.n);
    }

    public y a(c.d.a.a.i.G g2, c.d.a.a.k.l lVar) {
        return new y(this.f3714b, this.f3715c, this.f3716d, this.f3717e, this.f3718f, this.f3719g, this.f3720h, g2, lVar, this.k, this.l, this.m, this.n);
    }

    public y a(w.a aVar) {
        return new y(this.f3714b, this.f3715c, this.f3716d, this.f3717e, this.f3718f, this.f3719g, this.f3720h, this.f3721i, this.j, aVar, this.l, this.m, this.n);
    }
}

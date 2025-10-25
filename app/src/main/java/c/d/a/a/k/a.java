package c.d.a.a.k;

import c.d.a.a.i.E;
import c.d.a.a.i.b.n;
import c.d.a.a.k.i;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.H;
import c.d.a.a.m.InterfaceC0171f;
import c.d.a.a.q;
import java.util.List;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0163f f3276g;

    /* renamed from: h, reason: collision with root package name */
    private final long f3277h;

    /* renamed from: i, reason: collision with root package name */
    private final long f3278i;
    private final long j;
    private final float k;
    private final float l;
    private final long m;
    private final InterfaceC0171f n;
    private float o;
    private int p;
    private int q;
    private long r;

    @Override // c.d.a.a.k.i
    public Object h() {
        return null;
    }

    /* renamed from: c.d.a.a.k.a$a, reason: collision with other inner class name */
    public static final class C0041a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0163f f3279a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3280b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3281c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3282d;

        /* renamed from: e, reason: collision with root package name */
        private final float f3283e;

        /* renamed from: f, reason: collision with root package name */
        private final float f3284f;

        /* renamed from: g, reason: collision with root package name */
        private final long f3285g;

        /* renamed from: h, reason: collision with root package name */
        private final InterfaceC0171f f3286h;

        public C0041a() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0171f.f3513a);
        }

        public C0041a(int i2, int i3, int i4, float f2, float f3, long j, InterfaceC0171f interfaceC0171f) {
            this(null, i2, i3, i4, f2, f3, j, interfaceC0171f);
        }

        @Deprecated
        public C0041a(InterfaceC0163f interfaceC0163f, int i2, int i3, int i4, float f2, float f3, long j, InterfaceC0171f interfaceC0171f) {
            this.f3279a = interfaceC0163f;
            this.f3280b = i2;
            this.f3281c = i3;
            this.f3282d = i4;
            this.f3283e = f2;
            this.f3284f = f3;
            this.f3285g = j;
            this.f3286h = interfaceC0171f;
        }

        @Override // c.d.a.a.k.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(E e2, InterfaceC0163f interfaceC0163f, int... iArr) {
            return new a(e2, iArr, this.f3279a != null ? this.f3279a : interfaceC0163f, this.f3280b, this.f3281c, this.f3282d, this.f3283e, this.f3284f, this.f3285g, this.f3286h);
        }
    }

    public a(E e2, int[] iArr, InterfaceC0163f interfaceC0163f, long j, long j2, long j3, float f2, float f3, long j4, InterfaceC0171f interfaceC0171f) {
        super(e2, iArr);
        this.f3276g = interfaceC0163f;
        this.f3277h = j * 1000;
        this.f3278i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = f2;
        this.l = f3;
        this.m = j4;
        this.n = interfaceC0171f;
        this.o = 1.0f;
        this.q = 1;
        this.r = -9223372036854775807L;
        this.p = a(Long.MIN_VALUE);
    }

    @Override // c.d.a.a.k.c, c.d.a.a.k.i
    public void c() {
        this.r = -9223372036854775807L;
    }

    @Override // c.d.a.a.k.c, c.d.a.a.k.i
    public void a(float f2) {
        this.o = f2;
    }

    @Override // c.d.a.a.k.i
    public void a(long j, long j2, long j3, List<? extends c.d.a.a.i.b.l> list, n[] nVarArr) {
        long jB = this.n.b();
        int i2 = this.p;
        this.p = a(jB);
        if (this.p == i2) {
            return;
        }
        if (!b(i2, jB)) {
            q qVarA = a(i2);
            q qVarA2 = a(this.p);
            if (qVarA2.f3678c > qVarA.f3678c && j2 < b(j3)) {
                this.p = i2;
            } else if (qVarA2.f3678c < qVarA.f3678c && j2 >= this.f3278i) {
                this.p = i2;
            }
        }
        if (this.p != i2) {
            this.q = 3;
        }
    }

    @Override // c.d.a.a.k.i
    public int b() {
        return this.p;
    }

    @Override // c.d.a.a.k.i
    public int g() {
        return this.q;
    }

    @Override // c.d.a.a.k.c, c.d.a.a.k.i
    public int a(long j, List<? extends c.d.a.a.i.b.l> list) {
        long jB = this.n.b();
        if (this.r != -9223372036854775807L && jB - this.r < this.m) {
            return list.size();
        }
        this.r = jB;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (H.b(list.get(size - 1).f2531f - j, this.o) < this.j) {
            return size;
        }
        q qVarA = a(a(jB));
        for (int i2 = 0; i2 < size; i2++) {
            c.d.a.a.i.b.l lVar = list.get(i2);
            q qVar = lVar.f2528c;
            if (H.b(lVar.f2531f - j, this.o) >= this.j && qVar.f3678c < qVarA.f3678c && qVar.m != -1 && qVar.m < 720 && qVar.l != -1 && qVar.l < 1280 && qVar.m < qVarA.m) {
                return i2;
            }
        }
        return size;
    }

    private int a(long j) {
        long jB = (long) (this.f3276g.b() * this.k);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3288b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (Math.round(a(i3).f3678c * this.o) <= jB) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private long b(long j) {
        return (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1)) != 0 && (j > this.f3277h ? 1 : (j == this.f3277h ? 0 : -1)) <= 0 ? (long) (j * this.l) : this.f3277h;
    }
}

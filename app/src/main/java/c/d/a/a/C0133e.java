package c.d.a.a;

import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.AbstractC0170e;

/* renamed from: c.d.a.a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0133e implements t {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.l.o f1714a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1715b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1716c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1717d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1718e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1719f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1720g;

    /* renamed from: h, reason: collision with root package name */
    private final c.d.a.a.m.x f1721h;

    /* renamed from: i, reason: collision with root package name */
    private final long f1722i;
    private final boolean j;
    private int k;
    private boolean l;

    public C0133e() {
        this(new c.d.a.a.l.o(true, 65536));
    }

    @Deprecated
    public C0133e(c.d.a.a.l.o oVar) {
        this(oVar, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public C0133e(c.d.a.a.l.o oVar, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(oVar, i2, i3, i4, i5, i6, z, null);
    }

    @Deprecated
    public C0133e(c.d.a.a.l.o oVar, int i2, int i3, int i4, int i5, int i6, boolean z, c.d.a.a.m.x xVar) {
        this(oVar, i2, i3, i4, i5, i6, z, xVar, 0, false);
    }

    protected C0133e(c.d.a.a.l.o oVar, int i2, int i3, int i4, int i5, int i6, boolean z, c.d.a.a.m.x xVar, int i7, boolean z2) {
        a(i4, 0, "bufferForPlaybackMs", "0");
        a(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i2, "maxBufferMs", "minBufferMs");
        a(i7, 0, "backBufferDurationMs", "0");
        this.f1714a = oVar;
        this.f1715b = AbstractC0132d.b(i2);
        this.f1716c = AbstractC0132d.b(i3);
        this.f1717d = AbstractC0132d.b(i4);
        this.f1718e = AbstractC0132d.b(i5);
        this.f1719f = i6;
        this.f1720g = z;
        this.f1721h = xVar;
        this.f1722i = AbstractC0132d.b(i7);
        this.j = z2;
    }

    @Override // c.d.a.a.t
    public void a() {
        a(false);
    }

    @Override // c.d.a.a.t
    public void a(E[] eArr, c.d.a.a.i.G g2, c.d.a.a.k.j jVar) {
        this.k = this.f1719f == -1 ? a(eArr, jVar) : this.f1719f;
        this.f1714a.a(this.k);
    }

    @Override // c.d.a.a.t
    public void f() {
        a(true);
    }

    @Override // c.d.a.a.t
    public void d() {
        a(true);
    }

    @Override // c.d.a.a.t
    public InterfaceC0161d e() {
        return this.f1714a;
    }

    @Override // c.d.a.a.t
    public long c() {
        return this.f1722i;
    }

    @Override // c.d.a.a.t
    public boolean b() {
        return this.j;
    }

    @Override // c.d.a.a.t
    public boolean a(long j, float f2) {
        boolean z = true;
        boolean z2 = this.f1714a.e() >= this.k;
        boolean z3 = this.l;
        long jMin = this.f1715b;
        if (f2 > 1.0f) {
            jMin = Math.min(c.d.a.a.m.H.a(jMin, f2), this.f1716c);
        }
        if (j < jMin) {
            if (!this.f1720g && z2) {
                z = false;
            }
            this.l = z;
        } else if (j >= this.f1716c || z2) {
            this.l = false;
        }
        if (this.f1721h != null && this.l != z3) {
            if (this.l) {
                this.f1721h.a(0);
            } else {
                this.f1721h.b(0);
            }
        }
        return this.l;
    }

    @Override // c.d.a.a.t
    public boolean a(long j, float f2, boolean z) {
        long jB = c.d.a.a.m.H.b(j, f2);
        long j2 = z ? this.f1718e : this.f1717d;
        return j2 <= 0 || jB >= j2 || (!this.f1720g && this.f1714a.e() >= this.k);
    }

    protected int a(E[] eArr, c.d.a.a.k.j jVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < eArr.length; i3++) {
            if (jVar.a(i3) != null) {
                i2 += c.d.a.a.m.H.i(eArr[i3].g());
            }
        }
        return i2;
    }

    private void a(boolean z) {
        this.k = 0;
        if (this.f1721h != null && this.l) {
            this.f1721h.b(0);
        }
        this.l = false;
        if (z) {
            this.f1714a.d();
        }
    }

    private static void a(int i2, int i3, String str, String str2) {
        AbstractC0170e.a(i2 >= i3, str + " cannot be less than " + str2);
    }
}

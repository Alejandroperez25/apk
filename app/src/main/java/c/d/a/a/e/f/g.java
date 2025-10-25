package c.d.a.a.e.f;

import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.io.EOFException;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2030a = H.h("OggS");

    /* renamed from: b, reason: collision with root package name */
    public int f2031b;

    /* renamed from: c, reason: collision with root package name */
    public int f2032c;

    /* renamed from: d, reason: collision with root package name */
    public long f2033d;

    /* renamed from: e, reason: collision with root package name */
    public long f2034e;

    /* renamed from: f, reason: collision with root package name */
    public long f2035f;

    /* renamed from: g, reason: collision with root package name */
    public long f2036g;

    /* renamed from: h, reason: collision with root package name */
    public int f2037h;

    /* renamed from: i, reason: collision with root package name */
    public int f2038i;
    public int j;
    public final int[] k = new int[255];
    private final u l = new u(255);

    g() {
    }

    public void a() {
        this.f2031b = 0;
        this.f2032c = 0;
        this.f2033d = 0L;
        this.f2034e = 0L;
        this.f2035f = 0L;
        this.f2036g = 0L;
        this.f2037h = 0;
        this.f2038i = 0;
        this.j = 0;
    }

    public boolean a(c.d.a.a.e.h hVar, boolean z) throws x, EOFException {
        this.l.a();
        a();
        if (!(hVar.getLength() == -1 || hVar.getLength() - hVar.a() >= 27) || !hVar.b(this.l.f3567a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (this.l.n() != f2030a) {
            if (z) {
                return false;
            }
            throw new x("expected OggS capture pattern at begin of page");
        }
        this.f2031b = this.l.h();
        if (this.f2031b != 0) {
            if (z) {
                return false;
            }
            throw new x("unsupported bit stream revision");
        }
        this.f2032c = this.l.h();
        this.f2033d = this.l.s();
        this.f2034e = this.l.o();
        this.f2035f = this.l.o();
        this.f2036g = this.l.o();
        this.f2037h = this.l.h();
        this.f2038i = this.f2037h + 27;
        this.l.a();
        hVar.a(this.l.f3567a, 0, this.f2037h);
        for (int i2 = 0; i2 < this.f2037h; i2++) {
            this.k[i2] = this.l.h();
            this.j += this.k[i2];
        }
        return true;
    }
}

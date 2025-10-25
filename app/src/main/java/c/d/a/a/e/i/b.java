package c.d.a.a.e.i;

import c.d.a.a.d.f;
import c.d.a.a.e.g;
import c.d.a.a.e.h;
import c.d.a.a.e.i;
import c.d.a.a.e.j;
import c.d.a.a.e.n;
import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.x;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2320a = new j() { // from class: c.d.a.a.e.i.a
        @Override // c.d.a.a.e.j
        public final g[] a() {
            return b.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private i f2321b;

    /* renamed from: c, reason: collision with root package name */
    private q f2322c;

    /* renamed from: d, reason: collision with root package name */
    private c f2323d;

    /* renamed from: e, reason: collision with root package name */
    private int f2324e;

    /* renamed from: f, reason: collision with root package name */
    private int f2325f;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ g[] b() {
        return new g[]{new b()};
    }

    @Override // c.d.a.a.e.g
    public boolean a(h hVar) {
        return d.a(hVar) != null;
    }

    @Override // c.d.a.a.e.g
    public void a(i iVar) {
        this.f2321b = iVar;
        this.f2322c = iVar.a(0, 1);
        this.f2323d = null;
        iVar.a();
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.f2325f = 0;
    }

    @Override // c.d.a.a.e.g
    public int a(h hVar, n nVar) throws x {
        if (this.f2323d == null) {
            this.f2323d = d.a(hVar);
            if (this.f2323d == null) {
                throw new x("Unsupported or unrecognized wav header.");
            }
            this.f2322c.a(c.d.a.a.q.a((String) null, "audio/raw", (String) null, this.f2323d.g(), 32768, this.f2323d.i(), this.f2323d.h(), this.f2323d.j(), (List<byte[]>) null, (f) null, 0, (String) null));
            this.f2324e = this.f2323d.f();
        }
        if (!this.f2323d.e()) {
            d.a(hVar, this.f2323d);
            this.f2321b.a(this.f2323d);
        }
        long jA = this.f2323d.a();
        AbstractC0170e.b(jA != -1);
        long jC = jA - hVar.c();
        if (jC <= 0) {
            return -1;
        }
        int iA = this.f2322c.a(hVar, (int) Math.min(32768 - this.f2325f, jC), true);
        if (iA != -1) {
            this.f2325f += iA;
        }
        int i2 = this.f2325f / this.f2324e;
        if (i2 > 0) {
            long jA2 = this.f2323d.a(hVar.c() - this.f2325f);
            int i3 = i2 * this.f2324e;
            this.f2325f -= i3;
            this.f2322c.a(jA2, 1, i3, this.f2325f, null);
        }
        return iA == -1 ? -1 : 0;
    }
}

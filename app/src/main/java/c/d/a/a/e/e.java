package c.d.a.a.e;

import c.d.a.a.e.h.C0138e;
import c.d.a.a.e.h.C0140g;
import c.d.a.a.e.h.F;
import c.d.a.a.e.h.y;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final Constructor<? extends g> f1861a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1862b;

    /* renamed from: c, reason: collision with root package name */
    private int f1863c;

    /* renamed from: d, reason: collision with root package name */
    private int f1864d;

    /* renamed from: e, reason: collision with root package name */
    private int f1865e;

    /* renamed from: f, reason: collision with root package name */
    private int f1866f;

    /* renamed from: g, reason: collision with root package name */
    private int f1867g;

    /* renamed from: h, reason: collision with root package name */
    private int f1868h;

    /* renamed from: i, reason: collision with root package name */
    private int f1869i = 1;
    private int j;

    static {
        Constructor<? extends g> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(g.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f1861a = constructor;
    }

    @Override // c.d.a.a.e.j
    public synchronized g[] a() {
        g[] gVarArr;
        gVarArr = new g[f1861a == null ? 12 : 13];
        gVarArr[0] = new c.d.a.a.e.c.g(this.f1865e);
        gVarArr[1] = new c.d.a.a.e.e.h(this.f1867g);
        gVarArr[2] = new c.d.a.a.e.e.l(this.f1866f);
        gVarArr[3] = new c.d.a.a.e.d.e(this.f1868h | (this.f1862b ? 1 : 0));
        gVarArr[4] = new C0140g(0L, this.f1863c | (this.f1862b ? 1 : 0));
        gVarArr[5] = new C0138e();
        gVarArr[6] = new F(this.f1869i, this.j);
        gVarArr[7] = new c.d.a.a.e.b.c();
        gVarArr[8] = new c.d.a.a.e.f.e();
        gVarArr[9] = new y();
        gVarArr[10] = new c.d.a.a.e.i.b();
        gVarArr[11] = new c.d.a.a.e.a.b(this.f1864d | (this.f1862b ? 1 : 0));
        if (f1861a != null) {
            try {
                gVarArr[12] = f1861a.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return gVarArr;
    }
}

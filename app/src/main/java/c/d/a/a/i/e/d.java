package c.d.a.a.i.e;

import c.d.a.a.I;
import c.d.a.a.i.A;
import c.d.a.a.i.B;
import c.d.a.a.i.E;
import c.d.a.a.i.b.g;
import c.d.a.a.i.e.c;
import c.d.a.a.i.p;
import c.d.a.a.i.v;
import c.d.a.a.i.x;
import c.d.a.a.k.i;
import c.d.a.a.l.C;
import c.d.a.a.l.G;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class d implements v, B.a<g<c>> {

    /* renamed from: a, reason: collision with root package name */
    private final c.a f2930a;

    /* renamed from: b, reason: collision with root package name */
    private final G f2931b;

    /* renamed from: c, reason: collision with root package name */
    private final C f2932c;

    /* renamed from: d, reason: collision with root package name */
    private final z f2933d;

    /* renamed from: e, reason: collision with root package name */
    private final x.a f2934e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0161d f2935f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.i.G f2936g;

    /* renamed from: h, reason: collision with root package name */
    private final p f2937h;

    /* renamed from: i, reason: collision with root package name */
    private v.a f2938i;
    private c.d.a.a.i.e.a.a j;
    private g<c>[] k = a(0);
    private B l;
    private boolean m;

    public d(c.d.a.a.i.e.a.a aVar, c.a aVar2, G g2, p pVar, z zVar, x.a aVar3, C c2, InterfaceC0161d interfaceC0161d) {
        this.j = aVar;
        this.f2930a = aVar2;
        this.f2931b = g2;
        this.f2932c = c2;
        this.f2933d = zVar;
        this.f2934e = aVar3;
        this.f2935f = interfaceC0161d;
        this.f2937h = pVar;
        this.f2936g = b(aVar);
        this.l = pVar.a(this.k);
        aVar3.a();
    }

    public void a(c.d.a.a.i.e.a.a aVar) {
        this.j = aVar;
        for (g<c> gVar : this.k) {
            ((c) gVar.i()).a(aVar);
        }
        this.f2938i.a((v.a) this);
    }

    public void c() {
        for (g<c> gVar : this.k) {
            gVar.j();
        }
        this.f2938i = null;
        this.f2934e.b();
    }

    @Override // c.d.a.a.i.v
    public void a(v.a aVar, long j) {
        this.f2938i = aVar;
        aVar.a((v) this);
    }

    @Override // c.d.a.a.i.v
    public void d() {
        this.f2932c.a();
    }

    @Override // c.d.a.a.i.v
    public c.d.a.a.i.G f() {
        return this.f2936g;
    }

    @Override // c.d.a.a.i.v
    public long a(i[] iVarArr, boolean[] zArr, A[] aArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if (aArr[i2] != null) {
                g gVar = (g) aArr[i2];
                if (iVarArr[i2] == null || !zArr[i2]) {
                    gVar.j();
                    aArr[i2] = null;
                } else {
                    arrayList.add(gVar);
                }
            }
            if (aArr[i2] == null && iVarArr[i2] != null) {
                g<c> gVarA = a(iVarArr[i2], j);
                arrayList.add(gVarA);
                aArr[i2] = gVarA;
                zArr2[i2] = true;
            }
        }
        this.k = a(arrayList.size());
        arrayList.toArray(this.k);
        this.l = this.f2937h.a(this.k);
        return j;
    }

    @Override // c.d.a.a.i.v
    public void a(long j, boolean z) {
        for (g<c> gVar : this.k) {
            gVar.a(j, z);
        }
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public void c(long j) {
        this.l.c(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public boolean b(long j) {
        return this.l.b(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long b() {
        return this.l.b();
    }

    @Override // c.d.a.a.i.v
    public long e() {
        if (this.m) {
            return -9223372036854775807L;
        }
        this.f2934e.c();
        this.m = true;
        return -9223372036854775807L;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long g() {
        return this.l.g();
    }

    @Override // c.d.a.a.i.v
    public long a(long j) {
        for (g<c> gVar : this.k) {
            gVar.e(j);
        }
        return j;
    }

    @Override // c.d.a.a.i.v
    public long a(long j, I i2) {
        for (g<c> gVar : this.k) {
            if (gVar.f2552a == 2) {
                return gVar.a(j, i2);
            }
        }
        return j;
    }

    @Override // c.d.a.a.i.B.a
    public void a(g<c> gVar) {
        this.f2938i.a((v.a) this);
    }

    private g<c> a(i iVar, long j) {
        int iA = this.f2936g.a(iVar.a());
        return new g<>(this.j.f2885f[iA].f2891a, null, null, this.f2930a.a(this.f2932c, this.j, iA, iVar, this.f2931b), this, this.f2935f, j, this.f2933d, this.f2934e);
    }

    private static c.d.a.a.i.G b(c.d.a.a.i.e.a.a aVar) {
        E[] eArr = new E[aVar.f2885f.length];
        for (int i2 = 0; i2 < aVar.f2885f.length; i2++) {
            eArr[i2] = new E(aVar.f2885f[i2].j);
        }
        return new c.d.a.a.i.G(eArr);
    }

    private static g<c>[] a(int i2) {
        return new g[i2];
    }
}

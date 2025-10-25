package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import c.d.a.a.m.AbstractC0170e;
import java.util.List;

/* loaded from: classes.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.d.a.a.q> f2139a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.e.q[] f2140b;

    public I(List<c.d.a.a.q> list) {
        this.f2139a = list;
        this.f2140b = new c.d.a.a.e.q[list.size()];
    }

    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        for (int i2 = 0; i2 < this.f2140b.length; i2++) {
            dVar.a();
            c.d.a.a.e.q qVarA = iVar.a(dVar.b(), 3);
            c.d.a.a.q qVar = this.f2139a.get(i2);
            String str = qVar.f3682g;
            AbstractC0170e.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            qVarA.a(c.d.a.a.q.a(dVar.c(), str, null, -1, qVar.y, qVar.z, qVar.A, null, Long.MAX_VALUE, qVar.f3684i));
            this.f2140b[i2] = qVarA;
        }
    }

    public void a(long j, c.d.a.a.m.u uVar) {
        if (uVar.b() < 9) {
            return;
        }
        int iP = uVar.p();
        int iP2 = uVar.p();
        int iH = uVar.h();
        if (iP == 434 && iP2 == c.d.a.a.j.a.h.f3123a && iH == 3) {
            c.d.a.a.j.a.h.b(j, uVar, this.f2140b);
        }
    }
}

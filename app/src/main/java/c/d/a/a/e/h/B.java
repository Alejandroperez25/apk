package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import c.d.a.a.m.AbstractC0170e;
import java.util.List;

/* loaded from: classes.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.d.a.a.q> f2095a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.e.q[] f2096b;

    public B(List<c.d.a.a.q> list) {
        this.f2095a = list;
        this.f2096b = new c.d.a.a.e.q[list.size()];
    }

    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        for (int i2 = 0; i2 < this.f2096b.length; i2++) {
            dVar.a();
            c.d.a.a.e.q qVarA = iVar.a(dVar.b(), 3);
            c.d.a.a.q qVar = this.f2095a.get(i2);
            String str = qVar.f3682g;
            AbstractC0170e.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            qVarA.a(c.d.a.a.q.a(qVar.f3676a != null ? qVar.f3676a : dVar.c(), str, null, -1, qVar.y, qVar.z, qVar.A, null, Long.MAX_VALUE, qVar.f3684i));
            this.f2096b[i2] = qVarA;
        }
    }

    public void a(long j, c.d.a.a.m.u uVar) {
        c.d.a.a.j.a.h.a(j, uVar, this.f2096b);
    }
}

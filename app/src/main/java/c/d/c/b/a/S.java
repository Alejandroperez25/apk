package c.d.c.b.a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class S extends c.d.c.H<c.d.c.u> {
    S() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.c.u a(c.d.c.d.b bVar) {
        switch (aa.f4133a[bVar.g().ordinal()]) {
            case 1:
                return new c.d.c.z(new c.d.c.b.v(bVar.j()));
            case 2:
                return new c.d.c.z(Boolean.valueOf(bVar.k()));
            case 3:
                return new c.d.c.z(bVar.j());
            case 4:
                bVar.l();
                return c.d.c.w.f4322a;
            case 5:
                c.d.c.r rVar = new c.d.c.r();
                bVar.b();
                while (bVar.f()) {
                    rVar.a(a(bVar));
                }
                bVar.c();
                return rVar;
            case 6:
                c.d.c.x xVar = new c.d.c.x();
                bVar.d();
                while (bVar.f()) {
                    xVar.a(bVar.i(), a(bVar));
                }
                bVar.e();
                return xVar;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, c.d.c.u uVar) throws IOException {
        if (uVar == null || uVar.f()) {
            dVar.h();
            return;
        }
        if (uVar.e()) {
            c.d.c.z zVarI = uVar.i();
            if (zVarI.m()) {
                dVar.a(zVarI.n());
                return;
            } else if (zVarI.j()) {
                dVar.d(zVarI.l());
                return;
            } else {
                dVar.c(zVarI.p());
                return;
            }
        }
        if (uVar.c()) {
            dVar.d();
            Iterator<c.d.c.u> it = uVar.h().iterator();
            while (it.hasNext()) {
                a(dVar, it.next());
            }
            dVar.e();
            return;
        }
        if (uVar.d()) {
            dVar.f();
            for (Map.Entry<String, c.d.c.u> entry : uVar.g().j()) {
                dVar.b(entry.getKey());
                a(dVar, entry.getValue());
            }
            dVar.g();
            return;
        }
        throw new IllegalArgumentException("Couldn't write " + uVar.getClass());
    }
}

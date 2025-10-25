package c.d.c.d;

import c.d.c.b.a.AbstractC0241h;
import c.d.c.b.u;

/* loaded from: classes.dex */
class a extends u {
    a() {
    }

    @Override // c.d.c.b.u
    public void a(b bVar) {
        if (bVar instanceof AbstractC0241h) {
            ((AbstractC0241h) bVar).s();
            return;
        }
        int iH = bVar.f4281i;
        if (iH == 0) {
            iH = bVar.h();
        }
        if (iH == 13) {
            bVar.f4281i = 9;
            return;
        }
        if (iH == 12) {
            bVar.f4281i = 8;
            return;
        }
        if (iH == 14) {
            bVar.f4281i = 10;
            return;
        }
        throw new IllegalStateException("Expected a name but was " + bVar.g() + bVar.q());
    }
}

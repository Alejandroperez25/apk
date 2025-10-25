package c.d.c.b.a;

import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes.dex */
class E extends c.d.c.H<BigDecimal> {
    E() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BigDecimal a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return new BigDecimal(bVar.j());
        } catch (NumberFormatException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, BigDecimal bigDecimal) throws IOException {
        dVar.a(bigDecimal);
    }
}

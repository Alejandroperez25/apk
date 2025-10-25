package c.d.c.b.a;

import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes.dex */
class F extends c.d.c.H<BigInteger> {
    F() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BigInteger a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return new BigInteger(bVar.j());
        } catch (NumberFormatException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, BigInteger bigInteger) throws IOException {
        dVar.a(bigInteger);
    }
}

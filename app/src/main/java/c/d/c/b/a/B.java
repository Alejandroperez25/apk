package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class B extends c.d.c.H<Number> {
    B() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(c.d.c.d.b bVar) {
        c.d.c.d.c cVarG = bVar.g();
        int i2 = aa.f4133a[cVarG.ordinal()];
        if (i2 != 1) {
            switch (i2) {
                case 3:
                    break;
                case 4:
                    bVar.l();
                    return null;
                default:
                    throw new c.d.c.C("Expecting number, got: " + cVarG);
            }
        }
        return new c.d.c.b.v(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        dVar.a(number);
    }
}

package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class ea extends c.d.c.H<Number> {
    ea() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return Short.valueOf((short) bVar.o());
        } catch (NumberFormatException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        dVar.a(number);
    }
}

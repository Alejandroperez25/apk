package c.d.c.b.a;

import java.io.IOException;

/* renamed from: c.d.c.b.a.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0258y extends c.d.c.H<Number> {
    C0258y() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return Long.valueOf(bVar.n());
        } catch (NumberFormatException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        dVar.a(number);
    }
}

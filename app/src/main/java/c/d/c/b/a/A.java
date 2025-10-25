package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class A extends c.d.c.H<Number> {
    A() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return Double.valueOf(bVar.m());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        dVar.a(number);
    }
}

package c.d.c;

import java.io.IOException;

/* loaded from: classes.dex */
class m extends H<Number> {
    m() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return Long.valueOf(bVar.n());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        if (number == null) {
            dVar.h();
        } else {
            dVar.c(number.toString());
        }
    }
}

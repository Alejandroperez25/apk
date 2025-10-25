package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class ca extends c.d.c.H<Boolean> {
    ca() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return Boolean.valueOf(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Boolean bool) throws IOException {
        dVar.c(bool == null ? "null" : bool.toString());
    }
}

package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class ba extends c.d.c.H<Boolean> {
    ba() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(c.d.c.d.b bVar) {
        c.d.c.d.c cVarG = bVar.g();
        if (cVarG == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        if (cVarG == c.d.c.d.c.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(bVar.j()));
        }
        return Boolean.valueOf(bVar.k());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Boolean bool) throws IOException {
        dVar.a(bool);
    }
}

package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class D extends c.d.c.H<String> {
    D() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(c.d.c.d.b bVar) {
        c.d.c.d.c cVarG = bVar.g();
        if (cVarG == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        if (cVarG == c.d.c.d.c.BOOLEAN) {
            return Boolean.toString(bVar.k());
        }
        return bVar.j();
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, String str) throws IOException {
        dVar.c(str);
    }
}

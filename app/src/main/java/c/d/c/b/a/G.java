package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class G extends c.d.c.H<StringBuilder> {
    G() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public StringBuilder a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return new StringBuilder(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, StringBuilder sb) throws IOException {
        dVar.c(sb == null ? null : sb.toString());
    }
}

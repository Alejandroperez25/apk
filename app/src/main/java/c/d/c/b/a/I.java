package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class I extends c.d.c.H<StringBuffer> {
    I() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public StringBuffer a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return new StringBuffer(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, StringBuffer stringBuffer) throws IOException {
        dVar.c(stringBuffer == null ? null : stringBuffer.toString());
    }
}

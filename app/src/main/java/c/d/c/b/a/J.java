package c.d.c.b.a;

import java.io.IOException;
import java.net.URL;

/* loaded from: classes.dex */
class J extends c.d.c.H<URL> {
    J() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public URL a(c.d.c.d.b bVar) throws c.d.c.d.e {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        String strJ = bVar.j();
        if ("null".equals(strJ)) {
            return null;
        }
        return new URL(strJ);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, URL url) throws IOException {
        dVar.c(url == null ? null : url.toExternalForm());
    }
}

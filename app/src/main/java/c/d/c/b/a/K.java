package c.d.c.b.a;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
class K extends c.d.c.H<URI> {
    K() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public URI a(c.d.c.d.b bVar) throws c.d.c.d.e {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            String strJ = bVar.j();
            if ("null".equals(strJ)) {
                return null;
            }
            return new URI(strJ);
        } catch (URISyntaxException e2) {
            throw new c.d.c.v(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, URI uri) throws IOException {
        dVar.c(uri == null ? null : uri.toASCIIString());
    }
}

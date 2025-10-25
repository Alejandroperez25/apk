package c.d.c.b.a;

import java.io.IOException;
import java.net.InetAddress;

/* loaded from: classes.dex */
class L extends c.d.c.H<InetAddress> {
    L() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InetAddress a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return InetAddress.getByName(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, InetAddress inetAddress) throws IOException {
        dVar.c(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}

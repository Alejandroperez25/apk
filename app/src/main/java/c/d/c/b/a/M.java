package c.d.c.b.a;

import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
class M extends c.d.c.H<UUID> {
    M() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UUID a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return UUID.fromString(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, UUID uuid) throws IOException {
        dVar.c(uuid == null ? null : uuid.toString());
    }
}

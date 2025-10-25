package c.d.c.b.a;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class ga extends c.d.c.H<AtomicInteger> {
    ga() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicInteger a(c.d.c.d.b bVar) {
        try {
            return new AtomicInteger(bVar.o());
        } catch (NumberFormatException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, AtomicInteger atomicInteger) throws IOException {
        dVar.a(atomicInteger.get());
    }
}

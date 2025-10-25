package c.d.c.b.a;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class ha extends c.d.c.H<AtomicBoolean> {
    ha() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicBoolean a(c.d.c.d.b bVar) {
        return new AtomicBoolean(bVar.k());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, AtomicBoolean atomicBoolean) throws IOException {
        dVar.d(atomicBoolean.get());
    }
}

package c.d.c.b.a;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
class P implements c.d.c.I {
    P() {
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        if (aVar.a() != Timestamp.class) {
            return null;
        }
        return new O(this, pVar.a((Class) Date.class));
    }
}

package c.d.c;

import c.d.c.b.a.C0243j;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class H<T> {
    public abstract T a(c.d.c.d.b bVar);

    public abstract void a(c.d.c.d.d dVar, T t);

    public final H<T> a() {
        return new G(this);
    }

    public final u a(T t) {
        try {
            C0243j c0243j = new C0243j();
            a(c0243j, t);
            return c0243j.i();
        } catch (IOException e2) {
            throw new v(e2);
        }
    }
}

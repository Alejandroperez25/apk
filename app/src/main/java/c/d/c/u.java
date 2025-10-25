package c.d.c;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class u {
    public boolean c() {
        return this instanceof r;
    }

    public boolean d() {
        return this instanceof x;
    }

    public boolean e() {
        return this instanceof z;
    }

    public boolean f() {
        return this instanceof w;
    }

    public x g() {
        if (d()) {
            return (x) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r h() {
        if (c()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public z i() {
        if (e()) {
            return (z) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c.d.c.d.d dVar = new c.d.c.d.d(stringWriter);
            dVar.a(true);
            c.d.c.b.D.a(this, dVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}

package g;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f5853a;

    /* renamed from: b, reason: collision with root package name */
    private final B f5854b;

    public final A a() {
        return this.f5853a;
    }

    public final B b() {
        return this.f5854b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g.b.a.c.a(this.f5853a, bVar.f5853a) && g.b.a.c.a(this.f5854b, bVar.f5854b);
    }

    public int hashCode() {
        A a2 = this.f5853a;
        int iHashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f5854b;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public b(A a2, B b2) {
        this.f5853a = a2;
        this.f5854b = b2;
    }

    public String toString() {
        return '(' + this.f5853a + ", " + this.f5854b + ')';
    }
}

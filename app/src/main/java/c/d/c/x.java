package c.d.c;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class x extends u {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.b.y<String, u> f4323a = new c.d.c.b.y<>();

    public void a(String str, u uVar) {
        if (uVar == null) {
            uVar = w.f4322a;
        }
        this.f4323a.put(str, uVar);
    }

    public Set<Map.Entry<String, u>> j() {
        return this.f4323a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof x) && ((x) obj).f4323a.equals(this.f4323a));
    }

    public int hashCode() {
        return this.f4323a.hashCode();
    }
}

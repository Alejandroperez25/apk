package c.d.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends u implements Iterable<u> {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f4321a = new ArrayList();

    public void a(u uVar) {
        if (uVar == null) {
            uVar = w.f4322a;
        }
        this.f4321a.add(uVar);
    }

    @Override // java.lang.Iterable
    public Iterator<u> iterator() {
        return this.f4321a.iterator();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof r) && ((r) obj).f4321a.equals(this.f4321a));
    }

    public int hashCode() {
        return this.f4321a.hashCode();
    }
}

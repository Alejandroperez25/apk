package c.d.b.e;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f4085a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<e> f4086b = new HashSet();

    d() {
    }

    Set<e> b() {
        Set<e> setUnmodifiableSet;
        synchronized (this.f4086b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f4086b);
        }
        return setUnmodifiableSet;
    }

    public static d a() {
        d dVar = f4085a;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f4085a;
                if (dVar == null) {
                    dVar = new d();
                    f4085a = dVar;
                }
            }
        }
        return dVar;
    }
}

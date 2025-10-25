package c.d.b.e;

import com.google.firebase.components.e;
import com.google.firebase.components.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f4082a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4083b;

    c(Set<e> set, d dVar) {
        this.f4082a = a(set);
        this.f4083b = dVar;
    }

    @Override // c.d.b.e.g
    public String a() {
        if (this.f4083b.b().isEmpty()) {
            return this.f4082a;
        }
        return this.f4082a + ' ' + a(this.f4083b.b());
    }

    private static String a(Set<e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static com.google.firebase.components.e<g> b() {
        e.a aVarA = com.google.firebase.components.e.a(g.class);
        aVarA.a(q.b(e.class));
        aVarA.a(b.a());
        return aVarA.b();
    }

    static /* synthetic */ g a(com.google.firebase.components.f fVar) {
        return new c(fVar.d(e.class), d.a());
    }
}

package c.d.a.a.f;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class c implements e {
    c() {
    }

    @Override // c.d.a.a.f.e
    public List<a> a(String str, boolean z) {
        List<a> listB = g.b(str, z);
        if (listB.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(listB.get(0));
    }

    @Override // c.d.a.a.f.e
    public a a() {
        return g.a();
    }
}

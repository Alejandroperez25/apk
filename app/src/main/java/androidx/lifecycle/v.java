package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, t> f854a = new HashMap<>();

    final void a(String str, t tVar) {
        t tVarPut = this.f854a.put(str, tVar);
        if (tVarPut != null) {
            tVarPut.a();
        }
    }

    final t a(String str) {
        return this.f854a.get(str);
    }

    public final void a() {
        Iterator<t> it = this.f854a.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f854a.clear();
    }
}

package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class A extends androidx.lifecycle.t {

    /* renamed from: c, reason: collision with root package name */
    private static final u.a f617c = new z();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f621g;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<ComponentCallbacksC0108i> f618d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, A> f619e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.v> f620f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f622h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f623i = false;

    static A a(androidx.lifecycle.v vVar) {
        return (A) new androidx.lifecycle.u(vVar, f617c).a(A.class);
    }

    A(boolean z) {
        this.f621g = z;
    }

    @Override // androidx.lifecycle.t
    protected void a() {
        if (w.f770c) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f622h = true;
    }

    boolean c() {
        return this.f622h;
    }

    boolean a(ComponentCallbacksC0108i componentCallbacksC0108i) {
        return this.f618d.add(componentCallbacksC0108i);
    }

    Collection<ComponentCallbacksC0108i> d() {
        return this.f618d;
    }

    boolean b(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (!this.f618d.contains(componentCallbacksC0108i)) {
            return true;
        }
        if (this.f621g) {
            return this.f622h;
        }
        return !this.f623i;
    }

    boolean c(ComponentCallbacksC0108i componentCallbacksC0108i) {
        return this.f618d.remove(componentCallbacksC0108i);
    }

    A d(ComponentCallbacksC0108i componentCallbacksC0108i) {
        A a2 = this.f619e.get(componentCallbacksC0108i.f730f);
        if (a2 != null) {
            return a2;
        }
        A a3 = new A(this.f621g);
        this.f619e.put(componentCallbacksC0108i.f730f, a3);
        return a3;
    }

    androidx.lifecycle.v e(ComponentCallbacksC0108i componentCallbacksC0108i) {
        androidx.lifecycle.v vVar = this.f620f.get(componentCallbacksC0108i.f730f);
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v();
        this.f620f.put(componentCallbacksC0108i.f730f, vVar2);
        return vVar2;
    }

    void f(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (w.f770c) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC0108i);
        }
        A a2 = this.f619e.get(componentCallbacksC0108i.f730f);
        if (a2 != null) {
            a2.a();
            this.f619e.remove(componentCallbacksC0108i.f730f);
        }
        androidx.lifecycle.v vVar = this.f620f.get(componentCallbacksC0108i.f730f);
        if (vVar != null) {
            vVar.a();
            this.f620f.remove(componentCallbacksC0108i.f730f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A a2 = (A) obj;
        return this.f618d.equals(a2.f618d) && this.f619e.equals(a2.f619e) && this.f620f.equals(a2.f620f);
    }

    public int hashCode() {
        return (((this.f618d.hashCode() * 31) + this.f619e.hashCode()) * 31) + this.f620f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<ComponentCallbacksC0108i> it = this.f618d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f619e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f620f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

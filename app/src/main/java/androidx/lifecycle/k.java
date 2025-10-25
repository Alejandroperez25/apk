package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class k extends f {

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<i> f838d;

    /* renamed from: b, reason: collision with root package name */
    private b.b.a.b.a<h, a> f836b = new b.b.a.b.a<>();

    /* renamed from: e, reason: collision with root package name */
    private int f839e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f840f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f841g = false;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<f.b> f842h = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private f.b f837c = f.b.INITIALIZED;

    public k(i iVar) {
        this.f838d = new WeakReference<>(iVar);
    }

    @Deprecated
    public void a(f.b bVar) {
        b(bVar);
    }

    public void b(f.b bVar) {
        c(bVar);
    }

    public void b(f.a aVar) {
        c(a(aVar));
    }

    private void c(f.b bVar) {
        if (this.f837c == bVar) {
            return;
        }
        this.f837c = bVar;
        if (this.f840f || this.f839e != 0) {
            this.f841g = true;
            return;
        }
        this.f840f = true;
        d();
        this.f840f = false;
    }

    private boolean b() {
        if (this.f836b.size() == 0) {
            return true;
        }
        f.b bVar = this.f836b.d().getValue().f843a;
        f.b bVar2 = this.f836b.e().getValue().f843a;
        return bVar == bVar2 && this.f837c == bVar2;
    }

    private f.b c(h hVar) {
        Map.Entry<h, a> entryB = this.f836b.b(hVar);
        return a(a(this.f837c, entryB != null ? entryB.getValue().f843a : null), this.f842h.isEmpty() ? null : this.f842h.get(this.f842h.size() - 1));
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar) {
        i iVar;
        a aVar = new a(hVar, this.f837c == f.b.DESTROYED ? f.b.DESTROYED : f.b.INITIALIZED);
        if (this.f836b.b(hVar, aVar) == null && (iVar = this.f838d.get()) != null) {
            boolean z = this.f839e != 0 || this.f840f;
            f.b bVarC = c(hVar);
            this.f839e++;
            while (aVar.f843a.compareTo(bVarC) < 0 && this.f836b.contains(hVar)) {
                d(aVar.f843a);
                aVar.a(iVar, f(aVar.f843a));
                c();
                bVarC = c(hVar);
            }
            if (!z) {
                d();
            }
            this.f839e--;
        }
    }

    private void c() {
        this.f842h.remove(this.f842h.size() - 1);
    }

    private void d(f.b bVar) {
        this.f842h.add(bVar);
    }

    @Override // androidx.lifecycle.f
    public void b(h hVar) {
        this.f836b.remove(hVar);
    }

    @Override // androidx.lifecycle.f
    public f.b a() {
        return this.f837c;
    }

    static f.b a(f.a aVar) {
        switch (j.f834a[aVar.ordinal()]) {
            case 1:
            case 2:
                return f.b.CREATED;
            case 3:
            case 4:
                return f.b.STARTED;
            case 5:
                return f.b.RESUMED;
            case 6:
                return f.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private static f.a e(f.b bVar) {
        switch (j.f835b[bVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException();
            case 2:
                return f.a.ON_DESTROY;
            case 3:
                return f.a.ON_STOP;
            case 4:
                return f.a.ON_PAUSE;
            case 5:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    private static f.a f(f.b bVar) {
        switch (j.f835b[bVar.ordinal()]) {
            case 1:
            case 5:
                return f.a.ON_CREATE;
            case 2:
                return f.a.ON_START;
            case 3:
                return f.a.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(i iVar) {
        b.b.a.b.b<h, a>.d dVarC = this.f836b.c();
        while (dVarC.hasNext() && !this.f841g) {
            Map.Entry next = dVarC.next();
            a aVar = (a) next.getValue();
            while (aVar.f843a.compareTo(this.f837c) < 0 && !this.f841g && this.f836b.contains(next.getKey())) {
                d(aVar.f843a);
                aVar.a(iVar, f(aVar.f843a));
                c();
            }
        }
    }

    private void b(i iVar) {
        Iterator<Map.Entry<h, a>> itDescendingIterator = this.f836b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f841g) {
            Map.Entry<h, a> next = itDescendingIterator.next();
            a value = next.getValue();
            while (value.f843a.compareTo(this.f837c) > 0 && !this.f841g && this.f836b.contains(next.getKey())) {
                f.a aVarE = e(value.f843a);
                d(a(aVarE));
                value.a(iVar, aVarE);
                c();
            }
        }
    }

    private void d() {
        i iVar = this.f838d.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!b()) {
            this.f841g = false;
            if (this.f837c.compareTo(this.f836b.d().getValue().f843a) < 0) {
                b(iVar);
            }
            Map.Entry<h, a> entryE = this.f836b.e();
            if (!this.f841g && entryE != null && this.f837c.compareTo(entryE.getValue().f843a) > 0) {
                a(iVar);
            }
        }
        this.f841g = false;
    }

    static f.b a(f.b bVar, f.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        f.b f843a;

        /* renamed from: b, reason: collision with root package name */
        g f844b;

        a(h hVar, f.b bVar) {
            this.f844b = m.a(hVar);
            this.f843a = bVar;
        }

        void a(i iVar, f.a aVar) {
            f.b bVarA = k.a(aVar);
            this.f843a = k.a(this.f843a, bVarA);
            this.f844b.a(iVar, aVar);
            this.f843a = bVarA;
        }
    }
}

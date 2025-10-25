package c.d.a.a.l;

import c.d.a.a.m.H;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.d.a.a.l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0164g implements k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3398a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<G> f3399b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f3400c;

    /* renamed from: d, reason: collision with root package name */
    private n f3401d;

    @Override // c.d.a.a.l.k
    public /* synthetic */ Map<String, List<String>> a() {
        return j.a(this);
    }

    protected AbstractC0164g(boolean z) {
        this.f3398a = z;
    }

    @Override // c.d.a.a.l.k
    public final void a(G g2) {
        if (this.f3399b.contains(g2)) {
            return;
        }
        this.f3399b.add(g2);
        this.f3400c++;
    }

    protected final void b(n nVar) {
        for (int i2 = 0; i2 < this.f3400c; i2++) {
            this.f3399b.get(i2).c(this, nVar, this.f3398a);
        }
    }

    protected final void c(n nVar) {
        this.f3401d = nVar;
        for (int i2 = 0; i2 < this.f3400c; i2++) {
            this.f3399b.get(i2).b(this, nVar, this.f3398a);
        }
    }

    protected final void a(int i2) {
        n nVar = this.f3401d;
        H.a(nVar);
        n nVar2 = nVar;
        for (int i3 = 0; i3 < this.f3400c; i3++) {
            this.f3399b.get(i3).a(this, nVar2, this.f3398a, i2);
        }
    }

    protected final void c() {
        n nVar = this.f3401d;
        H.a(nVar);
        n nVar2 = nVar;
        for (int i2 = 0; i2 < this.f3400c; i2++) {
            this.f3399b.get(i2).a(this, nVar2, this.f3398a);
        }
        this.f3401d = null;
    }
}

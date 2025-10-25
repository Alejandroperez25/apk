package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: a, reason: collision with root package name */
    private final d[] f797a;

    CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f797a = dVarArr;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        o oVar = new o();
        for (d dVar : this.f797a) {
            dVar.a(iVar, aVar, false, oVar);
        }
        for (d dVar2 : this.f797a) {
            dVar2.a(iVar, aVar, true, oVar);
        }
    }
}

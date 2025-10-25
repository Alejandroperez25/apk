package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements g {

    /* renamed from: a, reason: collision with root package name */
    private final b f798a;

    /* renamed from: b, reason: collision with root package name */
    private final g f799b;

    FullLifecycleObserverAdapter(b bVar, g gVar) {
        this.f798a = bVar;
        this.f799b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        switch (c.f826a[aVar.ordinal()]) {
            case 1:
                this.f798a.b(iVar);
                break;
            case 2:
                this.f798a.f(iVar);
                break;
            case 3:
                this.f798a.a(iVar);
                break;
            case 4:
                this.f798a.c(iVar);
                break;
            case 5:
                this.f798a.d(iVar);
                break;
            case 6:
                this.f798a.e(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        if (this.f799b != null) {
            this.f799b.a(iVar, aVar);
        }
    }
}

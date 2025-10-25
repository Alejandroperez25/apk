package androidx.fragment.app;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
class S implements androidx.lifecycle.i {

    /* renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.k f711a = null;

    S() {
    }

    void d() {
        if (this.f711a == null) {
            this.f711a = new androidx.lifecycle.k(this);
        }
    }

    boolean e() {
        return this.f711a != null;
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        d();
        return this.f711a;
    }

    void a(f.a aVar) {
        this.f711a.b(aVar);
    }
}

package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0107h extends AbstractC0110k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f724a;

    C0107h(ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f724a = componentCallbacksC0108i;
    }

    @Override // androidx.fragment.app.AbstractC0110k
    public View a(int i2) {
        if (this.f724a.H == null) {
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }
        return this.f724a.H.findViewById(i2);
    }

    @Override // androidx.fragment.app.AbstractC0110k
    public boolean c() {
        return this.f724a.H != null;
    }
}

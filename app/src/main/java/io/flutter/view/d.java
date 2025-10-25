package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.e.b;

/* loaded from: classes.dex */
class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f6256a;

    d(g gVar) {
        this.f6256a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        if (z) {
            this.f6256a.f6262c.a(this.f6256a.u);
            this.f6256a.f6262c.a();
        } else {
            this.f6256a.f6262c.a((b.a) null);
            this.f6256a.f6262c.b();
        }
        if (this.f6256a.t != null) {
            this.f6256a.t.a(z, this.f6256a.f6263d.isTouchExplorationEnabled());
        }
    }
}

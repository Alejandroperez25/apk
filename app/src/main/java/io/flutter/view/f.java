package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.view.g;

/* loaded from: classes.dex */
class f implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccessibilityManager f6258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f6259b;

    f(g gVar, AccessibilityManager accessibilityManager) {
        this.f6259b = gVar;
        this.f6258a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        if (!z) {
            this.f6259b.g();
            this.f6259b.m &= ~g.a.ACCESSIBLE_NAVIGATION.f6273e;
        } else {
            this.f6259b.m |= g.a.ACCESSIBLE_NAVIGATION.f6273e;
        }
        this.f6259b.e();
        if (this.f6259b.t != null) {
            this.f6259b.t.a(this.f6258a.isEnabled(), z);
        }
    }
}

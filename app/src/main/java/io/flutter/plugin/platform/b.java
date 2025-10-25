package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private io.flutter.view.g f6148a;

    b() {
    }

    public boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        if (this.f6148a == null) {
            return false;
        }
        return this.f6148a.a(view, view2, accessibilityEvent);
    }

    void a(io.flutter.view.g gVar) {
        this.f6148a = gVar;
    }
}

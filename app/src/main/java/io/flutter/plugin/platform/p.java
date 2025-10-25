package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.plugin.platform.r;

/* loaded from: classes.dex */
class p implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f6174a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f6175b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f6176c;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    p(r rVar, View view, Runnable runnable) {
        this.f6176c = rVar;
        this.f6174a = view;
        this.f6175b = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        r.a.a(this.f6174a, new o(this));
        this.f6174a.removeOnAttachStateChangeListener(this);
    }
}

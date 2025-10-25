package io.flutter.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f5946a;

    b(c cVar) {
        this.f5946a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((ViewGroup) this.f5946a.f5947a.f5952e.getParent()).removeView(this.f5946a.f5947a.f5952e);
        this.f5946a.f5947a.f5952e = null;
    }
}

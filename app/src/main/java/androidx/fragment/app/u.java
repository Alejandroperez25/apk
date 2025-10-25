package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class u extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f765a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f766b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f767c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f768d;

    u(w wVar, ViewGroup viewGroup, View view, ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f768d = wVar;
        this.f765a = viewGroup;
        this.f766b = view;
        this.f767c = componentCallbacksC0108i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f765a.endViewTransition(this.f766b);
        animator.removeListener(this);
        if (this.f767c.H == null || !this.f767c.z) {
            return;
        }
        this.f767c.H.setVisibility(8);
    }
}

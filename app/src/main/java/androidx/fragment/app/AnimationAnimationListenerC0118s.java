package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class AnimationAnimationListenerC0118s implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f758a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f759b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f760c;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    AnimationAnimationListenerC0118s(w wVar, ViewGroup viewGroup, ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f760c = wVar;
        this.f758a = viewGroup;
        this.f759b = componentCallbacksC0108i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f758a.post(new RunnableC0117r(this));
    }
}

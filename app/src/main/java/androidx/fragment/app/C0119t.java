package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0119t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f763c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f764d;

    C0119t(w wVar, ViewGroup viewGroup, View view, ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f764d = wVar;
        this.f761a = viewGroup;
        this.f762b = view;
        this.f763c = componentCallbacksC0108i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        this.f761a.endViewTransition(this.f762b);
        Animator animatorAa = this.f763c.aa();
        this.f763c.a((Animator) null);
        if (animatorAa == null || this.f761a.indexOfChild(this.f762b) >= 0) {
            return;
        }
        this.f764d.a(this.f763c, this.f763c.ba(), 0, 0, false);
    }
}

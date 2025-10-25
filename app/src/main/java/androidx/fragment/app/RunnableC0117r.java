package androidx.fragment.app;

import android.content.res.Resources;
import android.view.View;

/* renamed from: androidx.fragment.app.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC0117r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimationAnimationListenerC0118s f757a;

    RunnableC0117r(AnimationAnimationListenerC0118s animationAnimationListenerC0118s) {
        this.f757a = animationAnimationListenerC0118s;
    }

    @Override // java.lang.Runnable
    public void run() throws Resources.NotFoundException {
        if (this.f757a.f759b.Z() != null) {
            this.f757a.f759b.a((View) null);
            this.f757a.f760c.a(this.f757a.f759b, this.f757a.f759b.ba(), 0, 0, false);
        }
    }
}

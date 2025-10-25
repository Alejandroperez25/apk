package androidx.appcompat.view.menu;

import android.view.View;

/* loaded from: classes.dex */
class f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f133a;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    f(i iVar) {
        this.f133a = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (this.f133a.z != null) {
            if (!this.f133a.z.isAlive()) {
                this.f133a.z = view.getViewTreeObserver();
            }
            this.f133a.z.removeGlobalOnLayoutListener(this.f133a.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}

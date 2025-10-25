package androidx.appcompat.view.menu;

import android.view.View;

/* loaded from: classes.dex */
class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f187a;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    w(x xVar) {
        this.f187a = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (this.f187a.q != null) {
            if (!this.f187a.q.isAlive()) {
                this.f187a.q = view.getViewTreeObserver();
            }
            this.f187a.q.removeGlobalOnLayoutListener(this.f187a.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}

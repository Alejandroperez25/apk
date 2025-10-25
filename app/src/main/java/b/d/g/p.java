package b.d.g;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f1152a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f1153b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f1154c;

    private p(View view, Runnable runnable) {
        this.f1152a = view;
        this.f1153b = view.getViewTreeObserver();
        this.f1154c = runnable;
    }

    public static p a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
        return pVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.f1154c.run();
        return true;
    }

    public void a() {
        if (this.f1153b.isAlive()) {
            this.f1153b.removeOnPreDrawListener(this);
        } else {
            this.f1152a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1152a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1153b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}

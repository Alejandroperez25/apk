package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
class v implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f186a;

    v(x xVar) {
        this.f186a = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f186a.c() || this.f186a.j.b()) {
            return;
        }
        View view = this.f186a.o;
        if (view == null || !view.isShown()) {
            this.f186a.dismiss();
        } else {
            this.f186a.j.a();
        }
    }
}

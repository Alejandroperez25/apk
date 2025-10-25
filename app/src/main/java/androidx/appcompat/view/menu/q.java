package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
class q implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f176a;

    q(r rVar) {
        this.f176a = rVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f176a.e();
    }
}

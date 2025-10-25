package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
class P implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f279a;

    P(SearchView searchView) {
        this.f279a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (this.f279a.ga == null) {
            return false;
        }
        if (this.f279a.q.isPopupShowing() && this.f279a.q.getListSelection() != -1) {
            return this.f279a.a(view, i2, keyEvent);
        }
        if (this.f279a.q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
            return false;
        }
        view.cancelLongPress();
        this.f279a.a(0, (String) null, this.f279a.q.getText().toString());
        return true;
    }
}

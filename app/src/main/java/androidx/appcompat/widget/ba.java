package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
class ba implements ActionMenuView.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f356a;

    ba(Toolbar toolbar) {
        this.f356a = toolbar;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.e
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f356a.G != null) {
            return this.f356a.G.onMenuItemClick(menuItem);
        }
        return false;
    }
}

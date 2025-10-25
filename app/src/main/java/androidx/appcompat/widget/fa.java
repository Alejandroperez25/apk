package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class fa implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final androidx.appcompat.view.menu.a f368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ga f369b;

    fa(ga gaVar) {
        this.f369b = gaVar;
        this.f368a = new androidx.appcompat.view.menu.a(this.f369b.f370a.getContext(), 0, android.R.id.home, 0, 0, this.f369b.f377h);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f369b.k == null || !this.f369b.l) {
            return;
        }
        this.f369b.k.onMenuItemSelected(0, this.f368a);
    }
}

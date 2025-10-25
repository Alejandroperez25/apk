package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class O implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f278a;

    O(SearchView searchView) {
        this.f278a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f278a.u) {
            this.f278a.e();
            return;
        }
        if (view == this.f278a.w) {
            this.f278a.d();
            return;
        }
        if (view == this.f278a.v) {
            this.f278a.c();
        } else if (view == this.f278a.x) {
            this.f278a.f();
        } else if (view == this.f278a.q) {
            this.f278a.i();
        }
    }
}

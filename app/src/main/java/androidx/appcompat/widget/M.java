package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class M implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f276a;

    M(SearchView searchView) {
        this.f276a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (this.f276a.N != null) {
            this.f276a.N.onFocusChange(this.f276a, z);
        }
    }
}

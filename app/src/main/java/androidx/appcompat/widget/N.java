package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class N implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f277a;

    N(SearchView searchView) {
        this.f277a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f277a.h();
    }
}

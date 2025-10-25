package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
class J implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f273a;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    J(SearchView searchView) {
        this.f273a = searchView;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f273a.b(charSequence);
    }
}

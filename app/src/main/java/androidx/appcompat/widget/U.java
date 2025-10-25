package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView.SearchAutoComplete f312a;

    U(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f312a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f312a.b();
    }
}

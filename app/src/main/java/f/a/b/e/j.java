package f.a.b.e;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f5829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f5830b;

    j(k kVar, View view) {
        this.f5830b = kVar;
        this.f5829a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f5830b.getContext().getSystemService("input_method");
        this.f5829a.onWindowFocusChanged(true);
        inputMethodManager.isActive(this.f5830b.f5831a);
    }
}

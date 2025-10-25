package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D f234a;

    B(D d2) {
        this.f234a = d2;
    }

    @Override // java.lang.Runnable
    public void run() {
        View viewE = this.f234a.e();
        if (viewE == null || viewE.getWindowToken() == null) {
            return;
        }
        this.f234a.a();
    }
}

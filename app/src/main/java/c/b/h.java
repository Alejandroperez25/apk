package c.b;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
class h implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f1302a;

    h(m mVar) {
        this.f1302a = mVar;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i2 != 4) {
            return false;
        }
        if (this.f1302a.f1315g.canGoBack()) {
            this.f1302a.f1315g.goBack();
            return true;
        }
        c.f1291a.a("onBack", null);
        return true;
    }
}

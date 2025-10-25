package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.i;
import java.util.Iterator;

/* loaded from: classes.dex */
class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f132a;

    e(i iVar) {
        this.f132a = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f132a.c() || this.f132a.j.size() <= 0 || this.f132a.j.get(0).f147a.b()) {
            return;
        }
        View view = this.f132a.q;
        if (view == null || !view.isShown()) {
            this.f132a.dismiss();
            return;
        }
        Iterator<i.a> it = this.f132a.j.iterator();
        while (it.hasNext()) {
            it.next().f147a.a();
        }
    }
}

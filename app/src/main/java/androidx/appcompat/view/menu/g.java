package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i.a f134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MenuItem f135b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f136c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f137d;

    g(h hVar, i.a aVar, MenuItem menuItem, k kVar) {
        this.f137d = hVar;
        this.f134a = aVar;
        this.f135b = menuItem;
        this.f136c = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f134a != null) {
            this.f137d.f138a.B = true;
            this.f134a.f148b.a(false);
            this.f137d.f138a.B = false;
        }
        if (this.f135b.isEnabled() && this.f135b.hasSubMenu()) {
            this.f136c.a(this.f135b, 4);
        }
    }
}

package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.widget.E;

/* loaded from: classes.dex */
class h implements E {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f138a;

    h(i iVar) {
        this.f138a = iVar;
    }

    @Override // androidx.appcompat.widget.E
    public void b(k kVar, MenuItem menuItem) {
        this.f138a.f145h.removeCallbacksAndMessages(kVar);
    }

    @Override // androidx.appcompat.widget.E
    public void a(k kVar, MenuItem menuItem) {
        this.f138a.f145h.removeCallbacksAndMessages(null);
        int size = this.f138a.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (kVar == this.f138a.j.get(i2).f148b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        this.f138a.f145h.postAtTime(new g(this, i3 < this.f138a.j.size() ? this.f138a.j.get(i3) : null, menuItem, kVar), kVar, SystemClock.uptimeMillis() + 200);
    }
}

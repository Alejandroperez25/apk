package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f708a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f709b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R f710c;

    Q(R r, ArrayList arrayList, Map map) {
        this.f710c = r;
        this.f708a = arrayList;
        this.f709b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f708a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f708a.get(i2);
            b.d.g.v.a(view, (String) this.f709b.get(b.d.g.v.e(view)));
        }
    }
}

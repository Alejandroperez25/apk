package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f705a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f706b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R f707c;

    P(R r, ArrayList arrayList, Map map) {
        this.f707c = r;
        this.f705a = arrayList;
        this.f706b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f705a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f705a.get(i2);
            String strE = b.d.g.v.e(view);
            if (strE != null) {
                b.d.g.v.a(view, R.a((Map<String, String>) this.f706b, strE));
            }
        }
    }
}

package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f699a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f701c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f702d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f703e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ R f704f;

    O(R r, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f704f = r;
        this.f699a = i2;
        this.f700b = arrayList;
        this.f701c = arrayList2;
        this.f702d = arrayList3;
        this.f703e = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i2 = 0; i2 < this.f699a; i2++) {
            b.d.g.v.a((View) this.f700b.get(i2), (String) this.f701c.get(i2));
            b.d.g.v.a((View) this.f702d.get(i2), (String) this.f703e.get(i2));
        }
    }
}

package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ R f652b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f653c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f654d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f655e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f656f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ArrayList f657g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Object f658h;

    F(Object obj, R r, View view, ComponentCallbacksC0108i componentCallbacksC0108i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f651a = obj;
        this.f652b = r;
        this.f653c = view;
        this.f654d = componentCallbacksC0108i;
        this.f655e = arrayList;
        this.f656f = arrayList2;
        this.f657g = arrayList3;
        this.f658h = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f651a != null) {
            this.f652b.c(this.f651a, this.f653c);
            this.f656f.addAll(I.a(this.f652b, this.f651a, this.f654d, (ArrayList<View>) this.f655e, this.f653c));
        }
        if (this.f657g != null) {
            if (this.f658h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f653c);
                this.f652b.b(this.f658h, this.f657g, arrayList);
            }
            this.f657g.clear();
            this.f657g.add(this.f653c);
        }
    }
}

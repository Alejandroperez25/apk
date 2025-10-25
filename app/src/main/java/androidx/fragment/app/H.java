package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.I;
import java.util.ArrayList;

/* loaded from: classes.dex */
class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R f667a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.c.b f668b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f669c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I.a f670d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f671e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f672f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f673g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f674h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f675i;
    final /* synthetic */ ArrayList j;
    final /* synthetic */ Object k;
    final /* synthetic */ Rect l;

    H(R r, b.c.b bVar, Object obj, I.a aVar, ArrayList arrayList, View view, ComponentCallbacksC0108i componentCallbacksC0108i, ComponentCallbacksC0108i componentCallbacksC0108i2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f667a = r;
        this.f668b = bVar;
        this.f669c = obj;
        this.f670d = aVar;
        this.f671e = arrayList;
        this.f672f = view;
        this.f673g = componentCallbacksC0108i;
        this.f674h = componentCallbacksC0108i2;
        this.f675i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.c.b<String, View> bVarA = I.a(this.f667a, (b.c.b<String, String>) this.f668b, this.f669c, this.f670d);
        if (bVarA != null) {
            this.f671e.addAll(bVarA.values());
            this.f671e.add(this.f672f);
        }
        I.a(this.f673g, this.f674h, this.f675i, bVarA, false);
        if (this.f669c != null) {
            this.f667a.a(this.f669c, this.j, this.f671e);
            View viewA = I.a(bVarA, this.f670d, this.k, this.f675i);
            if (viewA != null) {
                this.f667a.a(viewA, this.l);
            }
        }
    }
}

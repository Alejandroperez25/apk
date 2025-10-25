package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f660a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0108i f661b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f662c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b.c.b f663d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ View f664e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ R f665f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Rect f666g;

    G(ComponentCallbacksC0108i componentCallbacksC0108i, ComponentCallbacksC0108i componentCallbacksC0108i2, boolean z, b.c.b bVar, View view, R r, Rect rect) {
        this.f660a = componentCallbacksC0108i;
        this.f661b = componentCallbacksC0108i2;
        this.f662c = z;
        this.f663d = bVar;
        this.f664e = view;
        this.f665f = r;
        this.f666g = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        I.a(this.f660a, this.f661b, this.f662c, (b.c.b<String, View>) this.f663d, false);
        if (this.f664e != null) {
            this.f665f.a(this.f664e, this.f666g);
        }
    }
}

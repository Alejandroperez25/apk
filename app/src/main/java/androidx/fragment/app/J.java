package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
class J extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rect f685a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f686b;

    J(N n, Rect rect) {
        this.f686b = n;
        this.f685a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f685a;
    }
}

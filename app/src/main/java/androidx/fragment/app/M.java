package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
class M extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rect f697a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f698b;

    M(N n, Rect rect) {
        this.f698b = n;
        this.f697a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        if (this.f697a == null || this.f697a.isEmpty()) {
            return null;
        }
        return this.f697a;
    }
}

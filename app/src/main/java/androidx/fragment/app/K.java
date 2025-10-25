package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class K implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f687a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f688b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N f689c;

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }

    K(N n, View view, ArrayList arrayList) {
        this.f689c = n;
        this.f687a = view;
        this.f688b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f687a.setVisibility(8);
        int size = this.f688b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) this.f688b.get(i2)).setVisibility(0);
        }
    }
}

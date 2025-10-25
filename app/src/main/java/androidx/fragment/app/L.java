package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class L implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f691b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f692c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f693d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f694e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f695f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ N f696g;

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    L(N n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f696g = n;
        this.f690a = obj;
        this.f691b = arrayList;
        this.f692c = obj2;
        this.f693d = arrayList2;
        this.f694e = obj3;
        this.f695f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        if (this.f690a != null) {
            this.f696g.b(this.f690a, this.f691b, (ArrayList<View>) null);
        }
        if (this.f692c != null) {
            this.f696g.b(this.f692c, this.f693d, (ArrayList<View>) null);
        }
        if (this.f694e != null) {
            this.f696g.b(this.f694e, this.f695f, (ArrayList<View>) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}

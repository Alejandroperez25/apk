package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f650a;

    E(ArrayList arrayList) {
        this.f650a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        I.a((ArrayList<View>) this.f650a, 4);
    }
}

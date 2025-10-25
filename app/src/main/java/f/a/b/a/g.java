package f.a.b.a;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes.dex */
class g extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f5717a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(l lVar, Context context) {
        super(context);
        this.f5717a = lVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i2) {
        if (i2 == -1) {
            return;
        }
        this.f5717a.s = ((int) Math.round(i2 / 90.0d)) * 90;
    }
}

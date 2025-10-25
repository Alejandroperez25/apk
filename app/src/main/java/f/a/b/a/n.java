package f.a.b.a;

import android.app.Activity;
import android.os.Build;
import f.a.a.a.q;
import f.a.b.a.m;

/* loaded from: classes.dex */
public final class n implements io.flutter.embedding.engine.c.a, io.flutter.embedding.engine.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    private s f5744a;

    public static void a(final q.d dVar) {
        n nVar = new n();
        Activity activityD = dVar.d();
        f.a.a.a.e eVarF = dVar.f();
        dVar.getClass();
        nVar.a(activityD, eVarF, new m.b() { // from class: f.a.b.a.f
            @Override // f.a.b.a.m.b
            public final void a(q.e eVar) {
                dVar.a(eVar);
            }
        }, dVar.a());
    }

    private void a(Activity activity, f.a.a.a.e eVar, m.b bVar, io.flutter.view.r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.f5744a = new s(activity, eVar, new m(), bVar, rVar);
    }
}

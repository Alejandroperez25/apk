package d.a;

import android.app.Activity;
import android.view.Window;
import f.a.a.a.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Activity f5637a;

    public final void a(Activity activity) {
        this.f5637a = activity;
    }

    private final boolean a() {
        Activity activity = this.f5637a;
        if (activity == null) {
            g.b.a.c.a();
            throw null;
        }
        Window window = activity.getWindow();
        g.b.a.c.a((Object) window, "activity!!.window");
        return (window.getAttributes().flags & 128) != 0;
    }

    public final void a(boolean z, o.d dVar) {
        g.b.a.c.b(dVar, "result");
        if (this.f5637a == null) {
            b.a(dVar);
            return;
        }
        Activity activity = this.f5637a;
        if (activity == null) {
            g.b.a.c.a();
            throw null;
        }
        boolean zA = a();
        if (z) {
            if (!zA) {
                activity.getWindow().addFlags(128);
            }
        } else if (zA) {
            activity.getWindow().clearFlags(128);
        }
        dVar.a(null);
    }

    public final void a(o.d dVar) {
        g.b.a.c.b(dVar, "result");
        if (this.f5637a == null) {
            b.a(dVar);
        } else {
            dVar.a(Boolean.valueOf(a()));
        }
    }
}

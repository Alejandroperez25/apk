package f.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public interface q {

    public interface a {
        boolean onActivityResult(int i2, int i3, Intent intent);
    }

    public interface b {
        boolean onNewIntent(Intent intent);
    }

    public interface c {
        void a(q qVar);
    }

    public interface d {
        d a(a aVar);

        d a(b bVar);

        d a(e eVar);

        d a(g gVar);

        io.flutter.view.p a();

        String a(String str);

        String a(String str, String str2);

        Context b();

        io.flutter.view.r c();

        Activity d();

        Context e();

        f.a.a.a.e f();

        io.flutter.plugin.platform.i g();
    }

    public interface e {
        boolean a(int i2, String[] strArr, int[] iArr);
    }

    public interface f {
        void onUserLeaveHint();
    }

    public interface g {
        boolean a(io.flutter.view.k kVar);
    }

    boolean a(String str);

    d b(String str);
}

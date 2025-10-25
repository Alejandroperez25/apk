package c.d.a.b.b;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3759a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Context f3760b;

    static synchronized void a(Context context) {
        if (f3760b != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f3760b = context.getApplicationContext();
        }
    }
}

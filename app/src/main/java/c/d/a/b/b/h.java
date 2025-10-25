package c.d.a.b.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static h f3757a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3758b;

    private h(Context context) {
        this.f3758b = context.getApplicationContext();
    }

    public static h a(Context context) {
        t.a(context);
        synchronized (h.class) {
            if (f3757a == null) {
                m.a(context);
                f3757a = new h(context);
            }
        }
        return f3757a;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        n nVarA;
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z) {
                nVarA = a(packageInfo, q.f3765a);
            } else {
                nVarA = a(packageInfo, q.f3765a[0]);
            }
            if (nVarA != null) {
                return true;
            }
        }
        return false;
    }

    private static n a(PackageInfo packageInfo, n... nVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        o oVar = new o(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].equals(oVar)) {
                return nVarArr[i2];
            }
        }
        return null;
    }
}

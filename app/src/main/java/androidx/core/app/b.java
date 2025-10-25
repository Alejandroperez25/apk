package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class b extends androidx.core.content.a {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0006b f484c;

    public interface a {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0006b {
        boolean a(Activity activity, int i2, int i3, Intent intent);

        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface c {
        void a(int i2);
    }

    public static InterfaceC0006b a() {
        return f484c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i2) {
        if (f484c == null || !f484c.a(activity, strArr, i2)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof c) {
                    ((c) activity).a(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof a) {
                new Handler(Looper.getMainLooper()).post(new androidx.core.app.a(strArr, activity, i2));
            }
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}

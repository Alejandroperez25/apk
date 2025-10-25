package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Method f485a;

        /* renamed from: b, reason: collision with root package name */
        private static boolean f486b;

        public static IBinder a(Bundle bundle, String str) {
            if (!f486b) {
                try {
                    f485a = Bundle.class.getMethod("getIBinder", String.class);
                    f485a.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e2);
                }
                f486b = true;
            }
            if (f485a != null) {
                try {
                    return (IBinder) f485a.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e3);
                    f485a = null;
                }
            }
            return null;
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }
}

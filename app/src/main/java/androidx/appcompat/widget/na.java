package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class na {

    /* renamed from: a, reason: collision with root package name */
    private static Method f423a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f423a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (f423a.isAccessible()) {
                    return;
                }
                f423a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static boolean a(View view) {
        return b.d.g.v.b(view) == 1;
    }

    public static void a(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f423a != null) {
            try {
                f423a.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }
}

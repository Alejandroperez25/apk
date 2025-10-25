package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import b.d.g.v;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Method f607a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f608b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f609c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f610d;

    public static void a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
            return;
        }
        if ((b.d.g.c.a(i4, v.b(view)) & 7) == 5) {
            i2 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!f610d) {
                try {
                    f609c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f609c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f610d = true;
            }
            if (f609c != null) {
                try {
                    f609c.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static void a(PopupWindow popupWindow, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!f608b) {
            try {
                f607a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f607a.setAccessible(true);
            } catch (Exception unused) {
            }
            f608b = true;
        }
        if (f607a != null) {
            try {
                f607a.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }
}

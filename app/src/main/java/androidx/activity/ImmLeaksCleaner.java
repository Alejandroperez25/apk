package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* renamed from: a, reason: collision with root package name */
    private static int f70a;

    /* renamed from: b, reason: collision with root package name */
    private static Field f71b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f72c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f73d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f74e;

    ImmLeaksCleaner(Activity activity) {
        this.f74e = activity;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) throws IllegalAccessException, IllegalArgumentException {
        if (aVar != f.a.ON_DESTROY) {
            return;
        }
        if (f70a == 0) {
            a();
        }
        if (f70a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f74e.getSystemService("input_method");
            try {
                Object obj = f71b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f72c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f73d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }

    private static void a() {
        try {
            f70a = 2;
            f72c = InputMethodManager.class.getDeclaredField("mServedView");
            f72c.setAccessible(true);
            f73d = InputMethodManager.class.getDeclaredField("mNextServedView");
            f73d.setAccessible(true);
            f71b = InputMethodManager.class.getDeclaredField("mH");
            f71b.setAccessible(true);
            f70a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}

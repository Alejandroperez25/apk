package c.h.a.b.c;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f4728a = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    public enum a {
        BACK,
        FRONT
    }

    public static float[] a() {
        return f4728a;
    }

    public static int a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        switch (windowManager.getDefaultDisplay().getRotation()) {
        }
        return 0;
    }
}

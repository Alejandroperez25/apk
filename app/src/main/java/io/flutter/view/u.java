package io.flutter.view;

import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static u f6359a;

    /* renamed from: b, reason: collision with root package name */
    private final WindowManager f6360b;

    /* renamed from: c, reason: collision with root package name */
    private final FlutterJNI.b f6361c = new t(this);

    public static u a(WindowManager windowManager) {
        if (f6359a == null) {
            f6359a = new u(windowManager);
        }
        return f6359a;
    }

    private u(WindowManager windowManager) {
        this.f6360b = windowManager;
    }

    public void a() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.f6361c);
        FlutterJNI.setRefreshRateFPS(this.f6360b.getDefaultDisplay().getRefreshRate());
    }
}

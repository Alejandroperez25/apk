package io.flutter.app;

import android.app.Activity;
import android.app.Application;
import io.flutter.view.i;

/* loaded from: classes.dex */
public class FlutterApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
    private Activity f5941a = null;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        i.a(this);
    }

    public Activity a() {
        return this.f5941a;
    }

    public void a(Activity activity) {
        this.f5941a = activity;
    }
}

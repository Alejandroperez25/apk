package io.flutter.app;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import f.a.a.a.q;
import io.flutter.view.i;
import io.flutter.view.k;
import io.flutter.view.l;
import io.flutter.view.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements e, p.b, q {

    /* renamed from: a, reason: collision with root package name */
    private static final WindowManager.LayoutParams f5948a = new WindowManager.LayoutParams(-1, -1);

    /* renamed from: b, reason: collision with root package name */
    private final Activity f5949b;

    /* renamed from: c, reason: collision with root package name */
    private final a f5950c;

    /* renamed from: d, reason: collision with root package name */
    private p f5951d;

    /* renamed from: e, reason: collision with root package name */
    private View f5952e;

    public interface a {
        p a(Context context);

        boolean e();

        k g();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public d(Activity activity, a aVar) {
        f.a.c.b.a(activity);
        this.f5949b = activity;
        f.a.c.b.a(aVar);
        this.f5950c = aVar;
    }

    @Override // io.flutter.view.p.b
    public p a() {
        return this.f5951d;
    }

    @Override // f.a.a.a.q
    public boolean a(String str) {
        return this.f5951d.getPluginRegistry().a(str);
    }

    @Override // f.a.a.a.q
    public q.d b(String str) {
        return this.f5951d.getPluginRegistry().b(str);
    }

    @Override // f.a.a.a.q.e
    public boolean a(int i2, String[] strArr, int[] iArr) {
        return this.f5951d.getPluginRegistry().a(i2, strArr, iArr);
    }

    @Override // f.a.a.a.q.a
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        return this.f5951d.getPluginRegistry().onActivityResult(i2, i3, intent);
    }

    @Override // io.flutter.app.e
    public void onCreate(Bundle bundle) {
        String strA;
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.f5949b.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        i.a(this.f5949b.getApplicationContext(), a(this.f5949b.getIntent()));
        this.f5951d = this.f5950c.a(this.f5949b);
        if (this.f5951d == null) {
            this.f5951d = new p(this.f5949b, null, this.f5950c.g());
            this.f5951d.setLayoutParams(f5948a);
            this.f5949b.setContentView(this.f5951d);
            this.f5952e = c();
            if (this.f5952e != null) {
                f();
            }
        }
        if (b(this.f5949b.getIntent()) || (strA = i.a()) == null) {
            return;
        }
        c(strA);
    }

    @Override // io.flutter.app.e
    public void onNewIntent(Intent intent) {
        if (b() && b(intent)) {
            return;
        }
        this.f5951d.getPluginRegistry().onNewIntent(intent);
    }

    private boolean b() {
        return (this.f5949b.getApplicationInfo().flags & 2) != 0;
    }

    @Override // io.flutter.app.e
    public void onPause() {
        Application application = (Application) this.f5949b.getApplicationContext();
        if (application instanceof FlutterApplication) {
            FlutterApplication flutterApplication = (FlutterApplication) application;
            if (this.f5949b.equals(flutterApplication.a())) {
                flutterApplication.a(null);
            }
        }
        if (this.f5951d != null) {
            this.f5951d.c();
        }
    }

    @Override // io.flutter.app.e
    public void onStart() {
        if (this.f5951d != null) {
            this.f5951d.b();
        }
    }

    @Override // io.flutter.app.e
    public void onResume() {
        Application application = (Application) this.f5949b.getApplicationContext();
        if (application instanceof FlutterApplication) {
            ((FlutterApplication) application).a(this.f5949b);
        }
    }

    @Override // io.flutter.app.e
    public void onStop() {
        this.f5951d.e();
    }

    @Override // io.flutter.app.e
    public void onPostResume() {
        if (this.f5951d != null) {
            this.f5951d.d();
        }
    }

    @Override // io.flutter.app.e
    public void onDestroy() {
        Application application = (Application) this.f5949b.getApplicationContext();
        if (application instanceof FlutterApplication) {
            FlutterApplication flutterApplication = (FlutterApplication) application;
            if (this.f5949b.equals(flutterApplication.a())) {
                flutterApplication.a(null);
            }
        }
        if (this.f5951d != null) {
            if (this.f5951d.getPluginRegistry().a(this.f5951d.getFlutterNativeView()) || this.f5950c.e()) {
                this.f5951d.h();
            } else {
                this.f5951d.i();
            }
        }
    }

    @Override // io.flutter.app.e
    public boolean onBackPressed() {
        if (this.f5951d == null) {
            return false;
        }
        this.f5951d.g();
        return true;
    }

    @Override // io.flutter.app.e
    public void onUserLeaveHint() {
        this.f5951d.getPluginRegistry().onUserLeaveHint();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 10) {
            this.f5951d.f();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f5951d.f();
    }

    private static String[] a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        int intExtra = intent.getIntExtra("observatory-port", 0);
        if (intExtra > 0) {
            arrayList.add("--observatory-port=" + Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private boolean b(Intent intent) {
        if (!"android.intent.action.RUN".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("route");
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = i.a();
        }
        if (stringExtra != null) {
            this.f5951d.setInitialRoute(stringExtra);
        }
        c(dataString);
        return true;
    }

    private void c(String str) {
        if (this.f5951d.getFlutterNativeView().g()) {
            return;
        }
        l lVar = new l();
        lVar.f6320a = str;
        lVar.f6321b = "main";
        this.f5951d.a(lVar);
    }

    private View c() {
        Drawable drawableD;
        if (!e().booleanValue() || (drawableD = d()) == null) {
            return null;
        }
        View view = new View(this.f5949b);
        view.setLayoutParams(f5948a);
        view.setBackground(drawableD);
        return view;
    }

    private Drawable d() {
        TypedValue typedValue = new TypedValue();
        if (!this.f5949b.getTheme().resolveAttribute(R.attr.windowBackground, typedValue, true) || typedValue.resourceId == 0) {
            return null;
        }
        try {
            return this.f5949b.getResources().getDrawable(typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            Log.e("FlutterActivityDelegate", "Referenced launch screen windowBackground resource does not exist");
            return null;
        }
    }

    private Boolean e() {
        try {
            Bundle bundle = this.f5949b.getPackageManager().getActivityInfo(this.f5949b.getComponentName(), 129).metaData;
            return Boolean.valueOf(bundle != null && bundle.getBoolean("io.flutter.app.android.SplashScreenUntilFirstFrame"));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void f() {
        if (this.f5952e == null) {
            return;
        }
        this.f5949b.addContentView(this.f5952e, f5948a);
        this.f5951d.a(new c(this));
        this.f5949b.setTheme(R.style.Theme.Black.NoTitleBar);
    }
}

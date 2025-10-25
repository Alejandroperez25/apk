package io.flutter.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import f.a.a.a.q;
import io.flutter.app.d;
import io.flutter.view.k;
import io.flutter.view.p;

/* loaded from: classes.dex */
public abstract class a extends Activity implements p.b, q, d.a {

    /* renamed from: a, reason: collision with root package name */
    private final d f5942a = new d(this, this);

    /* renamed from: b, reason: collision with root package name */
    private final e f5943b = this.f5942a;

    /* renamed from: c, reason: collision with root package name */
    private final p.b f5944c = this.f5942a;

    /* renamed from: d, reason: collision with root package name */
    private final q f5945d = this.f5942a;

    @Override // io.flutter.app.d.a
    public p a(Context context) {
        return null;
    }

    @Override // io.flutter.app.d.a
    public boolean e() {
        return false;
    }

    @Override // io.flutter.app.d.a
    public k g() {
        return null;
    }

    @Override // io.flutter.view.p.b
    public p a() {
        return this.f5944c.a();
    }

    @Override // f.a.a.a.q
    public final boolean a(String str) {
        return this.f5945d.a(str);
    }

    @Override // f.a.a.a.q
    public final q.d b(String str) {
        return this.f5945d.b(str);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5943b.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f5943b.onStart();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f5943b.onResume();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f5943b.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f5943b.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.f5943b.onStop();
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f5943b.onPause();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f5943b.onPostResume();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f5943b.a(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f5943b.onActivityResult(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.f5943b.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        this.f5943b.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        this.f5943b.onTrimMemory(i2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f5943b.onLowMemory();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5943b.onConfigurationChanged(configuration);
    }
}

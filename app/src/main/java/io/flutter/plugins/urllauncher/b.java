package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6238a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f6239b;

    enum a {
        OK,
        NO_ACTIVITY
    }

    b(Context context, Activity activity) {
        this.f6238a = context;
        this.f6239b = activity;
    }

    boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.f6238a.getPackageManager());
        return (componentNameResolveActivity == null || "{com.android.fallback/com.android.fallback.Fallback}".equals(componentNameResolveActivity.toShortString())) ? false : true;
    }

    a a(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intent intentPutExtra;
        if (this.f6239b == null) {
            return a.NO_ACTIVITY;
        }
        if (z) {
            intentPutExtra = WebViewActivity.a(this.f6239b, str, z2, z3, bundle);
        } else {
            intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle);
        }
        this.f6239b.startActivity(intentPutExtra);
        return a.OK;
    }

    void a() {
        this.f6238a.sendBroadcast(new Intent(WebViewActivity.f6228a));
    }
}

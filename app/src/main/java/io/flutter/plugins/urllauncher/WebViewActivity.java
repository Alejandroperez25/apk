package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static String f6228a = "close action";

    /* renamed from: b, reason: collision with root package name */
    private static String f6229b = "url";

    /* renamed from: c, reason: collision with root package name */
    private static String f6230c = "enableJavaScript";

    /* renamed from: d, reason: collision with root package name */
    private static String f6231d = "enableDomStorage";

    /* renamed from: g, reason: collision with root package name */
    private WebView f6234g;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f6232e = new d(this);

    /* renamed from: f, reason: collision with root package name */
    private final WebViewClient f6233f = new e(this);

    /* renamed from: h, reason: collision with root package name */
    private IntentFilter f6235h = new IntentFilter(f6228a);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6234g = new WebView(this);
        setContentView(this.f6234g);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f6229b);
        boolean booleanExtra = intent.getBooleanExtra(f6230c, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f6231d, false);
        this.f6234g.loadUrl(stringExtra, a(intent.getBundleExtra("com.android.browser.headers")));
        this.f6234g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f6234g.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f6234g.setWebViewClient(this.f6233f);
        registerReceiver(this.f6232e, this.f6235h);
    }

    private Map<String, String> a(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f6232e);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && this.f6234g.canGoBack()) {
            this.f6234g.goBack();
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public static Intent a(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(f6229b, str).putExtra(f6230c, z).putExtra(f6231d, z2).putExtra("com.android.browser.headers", bundle);
    }
}

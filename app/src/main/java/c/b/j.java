package c.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f1304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f1305b;

    j(m mVar, Activity activity) {
        this.f1305b = mVar;
        this.f1304a = activity;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intent;
        if (this.f1305b.f1310b != null) {
            this.f1305b.f1310b.onReceiveValue(null);
        }
        this.f1305b.f1310b = valueCallback;
        String[] strArrA = this.f1305b.a(fileChooserParams);
        ArrayList arrayList = new ArrayList();
        this.f1305b.f1311c = null;
        this.f1305b.f1312d = null;
        if (this.f1305b.a(strArrA).booleanValue()) {
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f1305b.f1311c = this.f1305b.b("android.media.action.IMAGE_CAPTURE");
            intent2.putExtra("output", this.f1305b.f1311c);
            arrayList.add(intent2);
        }
        if (this.f1305b.b(strArrA).booleanValue()) {
            Intent intent3 = new Intent("android.media.action.VIDEO_CAPTURE");
            this.f1305b.f1312d = this.f1305b.b("android.media.action.VIDEO_CAPTURE");
            intent3.putExtra("output", this.f1305b.f1312d);
            arrayList.add(intent3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            boolean z = fileChooserParams.getMode() == 1;
            intent = fileChooserParams.createIntent();
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        Intent intent4 = new Intent("android.intent.action.CHOOSER");
        intent4.putExtra("android.intent.extra.INTENT", intent);
        intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        this.f1304a.startActivityForResult(intent4, 1);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        HashMap map = new HashMap();
        map.put("progress", Double.valueOf(i2 / 100.0d));
        c.f1291a.a("onProgressChanged", map);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, true, false);
    }
}

package io.flutter.plugins.urllauncher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f6243a;

    d(WebViewActivity webViewActivity) {
        this.f6243a = webViewActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (WebViewActivity.f6228a.equals(intent.getAction())) {
            this.f6243a.finish();
        }
    }
}

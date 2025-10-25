package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.view.g;

/* loaded from: classes.dex */
class e extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f6257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, Handler handler) {
        super(handler);
        this.f6257a = gVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(this.f6257a.f6266g, "transition_animation_scale");
        if (string != null && string.equals("0")) {
            this.f6257a.m |= g.a.DISABLE_ANIMATIONS.f6273e;
        } else {
            this.f6257a.m &= ~g.a.DISABLE_ANIMATIONS.f6273e;
        }
        this.f6257a.e();
    }
}

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: private */
/* loaded from: classes.dex */
public class MediaBrowserCompat$CustomActionResultReceiver extends a.a.a.a.c {

    /* renamed from: d, reason: collision with root package name */
    private final String f8d;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f9e;

    /* renamed from: f, reason: collision with root package name */
    private final MediaBrowserCompat$a f10f;

    @Override // a.a.a.a.c
    protected void a(int i2, Bundle bundle) {
        if (this.f10f == null) {
        }
        MediaSessionCompat.a(bundle);
        switch (i2) {
            case -1:
                this.f10f.c(this.f8d, this.f9e, bundle);
                break;
            case 0:
                this.f10f.b(this.f8d, this.f9e, bundle);
                break;
            case 1:
                this.f10f.a(this.f8d, this.f9e, bundle);
                break;
            default:
                Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.f9e + ", resultData=" + bundle + ")");
                break;
        }
    }
}

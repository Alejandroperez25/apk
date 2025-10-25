package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: Access modifiers changed from: private */
/* loaded from: classes.dex */
public class MediaBrowserCompat$ItemReceiver extends a.a.a.a.c {

    /* renamed from: d, reason: collision with root package name */
    private final String f11d;

    /* renamed from: e, reason: collision with root package name */
    private final MediaBrowserCompat$b f12e;

    @Override // a.a.a.a.c
    protected void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f12e.a(this.f11d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f12e.a((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f12e.a(this.f11d);
        }
    }
}

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 implements MediaControllerCompat$a {
    abstract void a();

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f42a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f42a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.mLock) {
                mediaControllerCompat$MediaControllerImplApi21.mSessionToken.a(a.AbstractBinderC0002a.a(androidx.core.app.c.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.mSessionToken.a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }
}

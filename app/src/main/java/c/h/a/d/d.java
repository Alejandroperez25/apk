package c.h.a.d;

import android.media.MediaCodec;
import android.util.Log;

/* loaded from: classes.dex */
class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f4760a;

    d(f fVar) {
        this.f4760a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() throws MediaCodec.CryptoException {
        while (((c.h.a.a) this.f4760a).f4662d) {
            try {
                this.f4760a.c(null);
            } catch (IllegalStateException e2) {
                Log.i("VideoEncoder", "Encoding error", e2);
            }
        }
    }
}

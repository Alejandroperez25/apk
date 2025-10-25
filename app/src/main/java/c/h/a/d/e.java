package c.h.a.d;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* loaded from: classes.dex */
class e extends MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f4761a;

    e(f fVar) {
        this.f4761a = fVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) throws MediaCodec.CryptoException {
        try {
            this.f4761a.a(mediaCodec, i2, (c.h.a.c) null);
        } catch (IllegalStateException e2) {
            Log.i("VideoEncoder", "Encoding error", e2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.f4761a.a(mediaCodec, i2, bufferInfo);
        } catch (IllegalStateException e2) {
            Log.i("VideoEncoder", "Encoding error", e2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        Log.e("VideoEncoder", "Error", codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f4761a.a(mediaCodec, mediaFormat);
    }
}

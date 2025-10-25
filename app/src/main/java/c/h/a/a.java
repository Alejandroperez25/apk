package c.h.a;

import android.media.MediaCodec;
import android.os.Build;
import c.h.a.c.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class a implements b {

    /* renamed from: b, reason: collision with root package name */
    protected MediaCodec f4660b;

    /* renamed from: c, reason: collision with root package name */
    protected long f4661c;

    /* renamed from: a, reason: collision with root package name */
    private MediaCodec.BufferInfo f4659a = new MediaCodec.BufferInfo();

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f4662d = false;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f4663e = true;

    /* renamed from: f, reason: collision with root package name */
    protected a.EnumC0054a f4664f = a.EnumC0054a.FIRST_COMPATIBLE_FOUND;

    protected abstract void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    public abstract void a(boolean z);

    protected abstract void b();

    protected abstract void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    protected abstract c d();

    public void a() {
        a(true);
    }

    public void c() {
        this.f4662d = false;
        b();
        if (this.f4660b != null) {
            this.f4660b.stop();
            this.f4660b.release();
            this.f4660b = null;
        }
    }

    protected void c(c cVar) throws MediaCodec.CryptoException {
        int iDequeueInputBuffer;
        if (this.f4663e && (iDequeueInputBuffer = this.f4660b.dequeueInputBuffer(0L)) >= 0) {
            a(this.f4660b, iDequeueInputBuffer, cVar);
        }
        while (this.f4662d) {
            int iDequeueOutputBuffer = this.f4660b.dequeueOutputBuffer(this.f4659a, 0L);
            if (iDequeueOutputBuffer == -2) {
                a(this.f4660b, this.f4660b.getOutputFormat());
            } else if (iDequeueOutputBuffer < 0) {
                return;
            } else {
                a(this.f4660b, iDequeueOutputBuffer, this.f4659a);
            }
        }
    }

    private void a(ByteBuffer byteBuffer, MediaCodec mediaCodec, int i2, c cVar) throws MediaCodec.CryptoException {
        if (cVar == null) {
            try {
                cVar = d();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        byteBuffer.clear();
        byteBuffer.put(cVar.a(), cVar.e(), cVar.f());
        mediaCodec.queueInputBuffer(i2, 0, cVar.f(), (System.nanoTime() / 1000) - this.f4661c, 0);
    }

    private void a(ByteBuffer byteBuffer, MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        a(byteBuffer, bufferInfo);
        b(byteBuffer, bufferInfo);
        mediaCodec.releaseOutputBuffer(i2, false);
    }

    public void a(MediaCodec mediaCodec, int i2, c cVar) throws MediaCodec.CryptoException {
        ByteBuffer inputBuffer;
        if (Build.VERSION.SDK_INT >= 21) {
            inputBuffer = mediaCodec.getInputBuffer(i2);
        } else {
            inputBuffer = mediaCodec.getInputBuffers()[i2];
        }
        a(inputBuffer, mediaCodec, i2, cVar);
    }

    public void a(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer outputBuffer;
        if (Build.VERSION.SDK_INT >= 21) {
            outputBuffer = mediaCodec.getOutputBuffer(i2);
        } else {
            outputBuffer = mediaCodec.getOutputBuffers()[i2];
        }
        a(outputBuffer, mediaCodec, i2, bufferInfo);
    }
}

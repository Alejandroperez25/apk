package c.h.a.d;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import c.h.a.c.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class f extends c.h.a.a implements c.h.a.b.c.e {

    /* renamed from: g, reason: collision with root package name */
    private c f4762g;
    private Surface j;
    private HandlerThread t;
    private MediaCodec.Callback v;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4763h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4764i = false;
    private int k = 640;
    private int l = 480;
    private int m = 30;
    private int n = 1228800;
    private int o = 90;
    private int p = 2;
    private c.h.a.b.c.d q = new c.h.a.b.c.d();
    private String r = "video/avc";
    private b s = b.YUV420Dynamical;
    private BlockingQueue<c.h.a.c> u = new ArrayBlockingQueue(80);

    public f(c cVar) {
        this.f4762g = cVar;
    }

    public boolean a(int i2, int i3, int i4, int i5, int i6, boolean z, int i7, b bVar) {
        String str;
        MediaFormat mediaFormatCreateVideoFormat;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = i6;
        this.f4764i = z;
        this.s = bVar;
        this.f4663e = true;
        MediaCodecInfo mediaCodecInfoA = a(this.r);
        try {
            if (mediaCodecInfoA != null) {
                this.f4660b = MediaCodec.createByCodecName(mediaCodecInfoA.getName());
                if (this.s == b.YUV420Dynamical) {
                    this.s = a(mediaCodecInfoA);
                    if (this.s == null) {
                        Log.e("VideoEncoder", "YUV420 dynamical choose failed");
                        return false;
                    }
                }
                if (!z && (i6 == 90 || i6 == 270)) {
                    str = i3 + "x" + i2;
                    mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.r, i3, i2);
                } else {
                    str = i2 + "x" + i3;
                    mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.r, i2, i3);
                }
                Log.i("VideoEncoder", "Prepare video info: " + this.s.name() + ", " + str);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.s.a());
                mediaFormatCreateVideoFormat.setInteger("max-input-size", 0);
                mediaFormatCreateVideoFormat.setInteger("bitrate", i5);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i7);
                if (z) {
                    mediaFormatCreateVideoFormat.setInteger("rotation-degrees", i6);
                }
                this.f4660b.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f4662d = false;
                if (bVar == b.SURFACE && Build.VERSION.SDK_INT >= 18) {
                    this.f4663e = false;
                    this.j = this.f4660b.createInputSurface();
                }
                Log.i("VideoEncoder", "prepared");
                return true;
            }
            Log.e("VideoEncoder", "Valid encoder not found");
            return false;
        } catch (IOException | IllegalStateException e2) {
            Log.e("VideoEncoder", "Create VideoEncoder failed.", e2);
            return false;
        }
    }

    @Override // c.h.a.a
    public void a(boolean z) {
        this.f4763h = false;
        if (z) {
            this.f4661c = System.nanoTime() / 1000;
            this.q.a(this.m);
        }
        if (this.s != b.SURFACE) {
            c.h.a.c.b.c.a(((this.k * this.l) * 3) / 2);
        }
        this.t = new HandlerThread("VideoEncoder");
        this.t.start();
        Handler handler = new Handler(this.t.getLooper());
        if (Build.VERSION.SDK_INT >= 23) {
            k();
            this.f4660b.setCallback(this.v, handler);
            this.f4660b.start();
        } else {
            this.f4660b.start();
            handler.post(new d(this));
        }
        this.f4662d = true;
        Log.i("VideoEncoder", "started");
    }

    @Override // c.h.a.a
    protected void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.t.quitSafely();
        } else {
            this.t.quit();
        }
        this.u.clear();
        this.f4763h = false;
        this.j = null;
        Log.i("VideoEncoder", "stopped");
    }

    public void e() {
        c();
        a(this.k, this.l, this.m, this.n, this.o, this.f4764i, this.p, this.s);
        a(false);
    }

    private b a(MediaCodecInfo mediaCodecInfo) {
        for (int i2 : mediaCodecInfo.getCapabilitiesForType("video/avc").colorFormats) {
            if (i2 == b.YUV420PLANAR.a()) {
                return b.YUV420PLANAR;
            }
            if (i2 == b.YUV420SEMIPLANAR.a()) {
                return b.YUV420SEMIPLANAR;
            }
        }
        return null;
    }

    public Surface f() {
        return this.j;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.o;
    }

    public int j() {
        return this.m;
    }

    @Override // c.h.a.b.c.e
    public void a(c.h.a.c cVar) {
        if (!this.f4662d || this.u.offer(cVar)) {
            return;
        }
        Log.i("VideoEncoder", "frame discarded");
    }

    private void a(MediaFormat mediaFormat) {
        if (this.r.equals("video/hevc")) {
            List<ByteBuffer> listA = a(mediaFormat.getByteBuffer("csd-0"));
            this.f4762g.a(listA.get(1), listA.get(2), listA.get(0));
        } else {
            this.f4762g.a(mediaFormat.getByteBuffer("csd-0"), mediaFormat.getByteBuffer("csd-1"));
        }
    }

    protected MediaCodecInfo a(String str) {
        List<MediaCodecInfo> listC;
        if (this.f4664f == a.EnumC0054a.HARDWARE) {
            listC = c.h.a.c.a.a(str);
        } else if (this.f4664f == a.EnumC0054a.SOFTWARE) {
            listC = c.h.a.c.a.b(str);
        } else {
            listC = c.h.a.c.a.c(str);
        }
        for (MediaCodecInfo mediaCodecInfo : listC) {
            Log.i("VideoEncoder", String.format("VideoEncoder %s", mediaCodecInfo.getName()));
            for (int i2 : mediaCodecInfo.getCapabilitiesForType(str).colorFormats) {
                Log.i("VideoEncoder", "Color supported: " + i2);
                if (this.s == b.SURFACE) {
                    if (i2 == b.SURFACE.a()) {
                        return mediaCodecInfo;
                    }
                } else if (i2 == b.YUV420PLANAR.a() || i2 == b.YUV420SEMIPLANAR.a()) {
                    return mediaCodecInfo;
                }
            }
        }
        return null;
    }

    private Pair<ByteBuffer, ByteBuffer> a(ByteBuffer byteBuffer, int i2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = new byte[i2];
        byteBuffer.get(bArr3, 0, i2);
        int i3 = 0;
        int i4 = -1;
        while (true) {
            if (i3 >= i2 - 4) {
                i3 = -1;
                break;
            }
            if (bArr3[i3] == 0 && bArr3[i3 + 1] == 0 && bArr3[i3 + 2] == 0 && bArr3[i3 + 3] == 1) {
                if (i4 != -1) {
                    break;
                }
                i4 = i3;
            }
            i3++;
        }
        if (i4 == -1 || i3 == -1) {
            bArr = null;
            bArr2 = null;
        } else {
            bArr = new byte[i3];
            System.arraycopy(bArr3, i4, bArr, 0, i3);
            int i5 = i2 - i3;
            bArr2 = new byte[i5];
            System.arraycopy(bArr3, i3, bArr2, 0, i5);
        }
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return new Pair<>(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
    }

    private List<ByteBuffer> a(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        byte[] bArrArray = byteBuffer.array();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < bArrArray.length; i6++) {
            if (i2 == 3 && bArrArray[i6] == 1) {
                if (i5 == -1) {
                    i5 = i6 - 3;
                } else if (i3 == -1) {
                    i3 = i6 - 3;
                } else {
                    i4 = i6 - 3;
                }
            }
            i2 = bArrArray[i6] == 0 ? i2 + 1 : 0;
        }
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i4 - i3];
        byte[] bArr3 = new byte[bArrArray.length - i4];
        for (int i7 = 0; i7 < bArrArray.length; i7++) {
            if (i7 < i3) {
                bArr[i7] = bArrArray[i7];
            } else if (i7 < i4) {
                bArr2[i7 - i3] = bArrArray[i7];
            } else {
                bArr3[i7 - i4] = bArrArray[i7];
            }
        }
        arrayList.add(ByteBuffer.wrap(bArr));
        arrayList.add(ByteBuffer.wrap(bArr2));
        arrayList.add(ByteBuffer.wrap(bArr3));
        return arrayList;
    }

    @Override // c.h.a.a
    protected c.h.a.c d() throws InterruptedException {
        byte[] bArrA;
        c.h.a.c cVarTake = this.u.take();
        if (this.q.a()) {
            return d();
        }
        byte[] bArrA2 = cVarTake.a();
        boolean z = cVarTake.d() == 842094169;
        if (!this.f4764i) {
            int iB = cVarTake.c() ? cVarTake.b() + 180 : cVarTake.b();
            if (iB >= 360) {
                iB -= 360;
            }
            if (z) {
                bArrA2 = c.h.a.c.b.c.b(bArrA2, this.k, this.l, iB);
            } else {
                bArrA2 = c.h.a.c.b.c.a(bArrA2, this.k, this.l, iB);
            }
        }
        if (z) {
            bArrA = c.h.a.c.b.c.b(bArrA2, this.k, this.l, this.s);
        } else {
            bArrA = c.h.a.c.b.c.a(bArrA2, this.k, this.l, this.s);
        }
        cVarTake.a(bArrA);
        return cVarTake;
    }

    @Override // c.h.a.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f4762g.b(mediaFormat);
        a(mediaFormat);
        this.f4763h = true;
    }

    @Override // c.h.a.a
    protected void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Pair<ByteBuffer, ByteBuffer> pairA;
        if ((bufferInfo.flags & 2) == 0 || this.f4763h || (pairA = a(byteBuffer.duplicate(), bufferInfo.size)) == null) {
            return;
        }
        this.f4762g.a((ByteBuffer) pairA.first, (ByteBuffer) pairA.second);
        this.f4763h = true;
    }

    @Override // c.h.a.a
    protected void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        bufferInfo.presentationTimeUs = (System.nanoTime() / 1000) - this.f4661c;
        this.f4762g.a(byteBuffer, bufferInfo);
    }

    private void k() {
        this.v = new e(this);
    }
}

package c.h.a.a;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import c.h.a.c;
import c.h.a.c.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends c.h.a.a implements c.h.a.b.a.b {

    /* renamed from: g, reason: collision with root package name */
    private b f4665g;

    /* renamed from: h, reason: collision with root package name */
    private int f4666h = 65536;

    /* renamed from: i, reason: collision with root package name */
    private int f4667i = 32000;
    private boolean j = true;

    @Override // c.h.a.a
    protected void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
    }

    @Override // c.h.a.a
    protected c d() {
        return null;
    }

    public a(b bVar) {
        this.f4665g = bVar;
    }

    public boolean a(int i2, int i3, boolean z, int i4) {
        this.f4667i = i3;
        this.f4663e = true;
        try {
            List arrayList = new ArrayList();
            if (this.f4664f == a.EnumC0054a.HARDWARE) {
                arrayList = c.h.a.c.a.a("audio/mp4a-latm");
            } else if (this.f4664f == a.EnumC0054a.SOFTWARE) {
                arrayList = c.h.a.c.a.b("audio/mp4a-latm");
            }
            if (this.f4664f == a.EnumC0054a.FIRST_COMPATIBLE_FOUND) {
                MediaCodecInfo mediaCodecInfoA = a("audio/mp4a-latm");
                if (mediaCodecInfoA != null) {
                    this.f4660b = MediaCodec.createByCodecName(mediaCodecInfoA.getName());
                } else {
                    Log.e("AudioEncoder", "Valid encoder not found");
                    return false;
                }
            } else {
                if (arrayList.isEmpty()) {
                    Log.e("AudioEncoder", "Valid encoder not found");
                    return false;
                }
                this.f4660b = MediaCodec.createByCodecName(((MediaCodecInfo) arrayList.get(0)).getName());
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i3, z ? 2 : 1);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i2);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", i4);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            this.f4660b.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f4662d = false;
            Log.i("AudioEncoder", "prepared");
            return true;
        } catch (IOException | IllegalStateException e2) {
            Log.e("AudioEncoder", "Create AudioEncoder failed.", e2);
            return false;
        }
    }

    @Override // c.h.a.a
    public void a(boolean z) {
        this.f4661c = System.nanoTime() / 1000;
        this.f4660b.start();
        this.f4662d = true;
        Log.i("AudioEncoder", "started");
    }

    @Override // c.h.a.a
    protected void b() {
        Log.i("AudioEncoder", "stopped");
    }

    @Override // c.h.a.a
    protected void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f4665g.b(byteBuffer, bufferInfo);
    }

    @Override // c.h.a.b.a.b
    public void b(c cVar) throws MediaCodec.CryptoException {
        if (this.f4662d) {
            try {
                c(cVar);
                return;
            } catch (IllegalStateException e2) {
                Log.i("AudioEncoder", "Encoding error", e2);
                return;
            }
        }
        Log.i("AudioEncoder", "frame discarded");
    }

    protected MediaCodecInfo a(String str) {
        List<MediaCodecInfo> listC = c.h.a.c.a.c(str);
        for (MediaCodecInfo mediaCodecInfo : listC) {
            if (!mediaCodecInfo.getName().toLowerCase().contains("omx.google")) {
                return mediaCodecInfo;
            }
        }
        if (listC.size() > 0) {
            return listC.get(0);
        }
        return null;
    }

    @Override // c.h.a.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f4665g.a(mediaFormat);
    }
}

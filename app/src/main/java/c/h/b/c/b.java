package c.h.b.c;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private MediaMuxer f4778b;

    /* renamed from: c, reason: collision with root package name */
    private MediaFormat f4779c;

    /* renamed from: d, reason: collision with root package name */
    private MediaFormat f4780d;

    /* renamed from: g, reason: collision with root package name */
    private a f4783g;

    /* renamed from: a, reason: collision with root package name */
    private EnumC0056b f4777a = EnumC0056b.STOPPED;

    /* renamed from: e, reason: collision with root package name */
    private int f4781e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f4782f = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f4784h = 0;

    /* renamed from: i, reason: collision with root package name */
    private long f4785i = 0;
    private MediaCodec.BufferInfo j = new MediaCodec.BufferInfo();
    private MediaCodec.BufferInfo k = new MediaCodec.BufferInfo();

    public interface a {
        void a(EnumC0056b enumC0056b);
    }

    /* renamed from: c.h.b.c.b$b, reason: collision with other inner class name */
    public enum EnumC0056b {
        STARTED,
        STOPPED,
        RECORDING,
        PAUSED,
        RESUMED
    }

    public boolean a() {
        return this.f4777a == EnumC0056b.STARTED || this.f4777a == EnumC0056b.RECORDING || this.f4777a == EnumC0056b.RESUMED || this.f4777a == EnumC0056b.PAUSED;
    }

    public boolean b() {
        return this.f4777a == EnumC0056b.RECORDING;
    }

    public void c() {
        this.f4779c = null;
        this.f4780d = null;
    }

    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f4777a == EnumC0056b.STARTED && bufferInfo.flags == 1 && this.f4779c != null && this.f4780d != null) {
            this.f4781e = this.f4778b.addTrack(this.f4779c);
            this.f4782f = this.f4778b.addTrack(this.f4780d);
            this.f4778b.start();
            this.f4777a = EnumC0056b.RECORDING;
            if (this.f4783g != null) {
                this.f4783g.a(this.f4777a);
            }
        } else if (this.f4777a == EnumC0056b.RESUMED && bufferInfo.flags == 1) {
            this.f4777a = EnumC0056b.RECORDING;
            if (this.f4783g != null) {
                this.f4783g.a(this.f4777a);
            }
        }
        if (this.f4777a == EnumC0056b.RECORDING) {
            a(this.j, bufferInfo);
            this.f4778b.writeSampleData(this.f4781e, byteBuffer, this.j);
        }
    }

    public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f4777a == EnumC0056b.RECORDING) {
            a(this.k, bufferInfo);
            this.f4778b.writeSampleData(this.f4782f, byteBuffer, this.k);
        }
    }

    public void a(MediaFormat mediaFormat) {
        this.f4779c = mediaFormat;
    }

    public void b(MediaFormat mediaFormat) {
        this.f4780d = mediaFormat;
    }

    private void a(MediaCodec.BufferInfo bufferInfo, MediaCodec.BufferInfo bufferInfo2) {
        bufferInfo.flags = bufferInfo2.flags;
        bufferInfo.offset = bufferInfo2.offset;
        bufferInfo.size = bufferInfo2.size;
        bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs - this.f4785i;
    }
}

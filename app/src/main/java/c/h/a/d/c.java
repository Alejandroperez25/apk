package c.h.a.d;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface c {
    void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    void b(MediaFormat mediaFormat);
}

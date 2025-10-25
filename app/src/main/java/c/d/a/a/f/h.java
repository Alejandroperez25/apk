package c.d.a.a.f;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import c.d.a.a.n.j;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class h {
    public static void a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer("csd-" + i2, ByteBuffer.wrap(list.get(i2)));
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, j jVar) {
        if (jVar != null) {
            a(mediaFormat, "color-transfer", jVar.f3636c);
            a(mediaFormat, "color-standard", jVar.f3634a);
            a(mediaFormat, "color-range", jVar.f3635b);
            a(mediaFormat, "hdr-static-info", jVar.f3637d);
        }
    }
}

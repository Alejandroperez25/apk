package c.h.b.b;

import android.content.Context;
import android.media.MediaCodec;
import h.a.a.b;
import h.a.a.h;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a extends c.h.b.a.a {
    private h n;

    public a(Context context, b bVar) {
        super(context);
        this.n = new h(bVar);
    }

    @Override // c.h.b.a.a
    protected void a(boolean z, int i2) {
        this.n.a(z);
        this.n.a(i2);
    }

    @Override // c.h.b.a.a
    protected void a(String str) {
        if (this.f4767c.i() == 90 || this.f4767c.i() == 270) {
            this.n.a(this.f4767c.h(), this.f4767c.g());
        } else {
            this.n.a(this.f4767c.g(), this.f4767c.h());
        }
        this.n.a(str);
    }

    @Override // c.h.b.a.a
    protected void d() throws InterruptedException {
        this.n.e();
    }

    public void a(int i2) {
        this.n.b(i2);
    }

    @Override // c.h.b.a.a
    protected void c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.n.b(byteBuffer, bufferInfo);
    }

    @Override // c.h.b.a.a
    protected void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.n.a(byteBuffer, byteBuffer2);
    }

    @Override // c.h.b.a.a
    protected void d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.n.a(byteBuffer, bufferInfo);
    }
}

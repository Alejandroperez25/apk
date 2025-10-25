package c.h.a.b.b.a;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected FloatBuffer f4686a;

    /* renamed from: b, reason: collision with root package name */
    protected float[] f4687b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f4688c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    protected d f4689d = new d();

    /* renamed from: e, reason: collision with root package name */
    protected int f4690e;

    /* renamed from: f, reason: collision with root package name */
    protected int f4691f;

    public abstract void a();

    public int b() {
        return this.f4689d.a()[0];
    }

    protected void a(int i2, int i3) {
        a(i2, i3, this.f4689d.b(), this.f4689d.c(), this.f4689d.a());
    }

    protected void a(int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        c.h.a.c.a.a.a("initFBO_S");
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenRenderbuffers(1, iArr2, 0);
        GLES20.glGenTextures(1, iArr3, 0);
        GLES20.glBindRenderbuffer(36161, iArr2[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i2, i3);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr2[0]);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[0], 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            throw new RuntimeException("FrameBuffer uncompleted code: " + iGlCheckFramebufferStatus);
        }
        c.h.a.c.a.a.a("initFBO_E");
    }
}

package c.h.a.b.b.a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import c.h.a.d$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: g, reason: collision with root package name */
    private int[] f4695g = new int[1];

    /* renamed from: h, reason: collision with root package name */
    private float[] f4696h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private float[] f4697i = new float[16];
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private SurfaceTexture o;
    private Surface p;

    public b() {
        Matrix.setIdentityM(this.f4687b, 0);
        Matrix.setIdentityM(this.f4688c, 0);
        float[] fArrA = c.h.a.b.c.b.a();
        this.f4686a = ByteBuffer.allocateDirect(fArrA.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4686a.put(fArrA).position(0);
        a(0);
        a(false, false);
    }

    public void a(int i2, int i3, Context context, int i4, int i5) {
        this.f4690e = i2;
        this.f4691f = i3;
        c.h.a.c.a.a.a("initGl start");
        this.j = c.h.a.c.a.a.a(c.h.a.c.a.a.a(context, d$a.simple_vertex), c.h.a.c.a.a.a(context, d$a.camera_fragment));
        this.m = GLES20.glGetAttribLocation(this.j, "aPosition");
        this.n = GLES20.glGetAttribLocation(this.j, "aTextureCoord");
        this.k = GLES20.glGetUniformLocation(this.j, "uMVPMatrix");
        this.l = GLES20.glGetUniformLocation(this.j, "uSTMatrix");
        this.l = GLES20.glGetUniformLocation(this.j, "uSTMatrix");
        c.h.a.c.a.a.a(1, this.f4695g, 0);
        this.o = new SurfaceTexture(this.f4695g[0]);
        this.o.setDefaultBufferSize(i2, i3);
        this.p = new Surface(this.o);
        a(i2, i3);
        c.h.a.c.a.a.a("initGl end");
    }

    public void c() {
        c.h.a.c.a.a.a("drawCamera start");
        GLES20.glBindFramebuffer(36160, this.f4689d.b()[0]);
        this.o.getTransformMatrix(this.f4688c);
        GLES20.glViewport(0, 0, this.f4690e, this.f4691f);
        GLES20.glUseProgram(this.j);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        this.f4686a.position(0);
        GLES20.glVertexAttribPointer(this.m, 3, 5126, false, 20, (Buffer) this.f4686a);
        GLES20.glEnableVertexAttribArray(this.m);
        this.f4686a.position(3);
        GLES20.glVertexAttribPointer(this.n, 2, 5126, false, 20, (Buffer) this.f4686a);
        GLES20.glEnableVertexAttribArray(this.n);
        GLES20.glUniformMatrix4fv(this.k, 1, false, this.f4687b, 0);
        GLES20.glUniformMatrix4fv(this.l, 1, false, this.f4688c, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f4695g[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        c.h.a.c.a.a.a("drawCamera end");
    }

    @Override // c.h.a.b.b.a.a
    public void a() {
        GLES20.glDeleteProgram(this.j);
        this.o = null;
        this.p = null;
    }

    public void d() {
        this.o.updateTexImage();
    }

    public SurfaceTexture e() {
        return this.o;
    }

    public void a(int i2) {
        Matrix.setIdentityM(this.f4696h, 0);
        Matrix.rotateM(this.f4696h, 0, i2, 0.0f, 0.0f, -1.0f);
        f();
    }

    public void a(boolean z, boolean z2) {
        Matrix.setIdentityM(this.f4697i, 0);
        Matrix.scaleM(this.f4697i, 0, z ? -1.0f : 1.0f, z2 ? -1.0f : 1.0f, 1.0f);
        f();
    }

    private void f() {
        Matrix.setIdentityM(this.f4687b, 0);
        Matrix.multiplyMM(this.f4687b, 0, this.f4697i, 0, this.f4687b, 0);
        Matrix.multiplyMM(this.f4687b, 0, this.f4696h, 0, this.f4687b, 0);
    }
}

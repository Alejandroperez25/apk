package c.h.a.b.b.a.a;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import c.h.a.d$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends a {
    private final float[] m = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;

    public b() {
        this.f4686a = ByteBuffer.allocateDirect(this.m.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4686a.put(this.m).position(0);
        Matrix.setIdentityM(this.f4687b, 0);
        Matrix.setIdentityM(this.f4688c, 0);
    }

    @Override // c.h.a.b.b.a.a.a
    protected void a(Context context) {
        this.n = c.h.a.c.a.a.a(c.h.a.c.a.a.a(context, d$a.simple_vertex), c.h.a.c.a.a.a(context, d$a.simple_fragment));
        this.o = GLES20.glGetAttribLocation(this.n, "aPosition");
        this.p = GLES20.glGetAttribLocation(this.n, "aTextureCoord");
        this.q = GLES20.glGetUniformLocation(this.n, "uMVPMatrix");
        this.r = GLES20.glGetUniformLocation(this.n, "uSTMatrix");
        this.s = GLES20.glGetUniformLocation(this.n, "uSampler");
    }

    @Override // c.h.a.b.b.a.a.a
    protected void e() {
        GLES20.glUseProgram(this.n);
        this.f4686a.position(0);
        GLES20.glVertexAttribPointer(this.o, 3, 5126, false, 20, (Buffer) this.f4686a);
        GLES20.glEnableVertexAttribArray(this.o);
        this.f4686a.position(3);
        GLES20.glVertexAttribPointer(this.p, 2, 5126, false, 20, (Buffer) this.f4686a);
        GLES20.glEnableVertexAttribArray(this.p);
        GLES20.glUniformMatrix4fv(this.q, 1, false, this.f4687b, 0);
        GLES20.glUniformMatrix4fv(this.r, 1, false, this.f4688c, 0);
        GLES20.glUniform1i(this.s, 4);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, this.k);
    }

    @Override // c.h.a.b.b.a.a
    public void a() {
        GLES20.glDeleteProgram(this.n);
    }
}

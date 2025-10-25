package c.h.a.b.b.a;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import c.h.a.d$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private int f4715f;
    private int o;
    private int p;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f4710a = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private float[] f4712c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private float[] f4713d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    private boolean f4714e = false;

    /* renamed from: g, reason: collision with root package name */
    private int f4716g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f4717h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f4718i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;

    /* renamed from: b, reason: collision with root package name */
    private FloatBuffer f4711b = ByteBuffer.allocateDirect(this.f4710a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public e() {
        this.f4711b.put(this.f4710a).position(0);
        Matrix.setIdentityM(this.f4712c, 0);
        Matrix.setIdentityM(this.f4713d, 0);
    }

    public void a(Context context) {
        c.h.a.c.a.a.a("initGl start");
        this.f4716g = c.h.a.c.a.a.a(c.h.a.c.a.a.a(context, d$a.simple_vertex), c.h.a.c.a.a.a(context, d$a.fxaa));
        this.j = GLES20.glGetAttribLocation(this.f4716g, "aPosition");
        this.k = GLES20.glGetAttribLocation(this.f4716g, "aTextureCoord");
        this.f4717h = GLES20.glGetUniformLocation(this.f4716g, "uMVPMatrix");
        this.f4718i = GLES20.glGetUniformLocation(this.f4716g, "uSTMatrix");
        this.l = GLES20.glGetUniformLocation(this.f4716g, "uSampler");
        this.m = GLES20.glGetUniformLocation(this.f4716g, "uResolution");
        this.n = GLES20.glGetUniformLocation(this.f4716g, "uAAEnabled");
        c.h.a.c.a.a.a("initGl end");
    }

    public void a(int i2, int i3, boolean z) {
        c.h.a.c.a.a.a("drawScreen start");
        c.h.a.c.a.b.a(z, i2, i3, this.o, this.p);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f4716g);
        this.f4711b.position(0);
        GLES20.glVertexAttribPointer(this.j, 3, 5126, false, 20, (Buffer) this.f4711b);
        GLES20.glEnableVertexAttribArray(this.j);
        this.f4711b.position(3);
        GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 20, (Buffer) this.f4711b);
        GLES20.glEnableVertexAttribArray(this.k);
        GLES20.glUniformMatrix4fv(this.f4717h, 1, false, this.f4712c, 0);
        GLES20.glUniformMatrix4fv(this.f4718i, 1, false, this.f4713d, 0);
        GLES20.glUniform2f(this.m, i2, i3);
        GLES20.glUniform1f(this.n, this.f4714e ? 1.0f : 0.0f);
        GLES20.glUniform1i(this.l, 5);
        GLES20.glActiveTexture(33989);
        GLES20.glBindTexture(3553, this.f4715f);
        GLES20.glDrawArrays(5, 0, 4);
        c.h.a.c.a.a.a("drawScreen end");
    }

    public void a() {
        GLES20.glDeleteProgram(this.f4716g);
    }

    public void a(int i2) {
        this.f4715f = i2;
    }

    public void a(boolean z) {
        this.f4714e = z;
    }

    public void a(int i2, int i3) {
        this.o = i2;
        this.p = i3;
    }
}

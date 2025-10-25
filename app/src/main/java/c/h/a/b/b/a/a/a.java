package c.h.a.b.b.a.a;

import android.content.Context;
import android.opengl.GLES20;
import c.h.a.b.b.a.d;

/* loaded from: classes.dex */
public abstract class a extends c.h.a.b.b.a.a {

    /* renamed from: g, reason: collision with root package name */
    private int f4692g;

    /* renamed from: h, reason: collision with root package name */
    private int f4693h;

    /* renamed from: i, reason: collision with root package name */
    private int f4694i;
    private int j;
    protected int k;
    private d l = new d();

    protected abstract void a(Context context);

    protected abstract void e();

    public void a(int i2, int i3, Context context, int i4, int i5) {
        this.f4692g = i2;
        this.f4693h = i3;
        this.f4694i = i4;
        this.j = i5;
        c.h.a.c.a.a.a("initGl start");
        a(context);
        c.h.a.c.a.a.a("initGl end");
    }

    public void c() {
        a(this.f4692g, this.f4693h, this.l.b(), this.l.c(), this.l.a());
    }

    public void d() {
        c.h.a.c.a.a.a("drawFilter start");
        GLES20.glBindFramebuffer(36160, this.l.b()[0]);
        GLES20.glViewport(0, 0, this.f4692g, this.f4693h);
        e();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        c.h.a.c.a.a.a("drawFilter end");
    }

    public void a(int i2) {
        this.k = i2;
    }

    @Override // c.h.a.b.b.a.a
    public int b() {
        return this.l.a()[0];
    }

    public int f() {
        return this.k;
    }

    public d g() {
        return this.l;
    }

    public void a(d dVar) {
        this.l = dVar;
    }
}

package c.h.a.b.b;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private EGLContext f4683a = null;

    /* renamed from: b, reason: collision with root package name */
    private EGLSurface f4684b = null;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f4685c = null;

    public a(Surface surface, a aVar) {
        a(surface, aVar.f4683a);
    }

    public a() {
        a(null, null);
    }

    public void a() {
        if (EGL14.eglMakeCurrent(this.f4685c, this.f4684b, this.f4684b, this.f4683a)) {
            return;
        }
        Log.e("Error", "eglMakeCurrent failed");
    }

    public void b() {
        EGL14.eglSwapBuffers(this.f4685c, this.f4684b);
    }

    private void a(Surface surface, EGLContext eGLContext) {
        int[] iArr;
        this.f4685c = EGL14.eglGetDisplay(0);
        if (this.f4685c == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr2 = new int[2];
        if (!EGL14.eglInitialize(this.f4685c, iArr2, 0, iArr2, 1)) {
            throw new RuntimeException("unable to initialize EGL14");
        }
        if (eGLContext == null) {
            iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
        } else {
            iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
        }
        int[] iArr3 = iArr;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f4685c, iArr3, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0);
        c.h.a.c.a.a.b("eglCreateContext RGB888+recordable ES2");
        int[] iArr4 = {12440, 2, 12344};
        EGLDisplay eGLDisplay = this.f4685c;
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        this.f4683a = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr4, 0);
        c.h.a.c.a.a.b("eglCreateContext");
        if (surface == null) {
            this.f4684b = EGL14.eglCreatePbufferSurface(this.f4685c, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        } else {
            this.f4684b = EGL14.eglCreateWindowSurface(this.f4685c, eGLConfigArr[0], surface, new int[]{12344}, 0);
        }
        c.h.a.c.a.a.b("eglCreateWindowSurface");
    }

    public void c() {
        if (this.f4685c != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.f4685c, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f4685c, this.f4684b);
            EGL14.eglDestroyContext(this.f4685c, this.f4683a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f4685c);
        }
        this.f4685c = EGL14.EGL_NO_DISPLAY;
        this.f4683a = EGL14.EGL_NO_CONTEXT;
        this.f4684b = EGL14.EGL_NO_SURFACE;
    }
}

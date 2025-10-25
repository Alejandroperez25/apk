package c.d.a.a.m;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import b.a.a$i;

@TargetApi(a$i.AppCompatTheme_actionModeBackground)
/* loaded from: classes.dex */
public final class k implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f3522a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3523b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f3524c;

    /* renamed from: d, reason: collision with root package name */
    private final b f3525d;

    /* renamed from: e, reason: collision with root package name */
    private EGLDisplay f3526e;

    /* renamed from: f, reason: collision with root package name */
    private EGLContext f3527f;

    /* renamed from: g, reason: collision with root package name */
    private EGLSurface f3528g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f3529h;

    public interface b {
        void a();
    }

    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    public k(Handler handler) {
        this(handler, null);
    }

    public k(Handler handler, b bVar) {
        this.f3523b = handler;
        this.f3525d = bVar;
        this.f3524c = new int[1];
    }

    public void a(int i2) {
        this.f3526e = d();
        EGLConfig eGLConfigA = a(this.f3526e);
        this.f3527f = a(this.f3526e, eGLConfigA, i2);
        this.f3528g = a(this.f3526e, eGLConfigA, this.f3527f, i2);
        a(this.f3524c);
        this.f3529h = new SurfaceTexture(this.f3524c[0]);
        this.f3529h.setOnFrameAvailableListener(this);
    }

    public void a() {
        this.f3523b.removeCallbacks(this);
        try {
            if (this.f3529h != null) {
                this.f3529h.release();
                GLES20.glDeleteTextures(1, this.f3524c, 0);
            }
        } finally {
            if (this.f3526e != null && !this.f3526e.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.f3526e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            if (this.f3528g != null && !this.f3528g.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f3526e, this.f3528g);
            }
            if (this.f3527f != null) {
                EGL14.eglDestroyContext(this.f3526e, this.f3527f);
            }
            if (H.f3499a >= 19) {
                EGL14.eglReleaseThread();
            }
            if (this.f3526e != null && !this.f3526e.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f3526e);
            }
            this.f3526e = null;
            this.f3527f = null;
            this.f3528g = null;
            this.f3529h = null;
        }
    }

    public SurfaceTexture b() {
        SurfaceTexture surfaceTexture = this.f3529h;
        AbstractC0170e.a(surfaceTexture);
        return surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3523b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
        if (this.f3529h != null) {
            try {
                this.f3529h.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    private void c() {
        if (this.f3525d != null) {
            this.f3525d.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new a("eglInitialize failed");
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f3522a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new a(H.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
        int[] iArr;
        if (i2 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i2 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new a("glGenTextures failed. Error: " + Integer.toHexString(iGlGetError));
    }
}

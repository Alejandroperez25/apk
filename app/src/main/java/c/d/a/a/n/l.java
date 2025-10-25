package c.d.a.a.n;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b.a.a$i;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;

@TargetApi(a$i.AppCompatTheme_actionModeBackground)
/* loaded from: classes.dex */
public final class l extends Surface {

    /* renamed from: a, reason: collision with root package name */
    private static int f3639a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3640b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3641c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3642d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3643e;

    public static synchronized boolean a(Context context) {
        if (!f3640b) {
            f3639a = H.f3499a < 24 ? 0 : b(context);
            f3640b = true;
        }
        return f3639a != 0;
    }

    public static l a(Context context, boolean z) {
        f();
        AbstractC0170e.b(!z || a(context));
        return new a().a(z ? f3639a : 0);
    }

    private l(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f3642d = aVar;
        this.f3641c = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f3642d) {
            if (!this.f3643e) {
                this.f3642d.a();
                this.f3643e = true;
            }
        }
    }

    private static void f() {
        if (H.f3499a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    private static int b(Context context) {
        String strEglQueryString;
        if (H.f3499a < 26 && ("samsung".equals(H.f3501c) || "XT1650".equals(H.f3502d))) {
            return 0;
        }
        if ((H.f3499a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
            return strEglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    private static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private c.d.a.a.m.k f3644a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f3645b;

        /* renamed from: c, reason: collision with root package name */
        private Error f3646c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f3647d;

        /* renamed from: e, reason: collision with root package name */
        private l f3648e;

        public a() {
            super("dummySurface");
        }

        public l a(int i2) {
            boolean z;
            start();
            this.f3645b = new Handler(getLooper(), this);
            this.f3644a = new c.d.a.a.m.k(this.f3645b);
            synchronized (this) {
                z = false;
                this.f3645b.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f3648e == null && this.f3647d == null && this.f3646c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            if (this.f3647d != null) {
                throw this.f3647d;
            }
            if (this.f3646c != null) {
                throw this.f3646c;
            }
            l lVar = this.f3648e;
            AbstractC0170e.a(lVar);
            return lVar;
        }

        public void a() {
            AbstractC0170e.a(this.f3645b);
            this.f3645b.sendEmptyMessage(2);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 1
                switch(r0) {
                    case 1: goto L1e;
                    case 2: goto L7;
                    default: goto L6;
                }
            L6:
                return r1
            L7:
                r3.b()     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L10
            La:
                r3.quit()
                goto L19
            Le:
                r4 = move-exception
                goto L1a
            L10:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to release dummy surface"
                c.d.a.a.m.o.b(r0, r2, r4)     // Catch: java.lang.Throwable -> Le
                goto La
            L19:
                return r1
            L1a:
                r3.quit()
                throw r4
            L1e:
                int r4 = r4.arg1     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e java.lang.RuntimeException -> L41
                r3.b(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e java.lang.RuntimeException -> L41
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L29
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                goto L50
            L29:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                throw r4
            L2c:
                r4 = move-exception
                goto L54
            L2e:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                c.d.a.a.m.o.b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2c
                r3.f3646c = r4     // Catch: java.lang.Throwable -> L2c
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L3e
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
                goto L50
            L3e:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
                throw r4
            L41:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                c.d.a.a.m.o.b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2c
                r3.f3647d = r4     // Catch: java.lang.Throwable -> L2c
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L51
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            L50:
                return r1
            L51:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
                throw r4
            L54:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L5a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5a
                throw r4
            L5a:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5a
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.n.l.a.handleMessage(android.os.Message):boolean");
        }

        private void b(int i2) {
            AbstractC0170e.a(this.f3644a);
            this.f3644a.a(i2);
            this.f3648e = new l(this, this.f3644a.b(), i2 != 0);
        }

        private void b() {
            AbstractC0170e.a(this.f3644a);
            this.f3644a.a();
        }
    }
}

package c.d.a.a.n;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import b.a.a$i;
import c.d.a.a.m.H;

@TargetApi(16)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final WindowManager f3655a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3656b;

    /* renamed from: c, reason: collision with root package name */
    private final a f3657c;

    /* renamed from: d, reason: collision with root package name */
    private long f3658d;

    /* renamed from: e, reason: collision with root package name */
    private long f3659e;

    /* renamed from: f, reason: collision with root package name */
    private long f3660f;

    /* renamed from: g, reason: collision with root package name */
    private long f3661g;

    /* renamed from: h, reason: collision with root package name */
    private long f3662h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3663i;
    private long j;
    private long k;
    private long l;

    public q(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f3655a = (WindowManager) context.getSystemService("window");
        } else {
            this.f3655a = null;
        }
        if (this.f3655a != null) {
            this.f3657c = H.f3499a >= 17 ? a(context) : null;
            this.f3656b = b.a();
        } else {
            this.f3657c = null;
            this.f3656b = null;
        }
        this.f3658d = -9223372036854775807L;
        this.f3659e = -9223372036854775807L;
    }

    public void a() {
        this.f3663i = false;
        if (this.f3655a != null) {
            this.f3656b.b();
            if (this.f3657c != null) {
                this.f3657c.a();
            }
            c();
        }
    }

    public void b() {
        if (this.f3655a != null) {
            if (this.f3657c != null) {
                this.f3657c.b();
            }
            this.f3656b.c();
        }
    }

    public long a(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.f3663i) {
            if (j != this.f3660f) {
                this.l++;
                this.f3661g = this.f3662h;
            }
            if (this.l >= 6) {
                j4 = this.f3661g + ((j6 - this.k) / this.l);
                if (b(j4, j2)) {
                    this.f3663i = false;
                    j5 = j2;
                    j4 = j6;
                } else {
                    j5 = (this.j + j4) - this.k;
                }
                j3 = j5;
            } else {
                if (b(j6, j2)) {
                    this.f3663i = false;
                }
                j3 = j2;
                j4 = j6;
            }
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.f3663i) {
            this.k = j6;
            this.j = j2;
            this.l = 0L;
            this.f3663i = true;
        }
        this.f3660f = j;
        this.f3662h = j4;
        if (this.f3656b == null || this.f3658d == -9223372036854775807L) {
            return j3;
        }
        long j7 = this.f3656b.f3667b;
        return j7 == -9223372036854775807L ? j3 : a(j3, j7, this.f3658d) - this.f3659e;
    }

    @TargetApi(a$i.AppCompatTheme_actionModeBackground)
    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f3655a.getDefaultDisplay() != null) {
            this.f3658d = (long) (1.0E9d / r0.getRefreshRate());
            this.f3659e = (this.f3658d * 80) / 100;
        }
    }

    private boolean b(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @TargetApi(a$i.AppCompatTheme_actionModeBackground)
    private final class a implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f3664a;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        public a(DisplayManager displayManager) {
            this.f3664a = displayManager;
        }

        public void a() {
            this.f3664a.registerDisplayListener(this, null);
        }

        public void b() {
            this.f3664a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                q.this.c();
            }
        }
    }

    private static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private static final b f3666a = new b();

        /* renamed from: c, reason: collision with root package name */
        private final Handler f3668c;

        /* renamed from: e, reason: collision with root package name */
        private Choreographer f3670e;

        /* renamed from: f, reason: collision with root package name */
        private int f3671f;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f3667b = -9223372036854775807L;

        /* renamed from: d, reason: collision with root package name */
        private final HandlerThread f3669d = new HandlerThread("ChoreographerOwner:Handler");

        public static b a() {
            return f3666a;
        }

        private b() {
            this.f3669d.start();
            this.f3668c = H.a(this.f3669d.getLooper(), (Handler.Callback) this);
            this.f3668c.sendEmptyMessage(0);
        }

        public void b() {
            this.f3668c.sendEmptyMessage(1);
        }

        public void c() {
            this.f3668c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f3667b = j;
            this.f3670e.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    d();
                    break;
                case 1:
                    e();
                    break;
                case 2:
                    f();
                    break;
            }
            return true;
        }

        private void d() {
            this.f3670e = Choreographer.getInstance();
        }

        private void e() {
            this.f3671f++;
            if (this.f3671f == 1) {
                this.f3670e.postFrameCallback(this);
            }
        }

        private void f() {
            this.f3671f--;
            if (this.f3671f == 0) {
                this.f3670e.removeFrameCallback(this);
                this.f3667b = -9223372036854775807L;
            }
        }
    }
}

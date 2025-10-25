package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.d.g.v;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private static final int f587a = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    final View f590d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f591e;

    /* renamed from: h, reason: collision with root package name */
    private int f594h;

    /* renamed from: i, reason: collision with root package name */
    private int f595i;
    private boolean m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* renamed from: b, reason: collision with root package name */
    final C0008a f588b = new C0008a();

    /* renamed from: c, reason: collision with root package name */
    private final Interpolator f589c = new AccelerateInterpolator();

    /* renamed from: f, reason: collision with root package name */
    private float[] f592f = {0.0f, 0.0f};

    /* renamed from: g, reason: collision with root package name */
    private float[] f593g = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int a(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    public abstract void a(int i2, int i3);

    public abstract boolean e(int i2);

    public abstract boolean f(int i2);

    public a(View view) {
        this.f590d = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i3 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f2 = i2;
        a(f2, f2);
        float f3 = i3;
        b(f3, f3);
        a(1);
        e(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        c(1.0f, 1.0f);
        b(f587a);
        c(500);
        d(500);
    }

    public a a(boolean z) {
        if (this.q && !z) {
            d();
        }
        this.q = z;
        return this;
    }

    public a a(float f2, float f3) {
        this.l[0] = f2 / 1000.0f;
        this.l[1] = f3 / 1000.0f;
        return this;
    }

    public a b(float f2, float f3) {
        this.k[0] = f2 / 1000.0f;
        this.k[1] = f3 / 1000.0f;
        return this;
    }

    public a c(float f2, float f3) {
        this.j[0] = f2 / 1000.0f;
        this.j[1] = f3 / 1000.0f;
        return this;
    }

    public a a(int i2) {
        this.f594h = i2;
        return this;
    }

    public a d(float f2, float f3) {
        this.f592f[0] = f2;
        this.f592f[1] = f3;
        return this;
    }

    public a e(float f2, float f3) {
        this.f593g[0] = f2;
        this.f593g[1] = f3;
        return this;
    }

    public a b(int i2) {
        this.f595i = i2;
        return this;
    }

    public a c(int i2) {
        this.f588b.a(i2);
        return this;
    }

    public a d(int i2) {
        this.f588b.b(i2);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.q) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.o = true;
                this.m = false;
                this.f588b.a(a(0, motionEvent.getX(), view.getWidth(), this.f590d.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.f590d.getHeight()));
                if (!this.p && a()) {
                    c();
                    break;
                }
                break;
            case 1:
            case 3:
                d();
                break;
            case 2:
                this.f588b.a(a(0, motionEvent.getX(), view.getWidth(), this.f590d.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.f590d.getHeight()));
                if (!this.p) {
                    c();
                    break;
                }
                break;
        }
        return this.r && this.p;
    }

    boolean a() {
        C0008a c0008a = this.f588b;
        int iF = c0008a.f();
        int iE = c0008a.e();
        return (iF != 0 && f(iF)) || (iE != 0 && e(iE));
    }

    private void c() {
        if (this.f591e == null) {
            this.f591e = new b();
        }
        this.p = true;
        this.n = true;
        if (!this.m && this.f595i > 0) {
            v.a(this.f590d, this.f591e, this.f595i);
        } else {
            this.f591e.run();
        }
        this.m = true;
    }

    private void d() {
        if (this.n) {
            this.p = false;
        } else {
            this.f588b.b();
        }
    }

    private float a(int i2, float f2, float f3, float f4) {
        float fA = a(this.f592f[i2], f3, this.f593g[i2], f2);
        if (fA == 0.0f) {
            return 0.0f;
        }
        float f5 = this.j[i2];
        float f6 = this.k[i2];
        float f7 = this.l[i2];
        float f8 = f5 * f4;
        if (fA > 0.0f) {
            return a(fA * f8, f6, f7);
        }
        return -a((-fA) * f8, f6, f7);
    }

    private float a(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fA = a(f2 * f3, 0.0f, f4);
        float f6 = f(f3 - f5, fA) - f(f5, fA);
        if (f6 < 0.0f) {
            interpolation = -this.f589c.getInterpolation(-f6);
        } else {
            if (f6 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f589c.getInterpolation(f6);
        }
        return a(interpolation, -1.0f, 1.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private float f(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        switch (this.f594h) {
            case 0:
            case 1:
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (this.p && this.f594h == 1) {
                        return 1.0f;
                    }
                }
                return 0.0f;
            case 2:
                if (f2 < 0.0f) {
                    return f2 / (-f3);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    void b() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f590d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.p) {
                if (a.this.n) {
                    a.this.n = false;
                    a.this.f588b.a();
                }
                C0008a c0008a = a.this.f588b;
                if (c0008a.c() || !a.this.a()) {
                    a.this.p = false;
                    return;
                }
                if (a.this.o) {
                    a.this.o = false;
                    a.this.b();
                }
                c0008a.d();
                a.this.a(c0008a.g(), c0008a.h());
                v.a(a.this.f590d, this);
            }
        }
    }

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0008a {

        /* renamed from: a, reason: collision with root package name */
        private int f596a;

        /* renamed from: b, reason: collision with root package name */
        private int f597b;

        /* renamed from: c, reason: collision with root package name */
        private float f598c;

        /* renamed from: d, reason: collision with root package name */
        private float f599d;
        private float j;
        private int k;

        /* renamed from: e, reason: collision with root package name */
        private long f600e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f604i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f601f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f602g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f603h = 0;

        private float a(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        C0008a() {
        }

        public void a(int i2) {
            this.f596a = i2;
        }

        public void b(int i2) {
            this.f597b = i2;
        }

        public void a() {
            this.f600e = AnimationUtils.currentAnimationTimeMillis();
            this.f604i = -1L;
            this.f601f = this.f600e;
            this.j = 0.5f;
            this.f602g = 0;
            this.f603h = 0;
        }

        public void b() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.a((int) (jCurrentAnimationTimeMillis - this.f600e), 0, this.f597b);
            this.j = a(jCurrentAnimationTimeMillis);
            this.f604i = jCurrentAnimationTimeMillis;
        }

        public boolean c() {
            return this.f604i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f604i + ((long) this.k);
        }

        private float a(long j) {
            if (j < this.f600e) {
                return 0.0f;
            }
            if (this.f604i < 0 || j < this.f604i) {
                return a.a((j - this.f600e) / this.f596a, 0.0f, 1.0f) * 0.5f;
            }
            return (1.0f - this.j) + (this.j * a.a((j - this.f604i) / this.k, 0.0f, 1.0f));
        }

        public void d() {
            if (this.f601f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fA = a(a(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f601f;
            this.f601f = jCurrentAnimationTimeMillis;
            float f2 = j * fA;
            this.f602g = (int) (this.f598c * f2);
            this.f603h = (int) (f2 * this.f599d);
        }

        public void a(float f2, float f3) {
            this.f598c = f2;
            this.f599d = f3;
        }

        public int e() {
            return (int) (this.f598c / Math.abs(this.f598c));
        }

        public int f() {
            return (int) (this.f599d / Math.abs(this.f599d));
        }

        public int g() {
            return this.f602g;
        }

        public int h() {
            return this.f603h;
        }
    }
}

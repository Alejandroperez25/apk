package c.h.b.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class c implements b, Runnable, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4794a;
    private int l;
    private int m;
    private d r;

    /* renamed from: b, reason: collision with root package name */
    private Thread f4795b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4796c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4797d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4798e = false;

    /* renamed from: f, reason: collision with root package name */
    private c.h.a.b.b.a f4799f = null;

    /* renamed from: g, reason: collision with root package name */
    private c.h.a.b.b.a f4800g = null;

    /* renamed from: h, reason: collision with root package name */
    private c.h.a.b.b.a.c f4801h = null;

    /* renamed from: i, reason: collision with root package name */
    private final Semaphore f4802i = new Semaphore(0);
    private final BlockingQueue<a> j = new LinkedBlockingQueue();
    private final Object k = new Object();
    private boolean n = false;
    private boolean o = false;
    private int p = 30;
    private c.h.a.b.c.d q = new c.h.a.b.c.d();

    public c(Context context) {
        this.f4794a = context;
    }

    @Override // c.h.b.d.b
    public void c() {
        if (!this.f4798e) {
            this.f4801h = new c.h.a.b.b.a.c();
        }
        this.f4798e = true;
    }

    @Override // c.h.b.d.b
    public void a(int i2, int i3) {
        this.l = i2;
        this.m = i3;
    }

    @Override // c.h.b.d.b
    public void b(int i2) {
        this.q.a(i2);
    }

    @Override // c.h.b.d.b
    public SurfaceTexture a() {
        return this.f4801h.d();
    }

    @Override // c.h.b.d.b
    public void a(Surface surface) {
        synchronized (this.k) {
            this.f4800g = new c.h.a.b.b.a(surface, this.f4799f);
        }
    }

    @Override // c.h.b.d.b
    public void b() {
        synchronized (this.k) {
            if (this.f4800g != null) {
                this.f4800g.c();
                this.f4800g = null;
            }
        }
    }

    @Override // c.h.b.d.b
    public void a(int i2) {
        this.f4801h.a(i2);
    }

    @Override // c.h.b.d.b
    public void start() {
        synchronized (this.k) {
            this.f4795b = new Thread(this);
            this.f4797d = true;
            this.f4795b.start();
            this.f4802i.acquireUninterruptibly();
        }
    }

    @Override // c.h.b.d.b
    public void stop() {
        synchronized (this.k) {
            if (this.f4795b != null) {
                this.f4795b.interrupt();
                try {
                    this.f4795b.join(100L);
                } catch (InterruptedException unused) {
                    this.f4795b.interrupt();
                }
                this.f4795b = null;
                this.f4797d = false;
            } else {
                this.f4797d = false;
            }
        }
    }

    private void d() {
        if (this.f4799f != null) {
            this.f4799f.c();
            this.f4799f = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        this.f4799f = new c.h.a.b.b.a();
        this.f4799f.a();
        this.f4801h.a(this.f4794a, this.l, this.m, this.l, this.m);
        this.f4801h.d().setOnFrameAvailableListener(this);
        this.f4802i.release();
        while (this.f4797d) {
            try {
                try {
                    if (this.f4796c) {
                        this.f4796c = false;
                        this.f4799f.a();
                        this.f4801h.c();
                        this.f4801h.a();
                        this.f4801h.a(this.l, this.m, false);
                        this.f4799f.b();
                        synchronized (this.k) {
                            if (this.f4800g != null && !this.q.a()) {
                                this.f4800g.a();
                                this.f4801h.a(this.l, this.m, false);
                                this.f4800g.b();
                            }
                            if (this.r != null) {
                                this.r.a(c.h.a.c.a.a.a(this.l, this.m, this.l, this.m));
                                this.r = null;
                            }
                        }
                        if (!this.j.isEmpty()) {
                            a aVarTake = this.j.take();
                            this.f4801h.a(aVarTake.a(), aVarTake.b());
                        } else if (this.n) {
                            this.f4801h.a(this.o);
                            this.n = false;
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } finally {
                this.f4801h.b();
                d();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.k) {
            this.f4796c = true;
            this.k.notifyAll();
        }
    }
}

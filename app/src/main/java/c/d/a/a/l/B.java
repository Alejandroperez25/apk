package c.d.a.a.l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class B implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3345a = a(false, -9223372036854775807L);

    /* renamed from: b, reason: collision with root package name */
    public static final b f3346b = a(true, -9223372036854775807L);

    /* renamed from: c, reason: collision with root package name */
    public static final b f3347c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f3348d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f3349e;

    /* renamed from: f, reason: collision with root package name */
    private c<? extends d> f3350f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f3351g;

    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i2);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void h();
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        f3347c = new b(2, j);
        f3348d = new b(3, j);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f3352a;

        /* renamed from: b, reason: collision with root package name */
        private final long f3353b;

        private b(int i2, long j) {
            this.f3352a = i2;
            this.f3353b = j;
        }

        public boolean a() {
            return this.f3352a == 0 || this.f3352a == 1;
        }
    }

    public B(String str) {
        this.f3349e = H.a(str);
    }

    public static b a(boolean z, long j) {
        return new b(z ? 1 : 0, j);
    }

    public <T extends d> long a(T t, a<T> aVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0170e.b(looperMyLooper != null);
        this.f3351g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new c(looperMyLooper, t, aVar, i2, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public boolean b() {
        return this.f3350f != null;
    }

    public void c() {
        this.f3350f.a(false);
    }

    public void d() {
        a((e) null);
    }

    public void a(e eVar) {
        if (this.f3350f != null) {
            this.f3350f.a(true);
        }
        if (eVar != null) {
            this.f3349e.execute(new f(eVar));
        }
        this.f3349e.shutdown();
    }

    @Override // c.d.a.a.l.C
    public void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public void a(int i2) throws IOException {
        if (this.f3351g != null) {
            throw this.f3351g;
        }
        if (this.f3350f != null) {
            c<? extends d> cVar = this.f3350f;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f3350f.f3354a;
            }
            cVar.a(i2);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3354a;

        /* renamed from: b, reason: collision with root package name */
        private final T f3355b;

        /* renamed from: c, reason: collision with root package name */
        private final long f3356c;

        /* renamed from: d, reason: collision with root package name */
        private a<T> f3357d;

        /* renamed from: e, reason: collision with root package name */
        private IOException f3358e;

        /* renamed from: f, reason: collision with root package name */
        private int f3359f;

        /* renamed from: g, reason: collision with root package name */
        private volatile Thread f3360g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f3361h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f3362i;

        public c(Looper looper, T t, a<T> aVar, int i2, long j) {
            super(looper);
            this.f3355b = t;
            this.f3357d = aVar;
            this.f3354a = i2;
            this.f3356c = j;
        }

        public void a(int i2) throws IOException {
            if (this.f3358e != null && this.f3359f > i2) {
                throw this.f3358e;
            }
        }

        public void a(long j) {
            AbstractC0170e.b(B.this.f3350f == null);
            B.this.f3350f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }

        public void a(boolean z) {
            this.f3362i = z;
            this.f3358e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f3361h = true;
                this.f3355b.b();
                if (this.f3360g != null) {
                    this.f3360g.interrupt();
                }
            }
            if (z) {
                b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f3357d.a(this.f3355b, jElapsedRealtime, jElapsedRealtime - this.f3356c, true);
                this.f3357d = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3360g = Thread.currentThread();
                if (!this.f3361h) {
                    c.d.a.a.m.F.a("load:" + this.f3355b.getClass().getSimpleName());
                    try {
                        this.f3355b.a();
                        c.d.a.a.m.F.a();
                    } catch (Throwable th) {
                        c.d.a.a.m.F.a();
                        throw th;
                    }
                }
                if (this.f3362i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e2) {
                if (this.f3362i) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (Error e3) {
                c.d.a.a.m.o.b("LoadTask", "Unexpected error loading stream", e3);
                if (!this.f3362i) {
                    obtainMessage(4, e3).sendToTarget();
                }
                throw e3;
            } catch (InterruptedException unused) {
                AbstractC0170e.b(this.f3361h);
                if (this.f3362i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e4) {
                c.d.a.a.m.o.b("LoadTask", "Unexpected exception loading stream", e4);
                if (this.f3362i) {
                    return;
                }
                obtainMessage(3, new g(e4)).sendToTarget();
            } catch (OutOfMemoryError e5) {
                c.d.a.a.m.o.b("LoadTask", "OutOfMemory error loading stream", e5);
                if (this.f3362i) {
                    return;
                }
                obtainMessage(3, new g(e5)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long jC;
            if (this.f3362i) {
                return;
            }
            if (message.what == 0) {
                a();
                return;
            }
            if (message.what == 4) {
                throw ((Error) message.obj);
            }
            b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f3356c;
            if (this.f3361h) {
                this.f3357d.a(this.f3355b, jElapsedRealtime, j, false);
                return;
            }
            switch (message.what) {
                case 1:
                    this.f3357d.a(this.f3355b, jElapsedRealtime, j, false);
                    return;
                case 2:
                    try {
                        this.f3357d.a(this.f3355b, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e2) {
                        c.d.a.a.m.o.b("LoadTask", "Unexpected exception handling load completed", e2);
                        B.this.f3351g = new g(e2);
                        return;
                    }
                case 3:
                    this.f3358e = (IOException) message.obj;
                    this.f3359f++;
                    b bVarA = this.f3357d.a(this.f3355b, jElapsedRealtime, j, this.f3358e, this.f3359f);
                    if (bVarA.f3352a != 3) {
                        if (bVarA.f3352a != 2) {
                            if (bVarA.f3352a == 1) {
                                this.f3359f = 1;
                            }
                            if (bVarA.f3353b != -9223372036854775807L) {
                                jC = bVarA.f3353b;
                            } else {
                                jC = c();
                            }
                            a(jC);
                            return;
                        }
                        return;
                    }
                    B.this.f3351g = this.f3358e;
                    return;
                default:
                    return;
            }
        }

        private void a() {
            this.f3358e = null;
            B.this.f3349e.execute(B.this.f3350f);
        }

        private void b() {
            B.this.f3350f = null;
        }

        private long c() {
            return Math.min((this.f3359f - 1) * 1000, 5000);
        }
    }

    private static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final e f3363a;

        public f(e eVar) {
            this.f3363a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3363a.h();
        }
    }
}

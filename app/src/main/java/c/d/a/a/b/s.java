package c.d.a.a.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.m.AbstractC0170e;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final a f1604a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f1605b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f1606c;

    /* renamed from: d, reason: collision with root package name */
    private int f1607d;

    /* renamed from: e, reason: collision with root package name */
    private int f1608e;

    /* renamed from: f, reason: collision with root package name */
    private r f1609f;

    /* renamed from: g, reason: collision with root package name */
    private int f1610g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1611h;

    /* renamed from: i, reason: collision with root package name */
    private long f1612i;
    private long j;
    private long k;
    private Method l;
    private long m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private int u;
    private long v;
    private long w;
    private long x;
    private long y;

    public interface a {
        void a(int i2, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    public s(a aVar) {
        AbstractC0170e.a(aVar);
        this.f1604a = aVar;
        if (c.d.a.a.m.H.f3499a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f1605b = new long[10];
    }

    public void a(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.f1606c = audioTrack;
        this.f1607d = i3;
        this.f1608e = i4;
        this.f1609f = new r(audioTrack);
        this.f1610g = audioTrack.getSampleRate();
        this.f1611h = a(i2);
        this.o = c.d.a.a.m.H.c(i2);
        this.f1612i = this.o ? g(i4 / i3) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.n = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.m = 0L;
    }

    public long a(boolean z) {
        long jH;
        AudioTrack audioTrack = this.f1606c;
        AbstractC0170e.a(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            e();
        }
        long jNanoTime = System.nanoTime() / 1000;
        r rVar = this.f1609f;
        AbstractC0170e.a(rVar);
        r rVar2 = rVar;
        if (rVar2.c()) {
            long jG = g(rVar2.g());
            return !rVar2.d() ? jG : jG + (jNanoTime - rVar2.f());
        }
        if (this.u == 0) {
            jH = h();
        } else {
            jH = jNanoTime + this.j;
        }
        return !z ? jH - this.m : jH;
    }

    public void a() {
        r rVar = this.f1609f;
        AbstractC0170e.a(rVar);
        rVar.e();
    }

    public boolean b() {
        AudioTrack audioTrack = this.f1606c;
        AbstractC0170e.a(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public boolean a(long j) {
        AudioTrack audioTrack = this.f1606c;
        AbstractC0170e.a(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f1611h) {
            if (playState == 2) {
                this.n = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z = this.n;
        this.n = e(j);
        if (z && !this.n && playState != 1 && this.f1604a != null) {
            this.f1604a.a(this.f1608e, AbstractC0132d.a(this.f1612i));
        }
        return true;
    }

    public int b(long j) {
        return this.f1608e - ((int) (j - (i() * this.f1607d)));
    }

    public boolean c(long j) {
        return this.w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.w >= 200;
    }

    public void d(long j) {
        this.x = i();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j;
    }

    public boolean e(long j) {
        return j > i() || g();
    }

    public boolean c() {
        f();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        r rVar = this.f1609f;
        AbstractC0170e.a(rVar);
        rVar.e();
        return true;
    }

    public void d() {
        f();
        this.f1606c = null;
        this.f1609f = null;
    }

    private void e() {
        long jH = h();
        if (jH == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.k >= 30000) {
            this.f1605b[this.t] = jH - jNanoTime;
            this.t = (this.t + 1) % 10;
            if (this.u < 10) {
                this.u++;
            }
            this.k = jNanoTime;
            this.j = 0L;
            for (int i2 = 0; i2 < this.u; i2++) {
                this.j += this.f1605b[i2] / this.u;
            }
        }
        if (this.f1611h) {
            return;
        }
        a(jNanoTime, jH);
        f(jNanoTime);
    }

    private void a(long j, long j2) {
        r rVar = this.f1609f;
        AbstractC0170e.a(rVar);
        r rVar2 = rVar;
        if (rVar2.a(j)) {
            long jF = rVar2.f();
            long jG = rVar2.g();
            if (Math.abs(jF - j) > 5000000) {
                this.f1604a.b(jG, jF, j, j2);
                rVar2.a();
            } else if (Math.abs(g(jG) - j2) > 5000000) {
                this.f1604a.a(jG, jF, j, j2);
                rVar2.a();
            } else {
                rVar2.b();
            }
        }
    }

    private void f(long j) {
        if (!this.o || this.l == null || j - this.p < 500000) {
            return;
        }
        try {
            Method method = this.l;
            AudioTrack audioTrack = this.f1606c;
            AbstractC0170e.a(audioTrack);
            c.d.a.a.m.H.a((Integer) method.invoke(audioTrack, new Object[0]));
            this.m = (r0.intValue() * 1000) - this.f1612i;
            this.m = Math.max(this.m, 0L);
            if (this.m > 5000000) {
                this.f1604a.a(this.m);
                this.m = 0L;
            }
        } catch (Exception unused) {
            this.l = null;
        }
        this.p = j;
    }

    private long g(long j) {
        return (j * 1000000) / this.f1610g;
    }

    private void f() {
        this.j = 0L;
        this.u = 0;
        this.t = 0;
        this.k = 0L;
    }

    private boolean g() {
        if (this.f1611h) {
            AudioTrack audioTrack = this.f1606c;
            AbstractC0170e.a(audioTrack);
            if (audioTrack.getPlayState() == 2 && i() == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i2) {
        return c.d.a.a.m.H.f3499a < 23 && (i2 == 5 || i2 == 6);
    }

    private long h() {
        return g(i());
    }

    private long i() {
        AudioTrack audioTrack = this.f1606c;
        AbstractC0170e.a(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * this.f1610g) / 1000000));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack2.getPlaybackHeadPosition();
        if (this.f1611h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (c.d.a.a.m.H.f3499a <= 28) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }
}

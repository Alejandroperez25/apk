package c.d.a.a.b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final a f1593a;

    /* renamed from: b, reason: collision with root package name */
    private int f1594b;

    /* renamed from: c, reason: collision with root package name */
    private long f1595c;

    /* renamed from: d, reason: collision with root package name */
    private long f1596d;

    /* renamed from: e, reason: collision with root package name */
    private long f1597e;

    /* renamed from: f, reason: collision with root package name */
    private long f1598f;

    public r(AudioTrack audioTrack) {
        if (c.d.a.a.m.H.f3499a >= 19) {
            this.f1593a = new a(audioTrack);
            e();
        } else {
            this.f1593a = null;
            a(3);
        }
    }

    public boolean a(long j) {
        if (this.f1593a == null || j - this.f1597e < this.f1596d) {
            return false;
        }
        this.f1597e = j;
        boolean zA = this.f1593a.a();
        switch (this.f1594b) {
            case 0:
                if (!zA) {
                    if (j - this.f1595c <= 500000) {
                        return zA;
                    }
                    a(3);
                    return zA;
                }
                if (this.f1593a.b() < this.f1595c) {
                    return false;
                }
                this.f1598f = this.f1593a.c();
                a(1);
                return zA;
            case 1:
                if (!zA) {
                    e();
                    return zA;
                }
                if (this.f1593a.c() <= this.f1598f) {
                    return zA;
                }
                a(2);
                return zA;
            case 2:
                if (zA) {
                    return zA;
                }
                e();
                return zA;
            case 3:
                if (!zA) {
                    return zA;
                }
                e();
                return zA;
            case 4:
                return zA;
            default:
                throw new IllegalStateException();
        }
    }

    public void a() {
        a(4);
    }

    public void b() {
        if (this.f1594b == 4) {
            e();
        }
    }

    public boolean c() {
        return this.f1594b == 1 || this.f1594b == 2;
    }

    public boolean d() {
        return this.f1594b == 2;
    }

    public void e() {
        if (this.f1593a != null) {
            a(0);
        }
    }

    public long f() {
        if (this.f1593a != null) {
            return this.f1593a.b();
        }
        return -9223372036854775807L;
    }

    public long g() {
        if (this.f1593a != null) {
            return this.f1593a.c();
        }
        return -1L;
    }

    private void a(int i2) {
        this.f1594b = i2;
        switch (i2) {
            case 0:
                this.f1597e = 0L;
                this.f1598f = -1L;
                this.f1595c = System.nanoTime() / 1000;
                this.f1596d = 5000L;
                return;
            case 1:
                this.f1596d = 5000L;
                return;
            case 2:
            case 3:
                this.f1596d = 10000000L;
                return;
            case 4:
                this.f1596d = 500000L;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @TargetApi(19)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f1599a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f1600b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f1601c;

        /* renamed from: d, reason: collision with root package name */
        private long f1602d;

        /* renamed from: e, reason: collision with root package name */
        private long f1603e;

        public a(AudioTrack audioTrack) {
            this.f1599a = audioTrack;
        }

        public boolean a() {
            boolean timestamp = this.f1599a.getTimestamp(this.f1600b);
            if (timestamp) {
                long j = this.f1600b.framePosition;
                if (this.f1602d > j) {
                    this.f1601c++;
                }
                this.f1602d = j;
                this.f1603e = j + (this.f1601c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.f1600b.nanoTime / 1000;
        }

        public long c() {
            return this.f1603e;
        }
    }
}

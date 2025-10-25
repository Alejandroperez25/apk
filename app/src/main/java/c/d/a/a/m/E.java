package c.d.a.a.m;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private long f3496a;

    /* renamed from: b, reason: collision with root package name */
    private long f3497b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f3498c = -9223372036854775807L;

    public E(long j) {
        c(j);
    }

    public synchronized void c(long j) {
        AbstractC0170e.b(this.f3498c == -9223372036854775807L);
        this.f3496a = j;
    }

    public long a() {
        return this.f3496a;
    }

    public long b() {
        if (this.f3498c != -9223372036854775807L) {
            return this.f3497b + this.f3498c;
        }
        if (this.f3496a != Long.MAX_VALUE) {
            return this.f3496a;
        }
        return -9223372036854775807L;
    }

    public long c() {
        if (this.f3496a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f3498c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3497b;
    }

    public void d() {
        this.f3498c = -9223372036854775807L;
    }

    public long d(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3498c != -9223372036854775807L) {
            long jB = b(this.f3498c);
            long j2 = (4294967296L + jB) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - jB) < Math.abs(j - jB)) {
                j = j3;
            }
        }
        return e(a(j));
    }

    public long e(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3498c != -9223372036854775807L) {
            this.f3498c = j;
        } else {
            if (this.f3496a != Long.MAX_VALUE) {
                this.f3497b = this.f3496a - j;
            }
            synchronized (this) {
                this.f3498c = j;
                notifyAll();
            }
        }
        return j + this.f3497b;
    }

    public synchronized void e() {
        while (this.f3498c == -9223372036854775807L) {
            wait();
        }
    }

    public static long a(long j) {
        return (j * 1000000) / 90000;
    }

    public static long b(long j) {
        return (j * 90000) / 1000000;
    }
}

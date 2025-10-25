package c.d.a.a.m;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f3492a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f3493b;

    /* renamed from: c, reason: collision with root package name */
    private int f3494c;

    /* renamed from: d, reason: collision with root package name */
    private int f3495d;

    public D() {
        this(10);
    }

    public D(int i2) {
        this.f3492a = new long[i2];
        this.f3493b = (V[]) a(i2);
    }

    public synchronized void a(long j, V v) {
        b(j);
        b();
        b(j, v);
    }

    public synchronized void a() {
        this.f3494c = 0;
        this.f3495d = 0;
        Arrays.fill(this.f3493b, (Object) null);
    }

    public synchronized V a(long j) {
        return a(j, true);
    }

    private V a(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (this.f3495d > 0) {
            long j3 = j - this.f3492a[this.f3494c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = this.f3493b[this.f3494c];
            this.f3493b[this.f3494c] = null;
            this.f3494c = (this.f3494c + 1) % this.f3493b.length;
            this.f3495d--;
            j2 = j3;
        }
        return v;
    }

    private void b(long j) {
        if (this.f3495d > 0) {
            if (j <= this.f3492a[((this.f3494c + this.f3495d) - 1) % this.f3493b.length]) {
                a();
            }
        }
    }

    private void b() {
        int length = this.f3493b.length;
        if (this.f3495d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) a(i2);
        int i3 = length - this.f3494c;
        System.arraycopy(this.f3492a, this.f3494c, jArr, 0, i3);
        System.arraycopy(this.f3493b, this.f3494c, vArr, 0, i3);
        if (this.f3494c > 0) {
            System.arraycopy(this.f3492a, 0, jArr, i3, this.f3494c);
            System.arraycopy(this.f3493b, 0, vArr, i3, this.f3494c);
        }
        this.f3492a = jArr;
        this.f3493b = vArr;
        this.f3494c = 0;
    }

    private void b(long j, V v) {
        int length = (this.f3494c + this.f3495d) % this.f3493b.length;
        this.f3492a[length] = j;
        this.f3493b[length] = v;
        this.f3495d++;
    }

    private static <V> V[] a(int i2) {
        return (V[]) new Object[i2];
    }
}

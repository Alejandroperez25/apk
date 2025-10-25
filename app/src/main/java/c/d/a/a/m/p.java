package c.d.a.a.m;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private int f3544a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f3545b;

    public p() {
        this(32);
    }

    public p(int i2) {
        this.f3545b = new long[i2];
    }

    public void a(long j) {
        if (this.f3544a == this.f3545b.length) {
            this.f3545b = Arrays.copyOf(this.f3545b, this.f3544a * 2);
        }
        long[] jArr = this.f3545b;
        int i2 = this.f3544a;
        this.f3544a = i2 + 1;
        jArr[i2] = j;
    }

    public long a(int i2) {
        if (i2 < 0 || i2 >= this.f3544a) {
            throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.f3544a);
        }
        return this.f3545b[i2];
    }

    public int a() {
        return this.f3544a;
    }

    public long[] b() {
        return Arrays.copyOf(this.f3545b, this.f3544a);
    }
}

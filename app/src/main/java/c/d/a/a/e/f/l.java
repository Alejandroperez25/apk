package c.d.a.a.e.f;

import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f2050a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2051b;

    /* renamed from: c, reason: collision with root package name */
    private int f2052c;

    /* renamed from: d, reason: collision with root package name */
    private int f2053d;

    public l(byte[] bArr) {
        this.f2050a = bArr;
        this.f2051b = bArr.length;
    }

    public boolean a() {
        boolean z = (((this.f2050a[this.f2052c] & 255) >> this.f2053d) & 1) == 1;
        b(1);
        return z;
    }

    public int a(int i2) {
        int i3 = this.f2052c;
        int iMin = Math.min(i2, 8 - this.f2053d);
        int i4 = i3 + 1;
        int i5 = ((this.f2050a[i3] & 255) >> this.f2053d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.f2050a[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        b(i2);
        return i6;
    }

    public void b(int i2) {
        int i3 = i2 / 8;
        this.f2052c += i3;
        this.f2053d += i2 - (i3 * 8);
        if (this.f2053d > 7) {
            this.f2052c++;
            this.f2053d -= 8;
        }
        c();
    }

    public int b() {
        return (this.f2052c * 8) + this.f2053d;
    }

    private void c() {
        AbstractC0170e.b(this.f2052c >= 0 && (this.f2052c < this.f2051b || (this.f2052c == this.f2051b && this.f2053d == 0)));
    }
}

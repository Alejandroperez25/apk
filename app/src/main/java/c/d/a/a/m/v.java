package c.d.a.a.m;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f3570a;

    /* renamed from: b, reason: collision with root package name */
    private int f3571b;

    /* renamed from: c, reason: collision with root package name */
    private int f3572c;

    /* renamed from: d, reason: collision with root package name */
    private int f3573d;

    public v(byte[] bArr, int i2, int i3) {
        a(bArr, i2, i3);
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.f3570a = bArr;
        this.f3572c = i2;
        this.f3571b = i3;
        this.f3573d = 0;
        g();
    }

    public void a() {
        int i2 = this.f3573d + 1;
        this.f3573d = i2;
        if (i2 == 8) {
            this.f3573d = 0;
            this.f3572c += d(this.f3572c + 1) ? 2 : 1;
        }
        g();
    }

    public void a(int i2) {
        int i3 = this.f3572c;
        int i4 = i2 / 8;
        this.f3572c += i4;
        this.f3573d += i2 - (i4 * 8);
        if (this.f3573d > 7) {
            this.f3572c++;
            this.f3573d -= 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.f3572c) {
                if (d(i3)) {
                    this.f3572c++;
                    i3 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }

    public boolean b(int i2) {
        int i3 = this.f3572c;
        int i4 = i2 / 8;
        int i5 = this.f3572c + i4;
        int i6 = (this.f3573d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f3571b) {
                break;
            }
            if (d(i3)) {
                i5++;
                i3 += 2;
            }
        }
        if (i5 >= this.f3571b) {
            return i5 == this.f3571b && i6 == 0;
        }
        return true;
    }

    public boolean b() {
        boolean z = (this.f3570a[this.f3572c] & (128 >> this.f3573d)) != 0;
        a();
        return z;
    }

    public int c(int i2) {
        this.f3573d += i2;
        int i3 = 0;
        while (true) {
            if (this.f3573d <= 8) {
                break;
            }
            this.f3573d -= 8;
            i3 |= (this.f3570a[this.f3572c] & 255) << this.f3573d;
            int i4 = this.f3572c;
            if (!d(this.f3572c + 1)) {
                i = 1;
            }
            this.f3572c = i4 + i;
        }
        int i5 = ((-1) >>> (32 - i2)) & (i3 | ((this.f3570a[this.f3572c] & 255) >> (8 - this.f3573d)));
        if (this.f3573d == 8) {
            this.f3573d = 0;
            this.f3572c += d(this.f3572c + 1) ? 2 : 1;
        }
        g();
        return i5;
    }

    public boolean c() {
        int i2 = this.f3572c;
        int i3 = this.f3573d;
        int i4 = 0;
        while (this.f3572c < this.f3571b && !b()) {
            i4++;
        }
        boolean z = this.f3572c == this.f3571b;
        this.f3572c = i2;
        this.f3573d = i3;
        return !z && b((i4 * 2) + 1);
    }

    public int d() {
        return f();
    }

    public int e() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    private int f() {
        int i2 = 0;
        while (!b()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? c(i2) : 0);
    }

    private boolean d(int i2) {
        return 2 <= i2 && i2 < this.f3571b && this.f3570a[i2] == 3 && this.f3570a[i2 + (-2)] == 0 && this.f3570a[i2 - 1] == 0;
    }

    private void g() {
        AbstractC0170e.b(this.f3572c >= 0 && (this.f3572c < this.f3571b || (this.f3572c == this.f3571b && this.f3573d == 0)));
    }
}

package c.d.a.a.m;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3563a;

    /* renamed from: b, reason: collision with root package name */
    private int f3564b;

    /* renamed from: c, reason: collision with root package name */
    private int f3565c;

    /* renamed from: d, reason: collision with root package name */
    private int f3566d;

    public t() {
        this.f3563a = H.f3504f;
    }

    public t(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public t(byte[] bArr, int i2) {
        this.f3563a = bArr;
        this.f3566d = i2;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(u uVar) {
        a(uVar.f3567a, uVar.c());
        a(uVar.d() * 8);
    }

    public void a(byte[] bArr, int i2) {
        this.f3563a = bArr;
        this.f3564b = 0;
        this.f3565c = 0;
        this.f3566d = i2;
    }

    public int a() {
        return ((this.f3566d - this.f3564b) * 8) - this.f3565c;
    }

    public int b() {
        return (this.f3564b * 8) + this.f3565c;
    }

    public int c() {
        AbstractC0170e.b(this.f3565c == 0);
        return this.f3564b;
    }

    public void a(int i2) {
        this.f3564b = i2 / 8;
        this.f3565c = i2 - (this.f3564b * 8);
        g();
    }

    public void d() {
        int i2 = this.f3565c + 1;
        this.f3565c = i2;
        if (i2 == 8) {
            this.f3565c = 0;
            this.f3564b++;
        }
        g();
    }

    public void b(int i2) {
        int i3 = i2 / 8;
        this.f3564b += i3;
        this.f3565c += i2 - (i3 * 8);
        if (this.f3565c > 7) {
            this.f3564b++;
            this.f3565c -= 8;
        }
        g();
    }

    public boolean e() {
        boolean z = (this.f3563a[this.f3564b] & (128 >> this.f3565c)) != 0;
        d();
        return z;
    }

    public int c(int i2) {
        if (i2 == 0) {
            return 0;
        }
        this.f3565c += i2;
        int i3 = 0;
        while (this.f3565c > 8) {
            this.f3565c -= 8;
            byte[] bArr = this.f3563a;
            int i4 = this.f3564b;
            this.f3564b = i4 + 1;
            i3 |= (bArr[i4] & 255) << this.f3565c;
        }
        int i5 = ((-1) >>> (32 - i2)) & (i3 | ((this.f3563a[this.f3564b] & 255) >> (8 - this.f3565c)));
        if (this.f3565c == 8) {
            this.f3565c = 0;
            this.f3564b++;
        }
        g();
        return i5;
    }

    public void a(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f3563a;
            int i5 = this.f3564b;
            this.f3564b = i5 + 1;
            bArr[i2] = (byte) (bArr2[i5] << this.f3565c);
            bArr[i2] = (byte) (((255 & this.f3563a[this.f3564b]) >> (8 - this.f3565c)) | bArr[i2]);
            i2++;
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            return;
        }
        bArr[i4] = (byte) (bArr[i4] & (255 >> i6));
        if (this.f3565c + i6 > 8) {
            byte b2 = bArr[i4];
            byte[] bArr3 = this.f3563a;
            int i7 = this.f3564b;
            this.f3564b = i7 + 1;
            bArr[i4] = (byte) (b2 | ((bArr3[i7] & 255) << this.f3565c));
            this.f3565c -= 8;
        }
        this.f3565c += i6;
        bArr[i4] = (byte) (((byte) (((this.f3563a[this.f3564b] & 255) >> (8 - this.f3565c)) << (8 - i6))) | bArr[i4]);
        if (this.f3565c == 8) {
            this.f3565c = 0;
            this.f3564b++;
        }
        g();
    }

    public void f() {
        if (this.f3565c == 0) {
            return;
        }
        this.f3565c = 0;
        this.f3564b++;
        g();
    }

    public void b(byte[] bArr, int i2, int i3) {
        AbstractC0170e.b(this.f3565c == 0);
        System.arraycopy(this.f3563a, this.f3564b, bArr, i2, i3);
        this.f3564b += i3;
        g();
    }

    public void d(int i2) {
        AbstractC0170e.b(this.f3565c == 0);
        this.f3564b += i2;
        g();
    }

    public void a(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int iMin = Math.min(8 - this.f3565c, i3);
        int i4 = (8 - this.f3565c) - iMin;
        this.f3563a[this.f3564b] = (byte) (((65280 >> this.f3565c) | ((1 << i4) - 1)) & this.f3563a[this.f3564b]);
        int i5 = i3 - iMin;
        this.f3563a[this.f3564b] = (byte) (((i2 >>> i5) << i4) | this.f3563a[this.f3564b]);
        int i6 = this.f3564b + 1;
        while (i5 > 8) {
            this.f3563a[i6] = (byte) (i2 >>> (i5 - 8));
            i5 -= 8;
            i6++;
        }
        int i7 = 8 - i5;
        this.f3563a[i6] = (byte) (this.f3563a[i6] & ((1 << i7) - 1));
        this.f3563a[i6] = (byte) (((i2 & ((1 << i5) - 1)) << i7) | this.f3563a[i6]);
        b(i3);
        g();
    }

    private void g() {
        AbstractC0170e.b(this.f3564b >= 0 && (this.f3564b < this.f3566d || (this.f3564b == this.f3566d && this.f3565c == 0)));
    }
}

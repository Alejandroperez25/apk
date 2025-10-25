package c.d.a.a.m;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3567a;

    /* renamed from: b, reason: collision with root package name */
    private int f3568b;

    /* renamed from: c, reason: collision with root package name */
    private int f3569c;

    public u() {
        this.f3567a = H.f3504f;
    }

    public u(int i2) {
        this.f3567a = new byte[i2];
        this.f3569c = i2;
    }

    public u(byte[] bArr) {
        this.f3567a = bArr;
        this.f3569c = bArr.length;
    }

    public u(byte[] bArr, int i2) {
        this.f3567a = bArr;
        this.f3569c = i2;
    }

    public void a() {
        this.f3568b = 0;
        this.f3569c = 0;
    }

    public void a(int i2) {
        a(e() < i2 ? new byte[i2] : this.f3567a, i2);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i2) {
        this.f3567a = bArr;
        this.f3569c = i2;
        this.f3568b = 0;
    }

    public int b() {
        return this.f3569c - this.f3568b;
    }

    public int c() {
        return this.f3569c;
    }

    public void b(int i2) {
        AbstractC0170e.a(i2 >= 0 && i2 <= this.f3567a.length);
        this.f3569c = i2;
    }

    public int d() {
        return this.f3568b;
    }

    public int e() {
        return this.f3567a.length;
    }

    public void c(int i2) {
        AbstractC0170e.a(i2 >= 0 && i2 <= this.f3569c);
        this.f3568b = i2;
    }

    public void d(int i2) {
        c(this.f3568b + i2);
    }

    public void a(t tVar, int i2) {
        a(tVar.f3563a, 0, i2);
        tVar.a(0);
    }

    public void a(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f3567a, this.f3568b, bArr, i2, i3);
        this.f3568b += i3;
    }

    public int f() {
        return this.f3567a[this.f3568b] & 255;
    }

    public char g() {
        return (char) (((this.f3567a[this.f3568b] & 255) << 8) | (this.f3567a[this.f3568b + 1] & 255));
    }

    public int h() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        return bArr[i2] & 255;
    }

    public int i() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = (bArr[i2] & 255) << 8;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        return i3 | (bArr2[i4] & 255);
    }

    public int j() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = bArr[i2] & 255;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        return i3 | ((bArr2[i4] & 255) << 8);
    }

    public short k() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = (bArr[i2] & 255) << 8;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        return (short) (i3 | (bArr2[i4] & 255));
    }

    public int l() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = (bArr[i2] & 255) << 16;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & 255) << 8);
        byte[] bArr3 = this.f3567a;
        int i6 = this.f3568b;
        this.f3568b = i6 + 1;
        return i5 | (bArr3[i6] & 255);
    }

    public int m() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = ((bArr[i2] & 255) << 24) >> 8;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & 255) << 8);
        byte[] bArr3 = this.f3567a;
        int i6 = this.f3568b;
        this.f3568b = i6 + 1;
        return i5 | (bArr3[i6] & 255);
    }

    public long n() {
        byte[] bArr = this.f3567a;
        this.f3568b = this.f3568b + 1;
        byte[] bArr2 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j = ((bArr[r1] & 255) << 24) | ((bArr2[r5] & 255) << 16);
        byte[] bArr3 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j2 = j | ((bArr3[r5] & 255) << 8);
        byte[] bArr4 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        return j2 | (255 & bArr4[r5]);
    }

    public long o() {
        byte[] bArr = this.f3567a;
        this.f3568b = this.f3568b + 1;
        byte[] bArr2 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j = (bArr[r1] & 255) | ((bArr2[r5] & 255) << 8);
        byte[] bArr3 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j2 = j | ((bArr3[r5] & 255) << 16);
        byte[] bArr4 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        return j2 | ((255 & bArr4[r5]) << 24);
    }

    public int p() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = (bArr[i2] & 255) << 24;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & 255) << 16);
        byte[] bArr3 = this.f3567a;
        int i6 = this.f3568b;
        this.f3568b = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & 255) << 8);
        byte[] bArr4 = this.f3567a;
        int i8 = this.f3568b;
        this.f3568b = i8 + 1;
        return i7 | (bArr4[i8] & 255);
    }

    public int q() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = bArr[i2] & 255;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & 255) << 8);
        byte[] bArr3 = this.f3567a;
        int i6 = this.f3568b;
        this.f3568b = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & 255) << 16);
        byte[] bArr4 = this.f3567a;
        int i8 = this.f3568b;
        this.f3568b = i8 + 1;
        return i7 | ((bArr4[i8] & 255) << 24);
    }

    public long r() {
        byte[] bArr = this.f3567a;
        this.f3568b = this.f3568b + 1;
        byte[] bArr2 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j = ((bArr[r1] & 255) << 56) | ((bArr2[r5] & 255) << 48);
        byte[] bArr3 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j2 = j | ((bArr3[r5] & 255) << 40);
        byte[] bArr4 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j3 = j2 | ((bArr4[r5] & 255) << 32);
        byte[] bArr5 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j4 = j3 | ((bArr5[r5] & 255) << 24);
        byte[] bArr6 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j5 = j4 | ((bArr6[r5] & 255) << 16);
        byte[] bArr7 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j6 = j5 | ((bArr7[r5] & 255) << 8);
        byte[] bArr8 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        return j6 | (255 & bArr8[r5]);
    }

    public long s() {
        byte[] bArr = this.f3567a;
        this.f3568b = this.f3568b + 1;
        byte[] bArr2 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j = (bArr[r1] & 255) | ((bArr2[r5] & 255) << 8);
        byte[] bArr3 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j2 = j | ((bArr3[r5] & 255) << 16);
        byte[] bArr4 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j3 = j2 | ((bArr4[r5] & 255) << 24);
        byte[] bArr5 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j4 = j3 | ((bArr5[r5] & 255) << 32);
        byte[] bArr6 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j5 = j4 | ((bArr6[r5] & 255) << 40);
        byte[] bArr7 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        long j6 = j5 | ((bArr7[r5] & 255) << 48);
        byte[] bArr8 = this.f3567a;
        this.f3568b = this.f3568b + 1;
        return j6 | ((255 & bArr8[r5]) << 56);
    }

    public int t() {
        byte[] bArr = this.f3567a;
        int i2 = this.f3568b;
        this.f3568b = i2 + 1;
        int i3 = (bArr[i2] & 255) << 8;
        byte[] bArr2 = this.f3567a;
        int i4 = this.f3568b;
        this.f3568b = i4 + 1;
        int i5 = i3 | (bArr2[i4] & 255);
        this.f3568b += 2;
        return i5;
    }

    public int u() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public int v() {
        int iP = p();
        if (iP >= 0) {
            return iP;
        }
        throw new IllegalStateException("Top bit not zero: " + iP);
    }

    public int w() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public long x() {
        long jR = r();
        if (jR >= 0) {
            return jR;
        }
        throw new IllegalStateException("Top bit not zero: " + jR);
    }

    public double y() {
        return Double.longBitsToDouble(r());
    }

    public String e(int i2) {
        return a(i2, Charset.forName("UTF-8"));
    }

    public String a(int i2, Charset charset) {
        String str = new String(this.f3567a, this.f3568b, i2, charset);
        this.f3568b += i2;
        return str;
    }

    public String f(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = (this.f3568b + i2) - 1;
        String strA = H.a(this.f3567a, this.f3568b, (i3 >= this.f3569c || this.f3567a[i3] != 0) ? i2 : i2 - 1);
        this.f3568b += i2;
        return strA;
    }

    public String z() {
        if (b() == 0) {
            return null;
        }
        int i2 = this.f3568b;
        while (i2 < this.f3569c && this.f3567a[i2] != 0) {
            i2++;
        }
        String strA = H.a(this.f3567a, this.f3568b, i2 - this.f3568b);
        this.f3568b = i2;
        if (this.f3568b < this.f3569c) {
            this.f3568b++;
        }
        return strA;
    }

    public String A() {
        if (b() == 0) {
            return null;
        }
        int i2 = this.f3568b;
        while (i2 < this.f3569c && !H.a(this.f3567a[i2])) {
            i2++;
        }
        if (i2 - this.f3568b >= 3 && this.f3567a[this.f3568b] == -17 && this.f3567a[this.f3568b + 1] == -69 && this.f3567a[this.f3568b + 2] == -65) {
            this.f3568b += 3;
        }
        String strA = H.a(this.f3567a, this.f3568b, i2 - this.f3568b);
        this.f3568b = i2;
        if (this.f3568b == this.f3569c) {
            return strA;
        }
        if (this.f3567a[this.f3568b] == 13) {
            this.f3568b++;
            if (this.f3568b == this.f3569c) {
                return strA;
            }
        }
        if (this.f3567a[this.f3568b] == 10) {
            this.f3568b++;
        }
        return strA;
    }

    public long B() {
        int i2;
        int i3;
        long j = this.f3567a[this.f3568b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= r6 - 1;
                i3 = 7 - i4;
            } else if (i4 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i3; i2++) {
            if ((this.f3567a[this.f3568b + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f3568b += i3;
        return j;
    }
}

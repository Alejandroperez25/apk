package c.d.a.a.b;

import c.d.a.a.m.AbstractC0170e;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class E {

    /* renamed from: a, reason: collision with root package name */
    private final int f1508a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1509b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1510c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1511d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1512e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1513f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1514g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1515h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f1516i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public E(int i2, int i3, float f2, float f3, int i4) {
        this.f1508a = i2;
        this.f1509b = i3;
        this.f1510c = f2;
        this.f1511d = f3;
        this.f1512e = i2 / i4;
        this.f1513f = i2 / 400;
        this.f1514g = i2 / 65;
        this.f1515h = this.f1514g * 2;
        this.f1516i = new short[this.f1515h];
        this.j = new short[this.f1515h * i3];
        this.l = new short[this.f1515h * i3];
        this.n = new short[this.f1515h * i3];
    }

    public void a(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining() / this.f1509b;
        int i2 = this.f1509b * iRemaining * 2;
        this.j = a(this.j, this.k, iRemaining);
        shortBuffer.get(this.j, this.k * this.f1509b, i2 / 2);
        this.k += iRemaining;
        d();
    }

    public void b(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f1509b, this.m);
        shortBuffer.put(this.l, 0, this.f1509b * iMin);
        this.m -= iMin;
        System.arraycopy(this.l, iMin * this.f1509b, this.l, 0, this.m * this.f1509b);
    }

    public void a() {
        int i2 = this.k;
        int i3 = this.m + ((int) ((((i2 / (this.f1510c / this.f1511d)) + this.o) / (this.f1512e * this.f1511d)) + 0.5f));
        this.j = a(this.j, this.k, (this.f1515h * 2) + i2);
        for (int i4 = 0; i4 < this.f1515h * 2 * this.f1509b; i4++) {
            this.j[(this.f1509b * i2) + i4] = 0;
        }
        this.k += this.f1515h * 2;
        d();
        if (this.m > i3) {
            this.m = i3;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void b() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public int c() {
        return this.m;
    }

    private short[] a(short[] sArr, int i2, int i3) {
        int length = sArr.length / this.f1509b;
        return i2 + i3 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i3) * this.f1509b);
    }

    private void a(int i2) {
        int i3 = this.k - i2;
        System.arraycopy(this.j, i2 * this.f1509b, this.j, 0, this.f1509b * i3);
        this.k = i3;
    }

    private void b(short[] sArr, int i2, int i3) {
        this.l = a(this.l, this.m, i3);
        System.arraycopy(sArr, i2 * this.f1509b, this.l, this.m * this.f1509b, this.f1509b * i3);
        this.m += i3;
    }

    private int b(int i2) {
        int iMin = Math.min(this.f1515h, this.r);
        b(this.j, i2, iMin);
        this.r -= iMin;
        return iMin;
    }

    private void c(short[] sArr, int i2, int i3) {
        int i4 = this.f1515h / i3;
        int i5 = this.f1509b * i3;
        int i6 = i2 * this.f1509b;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f1516i[i7] = (short) (i8 / i5);
        }
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f1509b;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i7 < i6 * i3) {
                i7 = i3;
                i6 = iAbs;
            }
            if (iAbs * i9 > i8 * i3) {
                i9 = i3;
                i8 = iAbs;
            }
            i3++;
        }
        this.u = i6 / i7;
        this.v = i8 / i9;
        return i7;
    }

    private boolean a(int i2, int i3) {
        return i2 != 0 && this.s != 0 && i3 <= i2 * 3 && i2 * 2 > this.t * 3;
    }

    private int a(short[] sArr, int i2) {
        int iA;
        int i3 = this.f1508a > 4000 ? this.f1508a / 4000 : 1;
        if (this.f1509b == 1 && i3 == 1) {
            iA = a(sArr, i2, this.f1513f, this.f1514g);
        } else {
            c(sArr, i2, i3);
            int iA2 = a(this.f1516i, 0, this.f1513f / i3, this.f1514g / i3);
            if (i3 != 1) {
                int i4 = iA2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                if (i6 < this.f1513f) {
                    i6 = this.f1513f;
                }
                if (i7 > this.f1514g) {
                    i7 = this.f1514g;
                }
                if (this.f1509b == 1) {
                    iA = a(sArr, i2, i6, i7);
                } else {
                    c(sArr, i2, 1);
                    iA = a(this.f1516i, 0, i6, i7);
                }
            } else {
                iA = iA2;
            }
        }
        int i8 = a(this.u, this.v) ? this.s : iA;
        this.t = this.u;
        this.s = iA;
        return i8;
    }

    private void c(int i2) {
        int i3 = this.m - i2;
        this.n = a(this.n, this.o, i3);
        System.arraycopy(this.l, this.f1509b * i2, this.n, this.o * this.f1509b, this.f1509b * i3);
        this.m = i2;
        this.o += i3;
    }

    private void d(int i2) {
        if (i2 == 0) {
            return;
        }
        System.arraycopy(this.n, this.f1509b * i2, this.n, 0, (this.o - i2) * this.f1509b);
        this.o -= i2;
    }

    private short b(short[] sArr, int i2, int i3, int i4) {
        short s = sArr[i2];
        short s2 = sArr[i2 + this.f1509b];
        int i5 = this.q * i3;
        int i6 = this.p * i4;
        int i7 = (this.p + 1) * i4;
        int i8 = i7 - i5;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    private void a(float f2, int i2) {
        if (this.m == i2) {
            return;
        }
        int i3 = (int) (this.f1508a / f2);
        int i4 = this.f1508a;
        while (true) {
            if (i3 <= 16384 && i4 <= 16384) {
                break;
            }
            i3 /= 2;
            i4 /= 2;
        }
        c(i2);
        int i5 = 0;
        while (true) {
            if (i5 < this.o - 1) {
                while ((this.p + 1) * i3 > this.q * i4) {
                    this.l = a(this.l, this.m, 1);
                    for (int i6 = 0; i6 < this.f1509b; i6++) {
                        this.l[(this.m * this.f1509b) + i6] = b(this.n, (this.f1509b * i5) + i6, i4, i3);
                    }
                    this.q++;
                    this.m++;
                }
                this.p++;
                if (this.p == i4) {
                    this.p = 0;
                    AbstractC0170e.b(this.q == i3);
                    this.q = 0;
                }
                i5++;
            } else {
                d(this.o - 1);
                return;
            }
        }
    }

    private int a(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (i3 / (f2 - 1.0f));
        } else {
            this.r = (int) ((i3 * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        this.l = a(this.l, this.m, i4);
        a(i4, this.f1509b, this.l, this.m, sArr, i2, sArr, i2 + i3);
        this.m += i4;
        return i4;
    }

    private int b(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            this.r = (int) ((i3 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        this.l = a(this.l, this.m, i5);
        System.arraycopy(sArr, this.f1509b * i2, this.l, this.m * this.f1509b, this.f1509b * i3);
        a(i4, this.f1509b, this.l, this.m + i3, sArr, i2 + i3, sArr, i2);
        this.m += i5;
        return i4;
    }

    private void a(float f2) {
        if (this.k < this.f1515h) {
            return;
        }
        int i2 = this.k;
        int iB = 0;
        do {
            if (this.r > 0) {
                iB += b(iB);
            } else {
                int iA = a(this.j, iB);
                if (f2 > 1.0d) {
                    iB += iA + a(this.j, iB, f2, iA);
                } else {
                    iB += b(this.j, iB, f2, iA);
                }
            }
        } while (this.f1515h + iB <= i2);
        a(iB);
    }

    private void d() {
        int i2 = this.m;
        float f2 = this.f1510c / this.f1511d;
        float f3 = this.f1512e * this.f1511d;
        double d2 = f2;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            a(f2);
        } else {
            b(this.j, 0, this.k);
            this.k = 0;
        }
        if (f3 != 1.0f) {
            a(f3, i2);
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }
}

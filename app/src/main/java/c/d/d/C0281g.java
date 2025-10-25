package c.d.d;

import c.d.d.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: c.d.d.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281g {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4396a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4397b;

    /* renamed from: c, reason: collision with root package name */
    private int f4398c;

    /* renamed from: d, reason: collision with root package name */
    private int f4399d;

    /* renamed from: e, reason: collision with root package name */
    private int f4400e;

    /* renamed from: g, reason: collision with root package name */
    private int f4402g;

    /* renamed from: i, reason: collision with root package name */
    private int f4404i;
    private int k;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4403h = false;
    private int j = Integer.MAX_VALUE;
    private int l = 100;
    private int m = 67108864;
    private a n = null;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f4401f = null;

    /* renamed from: c.d.d.g$a */
    private interface a {
        void a();
    }

    public static int a(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0281g a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static C0281g a(byte[] bArr, int i2, int i3) {
        return a(bArr, i2, i3, false);
    }

    static C0281g a(byte[] bArr, int i2, int i3, boolean z) {
        C0281g c0281g = new C0281g(bArr, i2, i3, z);
        try {
            c0281g.d(i3);
            return c0281g;
        } catch (C0291q e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int a() throws C0291q {
        if (y()) {
            this.f4402g = 0;
            return 0;
        }
        this.f4402g = t();
        if (S.b(this.f4402g) == 0) {
            throw C0291q.d();
        }
        return this.f4402g;
    }

    public void b(int i2) throws C0291q {
        if (this.f4402g != i2) {
            throw C0291q.e();
        }
    }

    public boolean c(int i2) throws C0291q {
        switch (S.a(i2)) {
            case 0:
                A();
                return true;
            case 1:
                f(8);
                return true;
            case 2:
                f(t());
                return true;
            case 3:
                b();
                b(S.a(S.b(i2), 4));
                return true;
            case 4:
                return false;
            case 5:
                f(4);
                return true;
            default:
                throw C0291q.f();
        }
    }

    public void b() throws C0291q {
        int iA;
        do {
            iA = a();
            if (iA == 0) {
                return;
            }
        } while (c(iA));
    }

    public double c() {
        return Double.longBitsToDouble(x());
    }

    public float d() {
        return Float.intBitsToFloat(w());
    }

    public long e() {
        return u();
    }

    public long f() {
        return u();
    }

    public int g() {
        return t();
    }

    public long h() {
        return x();
    }

    public int i() {
        return w();
    }

    public boolean j() {
        return u() != 0;
    }

    public String k() throws C0291q {
        int iT = t();
        if (iT <= this.f4398c - this.f4400e && iT > 0) {
            String str = new String(this.f4396a, this.f4400e, iT, AbstractC0290p.f4443a);
            this.f4400e += iT;
            return str;
        }
        if (iT == 0) {
            return "";
        }
        if (iT <= this.f4398c) {
            g(iT);
            String str2 = new String(this.f4396a, this.f4400e, iT, AbstractC0290p.f4443a);
            this.f4400e += iT;
            return str2;
        }
        return new String(i(iT), AbstractC0290p.f4443a);
    }

    public String l() throws IOException {
        byte[] bArrI;
        int iT = t();
        int i2 = this.f4400e;
        int i3 = 0;
        if (iT <= this.f4398c - i2 && iT > 0) {
            bArrI = this.f4396a;
            this.f4400e = i2 + iT;
            i3 = i2;
        } else {
            if (iT == 0) {
                return "";
            }
            if (iT <= this.f4398c) {
                g(iT);
                bArrI = this.f4396a;
                this.f4400e = iT + 0;
            } else {
                bArrI = i(iT);
            }
        }
        if (!M.a(bArrI, i3, i3 + iT)) {
            throw C0291q.i();
        }
        return new String(bArrI, i3, iT, AbstractC0290p.f4443a);
    }

    public void a(x.a aVar, C0285k c0285k) throws C0291q {
        int iT = t();
        if (this.k >= this.l) {
            throw C0291q.g();
        }
        int iD = d(iT);
        this.k++;
        aVar.a(this, c0285k);
        b(0);
        this.k--;
        e(iD);
    }

    public <T extends x> T a(A<T> a2, C0285k c0285k) throws C0291q {
        int iT = t();
        if (this.k >= this.l) {
            throw C0291q.g();
        }
        int iD = d(iT);
        this.k++;
        T tA = a2.a(this, c0285k);
        b(0);
        this.k--;
        e(iD);
        return tA;
    }

    public AbstractC0280f m() {
        AbstractC0280f abstractC0280fA;
        int iT = t();
        if (iT > this.f4398c - this.f4400e || iT <= 0) {
            if (iT == 0) {
                return AbstractC0280f.f4390a;
            }
            return AbstractC0280f.b(i(iT));
        }
        if (this.f4397b && this.f4403h) {
            abstractC0280fA = AbstractC0280f.b(this.f4396a, this.f4400e, iT);
        } else {
            abstractC0280fA = AbstractC0280f.a(this.f4396a, this.f4400e, iT);
        }
        this.f4400e += iT;
        return abstractC0280fA;
    }

    public int n() {
        return t();
    }

    public int o() {
        return t();
    }

    public int p() {
        return w();
    }

    public long q() {
        return x();
    }

    public int r() {
        return a(t());
    }

    public long s() {
        return a(u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r1[r2] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int t() {
        /*
            r5 = this;
            int r0 = r5.f4400e
            int r1 = r5.f4398c
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r1 = r5.f4396a
            int r2 = r0 + 1
            r0 = r1[r0]
            if (r0 < 0) goto L12
            r5.f4400e = r2
            return r0
        L12:
            int r3 = r5.f4398c
            int r3 = r3 - r2
            r4 = 9
            if (r3 >= r4) goto L1a
            goto L6c
        L1a:
            int r3 = r2 + 1
            r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L26
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L72
        L26:
            int r2 = r3 + 1
            r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L33
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L31:
            r3 = r2
            goto L72
        L33:
            int r3 = r2 + 1
            r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L41
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L72
        L41:
            int r2 = r3 + 1
            r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L31
            int r3 = r2 + 1
            r2 = r1[r2]
            if (r2 >= 0) goto L72
            int r2 = r3 + 1
            r3 = r1[r3]
            if (r3 >= 0) goto L31
            int r3 = r2 + 1
            r2 = r1[r2]
            if (r2 >= 0) goto L72
            int r2 = r3 + 1
            r3 = r1[r3]
            if (r3 >= 0) goto L31
            int r3 = r2 + 1
            r1 = r1[r2]
            if (r1 >= 0) goto L72
        L6c:
            long r0 = r5.v()
            int r0 = (int) r0
            return r0
        L72:
            r5.f4400e = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.d.C0281g.t():int");
    }

    private void A() throws C0291q {
        if (this.f4398c - this.f4400e >= 10) {
            byte[] bArr = this.f4396a;
            int i2 = this.f4400e;
            int i3 = 0;
            while (i3 < 10) {
                int i4 = i2 + 1;
                if (bArr[i2] >= 0) {
                    this.f4400e = i4;
                    return;
                } else {
                    i3++;
                    i2 = i4;
                }
            }
        }
        B();
    }

    private void B() throws C0291q {
        for (int i2 = 0; i2 < 10; i2++) {
            if (z() >= 0) {
                return;
            }
        }
        throw C0291q.c();
    }

    public long u() {
        int i2;
        long j;
        long j2;
        long j3;
        int i3 = this.f4400e;
        if (this.f4398c != i3) {
            byte[] bArr = this.f4396a;
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f4400e = i4;
                return b2;
            }
            if (this.f4398c - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b2 ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        long j4 = i8 ^ 16256;
                        i2 = i7;
                        j = j4;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            j3 = i9 ^ (-2080896);
                        } else {
                            long j5 = i9;
                            i2 = i5 + 1;
                            long j6 = (bArr[i5] << 28) ^ j5;
                            if (j6 >= 0) {
                                j = j6 ^ 266354560;
                            } else {
                                int i10 = i2 + 1;
                                long j7 = j6 ^ (bArr[i2] << 35);
                                if (j7 < 0) {
                                    j2 = (-34093383808L) ^ j7;
                                } else {
                                    i2 = i10 + 1;
                                    long j8 = j7 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j = j8 ^ 4363953127296L;
                                    } else {
                                        i10 = i2 + 1;
                                        long j9 = j8 ^ (bArr[i2] << 49);
                                        if (j9 < 0) {
                                            j2 = (-558586000294016L) ^ j9;
                                        } else {
                                            i2 = i10 + 1;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i10 = i2 + 1;
                                                if (bArr[i2] >= 0) {
                                                    j = j10;
                                                    i2 = i10;
                                                }
                                            } else {
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                                j = j2;
                                i2 = i10;
                            }
                        }
                    }
                    this.f4400e = i2;
                    return j;
                }
                j3 = i6 ^ (-128);
                j = j3;
                i2 = i5;
                this.f4400e = i2;
                return j;
            }
        }
        return v();
    }

    long v() throws C0291q {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r3 & 127) << i2;
            if ((z() & 128) == 0) {
                return j;
            }
        }
        throw C0291q.c();
    }

    public int w() throws C0291q {
        int i2 = this.f4400e;
        if (this.f4398c - i2 < 4) {
            g(4);
            i2 = this.f4400e;
        }
        byte[] bArr = this.f4396a;
        this.f4400e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long x() throws C0291q {
        int i2 = this.f4400e;
        if (this.f4398c - i2 < 8) {
            g(8);
            i2 = this.f4400e;
        }
        byte[] bArr = this.f4396a;
        this.f4400e = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    private C0281g(byte[] bArr, int i2, int i3, boolean z) {
        this.f4396a = bArr;
        this.f4398c = i3 + i2;
        this.f4400e = i2;
        this.f4404i = -i2;
        this.f4397b = z;
    }

    public int d(int i2) throws C0291q {
        if (i2 < 0) {
            throw C0291q.b();
        }
        int i3 = i2 + this.f4404i + this.f4400e;
        int i4 = this.j;
        if (i3 > i4) {
            throw C0291q.a();
        }
        this.j = i3;
        C();
        return i4;
    }

    private void C() {
        this.f4398c += this.f4399d;
        int i2 = this.f4404i + this.f4398c;
        if (i2 > this.j) {
            this.f4399d = i2 - this.j;
            this.f4398c -= this.f4399d;
        } else {
            this.f4399d = 0;
        }
    }

    public void e(int i2) {
        this.j = i2;
        C();
    }

    public boolean y() {
        return this.f4400e == this.f4398c && !h(1);
    }

    private void g(int i2) throws C0291q {
        if (!h(i2)) {
            throw C0291q.a();
        }
    }

    private boolean h(int i2) throws IOException {
        if (this.f4400e + i2 <= this.f4398c) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        if (this.f4404i + this.f4400e + i2 > this.j) {
            return false;
        }
        if (this.n != null) {
            this.n.a();
        }
        if (this.f4401f != null) {
            int i3 = this.f4400e;
            if (i3 > 0) {
                if (this.f4398c > i3) {
                    System.arraycopy(this.f4396a, i3, this.f4396a, 0, this.f4398c - i3);
                }
                this.f4404i += i3;
                this.f4398c -= i3;
                this.f4400e = 0;
            }
            int i4 = this.f4401f.read(this.f4396a, this.f4398c, this.f4396a.length - this.f4398c);
            if (i4 == 0 || i4 < -1 || i4 > this.f4396a.length) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + i4 + "\nThe InputStream implementation is buggy.");
            }
            if (i4 > 0) {
                this.f4398c += i4;
                if ((this.f4404i + i2) - this.m > 0) {
                    throw C0291q.h();
                }
                C();
                if (this.f4398c >= i2) {
                    return true;
                }
                return h(i2);
            }
        }
        return false;
    }

    public byte z() throws C0291q {
        if (this.f4400e == this.f4398c) {
            g(1);
        }
        byte[] bArr = this.f4396a;
        int i2 = this.f4400e;
        this.f4400e = i2 + 1;
        return bArr[i2];
    }

    private byte[] i(int i2) throws IOException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return AbstractC0290p.f4445c;
            }
            throw C0291q.b();
        }
        int i3 = this.f4404i + this.f4400e + i2;
        if (i3 > this.m) {
            throw C0291q.h();
        }
        if (i3 > this.j) {
            f((this.j - this.f4404i) - this.f4400e);
            throw C0291q.a();
        }
        if (this.f4401f == null) {
            throw C0291q.a();
        }
        int i4 = this.f4400e;
        int length = this.f4398c - this.f4400e;
        this.f4404i += this.f4398c;
        this.f4400e = 0;
        this.f4398c = 0;
        int length2 = i2 - length;
        if (length2 < 4096 || length2 <= this.f4401f.available()) {
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f4396a, i4, bArr, 0, length);
            while (length < bArr.length) {
                int i5 = this.f4401f.read(bArr, length, i2 - length);
                if (i5 == -1) {
                    throw C0291q.a();
                }
                this.f4404i += i5;
                length += i5;
            }
            return bArr;
        }
        ArrayList<byte[]> arrayList = new ArrayList();
        while (length2 > 0) {
            byte[] bArr2 = new byte[Math.min(length2, 4096)];
            int i6 = 0;
            while (i6 < bArr2.length) {
                int i7 = this.f4401f.read(bArr2, i6, bArr2.length - i6);
                if (i7 == -1) {
                    throw C0291q.a();
                }
                this.f4404i += i7;
                i6 += i7;
            }
            length2 -= bArr2.length;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(this.f4396a, i4, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public void f(int i2) throws C0291q {
        if (i2 <= this.f4398c - this.f4400e && i2 >= 0) {
            this.f4400e += i2;
        } else {
            j(i2);
        }
    }

    private void j(int i2) throws C0291q {
        if (i2 < 0) {
            throw C0291q.b();
        }
        if (this.f4404i + this.f4400e + i2 > this.j) {
            f((this.j - this.f4404i) - this.f4400e);
            throw C0291q.a();
        }
        int i3 = this.f4398c - this.f4400e;
        this.f4400e = this.f4398c;
        g(1);
        while (true) {
            int i4 = i2 - i3;
            if (i4 > this.f4398c) {
                i3 += this.f4398c;
                this.f4400e = this.f4398c;
                g(1);
            } else {
                this.f4400e = i4;
                return;
            }
        }
    }
}

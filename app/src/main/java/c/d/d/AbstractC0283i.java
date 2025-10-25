package c.d.d;

import c.d.d.M;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.d.d.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283i extends AbstractC0278d {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f4405a = Logger.getLogger(AbstractC0283i.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4406b = L.a();

    /* renamed from: c, reason: collision with root package name */
    private static final long f4407c = L.c();

    public static int a(double d2) {
        return 8;
    }

    public static int a(float f2) {
        return 4;
    }

    public static int a(boolean z) {
        return 1;
    }

    public static int b(long j) {
        int i2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i2 = 6;
            j >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j) != 0) {
            i2 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int c(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d(long j) {
        return 8;
    }

    public static int e(int i2) {
        return 4;
    }

    public static int e(long j) {
        return 8;
    }

    public static int f(int i2) {
        return 4;
    }

    public static long f(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int i(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract void a(byte b2);

    public abstract void b(int i2, AbstractC0280f abstractC0280f);

    public abstract void b(int i2, x xVar);

    public abstract void b(int i2, String str);

    public abstract void b(int i2, boolean z);

    public abstract void b(AbstractC0280f abstractC0280f);

    public abstract void b(String str);

    public abstract int c();

    public abstract void c(int i2, int i3);

    public abstract void c(x xVar);

    abstract void c(byte[] bArr, int i2, int i3);

    public abstract void d(int i2, int i3);

    public abstract void h(long j);

    public abstract void j(int i2);

    public abstract void j(long j);

    public abstract void k(int i2);

    public abstract void m(int i2);

    public static AbstractC0283i a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AbstractC0283i b(byte[] bArr, int i2, int i3) {
        return new a(bArr, i2, i3);
    }

    private AbstractC0283i() {
    }

    public final void e(int i2, int i3) {
        d(i2, i3);
    }

    public final void l(int i2) {
        k(i(i2));
    }

    public final void n(int i2) {
        m(i2);
    }

    public final void g(long j) {
        h(j);
    }

    public final void i(long j) {
        h(f(j));
    }

    public final void k(long j) {
        j(j);
    }

    public final void b(float f2) {
        m(Float.floatToRawIntBits(f2));
    }

    public final void b(double d2) {
        j(Double.doubleToRawLongBits(d2));
    }

    public final void b(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    public final void o(int i2) {
        j(i2);
    }

    public final void c(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public static int a(int i2, int i3) {
        return a(i2) + b(i3);
    }

    public static int a(int i2, boolean z) {
        return a(i2) + a(z);
    }

    public static int b(int i2, int i3) {
        return a(i2) + g(i3);
    }

    public static int a(int i2, String str) {
        return a(i2) + a(str);
    }

    public static int a(int i2, AbstractC0280f abstractC0280f) {
        return a(i2) + a(abstractC0280f);
    }

    public static int a(int i2, x xVar) {
        return a(i2) + a(xVar);
    }

    public static int a(int i2) {
        return c(S.a(i2, 0));
    }

    public static int b(int i2) {
        if (i2 >= 0) {
            return c(i2);
        }
        return 10;
    }

    public static int d(int i2) {
        return c(i(i2));
    }

    public static int a(long j) {
        return b(j);
    }

    public static int c(long j) {
        return b(f(j));
    }

    public static int g(int i2) {
        return b(i2);
    }

    public static int a(String str) {
        int length;
        try {
            length = M.a(str);
        } catch (M.c unused) {
            length = str.getBytes(AbstractC0290p.f4443a).length;
        }
        return h(length);
    }

    public static int a(AbstractC0294t abstractC0294t) {
        return h(abstractC0294t.a());
    }

    public static int a(AbstractC0280f abstractC0280f) {
        return h(abstractC0280f.size());
    }

    public static int b(byte[] bArr) {
        return h(bArr.length);
    }

    public static int a(x xVar) {
        return h(xVar.c());
    }

    static int h(int i2) {
        return c(i2) + i2;
    }

    public final void d() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c.d.d.i$b */
    public static class b extends IOException {
        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    final void a(String str, M.c cVar) throws b {
        f4405a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(AbstractC0290p.f4443a);
        try {
            k(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new b(e3);
        }
    }

    @Deprecated
    public final void c(int i2, x xVar) {
        c(i2, 3);
        d(xVar);
        c(i2, 4);
    }

    @Deprecated
    public final void d(x xVar) {
        xVar.a(this);
    }

    @Deprecated
    public static int b(x xVar) {
        return xVar.c();
    }

    /* renamed from: c.d.d.i$a */
    private static class a extends AbstractC0283i {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f4408d;

        /* renamed from: e, reason: collision with root package name */
        private final int f4409e;

        /* renamed from: f, reason: collision with root package name */
        private final int f4410f;

        /* renamed from: g, reason: collision with root package name */
        private int f4411g;

        a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f4408d = bArr;
            this.f4409e = i2;
            this.f4411g = i2;
            this.f4410f = i4;
        }

        @Override // c.d.d.AbstractC0283i
        public final void c(int i2, int i3) throws b {
            k(S.a(i2, i3));
        }

        @Override // c.d.d.AbstractC0283i
        public final void d(int i2, int i3) throws b {
            c(i2, 0);
            j(i3);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(int i2, boolean z) throws b {
            c(i2, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(int i2, String str) throws b {
            c(i2, 2);
            b(str);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(int i2, AbstractC0280f abstractC0280f) throws b {
            c(i2, 2);
            b(abstractC0280f);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(AbstractC0280f abstractC0280f) throws b {
            k(abstractC0280f.size());
            abstractC0280f.a(this);
        }

        @Override // c.d.d.AbstractC0283i
        public final void c(byte[] bArr, int i2, int i3) throws b {
            k(i3);
            d(bArr, i2, i3);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(int i2, x xVar) throws b {
            c(i2, 2);
            c(xVar);
        }

        @Override // c.d.d.AbstractC0283i
        public final void c(x xVar) throws b {
            k(xVar.c());
            xVar.a(this);
        }

        @Override // c.d.d.AbstractC0283i
        public final void a(byte b2) throws b {
            try {
                byte[] bArr = this.f4408d;
                int i2 = this.f4411g;
                this.f4411g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), 1), e2);
            }
        }

        @Override // c.d.d.AbstractC0283i
        public final void j(int i2) throws b {
            if (i2 >= 0) {
                k(i2);
            } else {
                h(i2);
            }
        }

        @Override // c.d.d.AbstractC0283i
        public final void k(int i2) throws b {
            if (AbstractC0283i.f4406b && c() >= 10) {
                long j = AbstractC0283i.f4407c + this.f4411g;
                while ((i2 & (-128)) != 0) {
                    L.a(this.f4408d, j, (byte) ((i2 & 127) | 128));
                    this.f4411g++;
                    i2 >>>= 7;
                    j = 1 + j;
                }
                L.a(this.f4408d, j, (byte) i2);
                this.f4411g++;
                return;
            }
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f4408d;
                    int i3 = this.f4411g;
                    this.f4411g = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), 1), e2);
                }
            }
            byte[] bArr2 = this.f4408d;
            int i4 = this.f4411g;
            this.f4411g = i4 + 1;
            bArr2[i4] = (byte) i2;
        }

        @Override // c.d.d.AbstractC0283i
        public final void m(int i2) throws b {
            try {
                byte[] bArr = this.f4408d;
                int i3 = this.f4411g;
                this.f4411g = i3 + 1;
                bArr[i3] = (byte) (i2 & 255);
                byte[] bArr2 = this.f4408d;
                int i4 = this.f4411g;
                this.f4411g = i4 + 1;
                bArr2[i4] = (byte) ((i2 >> 8) & 255);
                byte[] bArr3 = this.f4408d;
                int i5 = this.f4411g;
                this.f4411g = i5 + 1;
                bArr3[i5] = (byte) ((i2 >> 16) & 255);
                byte[] bArr4 = this.f4408d;
                int i6 = this.f4411g;
                this.f4411g = i6 + 1;
                bArr4[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), 1), e2);
            }
        }

        @Override // c.d.d.AbstractC0283i
        public final void h(long j) throws b {
            if (AbstractC0283i.f4406b && c() >= 10) {
                long j2 = AbstractC0283i.f4407c + this.f4411g;
                while ((j & (-128)) != 0) {
                    L.a(this.f4408d, j2, (byte) ((((int) j) & 127) | 128));
                    this.f4411g++;
                    j >>>= 7;
                    j2 = 1 + j2;
                }
                L.a(this.f4408d, j2, (byte) j);
                this.f4411g++;
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.f4408d;
                    int i2 = this.f4411g;
                    this.f4411g = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), 1), e2);
                }
            }
            byte[] bArr2 = this.f4408d;
            int i3 = this.f4411g;
            this.f4411g = i3 + 1;
            bArr2[i3] = (byte) j;
        }

        @Override // c.d.d.AbstractC0283i
        public final void j(long j) throws b {
            try {
                byte[] bArr = this.f4408d;
                int i2 = this.f4411g;
                this.f4411g = i2 + 1;
                bArr[i2] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.f4408d;
                int i3 = this.f4411g;
                this.f4411g = i3 + 1;
                bArr2[i3] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.f4408d;
                int i4 = this.f4411g;
                this.f4411g = i4 + 1;
                bArr3[i4] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.f4408d;
                int i5 = this.f4411g;
                this.f4411g = i5 + 1;
                bArr4[i5] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.f4408d;
                int i6 = this.f4411g;
                this.f4411g = i6 + 1;
                bArr5[i6] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.f4408d;
                int i7 = this.f4411g;
                this.f4411g = i7 + 1;
                bArr6[i7] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.f4408d;
                int i8 = this.f4411g;
                this.f4411g = i8 + 1;
                bArr7[i8] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.f4408d;
                int i9 = this.f4411g;
                this.f4411g = i9 + 1;
                bArr8[i9] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), 1), e2);
            }
        }

        public final void d(byte[] bArr, int i2, int i3) throws b {
            try {
                System.arraycopy(bArr, i2, this.f4408d, this.f4411g, i3);
                this.f4411g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4411g), Integer.valueOf(this.f4410f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // c.d.d.AbstractC0278d
        public final void a(byte[] bArr, int i2, int i3) throws b {
            d(bArr, i2, i3);
        }

        @Override // c.d.d.AbstractC0283i
        public final void b(String str) throws b {
            int i2 = this.f4411g;
            try {
                int iC = AbstractC0283i.c(str.length() * 3);
                int iC2 = AbstractC0283i.c(str.length());
                if (iC2 == iC) {
                    this.f4411g = i2 + iC2;
                    int iA = M.a(str, this.f4408d, this.f4411g, c());
                    this.f4411g = i2;
                    k((iA - i2) - iC2);
                    this.f4411g = iA;
                } else {
                    k(M.a(str));
                    this.f4411g = M.a(str, this.f4408d, this.f4411g, c());
                }
            } catch (M.c e2) {
                this.f4411g = i2;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // c.d.d.AbstractC0283i
        public final int c() {
            return this.f4410f - this.f4411g;
        }
    }
}

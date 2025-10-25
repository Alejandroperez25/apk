package c.d.a.a.m;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3547a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f3548b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3549c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f3550d = new int[10];

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3554a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3555b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3556c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3557d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3558e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3559f;

        /* renamed from: g, reason: collision with root package name */
        public final float f3560g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f3561h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f3562i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f3554a = i2;
            this.f3555b = i3;
            this.f3556c = i4;
            this.f3557d = i5;
            this.f3558e = i6;
            this.f3559f = i7;
            this.f3560g = f2;
            this.f3561h = z;
            this.f3562i = z2;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = z3;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3551a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3552b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3553c;

        public a(int i2, int i3, boolean z) {
            this.f3551a = i2;
            this.f3552b = i3;
            this.f3553c = z;
        }
    }

    public static int a(byte[] bArr, int i2) {
        int i3;
        synchronized (f3549c) {
            int iC = 0;
            int i4 = 0;
            while (iC < i2) {
                try {
                    iC = c(bArr, iC, i2);
                    if (iC < i2) {
                        if (f3550d.length <= i4) {
                            f3550d = Arrays.copyOf(f3550d, f3550d.length * 2);
                        }
                        f3550d[i4] = iC;
                        iC += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f3550d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i3 - i5);
        }
        return i3;
    }

    public static void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 < iPosition) {
                int i5 = byteBuffer.get(i2) & 255;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static int b(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int c(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.d.a.a.m.s.b a(byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.m.s.a(byte[], int, int):c.d.a.a.m.s$b");
    }

    public static a b(byte[] bArr, int i2, int i3) {
        v vVar = new v(bArr, i2, i3);
        vVar.a(8);
        int iD = vVar.d();
        int iD2 = vVar.d();
        vVar.a();
        return new a(iD, iD2, vVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x007b, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.m.s.a(byte[], int, int, boolean[]):int");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int c(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static void a(v vVar, int i2) {
        int iE = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (iE != 0) {
                iE = ((vVar.e() + i3) + 256) % 256;
            }
            if (iE != 0) {
                i3 = iE;
            }
        }
    }
}

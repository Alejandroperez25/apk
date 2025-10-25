package c.d.a.a.e.c;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f1826a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1827b = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    private int f1828c;

    /* renamed from: d, reason: collision with root package name */
    private int f1829d;

    public void a() {
        this.f1828c = 0;
        this.f1829d = 0;
    }

    public long a(c.d.a.a.e.h hVar, boolean z, boolean z2, int i2) {
        if (this.f1828c == 0) {
            if (!hVar.a(this.f1827b, 0, 1, z)) {
                return -1L;
            }
            this.f1829d = a(this.f1827b[0] & 255);
            if (this.f1829d == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f1828c = 1;
        }
        if (this.f1829d > i2) {
            this.f1828c = 0;
            return -2L;
        }
        if (this.f1829d != 1) {
            hVar.readFully(this.f1827b, 1, this.f1829d - 1);
        }
        this.f1828c = 0;
        return a(this.f1827b, this.f1829d, z2);
    }

    public int b() {
        return this.f1829d;
    }

    public static int a(int i2) {
        for (int i3 = 0; i3 < f1826a.length; i3++) {
            if ((f1826a[i3] & i2) != 0) {
                return i3 + 1;
            }
        }
        return -1;
    }

    public static long a(byte[] bArr, int i2, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f1826a[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j = (j << 8) | (bArr[i3] & 255);
        }
        return j;
    }
}

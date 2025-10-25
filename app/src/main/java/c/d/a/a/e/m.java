package c.d.a.a.e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f2340a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f2341b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f2342c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f2343d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f2344e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f2345f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f2346g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: h, reason: collision with root package name */
    public int f2347h;

    /* renamed from: i, reason: collision with root package name */
    public String f2348i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f2341b[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f2342c[i5 - 1] : f2343d[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f2344e[i5 - 1] : f2345f[i5 - 1];
        } else {
            i7 = f2346g[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static boolean a(int i2, m mVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = f2341b[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = ((((i3 == 3 ? f2342c[i5 - 1] : f2343d[i5 - 1]) * 12) / i10) + i11) * 4;
            i8 = 384;
        } else {
            if (i3 == 3) {
                i7 = (((i4 == 2 ? f2344e[i5 - 1] : f2345f[i5 - 1]) * 144) / i10) + i11;
                i8 = 1152;
            } else {
                int i12 = f2346g[i5 - 1];
                int i13 = i4 == 1 ? 576 : 1152;
                i7 = (((i4 == 1 ? 72 : 144) * i12) / i10) + i11;
                i8 = i13;
            }
        }
        mVar.a(i3, f2340a[3 - i4], i7, i10, ((i2 >> 6) & 3) == 3 ? 1 : 2, ((i7 * 8) * i10) / i8, i8);
        return true;
    }

    private void a(int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.f2347h = i2;
        this.f2348i = str;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
    }
}

package c.d.a.a.l;

import android.net.Uri;
import c.d.a.a.m.AbstractC0170e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3418b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3419c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public final byte[] f3420d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3421e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3422f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3423g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3424h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3425i;

    public n(Uri uri, int i2) {
        this(uri, 0L, -1L, null, i2);
    }

    public n(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public n(Uri uri, long j, long j2, String str, int i2) {
        this(uri, j, j, j2, str, i2);
    }

    public n(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, null, j, j2, j3, str, i2);
    }

    public n(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i2);
    }

    public n(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3) {
        byte[] bArr2 = bArr;
        AbstractC0170e.a(j >= 0);
        AbstractC0170e.a(j2 >= 0);
        AbstractC0170e.a(j3 > 0 || j3 == -1);
        this.f3417a = uri;
        this.f3418b = i2;
        this.f3419c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f3420d = this.f3419c;
        this.f3421e = j;
        this.f3422f = j2;
        this.f3423g = j3;
        this.f3424h = str;
        this.f3425i = i3;
    }

    public boolean b(int i2) {
        return (this.f3425i & i2) == i2;
    }

    public String toString() {
        return "DataSpec[" + a() + " " + this.f3417a + ", " + Arrays.toString(this.f3419c) + ", " + this.f3421e + ", " + this.f3422f + ", " + this.f3423g + ", " + this.f3424h + ", " + this.f3425i + "]";
    }

    public final String a() {
        return a(this.f3418b);
    }

    public static String a(int i2) {
        switch (i2) {
            case 1:
                return "GET";
            case 2:
                return "POST";
            case 3:
                return "HEAD";
            default:
                throw new AssertionError(i2);
        }
    }

    public n a(long j) {
        return a(j, this.f3423g != -1 ? this.f3423g - j : -1L);
    }

    public n a(long j, long j2) {
        return (j == 0 && this.f3423g == j2) ? this : new n(this.f3417a, this.f3418b, this.f3419c, this.f3421e + j, this.f3422f + j, j2, this.f3424h, this.f3425i);
    }
}

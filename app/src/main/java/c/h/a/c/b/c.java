package c.h.a.c.b;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(int i2) {
        a.a(i2);
        d.a(i2);
    }

    public static byte[] a(byte[] bArr, int i2, int i3, c.h.a.d.b bVar) {
        switch (b.f4747a[bVar.ordinal()]) {
            case 1:
                return a.b(bArr, i2, i3);
            case 2:
                return a.a(bArr, i2, i3);
            default:
                return null;
        }
    }

    public static byte[] a(byte[] bArr, int i2, int i3, int i4) {
        if (i4 == 0) {
            return bArr;
        }
        if (i4 == 90) {
            return a.c(bArr, i2, i3);
        }
        if (i4 == 180) {
            return a.d(bArr, i2, i3);
        }
        if (i4 != 270) {
            return null;
        }
        return a.e(bArr, i2, i3);
    }

    public static byte[] b(byte[] bArr, int i2, int i3, c.h.a.d.b bVar) {
        switch (b.f4747a[bVar.ordinal()]) {
            case 1:
                return d.b(bArr, i2, i3);
            case 2:
                return d.a(bArr, i2, i3);
            default:
                return null;
        }
    }

    public static byte[] b(byte[] bArr, int i2, int i3, int i4) {
        if (i4 == 0) {
            return bArr;
        }
        if (i4 == 90) {
            return d.c(bArr, i2, i3);
        }
        if (i4 == 180) {
            return d.d(bArr, i2, i3);
        }
        if (i4 != 270) {
            return null;
        }
        return d.e(bArr, i2, i3);
    }
}

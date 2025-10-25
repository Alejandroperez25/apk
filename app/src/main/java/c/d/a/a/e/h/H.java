package c.d.a.a.e.h;

/* loaded from: classes.dex */
public abstract class H {
    public static int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long a(c.d.a.a.m.u uVar, int i2, int i3) {
        uVar.c(i2);
        if (uVar.b() < 5) {
            return -9223372036854775807L;
        }
        int iP = uVar.p();
        if ((8388608 & iP) != 0 || ((2096896 & iP) >> 8) != i3) {
            return -9223372036854775807L;
        }
        if (((iP & 32) != 0) && uVar.h() >= 7 && uVar.b() >= 7) {
            if ((uVar.h() & 16) == 16) {
                byte[] bArr = new byte[6];
                uVar.a(bArr, 0, bArr.length);
                return a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}

package c.d.a.a.b;

import b.a.a$i;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1643a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1644b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1645c = {64, a$i.AppCompatTheme_windowActionBarOverlay, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i2) {
        return i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368;
    }

    public static c.d.a.a.q a(byte[] bArr, String str, String str2, c.d.a.a.d.f fVar) {
        c.d.a.a.m.t tVarC = c(bArr);
        tVarC.b(60);
        int i2 = f1643a[tVarC.c(6)];
        int i3 = f1644b[tVarC.c(4)];
        int iC = tVarC.c(5);
        int i4 = iC >= f1645c.length ? -1 : (f1645c[iC] * 1000) / 2;
        tVarC.b(10);
        return c.d.a.a.q.a(str, "audio/vnd.dts", (String) null, i4, -1, i2 + (tVarC.c(2) > 0 ? 1 : 0), i3, (List<byte[]>) null, fVar, 0, str2);
    }

    public static int a(byte[] bArr) {
        int i2;
        byte b2 = bArr[0];
        if (b2 != 31) {
            switch (b2) {
                case -2:
                    i2 = ((bArr[4] & 252) >> 2) | ((bArr[5] & 1) << 6);
                    break;
                case -1:
                    i2 = ((bArr[7] & 60) >> 2) | ((bArr[4] & 7) << 4);
                    break;
                default:
                    i2 = ((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6);
                    break;
            }
        } else {
            i2 = ((bArr[6] & 60) >> 2) | ((bArr[5] & 7) << 4);
        }
        return (i2 + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i2;
        int iPosition = byteBuffer.position();
        byte b2 = byteBuffer.get(iPosition);
        if (b2 != 31) {
            switch (b2) {
                case -2:
                    i2 = ((byteBuffer.get(iPosition + 4) & 252) >> 2) | ((byteBuffer.get(iPosition + 5) & 1) << 6);
                    break;
                case -1:
                    i2 = ((byteBuffer.get(iPosition + 7) & 60) >> 2) | ((byteBuffer.get(iPosition + 4) & 7) << 4);
                    break;
                default:
                    i2 = ((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6);
                    break;
            }
        } else {
            i2 = ((byteBuffer.get(iPosition + 6) & 60) >> 2) | ((byteBuffer.get(iPosition + 5) & 7) << 4);
        }
        return (i2 + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = 31
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            switch(r1) {
                case -2: goto L3b;
                case -1: goto L23;
                default: goto Le;
            }
        Le:
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L66
        L23:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
        L39:
            r0 = 1
            goto L66
        L3b:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L66
        L4f:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            goto L39
        L66:
            if (r0 == 0) goto L6c
            int r7 = r7 * 16
            int r7 = r7 / 14
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.b.y.b(byte[]):int");
    }

    private static c.d.a.a.m.t c(byte[] bArr) {
        if (bArr[0] == 127) {
            return new c.d.a.a.m.t(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (d(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
            }
        }
        c.d.a.a.m.t tVar = new c.d.a.a.m.t(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            c.d.a.a.m.t tVar2 = new c.d.a.a.m.t(bArrCopyOf);
            while (tVar2.a() >= 16) {
                tVar2.b(2);
                tVar.a(tVar2.c(14), 14);
            }
        }
        tVar.a(bArrCopyOf);
        return tVar;
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}

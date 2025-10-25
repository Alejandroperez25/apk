package c.d.a.b.e.d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f3958a = new h();

    private static byte[] a(Deque<byte[]> deque, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] bArrRemoveFirst = deque.removeFirst();
            int iMin = Math.min(i3, bArrRemoveFirst.length);
            System.arraycopy(bArrRemoveFirst, 0, bArr, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArr;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        int i2;
        g.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iA = 8192;
        for (int i3 = 0; i3 < 2147483639; i3 = i2) {
            byte[] bArr = new byte[Math.min(iA, 2147483639 - i3)];
            arrayDeque.add(bArr);
            i2 = i3;
            int i4 = 0;
            while (i4 < bArr.length) {
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                if (i5 == -1) {
                    return a(arrayDeque, i2);
                }
                i4 += i5;
                i2 += i5;
            }
            iA = m.a(iA, 2);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream a(InputStream inputStream, long j) {
        return new k(inputStream, 1048577L);
    }
}

package c.c.a.a.c;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.util.Random;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f1374a = {71, 101, 110, 117, 105, 110, 101, 32, 65, 100, 111, 98, 101, 32, 70, 108, 97, 115, 104, 32, 80, 108, 97, 121, 101, 114, 32, 48, 48, 49, -16, -18, -62, 74, -128, 104, -66, -24, 46, 0, -48, -47, 2, -98, 126, 87, 110, -20, 93, 45, 41, -128, 111, -85, -109, -72, -26, 54, -49, -21, 49, -82};

    /* renamed from: b, reason: collision with root package name */
    private byte[] f1375b;

    public final void a(OutputStream outputStream) throws IOException {
        Log.d("Handshake", "writeC0");
        outputStream.write(3);
    }

    public final void a(InputStream inputStream) throws IOException {
        Log.d("Handshake", "readS0");
        byte b2 = (byte) inputStream.read();
        if (b2 == 3 || b2 == 72) {
            return;
        }
        if (b2 == -1) {
            throw new IOException("InputStream closed");
        }
        throw new IOException("Invalid RTMP protocol version; expected 3, got " + ((int) b2));
    }

    public final void b(OutputStream outputStream) throws InvalidKeyException, IOException {
        Log.d("Handshake", "writeC1");
        Log.d("Handshake", "writeC1(): Calculating digest offset");
        Random random = new Random();
        int iNextInt = random.nextInt(720);
        int i2 = (iNextInt % 728) + 772 + 4;
        Log.d("Handshake", "writeC1(): (real value of) digestOffset: " + iNextInt);
        Log.d("Handshake", "writeC1(): recalculated digestOffset: " + i2);
        byte[] bArr = new byte[4];
        for (int i3 = 3; i3 >= 0; i3--) {
            if (iNextInt > 255) {
                bArr[i3] = -1;
                iNextInt -= 255;
            } else {
                bArr[i3] = (byte) iNextInt;
                iNextInt -= iNextInt;
            }
        }
        Log.d("Handshake", "writeC1(): digestOffsetBytes: " + c.c.a.a.d.b(bArr));
        byte[] bArr2 = new byte[i2];
        Log.d("Handshake", "partBeforeDigest(): size: " + bArr2.length);
        random.nextBytes(bArr2);
        Log.d("Handshake", "writeC1(): Writing timestamp and Flash Player version");
        System.arraycopy(c.c.a.a.d.a((int) (System.currentTimeMillis() / 1000)), 0, bArr2, 0, 4);
        System.arraycopy(new byte[]{-128, 0, 7, 2}, 0, bArr2, 4, 4);
        byte[] bArr3 = new byte[(1536 - i2) - 32];
        Log.d("Handshake", "partAfterDigest(): size: " + bArr3.length);
        random.nextBytes(bArr3);
        Log.d("Handshake", "copying digest offset bytes in partBeforeDigest");
        System.arraycopy(bArr, 0, bArr2, 772, 4);
        Log.d("Handshake", "writeC1(): Calculating digest");
        byte[] bArr4 = new byte[1504];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr2.length, bArr3.length);
        byte[] bArrA = new c.c.a.a.a().a(bArr4, f1374a, 30);
        Log.d("Handshake", "writeC1(): writing C1 packet");
        outputStream.write(bArr2);
        outputStream.write(bArrA);
        outputStream.write(bArr3);
    }

    public final void b(InputStream inputStream) throws IOException {
        Log.d("Handshake", "readS1");
        this.f1375b = new byte[1536];
        int i2 = 0;
        do {
            int i3 = inputStream.read(this.f1375b, i2, 1536 - i2);
            if (i3 != -1) {
                i2 += i3;
            }
        } while (i2 < 1536);
        if (i2 != 1536) {
            throw new IOException("Unexpected EOF while reading S1, expected 1536 bytes, but only read " + i2 + " bytes");
        }
        Log.d("Handshake", "readS1(): S1 total bytes read OK");
    }

    public final void c(OutputStream outputStream) throws IOException {
        Log.d("Handshake", "writeC2");
        if (this.f1375b == null) {
            throw new IllegalStateException("C2 cannot be written without S1 being read first");
        }
        outputStream.write(this.f1375b);
    }

    public final void c(InputStream inputStream) throws IOException {
        int i2;
        Log.d("Handshake", "readS2");
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[1528];
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = inputStream.read(bArr, i4, 4 - i4);
            if (i5 == -1) {
                throw new IOException("Unexpected EOF while reading S2 bytes 0-3");
            }
            i4 += i5;
        } while (i4 < 4);
        int i6 = 0;
        do {
            int i7 = inputStream.read(bArr2, i6, 4 - i6);
            if (i7 == -1) {
                throw new IOException("Unexpected EOF while reading S2 bytes 4-7");
            }
            i6 += i7;
        } while (i6 < 4);
        do {
            i2 = inputStream.read(bArr3, i3, 1528 - i3);
            if (i2 != -1) {
                i3 += i2;
            }
            if (i3 >= 1528) {
                break;
            }
        } while (i2 != -1);
        if (i3 != 1528) {
            throw new IOException("Unexpected EOF while reading remainder of S2, expected 1528 bytes, but only read " + i3 + " bytes");
        }
        Log.d("Handshake", "readS2(): S2 total bytes read OK");
    }
}

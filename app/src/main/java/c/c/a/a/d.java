package c.c.a.a;

import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((byte) (i2 >>> 24));
        outputStream.write((byte) (i2 >>> 16));
        outputStream.write((byte) (i2 >>> 8));
        outputStream.write((byte) i2);
    }

    public static int a(InputStream inputStream) {
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 24) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8);
    }

    public static int b(InputStream inputStream) {
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8);
    }

    public static int c(InputStream inputStream) {
        return (inputStream.read() & 255) | ((inputStream.read() & 255) << 8);
    }

    public static void b(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((byte) (i2 >>> 16));
        outputStream.write((byte) (i2 >>> 8));
        outputStream.write((byte) i2);
    }

    public static void c(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((byte) (i2 >>> 8));
        outputStream.write((byte) i2);
    }

    public static int a(byte[] bArr) {
        return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static void d(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((byte) i2);
        outputStream.write((byte) (i2 >>> 8));
        outputStream.write((byte) (i2 >>> 16));
        outputStream.write((byte) (i2 >>> 24));
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789ABCDEF".charAt((b2 & 240) >> 4));
            sb.append("0123456789ABCDEF".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static String a(byte b2) {
        StringBuilder sb = new StringBuilder();
        sb.append("0123456789ABCDEF".charAt((b2 & 240) >> 4));
        sb.append("0123456789ABCDEF".charAt(b2 & 15));
        return sb.toString();
    }

    public static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i2 = 0;
        do {
            int i3 = inputStream.read(bArr, i2, length - i2);
            if (i3 == -1) {
                throw new IOException("Unexpected EOF reached before read buffer was filled");
            }
            i2 += i3;
        } while (i2 < length);
    }

    public static byte[] a(int i2) {
        return new byte[]{(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i2 >>> 8), (byte) i2};
    }

    public static double d(InputStream inputStream) {
        return Double.longBitsToDouble(((inputStream.read() & 255) << 56) | ((inputStream.read() & 255) << 48) | ((inputStream.read() & 255) << 40) | ((inputStream.read() & 255) << 32) | ((inputStream.read() & 255) << 24) | ((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8) | (inputStream.read() & 255));
    }

    public static void a(OutputStream outputStream, double d2) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
        outputStream.write(new byte[]{(byte) ((jDoubleToRawLongBits >> 56) & 255), (byte) ((jDoubleToRawLongBits >> 48) & 255), (byte) ((jDoubleToRawLongBits >> 40) & 255), (byte) ((jDoubleToRawLongBits >> 32) & 255), (byte) ((jDoubleToRawLongBits >> 24) & 255), (byte) ((jDoubleToRawLongBits >> 16) & 255), (byte) ((jDoubleToRawLongBits >> 8) & 255), (byte) (jDoubleToRawLongBits & 255)});
    }

    public static String a(String str) {
        for (String str2 : str.split("&")) {
            if (str2.contains("salt=")) {
                return str2.substring(5);
            }
        }
        return null;
    }

    public static String b(String str) {
        for (String str2 : str.split("&")) {
            if (str2.contains("challenge=")) {
                return str2.substring(10);
            }
        }
        return null;
    }

    public static String c(String str) {
        for (String str2 : str.split("&")) {
            if (str2.contains("opaque=")) {
                return str2.substring(7);
            }
        }
        return "";
    }

    public static String d(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"), 0, str.length());
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (Exception unused) {
            return null;
        }
    }
}

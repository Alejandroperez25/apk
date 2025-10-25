package f.a.a.a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r implements l<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5674a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5675b;

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f5676c;

    static {
        f5675b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f5676c = Charset.forName("UTF8");
    }

    @Override // f.a.a.a.l
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        a(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // f.a.a.a.l
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objD = d(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objD;
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (i2 < 254) {
            byteArrayOutputStream.write(i2);
        } else if (i2 <= 65535) {
            byteArrayOutputStream.write(254);
            b(byteArrayOutputStream, i2);
        } else {
            byteArrayOutputStream.write(255);
            c(byteArrayOutputStream, i2);
        }
    }

    protected static final void b(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (f5675b) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
        } else {
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2);
        }
    }

    protected static final void c(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (f5675b) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2 >>> 16);
            byteArrayOutputStream.write(i2 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i2 >>> 24);
        byteArrayOutputStream.write(i2 >>> 16);
        byteArrayOutputStream.write(i2 >>> 8);
        byteArrayOutputStream.write(i2);
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f5675b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, double d2) {
        a(byteArrayOutputStream, Double.doubleToLongBits(d2));
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void d(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        int size = byteArrayOutputStream.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected void a(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj == Boolean.TRUE) {
            byteArrayOutputStream.write(1);
            return;
        }
        if (obj == Boolean.FALSE) {
            byteArrayOutputStream.write(2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                c(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                a(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                d(byteArrayOutputStream, 8);
                a(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (obj instanceof BigInteger) {
                    byteArrayOutputStream.write(5);
                    a(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f5676c));
                    return;
                }
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        }
        if (obj instanceof String) {
            byteArrayOutputStream.write(7);
            a(byteArrayOutputStream, ((String) obj).getBytes(f5676c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            a(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            a(byteArrayOutputStream, iArr.length);
            d(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i2 < length) {
                c(byteArrayOutputStream, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            a(byteArrayOutputStream, jArr.length);
            d(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                a(byteArrayOutputStream, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            a(byteArrayOutputStream, dArr.length);
            d(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                a(byteArrayOutputStream, dArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            a(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            a(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                a(byteArrayOutputStream, entry.getKey());
                a(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported value: " + obj);
    }

    protected static final int b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        if (i2 < 254) {
            return i2;
        }
        if (i2 == 254) {
            return byteBuffer.getChar();
        }
        return byteBuffer.getInt();
    }

    protected static final byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[b(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final void a(ByteBuffer byteBuffer, int i2) {
        int iPosition = byteBuffer.position() % i2;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - iPosition);
        }
    }

    protected final Object d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return a(byteBuffer.get(), byteBuffer);
    }

    protected Object a(byte b2, ByteBuffer byteBuffer) {
        long[] jArr;
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(c(byteBuffer), f5676c), 16);
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(c(byteBuffer), f5676c);
            case 8:
                return c(byteBuffer);
            case 9:
                int iB = b(byteBuffer);
                int[] iArr = new int[iB];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (iB * 4));
                return iArr;
            case 10:
                int iB2 = b(byteBuffer);
                long[] jArr2 = new long[iB2];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                byteBuffer.position(byteBuffer.position() + (iB2 * 8));
                jArr = jArr2;
                break;
            case 11:
                int iB3 = b(byteBuffer);
                double[] dArr = new double[iB3];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (iB3 * 8));
                jArr = dArr;
                break;
            case 12:
                int iB4 = b(byteBuffer);
                ArrayList arrayList = new ArrayList(iB4);
                while (i2 < iB4) {
                    arrayList.add(d(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int iB5 = b(byteBuffer);
                HashMap map = new HashMap();
                while (i2 < iB5) {
                    map.put(d(byteBuffer), d(byteBuffer));
                    i2++;
                }
                return map;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return jArr;
    }

    static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }
}

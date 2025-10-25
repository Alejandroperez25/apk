package c.d.d;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.d.d.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0290p {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f4443a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f4444b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4445c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f4446d = ByteBuffer.wrap(f4445c);

    /* renamed from: e, reason: collision with root package name */
    public static final C0281g f4447e = C0281g.a(f4445c);

    /* renamed from: c.d.d.p$a */
    public interface a {
        int a();
    }

    /* renamed from: c.d.d.p$b */
    public interface b<T extends a> {
    }

    /* renamed from: c.d.d.p$c */
    public interface c<E> extends List<E>, RandomAccess {
        c<E> a(int i2);

        void a();

        boolean b();
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static int a(byte[] bArr, int i2, int i3) {
        int iA = a(i3, bArr, i2, i3);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = i2;
        for (int i6 = i3; i6 < i3 + i4; i6++) {
            i5 = (i5 * 31) + bArr[i6];
        }
        return i5;
    }
}

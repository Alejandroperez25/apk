package c.d.d;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f4351a = d();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4352b = f();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f4353c = e();

    /* renamed from: d, reason: collision with root package name */
    private static final long f4354d = g();

    /* renamed from: e, reason: collision with root package name */
    private static final long f4355e = a(a((Class<?>) Buffer.class, "address"));

    static boolean a() {
        return f4353c;
    }

    static boolean b() {
        return f4352b;
    }

    static long c() {
        return f4354d;
    }

    static byte a(byte[] bArr, long j) {
        return f4351a.getByte(bArr, j);
    }

    static void a(byte[] bArr, long j, byte b2) {
        f4351a.putByte(bArr, j, b2);
    }

    static long b(byte[] bArr, long j) {
        return f4351a.getLong(bArr, j);
    }

    private static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new K());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean e() {
        if (f4351a != null) {
            try {
                Class<?> cls = f4351a.getClass();
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("getByte", Object.class, Long.TYPE);
                cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean f() {
        if (f4351a != null) {
            try {
                Class<?> cls = f4351a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getByte", Long.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
                cls.getMethod("getLong", Long.TYPE);
                cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static int g() {
        if (f4353c) {
            return f4351a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    private static long a(Field field) {
        if (field == null || f4351a == null) {
            return -1L;
        }
        return f4351a.objectFieldOffset(field);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }
}

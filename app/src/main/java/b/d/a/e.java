package b.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.a.c;
import b.d.d.f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f1045b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f1046c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f1047d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f1048e;

    e() {
    }

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f1046c = constructor;
        f1045b = cls;
        f1047d = method2;
        f1048e = method;
    }

    public static boolean a() {
        if (f1047d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1047d != null;
    }

    private static Object b() {
        try {
            return f1046c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f1047d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface a(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1045b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1048e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b.d.a.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) throws Throwable {
        Object objB = b();
        if (objB == null) {
            return null;
        }
        b.c.i iVar = new b.c.i();
        for (f.b bVar : bVarArr) {
            Uri uriA = bVar.a();
            ByteBuffer byteBufferA = (ByteBuffer) iVar.get(uriA);
            if (byteBufferA == null) {
                byteBufferA = k.a(context, cancellationSignal, uriA);
                iVar.put(uriA, byteBufferA);
            }
            if (byteBufferA == null || !a(objB, byteBufferA, bVar.b(), bVar.c(), bVar.d())) {
                return null;
            }
        }
        Typeface typefaceA = a(objB);
        if (typefaceA == null) {
            return null;
        }
        return Typeface.create(typefaceA, i2);
    }

    @Override // b.d.a.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        Object objB = b();
        if (objB == null) {
            return null;
        }
        for (c.C0007c c0007c : bVar.a()) {
            ByteBuffer byteBufferA = k.a(context, resources, c0007c.f());
            if (byteBufferA == null || !a(objB, byteBufferA, c0007c.e(), c0007c.b(), c0007c.c())) {
                return null;
            }
        }
        return a(objB);
    }
}

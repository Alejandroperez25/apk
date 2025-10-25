package b.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.a.c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class d extends j {

    /* renamed from: b, reason: collision with root package name */
    private static Class f1040b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f1041c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f1042d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f1043e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f1044f = false;

    d() {
    }

    private static void a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1044f) {
            return;
        }
        f1044f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f1041c = constructor;
        f1040b = cls;
        f1042d = method2;
        f1043e = method;
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    private static Object b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        a();
        try {
            return f1041c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface a(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        a();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1040b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1043e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean a(Object obj, String str, int i2, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        a();
        try {
            return ((Boolean) f1042d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[Catch: all -> 0x0065, Throwable -> 0x0068, TryCatch #2 {all -> 0x0065, blocks: (B:11:0x0020, B:13:0x0026, B:16:0x002d, B:20:0x0037, B:22:0x0044, B:33:0x0058, B:38:0x0064, B:37:0x0061, B:36:0x005d), top: B:58:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[Catch: IOException -> 0x007f, SYNTHETIC, TRY_LEAVE, TryCatch #5 {IOException -> 0x007f, blocks: (B:6:0x000e, B:9:0x001c, B:18:0x0033, B:24:0x0049, B:47:0x0072, B:51:0x007b, B:50:0x0077, B:52:0x007e), top: B:61:0x000e, inners: #6 }] */
    @Override // b.d.a.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface a(android.content.Context r5, android.os.CancellationSignal r6, b.d.d.f.b[] r7, int r8) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            b.d.d.f$b r7 = r4.a(r7, r8)
            android.content.ContentResolver r8 = r5.getContentResolver()
            android.net.Uri r7 = r7.a()     // Catch: java.io.IOException -> L7f
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r8.openFileDescriptor(r7, r0, r6)     // Catch: java.io.IOException -> L7f
            if (r6 != 0) goto L20
            if (r6 == 0) goto L1f
            r6.close()     // Catch: java.io.IOException -> L7f
        L1f:
            return r1
        L20:
            java.io.File r7 = r4.a(r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            if (r7 == 0) goto L37
            boolean r8 = r7.canRead()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            if (r8 != 0) goto L2d
            goto L37
        L2d:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r7)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            if (r6 == 0) goto L36
            r6.close()     // Catch: java.io.IOException -> L7f
        L36:
            return r5
        L37:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            java.io.FileDescriptor r8 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            android.graphics.Typeface r5 = super.a(r5, r7)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            r7.close()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            if (r6 == 0) goto L4c
            r6.close()     // Catch: java.io.IOException -> L7f
        L4c:
            return r5
        L4d:
            r5 = move-exception
            r8 = r1
            goto L56
        L50:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L52
        L52:
            r8 = move-exception
            r3 = r8
            r8 = r5
            r5 = r3
        L56:
            if (r8 == 0) goto L61
            r7.close()     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65
            goto L64
        L5c:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
            goto L64
        L61:
            r7.close()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
        L64:
            throw r5     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68
        L65:
            r5 = move-exception
            r7 = r1
            goto L6e
        L68:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r7 = move-exception
            r3 = r7
            r7 = r5
            r5 = r3
        L6e:
            if (r6 == 0) goto L7e
            if (r7 == 0) goto L7b
            r6.close()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7f
            goto L7e
        L76:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.io.IOException -> L7f
            goto L7e
        L7b:
            r6.close()     // Catch: java.io.IOException -> L7f
        L7e:
            throw r5     // Catch: java.io.IOException -> L7f
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.d.a(android.content.Context, android.os.CancellationSignal, b.d.d.f$b[], int):android.graphics.Typeface");
    }

    @Override // b.d.a.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objB = b();
        for (c.C0007c c0007c : bVar.a()) {
            File fileA = k.a(context);
            if (fileA == null) {
                return null;
            }
            try {
                if (!k.a(fileA, resources, c0007c.f())) {
                    return null;
                }
                if (!a(objB, fileA.getPath(), c0007c.b(), c0007c.c())) {
                    return null;
                }
                fileA.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileA.delete();
            }
        }
        return a(objB);
    }
}

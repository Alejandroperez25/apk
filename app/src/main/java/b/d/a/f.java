package b.d.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.a.c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f1049g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f1050h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f1051i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public f() {
        Constructor constructorA;
        Method methodB;
        Method methodC;
        Method methodD;
        Method methodE;
        Method methodF;
        Class cls = null;
        try {
            Class clsA = a();
            constructorA = a(clsA);
            methodB = b(clsA);
            methodC = c(clsA);
            methodD = d(clsA);
            methodE = e(clsA);
            methodF = f(clsA);
            cls = clsA;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            constructorA = null;
            methodB = null;
            methodC = null;
            methodD = null;
            methodE = null;
            methodF = null;
        }
        this.f1049g = cls;
        this.f1050h = constructorA;
        this.f1051i = methodB;
        this.j = methodC;
        this.k = methodD;
        this.l = methodE;
        this.m = methodF;
    }

    private boolean b() {
        if (this.f1051i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1051i != null;
    }

    private Object c() {
        try {
            return this.f1050h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1051i.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Typeface a(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1049g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean b(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void c(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // b.d.a.d, b.d.a.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!b()) {
            return super.a(context, bVar, resources, i2);
        }
        Object objC = c();
        if (objC == null) {
            return null;
        }
        for (c.C0007c c0007c : bVar.a()) {
            if (!a(context, objC, c0007c.a(), c0007c.e(), c0007c.b(), c0007c.c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0007c.d()))) {
                c(objC);
                return null;
            }
        }
        if (b(objC)) {
            return a(objC);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[Catch: IOException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #2 {IOException -> 0x0063, blocks: (B:8:0x0014, B:11:0x0022, B:15:0x0045, B:25:0x0056, B:29:0x005f, B:28:0x005b, B:30:0x0062), top: B:59:0x0014, inners: #0 }] */
    @Override // b.d.a.d, b.d.a.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface a(android.content.Context r12, android.os.CancellationSignal r13, b.d.d.f.b[] r14, int r15) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            boolean r0 = r11.b()
            if (r0 != 0) goto L64
            b.d.d.f$b r14 = r11.a(r14, r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.a()     // Catch: java.io.IOException -> L63
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch: java.io.IOException -> L63
            if (r12 != 0) goto L26
            if (r12 == 0) goto L25
            r12.close()     // Catch: java.io.IOException -> L63
        L25:
            return r2
        L26:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            int r15 = r14.c()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            boolean r14 = r14.d()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface r13 = r13.build()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            if (r12 == 0) goto L48
            r12.close()     // Catch: java.io.IOException -> L63
        L48:
            return r13
        L49:
            r13 = move-exception
            r14 = r2
            goto L52
        L4c:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L4e
        L4e:
            r14 = move-exception
            r10 = r14
            r14 = r13
            r13 = r10
        L52:
            if (r12 == 0) goto L62
            if (r14 == 0) goto L5f
            r12.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L63
            goto L62
        L5a:
            r12 = move-exception
            r14.addSuppressed(r12)     // Catch: java.io.IOException -> L63
            goto L62
        L5f:
            r12.close()     // Catch: java.io.IOException -> L63
        L62:
            throw r13     // Catch: java.io.IOException -> L63
        L63:
            return r2
        L64:
            java.util.Map r12 = b.d.d.f.a(r12, r14, r13)
            java.lang.Object r13 = r11.c()
            if (r13 != 0) goto L6f
            return r2
        L6f:
            int r0 = r14.length
            r3 = 0
            r9 = 0
        L72:
            if (r9 >= r0) goto L9f
            r4 = r14[r9]
            android.net.Uri r5 = r4.a()
            java.lang.Object r5 = r12.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L83
            goto L9c
        L83:
            int r6 = r4.b()
            int r7 = r4.c()
            boolean r8 = r4.d()
            r3 = r11
            r4 = r13
            boolean r3 = r3.a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L9b
            r11.c(r13)
            return r2
        L9b:
            r3 = 1
        L9c:
            int r9 = r9 + 1
            goto L72
        L9f:
            if (r3 != 0) goto La5
            r11.c(r13)
            return r2
        La5:
            boolean r12 = r11.b(r13)
            if (r12 != 0) goto Lac
            return r2
        Lac:
            android.graphics.Typeface r12 = r11.a(r13)
            if (r12 != 0) goto Lb3
            return r2
        Lb3:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.f.a(android.content.Context, android.os.CancellationSignal, b.d.d.f$b[], int):android.graphics.Typeface");
    }

    @Override // b.d.a.j
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!b()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object objC = c();
        if (objC == null) {
            return null;
        }
        if (!a(context, objC, str, 0, -1, -1, null)) {
            c(objC);
            return null;
        }
        if (b(objC)) {
            return a(objC);
        }
        return null;
    }

    protected Class a() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor a(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method b(Class cls) {
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    protected Method c(Class cls) {
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    protected Method d(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    protected Method e(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method f(Class cls) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

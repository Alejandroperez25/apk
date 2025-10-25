package b.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.a.c;
import b.d.d.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, c.b> f1054a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    j() {
    }

    private static <T> T a(T[] tArr, int i2, a<T> aVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(aVar.a(t2) - i3) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > iAbs) {
                t = t2;
                i4 = iAbs;
            }
        }
        return t;
    }

    private static long a(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    protected f.b a(f.b[] bVarArr, int i2) {
        return (f.b) a(bVarArr, i2, new h(this));
    }

    protected Typeface a(Context context, InputStream inputStream) {
        File fileA = k.a(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (k.a(fileA, inputStream)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(a(bVarArr, i2).a());
            try {
                Typeface typefaceA = a(context, inputStreamOpenInputStream);
                k.a(inputStreamOpenInputStream);
                return typefaceA;
            } catch (IOException unused) {
                k.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                k.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private c.C0007c a(c.b bVar, int i2) {
        return (c.C0007c) a(bVar.a(), i2, new i(this));
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        c.C0007c c0007cA = a(bVar, i2);
        if (c0007cA == null) {
            return null;
        }
        Typeface typefaceA = c.a(context, resources, c0007cA.f(), c0007cA.a(), i2);
        a(typefaceA, bVar);
        return typefaceA;
    }

    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        File fileA = k.a(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (k.a(fileA, resources, i2)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    private void a(Typeface typeface, c.b bVar) throws NoSuchFieldException {
        long jA = a(typeface);
        if (jA != 0) {
            this.f1054a.put(Long.valueOf(jA), bVar);
        }
    }
}

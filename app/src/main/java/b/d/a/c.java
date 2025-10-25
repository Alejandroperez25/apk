package b.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.a.c;
import androidx.core.content.a.h;
import b.d.d.f;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1038a;

    /* renamed from: b, reason: collision with root package name */
    private static final b.c.g<String, Typeface> f1039b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            f1038a = new g();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f1038a = new f();
        } else if (Build.VERSION.SDK_INT >= 24 && e.a()) {
            f1038a = new e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f1038a = new d();
        } else {
            f1038a = new j();
        }
        f1039b = new b.c.g<>(16);
    }

    public static Typeface a(Resources resources, int i2, int i3) {
        return f1039b.a((b.c.g<String, Typeface>) b(resources, i2, i3));
    }

    private static String b(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i2, int i3, h.a aVar2, Handler handler, boolean z) {
        Typeface typefaceA;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.b() == 0) {
                z2 = true;
            }
            typefaceA = b.d.d.f.a(context, dVar.a(), aVar2, handler, z2, z ? dVar.c() : -1, i3);
        } else {
            typefaceA = f1038a.a(context, (c.b) aVar, resources, i3);
            if (aVar2 != null) {
                if (typefaceA != null) {
                    aVar2.a(typefaceA, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f1039b.a(b(resources, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceA = f1038a.a(context, resources, i2, str, i3);
        if (typefaceA != null) {
            f1039b.a(b(resources, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        return f1038a.a(context, cancellationSignal, bVarArr, i2);
    }
}

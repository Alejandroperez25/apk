package b.a.a.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0083j;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f902a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0011a>> f903b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f904c = new Object();

    public static ColorStateList a(Context context, int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList colorStateListD = d(context, i2);
        if (colorStateListD != null) {
            return colorStateListD;
        }
        ColorStateList colorStateListC = c(context, i2);
        if (colorStateListC != null) {
            a(context, i2, colorStateListC);
            return colorStateListC;
        }
        return androidx.core.content.a.b(context, i2);
    }

    public static Drawable b(Context context, int i2) {
        return C0083j.a().a(context, i2);
    }

    private static ColorStateList c(Context context, int i2) throws Resources.NotFoundException {
        if (e(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return androidx.core.content.a.a.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static ColorStateList d(Context context, int i2) {
        C0011a c0011a;
        synchronized (f904c) {
            SparseArray<C0011a> sparseArray = f903b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0011a = sparseArray.get(i2)) != null) {
                if (c0011a.f906b.equals(context.getResources().getConfiguration())) {
                    return c0011a.f905a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    private static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f904c) {
            SparseArray<C0011a> sparseArray = f903b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f903b.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0011a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean e(Context context, int i2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueA = a();
        resources.getValue(i2, typedValueA, true);
        return typedValueA.type >= 28 && typedValueA.type <= 31;
    }

    private static TypedValue a() {
        TypedValue typedValue = f902a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f902a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b.a.a.a.a$a, reason: collision with other inner class name */
    private static class C0011a {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f905a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f906b;

        C0011a(ColorStateList colorStateList, Configuration configuration) {
            this.f905a = colorStateList;
            this.f906b = configuration;
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import b.a.a$i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0093t {

    /* renamed from: a, reason: collision with root package name */
    private static final RectF f442a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f443b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private int f444c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f445d = false;

    /* renamed from: e, reason: collision with root package name */
    private float f446e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f447f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f448g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private int[] f449h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    private boolean f450i = false;
    private TextPaint j;
    private final TextView k;
    private final Context l;

    C0093t(TextView textView) {
        this.k = textView;
        this.l = this.k.getContext();
    }

    void a(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.l.obtainStyledAttributes(attributeSet, a$i.AppCompatTextView, i2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(a$i.AppCompatTextView_autoSizeTextType)) {
            this.f444c = typedArrayObtainStyledAttributes.getInt(a$i.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(a$i.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(a$i.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(a$i.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(a$i.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(a$i.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(a$i.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(a$i.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a$i.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (k()) {
            if (this.f444c == 1) {
                if (!this.f450i) {
                    DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    a(dimension2, dimension3, dimension);
                }
                i();
                return;
            }
            return;
        }
        this.f444c = 0;
    }

    void a(int i2) {
        if (k()) {
            switch (i2) {
                case 0:
                    j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (i()) {
                        f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
        }
    }

    void a(int i2, int i3, int i4, int i5) {
        if (k()) {
            DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (i()) {
                f();
            }
        }
    }

    void a(int[] iArr, int i2) {
        if (k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f449h = a(iArrCopyOf);
                if (!h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f450i = false;
            }
            if (i()) {
                f();
            }
        }
    }

    int a() {
        return this.f444c;
    }

    int b() {
        return Math.round(this.f446e);
    }

    int c() {
        return Math.round(this.f447f);
    }

    int d() {
        return Math.round(this.f448g);
    }

    int[] e() {
        return this.f449h;
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f449h = a(iArr);
            h();
        }
    }

    private boolean h() {
        this.f450i = this.f449h.length > 0;
        if (this.f450i) {
            this.f444c = 1;
            this.f447f = this.f449h[0];
            this.f448g = this.f449h[r0 - 1];
            this.f446e = -1.0f;
        }
        return this.f450i;
    }

    private int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f444c = 1;
        this.f447f = f2;
        this.f448g = f3;
        this.f446e = f4;
        this.f450i = false;
    }

    private boolean i() {
        if (k() && this.f444c == 1) {
            if (!this.f450i || this.f449h.length == 0) {
                float fRound = Math.round(this.f447f);
                int i2 = 1;
                while (Math.round(this.f446e + fRound) <= Math.round(this.f448g)) {
                    i2++;
                    fRound += this.f446e;
                }
                int[] iArr = new int[i2];
                float f2 = this.f447f;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f446e;
                }
                this.f449h = a(iArr);
            }
            this.f445d = true;
        } else {
            this.f445d = false;
        }
        return this.f445d;
    }

    void f() {
        if (g()) {
            if (this.f445d) {
                if (this.k.getMeasuredHeight() <= 0 || this.k.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) a((Object) this.k, "getHorizontallyScrolling", (String) false)).booleanValue() ? 1048576 : (this.k.getMeasuredWidth() - this.k.getTotalPaddingLeft()) - this.k.getTotalPaddingRight();
                int height = (this.k.getHeight() - this.k.getCompoundPaddingBottom()) - this.k.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f442a) {
                    f442a.setEmpty();
                    f442a.right = measuredWidth;
                    f442a.bottom = height;
                    float fA = a(f442a);
                    if (fA != this.k.getTextSize()) {
                        a(0, fA);
                    }
                }
            }
            this.f445d = true;
        }
    }

    private void j() {
        this.f444c = 0;
        this.f447f = -1.0f;
        this.f448g = -1.0f;
        this.f446e = -1.0f;
        this.f449h = new int[0];
        this.f445d = false;
    }

    void a(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Resources resources;
        if (this.l == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.l.getResources();
        }
        a(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }

    private void a(float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f2 != this.k.getPaint().getTextSize()) {
            this.k.getPaint().setTextSize(f2);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.k.isInLayout() : false;
            if (this.k.getLayout() != null) {
                this.f445d = false;
                try {
                    Method methodA = a("nullLayouts");
                    if (methodA != null) {
                        methodA.invoke(this.k, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!zIsInLayout) {
                    this.k.requestLayout();
                } else {
                    this.k.forceLayout();
                }
                this.k.invalidate();
            }
        }
    }

    private int a(RectF rectF) {
        int length = this.f449h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (a(this.f449h[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f449h[i4];
    }

    private boolean a(int i2, RectF rectF) {
        StaticLayout staticLayoutA;
        CharSequence transformation;
        CharSequence text = this.k.getText();
        TransformationMethod transformationMethod = this.k.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.k)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.k.getMaxLines() : -1;
        if (this.j == null) {
            this.j = new TextPaint();
        } else {
            this.j.reset();
        }
        this.j.set(this.k.getPaint());
        this.j.setTextSize(i2);
        Layout.Alignment alignment = (Layout.Alignment) a((Object) this.k, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayoutA = a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayoutA = a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && ((float) staticLayoutA.getHeight()) <= rectF.bottom;
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a((Object) this.k, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.j, i2).setAlignment(alignment).setLineSpacing(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier()).setIncludePad(this.k.getIncludeFontPadding()).setBreakStrategy(this.k.getBreakStrategy()).setHyphenationFrequency(this.k.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        float fFloatValue;
        float fFloatValue2;
        boolean zBooleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            fFloatValue = this.k.getLineSpacingMultiplier();
            fFloatValue2 = this.k.getLineSpacingExtra();
            zBooleanValue = this.k.getIncludeFontPadding();
        } else {
            fFloatValue = ((Float) a((Object) this.k, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            fFloatValue2 = ((Float) a((Object) this.k, "getLineSpacingExtra", (String) Float.valueOf(0.0f))).floatValue();
            zBooleanValue = ((Boolean) a((Object) this.k, "getIncludeFontPadding", (String) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.j, i2, alignment, fFloatValue, fFloatValue2, zBooleanValue);
    }

    private <T> T a(Object obj, String str, T t) {
        try {
            return (T) a(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private Method a(String str) {
        try {
            Method declaredMethod = f443b.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f443b.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    boolean g() {
        return k() && this.f444c != 0;
    }

    private boolean k() {
        return !(this.k instanceof AbstractC0084k);
    }
}

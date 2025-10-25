package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b.a.a$b;
import b.a.a$d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083j {

    /* renamed from: b, reason: collision with root package name */
    private static C0083j f390b;
    private WeakHashMap<Context, b.c.j<ColorStateList>> j;
    private b.c.b<String, d> k;
    private b.c.j<String> l;
    private final WeakHashMap<Context, b.c.f<WeakReference<Drawable.ConstantState>>> m = new WeakHashMap<>(0);
    private TypedValue n;
    private boolean o;

    /* renamed from: a, reason: collision with root package name */
    private static final PorterDuff.Mode f389a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static final c f391c = new c(6);

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f392d = {a$d.abc_textfield_search_default_mtrl_alpha, a$d.abc_textfield_default_mtrl_alpha, a$d.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f393e = {a$d.abc_ic_commit_search_api_mtrl_alpha, a$d.abc_seekbar_tick_mark_material, a$d.abc_ic_menu_share_mtrl_alpha, a$d.abc_ic_menu_copy_mtrl_am_alpha, a$d.abc_ic_menu_cut_mtrl_alpha, a$d.abc_ic_menu_selectall_mtrl_alpha, a$d.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f394f = {a$d.abc_textfield_activated_mtrl_alpha, a$d.abc_textfield_search_activated_mtrl_alpha, a$d.abc_cab_background_top_mtrl_alpha, a$d.abc_text_cursor_material, a$d.abc_text_select_handle_left_mtrl_dark, a$d.abc_text_select_handle_middle_mtrl_dark, a$d.abc_text_select_handle_right_mtrl_dark, a$d.abc_text_select_handle_left_mtrl_light, a$d.abc_text_select_handle_middle_mtrl_light, a$d.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f395g = {a$d.abc_popup_background_mtrl_mult, a$d.abc_cab_background_internal_bg, a$d.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f396h = {a$d.abc_tab_indicator_material, a$d.abc_textfield_search_material};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f397i = {a$d.abc_btn_check_material, a$d.abc_btn_radio_material};

    /* renamed from: androidx.appcompat.widget.j$d */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static synchronized C0083j a() {
        if (f390b == null) {
            f390b = new C0083j();
            a(f390b);
        }
        return f390b;
    }

    private static void a(C0083j c0083j) {
        if (Build.VERSION.SDK_INT < 24) {
            c0083j.a("vector", new e());
            c0083j.a("animated-vector", new b());
            c0083j.a("animated-selector", new a());
        }
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable drawableD;
        e(context);
        drawableD = d(context, i2);
        if (drawableD == null) {
            drawableD = c(context, i2);
        }
        if (drawableD == null) {
            drawableD = androidx.core.content.a.a(context, i2);
        }
        if (drawableD != null) {
            drawableD = a(context, i2, z, drawableD);
        }
        if (drawableD != null) {
            AbstractC0096w.a(drawableD);
        }
        return drawableD;
    }

    private static long a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable c(Context context, int i2) throws Resources.NotFoundException {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        context.getResources().getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        if (i2 == a$d.abc_cab_background_top_material) {
            drawableA = new LayerDrawable(new Drawable[]{a(context, a$d.abc_cab_background_internal_bg), a(context, a$d.abc_cab_background_top_mtrl_alpha)});
        }
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jA, drawableA);
        }
        return drawableA;
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            if (AbstractC0096w.b(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableF = androidx.core.graphics.drawable.a.f(drawable);
            androidx.core.graphics.drawable.a.a(drawableF, colorStateListB);
            PorterDuff.Mode modeA = a(i2);
            if (modeA == null) {
                return drawableF;
            }
            androidx.core.graphics.drawable.a.a(drawableF, modeA);
            return drawableF;
        }
        if (i2 == a$d.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(android.R.id.background), W.a(context, b.a.a$a.colorControlNormal), f389a);
            a(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), W.a(context, b.a.a$a.colorControlNormal), f389a);
            a(layerDrawable.findDrawableByLayerId(android.R.id.progress), W.a(context, b.a.a$a.colorControlActivated), f389a);
            return drawable;
        }
        if (i2 == a$d.abc_ratingbar_material || i2 == a$d.abc_ratingbar_indicator_material || i2 == a$d.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(android.R.id.background), W.c(context, b.a.a$a.colorControlNormal), f389a);
            a(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), W.a(context, b.a.a$a.colorControlActivated), f389a);
            a(layerDrawable2.findDrawableByLayerId(android.R.id.progress), W.a(context, b.a.a$a.colorControlActivated), f389a);
            return drawable;
        }
        if (a(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    private Drawable d(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (this.k == null || this.k.isEmpty()) {
            return null;
        }
        if (this.l != null) {
            String strA = this.l.a(i2);
            if ("appcompat_skip_skip".equals(strA) || (strA != null && this.k.get(strA) == null)) {
                return null;
            }
        } else {
            this.l = new b.c.j<>();
        }
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.l.c(i2, name);
                d dVar = this.k.get(name);
                if (dVar != null) {
                    drawableA = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableA != null) {
                    drawableA.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jA, drawableA);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (drawableA == null) {
            this.l.c(i2, "appcompat_skip_skip");
        }
        return drawableA;
    }

    private synchronized Drawable a(Context context, long j) {
        b.c.f<WeakReference<Drawable.ConstantState>> fVar = this.m.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceA = fVar.a(j);
        if (weakReferenceA != null) {
            Drawable.ConstantState constantState = weakReferenceA.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.b(j);
        }
        return null;
    }

    private synchronized boolean a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        b.c.f<WeakReference<Drawable.ConstantState>> fVar = this.m.get(context);
        if (fVar == null) {
            fVar = new b.c.f<>();
            this.m.put(context, fVar);
        }
        fVar.b(j, new WeakReference<>(constantState));
        return true;
    }

    synchronized Drawable a(Context context, ma maVar, int i2) {
        Drawable drawableD = d(context, i2);
        if (drawableD == null) {
            drawableD = maVar.a(i2);
        }
        if (drawableD == null) {
            return null;
        }
        return a(context, i2, false, drawableD);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0083j.f389a
            int[] r1 = androidx.appcompat.widget.C0083j.f392d
            boolean r1 = a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = b.a.a$a.colorControlNormal
        L12:
            r7 = 1
            r1 = -1
            goto L44
        L15:
            int[] r1 = androidx.appcompat.widget.C0083j.f394f
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = b.a.a$a.colorControlActivated
            goto L12
        L20:
            int[] r1 = androidx.appcompat.widget.C0083j.f395g
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = b.a.a$d.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L44
        L3c:
            int r1 = b.a.a$d.abc_dialog_material_background
            if (r7 != r1) goto L41
            goto L12
        L41:
            r7 = 0
            r1 = -1
            r2 = 0
        L44:
            if (r7 == 0) goto L61
            boolean r7 = androidx.appcompat.widget.AbstractC0096w.b(r8)
            if (r7 == 0) goto L50
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L50:
            int r6 = androidx.appcompat.widget.W.a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L60
            r8.setAlpha(r1)
        L60:
            return r5
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0083j.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(String str, d dVar) {
        if (this.k == null) {
            this.k = new b.c.b<>();
        }
        this.k.put(str, dVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    static PorterDuff.Mode a(int i2) {
        if (i2 == a$d.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    synchronized ColorStateList b(Context context, int i2) {
        ColorStateList colorStateListE;
        colorStateListE = e(context, i2);
        if (colorStateListE == null) {
            if (i2 == a$d.abc_edit_text_material) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_edittext);
            } else if (i2 == a$d.abc_switch_track_mtrl_alpha) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_switch_track);
            } else if (i2 == a$d.abc_switch_thumb_material) {
                colorStateListE = d(context);
            } else if (i2 == a$d.abc_btn_default_mtrl_shape) {
                colorStateListE = a(context);
            } else if (i2 == a$d.abc_btn_borderless_material) {
                colorStateListE = b(context);
            } else if (i2 == a$d.abc_btn_colored_material) {
                colorStateListE = c(context);
            } else if (i2 == a$d.abc_spinner_mtrl_am_alpha || i2 == a$d.abc_spinner_textfield_background_material) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_spinner);
            } else if (a(f393e, i2)) {
                colorStateListE = W.b(context, b.a.a$a.colorControlNormal);
            } else if (a(f396h, i2)) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_default);
            } else if (a(f397i, i2)) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_btn_checkable);
            } else if (i2 == a$d.abc_seekbar_thumb_material) {
                colorStateListE = b.a.a.a.a.a(context, a$b.abc_tint_seek_thumb);
            }
            if (colorStateListE != null) {
                a(context, i2, colorStateListE);
            }
        }
        return colorStateListE;
    }

    private ColorStateList e(Context context, int i2) {
        b.c.j<ColorStateList> jVar;
        if (this.j == null || (jVar = this.j.get(context)) == null) {
            return null;
        }
        return jVar.a(i2);
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.j == null) {
            this.j = new WeakHashMap<>();
        }
        b.c.j<ColorStateList> jVar = this.j.get(context);
        if (jVar == null) {
            jVar = new b.c.j<>();
            this.j.put(context, jVar);
        }
        jVar.c(i2, colorStateList);
    }

    private ColorStateList a(Context context) {
        return f(context, W.a(context, b.a.a$a.colorButtonNormal));
    }

    private ColorStateList b(Context context) {
        return f(context, 0);
    }

    private ColorStateList c(Context context) {
        return f(context, W.a(context, b.a.a$a.colorAccent));
    }

    private ColorStateList f(Context context, int i2) {
        int iA = W.a(context, b.a.a$a.colorControlHighlight);
        return new ColorStateList(new int[][]{W.f324b, W.f327e, W.f325c, W.f331i}, new int[]{W.c(context, b.a.a$a.colorButtonNormal), b.d.a.a.a(iA, i2), b.d.a.a.a(iA, i2), i2});
    }

    private ColorStateList d(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListB = W.b(context, b.a.a$a.colorSwitchThumbNormal);
        if (colorStateListB != null && colorStateListB.isStateful()) {
            iArr[0] = W.f324b;
            iArr2[0] = colorStateListB.getColorForState(iArr[0], 0);
            iArr[1] = W.f328f;
            iArr2[1] = W.a(context, b.a.a$a.colorControlActivated);
            iArr[2] = W.f331i;
            iArr2[2] = colorStateListB.getDefaultColor();
        } else {
            iArr[0] = W.f324b;
            iArr2[0] = W.c(context, b.a.a$a.colorSwitchThumbNormal);
            iArr[1] = W.f328f;
            iArr2[1] = W.a(context, b.a.a$a.colorControlActivated);
            iArr[2] = W.f331i;
            iArr2[2] = W.a(context, b.a.a$a.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: androidx.appcompat.widget.j$c */
    private static class c extends b.c.g<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
            return a((c) Integer.valueOf(b(i2, mode)));
        }

        PorterDuffColorFilter a(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return a((c) Integer.valueOf(b(i2, mode)), (Integer) porterDuffColorFilter);
        }

        private static int b(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }
    }

    static void a(Drawable drawable, Y y, int[] iArr) {
        if (AbstractC0096w.b(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (y.f339d || y.f338c) {
            drawable.setColorFilter(a(y.f339d ? y.f336a : null, y.f338c ? y.f337b : f389a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterA;
        porterDuffColorFilterA = f391c.a(i2, mode);
        if (porterDuffColorFilterA == null) {
            porterDuffColorFilterA = new PorterDuffColorFilter(i2, mode);
            f391c.a(i2, mode, porterDuffColorFilterA);
        }
        return porterDuffColorFilterA;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (AbstractC0096w.b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f389a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    private void e(Context context) {
        if (this.o) {
            return;
        }
        this.o = true;
        Drawable drawableA = a(context, a$d.abc_vector_test);
        if (drawableA == null || !a(drawableA)) {
            this.o = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof b.k.a.a.k) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: androidx.appcompat.widget.j$e */
    private static class e implements d {
        e() {
        }

        @Override // androidx.appcompat.widget.C0083j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.k.a.a.k.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j$b */
    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.C0083j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.k.a.a.d.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j$a */
    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.C0083j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.a.b.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }
}

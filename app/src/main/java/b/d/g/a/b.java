package b.d.g.a;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b.a.a$i;
import b.d.a$c;
import b.d.g.a.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f1123a;

    /* renamed from: b, reason: collision with root package name */
    private final AccessibilityNodeInfo f1124b;

    /* renamed from: c, reason: collision with root package name */
    public int f1125c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f1126d = -1;

    private static String b(int i2) {
        switch (i2) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                return "ACTION_LONG_CLICK";
            case a$i.AppCompatTheme_dropDownListViewStyle /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        /* renamed from: a, reason: collision with root package name */
        public static final a f1127a = new a(1, null);

        /* renamed from: b, reason: collision with root package name */
        public static final a f1128b = new a(2, null);

        /* renamed from: c, reason: collision with root package name */
        public static final a f1129c = new a(4, null);

        /* renamed from: d, reason: collision with root package name */
        public static final a f1130d = new a(8, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f1131e = new a(16, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f1132f = new a(32, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f1133g = new a(64, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f1134h = new a(128, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f1135i = new a(256, null, e.b.class);
        public static final a j = new a(512, null, e.b.class);
        public static final a k = new a(1024, null, e.c.class);
        public static final a l = new a(2048, null, e.c.class);
        public static final a m = new a(4096, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, null, e.g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(1048576, null);
        public static final a v = new a(2097152, null, e.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object H;
        private final int I;
        private final CharSequence J;
        private final Class<? extends e.a> K;
        protected final e L;

        static {
            w = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            x = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, e.C0018e.class);
            y = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            z = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            A = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            B = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            C = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            D = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, e.f.class);
            E = new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, e.d.class);
            F = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            G = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends e.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, e eVar, Class<? extends e.a> cls) {
            this.I = i2;
            this.J = charSequence;
            this.L = eVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.H = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.H = obj;
            }
            this.K = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.H).getId();
            }
            return 0;
        }

        public boolean a(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            e.a aVarNewInstance;
            if (this.L == null) {
                return false;
            }
            e.a aVar = null;
            if (this.K != null) {
                try {
                    aVarNewInstance = this.K.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    aVarNewInstance.a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = aVarNewInstance;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (this.K == null ? "null" : this.K.getName()), e);
                    return this.L.a(view, aVar);
                }
            }
            return this.L.a(view, aVar);
        }
    }

    private b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1124b = accessibilityNodeInfo;
    }

    public static b a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new b(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo a() {
        return this.f1124b;
    }

    public int b() {
        return this.f1124b.getActions();
    }

    public void a(int i2) {
        this.f1124b.addAction(i2);
    }

    private List<Integer> a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f1124b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1124b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1124b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.H);
        }
    }

    public boolean a(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1124b.performAction(i2, bundle);
        }
        return false;
    }

    public void a(Rect rect) {
        this.f1124b.getBoundsInParent(rect);
    }

    public void b(Rect rect) {
        this.f1124b.getBoundsInScreen(rect);
    }

    public boolean c() {
        return this.f1124b.isCheckable();
    }

    public boolean d() {
        return this.f1124b.isChecked();
    }

    public boolean e() {
        return this.f1124b.isFocusable();
    }

    public boolean f() {
        return this.f1124b.isFocused();
    }

    public boolean g() {
        return this.f1124b.isSelected();
    }

    public boolean h() {
        return this.f1124b.isClickable();
    }

    public boolean i() {
        return this.f1124b.isLongClickable();
    }

    public boolean j() {
        return this.f1124b.isEnabled();
    }

    public boolean k() {
        return this.f1124b.isPassword();
    }

    public boolean l() {
        return this.f1124b.isScrollable();
    }

    public void a(boolean z) {
        this.f1124b.setScrollable(z);
    }

    public CharSequence m() {
        return this.f1124b.getPackageName();
    }

    public CharSequence n() {
        return this.f1124b.getClassName();
    }

    public void b(CharSequence charSequence) {
        this.f1124b.setClassName(charSequence);
    }

    public CharSequence o() {
        if (s()) {
            List<Integer> listA = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> listA2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> listA3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> listA4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1124b.getText(), 0, this.f1124b.getText().length()));
            for (int i2 = 0; i2 < listA.size(); i2++) {
                spannableString.setSpan(new b.d.g.a.a(listA4.get(i2).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listA.get(i2).intValue(), listA2.get(i2).intValue(), listA3.get(i2).intValue());
            }
            return spannableString;
        }
        return this.f1124b.getText();
    }

    public void a(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 19 || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        t();
        c(view);
        ClickableSpan[] clickableSpanArrA = a(charSequence);
        if (clickableSpanArrA == null || clickableSpanArrA.length <= 0) {
            return;
        }
        r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a$c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayA = a(view);
        for (int i2 = 0; clickableSpanArrA != null && i2 < clickableSpanArrA.length; i2++) {
            int iA = a(clickableSpanArrA[i2], sparseArrayA);
            sparseArrayA.put(iA, new WeakReference<>(clickableSpanArrA[i2]));
            a(clickableSpanArrA[i2], (Spanned) charSequence, iA);
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> a(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayB = b(view);
        if (sparseArrayB != null) {
            return sparseArrayB;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a$c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> b(View view) {
        return (SparseArray) view.getTag(a$c.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f1123a;
        f1123a = i3 + 1;
        return i3;
    }

    private boolean s() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private void t() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1124b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f1124b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f1124b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f1124b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void c(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayB = b(view);
        if (sparseArrayB != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayB.size(); i2++) {
                if (sparseArrayB.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayB.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    public CharSequence p() {
        return this.f1124b.getContentDescription();
    }

    public String q() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1124b.getViewIdResourceName();
        }
        return null;
    }

    public Bundle r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1124b.getExtras();
        }
        return new Bundle();
    }

    public void c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1124b.setPaneTitle(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f1124b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void b(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1124b.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    public void c(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1124b.setHeading(z);
        } else {
            a(2, z);
        }
    }

    public int hashCode() {
        if (this.f1124b == null) {
            return 0;
        }
        return this.f1124b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1124b == null) {
            if (bVar.f1124b != null) {
                return false;
            }
        } else if (!this.f1124b.equals(bVar.f1124b)) {
            return false;
        }
        return this.f1126d == bVar.f1126d && this.f1125c == bVar.f1125c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(o());
        sb.append("; contentDescription: ");
        sb.append(p());
        sb.append("; viewId: ");
        sb.append(q());
        sb.append("; checkable: ");
        sb.append(c());
        sb.append("; checked: ");
        sb.append(d());
        sb.append("; focusable: ");
        sb.append(e());
        sb.append("; focused: ");
        sb.append(f());
        sb.append("; selected: ");
        sb.append(g());
        sb.append("; clickable: ");
        sb.append(h());
        sb.append("; longClickable: ");
        sb.append(i());
        sb.append("; enabled: ");
        sb.append(j());
        sb.append("; password: ");
        sb.append(k());
        sb.append("; scrollable: " + l());
        sb.append("; [");
        int iB = b();
        while (iB != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iB);
            iB &= ~iNumberOfTrailingZeros;
            sb.append(b(iNumberOfTrailingZeros));
            if (iB != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void a(int i2, boolean z) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i3 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }
}

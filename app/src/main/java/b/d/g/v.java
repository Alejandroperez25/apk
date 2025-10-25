package b.d.g;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.d.a$c;
import b.d.g.C0120a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    private static Field f1156b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1157c;

    /* renamed from: d, reason: collision with root package name */
    private static WeakHashMap<View, String> f1158d;

    /* renamed from: f, reason: collision with root package name */
    private static Field f1160f;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f1155a = new AtomicInteger(1);

    /* renamed from: e, reason: collision with root package name */
    private static WeakHashMap<View, z> f1159e = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f1161g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f1162h = {a$c.accessibility_custom_action_0, a$c.accessibility_custom_action_1, a$c.accessibility_custom_action_2, a$c.accessibility_custom_action_3, a$c.accessibility_custom_action_4, a$c.accessibility_custom_action_5, a$c.accessibility_custom_action_6, a$c.accessibility_custom_action_7, a$c.accessibility_custom_action_8, a$c.accessibility_custom_action_9, a$c.accessibility_custom_action_10, a$c.accessibility_custom_action_11, a$c.accessibility_custom_action_12, a$c.accessibility_custom_action_13, a$c.accessibility_custom_action_14, a$c.accessibility_custom_action_15, a$c.accessibility_custom_action_16, a$c.accessibility_custom_action_17, a$c.accessibility_custom_action_18, a$c.accessibility_custom_action_19, a$c.accessibility_custom_action_20, a$c.accessibility_custom_action_21, a$c.accessibility_custom_action_22, a$c.accessibility_custom_action_23, a$c.accessibility_custom_action_24, a$c.accessibility_custom_action_25, a$c.accessibility_custom_action_26, a$c.accessibility_custom_action_27, a$c.accessibility_custom_action_28, a$c.accessibility_custom_action_29, a$c.accessibility_custom_action_30, a$c.accessibility_custom_action_31};

    /* renamed from: i, reason: collision with root package name */
    private static a f1163i = new a();

    public interface c {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static void a(View view, C0120a c0120a) {
        if (c0120a == null && (o(view) instanceof C0120a.C0017a)) {
            c0120a = new C0120a();
        }
        view.setAccessibilityDelegate(c0120a == null ? null : c0120a.a());
    }

    private static View.AccessibilityDelegate o(View view) {
        if (f1161g) {
            return null;
        }
        if (f1160f == null) {
            try {
                f1160f = View.class.getDeclaredField("mAccessibilityDelegate");
                f1160f.setAccessible(true);
            } catch (Throwable unused) {
                f1161g = true;
                return null;
            }
        }
        try {
            Object obj = f1160f.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1161g = true;
            return null;
        }
    }

    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static int b(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1157c) {
            try {
                f1156b = View.class.getDeclaredField("mMinHeight");
                f1156b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1157c = true;
        }
        if (f1156b == null) {
            return 0;
        }
        try {
            return ((Integer) f1156b.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1158d == null) {
            f1158d = new WeakHashMap<>();
        }
        f1158d.put(view, str);
    }

    public static String e(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f1158d == null) {
            return null;
        }
        return f1158d.get(view);
    }

    public static int f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void g(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof r) {
            return ((r) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof r) {
            ((r) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof r) {
            return ((r) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof r) {
            ((r) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof j) {
            ((j) view).stopNestedScroll();
        }
    }

    public static boolean k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return d.a(view).a(keyEvent);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return d.a(view).a(view, keyEvent);
    }

    public static boolean l(View view) {
        Boolean boolA = a().a(view);
        if (boolA == null) {
            return false;
        }
        return boolA.booleanValue();
    }

    private static b<Boolean> a() {
        return new s(a$c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static CharSequence m(View view) {
        return b().a(view);
    }

    private static b<CharSequence> b() {
        return new t(a$c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean n(View view) {
        Boolean boolA = c().a(view);
        if (boolA == null) {
            return false;
        }
        return boolA.booleanValue();
    }

    private static b<Boolean> c() {
        return new u(a$c.tag_accessibility_heading, Boolean.class, 28);
    }

    static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f1165a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f1166b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1167c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1168d;

        abstract T b(View view);

        b(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        b(int i2, Class<T> cls, int i3, int i4) {
            this.f1165a = i2;
            this.f1166b = cls;
            this.f1168d = i3;
            this.f1167c = i4;
        }

        T a(View view) {
            if (a()) {
                return b(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.f1165a);
            if (this.f1166b.isInstance(t)) {
                return t;
            }
            return null;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= this.f1167c;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }
    }

    static void a(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m(view) != null;
            if (c(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1164a = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f1164a.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    v.a(view, 16);
                }
                this.f1164a.put(view, Boolean.valueOf(z2));
            }
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1169a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1170b = null;

        /* renamed from: c, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1171c = null;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<KeyEvent> f1172d = null;

        d() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f1171c == null) {
                this.f1171c = new SparseArray<>();
            }
            return this.f1171c;
        }

        static d a(View view) {
            d dVar = (d) view.getTag(a$c.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(a$c.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View viewB = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(viewB));
                }
            }
            return viewB != null;
        }

        private View b(View view, KeyEvent keyEvent) {
            if (this.f1170b == null || !this.f1170b.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewB = b(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewB != null) {
                        return viewB;
                    }
                }
            }
            if (c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        boolean a(KeyEvent keyEvent) {
            int iIndexOfKey;
            if (this.f1172d != null && this.f1172d.get() == keyEvent) {
                return false;
            }
            this.f1172d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayA = a();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayA.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayA.valueAt(iIndexOfKey);
                sparseArrayA.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayA.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && v.k(view)) {
                c(view, keyEvent);
            }
            return true;
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a$c.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void b() {
            if (this.f1170b != null) {
                this.f1170b.clear();
            }
            if (f1169a.isEmpty()) {
                return;
            }
            synchronized (f1169a) {
                if (this.f1170b == null) {
                    this.f1170b = new WeakHashMap<>();
                }
                for (int size = f1169a.size() - 1; size >= 0; size--) {
                    View view = f1169a.get(size).get();
                    if (view == null) {
                        f1169a.remove(size);
                    } else {
                        this.f1170b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1170b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }
}

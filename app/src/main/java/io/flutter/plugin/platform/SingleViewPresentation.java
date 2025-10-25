package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import b.a.a$i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Keep
@TargetApi(a$i.AppCompatTheme_actionModeBackground)
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private final io.flutter.plugin.platform.b accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private a rootView;
    private boolean startFocused;
    private e state;
    private final h viewFactory;
    private int viewId;

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private g f6141a;

        /* renamed from: b, reason: collision with root package name */
        private f f6142b;

        /* renamed from: c, reason: collision with root package name */
        private b f6143c;

        e() {
        }
    }

    public SingleViewPresentation(Context context, Display display, h hVar, io.flutter.plugin.platform.b bVar, int i2, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.startFocused = false;
        this.viewFactory = hVar;
        this.accessibilityEventsDelegate = bVar;
        this.viewId = i2;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.state = new e();
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.b bVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = bVar;
        this.viewFactory = null;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f6143c == null) {
            this.state.f6143c = new b(getContext());
        }
        if (this.state.f6142b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            this.state.f6142b = new f(windowManager, this.state.f6143c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f6142b);
        if (this.state.f6141a == null) {
            this.state.f6141a = this.viewFactory.a(dVar, this.viewId, this.createParams);
        }
        View viewD = this.state.f6141a.d();
        this.container.addView(viewD);
        this.rootView = new a(getContext(), this.accessibilityEventsDelegate, viewD);
        this.rootView.addView(this.container);
        this.rootView.addView(this.state.f6143c);
        viewD.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            viewD.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public g getView() {
        if (this.state.f6141a == null) {
            return null;
        }
        return this.state.f6141a;
    }

    static class b extends ViewGroup {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f6136a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f6137b;

        public b(Context context) {
            super(context);
            this.f6136a = new Rect();
            this.f6137b = new Rect();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f6136a.set(i2, i3, i4, i5);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f6136a, layoutParams.x, layoutParams.y, this.f6137b);
                childAt.layout(this.f6137b.left, this.f6137b.top, this.f6137b.right, this.f6137b.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i2, int i3) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                getChildAt(i4).measure(a(i2), a(i3));
            }
            super.onMeasure(i2, i3);
        }

        private static int a(int i2) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final InputMethodManager f6138a;

        c(Context context) {
            this(context, null);
        }

        private c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f6138a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if ("input_method".equals(str)) {
                return this.f6138a;
            }
            return super.getSystemService(str);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f6138a);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final f f6139a;

        /* renamed from: b, reason: collision with root package name */
        private WindowManager f6140b;

        d(Context context, f fVar) {
            super(context);
            this.f6139a = fVar;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if ("window".equals(str)) {
                return a();
            }
            return super.getSystemService(str);
        }

        private WindowManager a() {
            if (this.f6140b == null) {
                this.f6140b = this.f6139a.a();
            }
            return this.f6140b;
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f6144a;

        /* renamed from: b, reason: collision with root package name */
        b f6145b;

        f(WindowManager windowManager, b bVar) {
            this.f6144a = windowManager;
            this.f6145b = bVar;
        }

        public WindowManager a() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) throws java.lang.Throwable {
            /*
                r2 = this;
                java.lang.String r3 = r4.getName()
                int r0 = r3.hashCode()
                r1 = -1148522778(0xffffffffbb8aeee6, float:-0.0042399047)
                if (r0 == r1) goto L3b
                r1 = 542766184(0x2059f468, float:1.8461482E-19)
                if (r0 == r1) goto L31
                r1 = 931413976(0x37843fd8, float:1.5765356E-5)
                if (r0 == r1) goto L27
                r1 = 1098630473(0x417bc549, float:15.735665)
                if (r0 == r1) goto L1d
                goto L45
            L1d:
                java.lang.String r0 = "removeView"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L45
                r3 = 1
                goto L46
            L27:
                java.lang.String r0 = "updateViewLayout"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L45
                r3 = 3
                goto L46
            L31:
                java.lang.String r0 = "removeViewImmediate"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L45
                r3 = 2
                goto L46
            L3b:
                java.lang.String r0 = "addView"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L45
                r3 = 0
                goto L46
            L45:
                r3 = -1
            L46:
                r0 = 0
                switch(r3) {
                    case 0: goto L59;
                    case 1: goto L55;
                    case 2: goto L51;
                    case 3: goto L4d;
                    default: goto L4a;
                }
            L4a:
                android.view.WindowManager r3 = r2.f6144a     // Catch: java.lang.reflect.InvocationTargetException -> L62
                goto L5d
            L4d:
                r2.d(r5)
                return r0
            L51:
                r2.c(r5)
                return r0
            L55:
                r2.b(r5)
                return r0
            L59:
                r2.a(r5)
                return r0
            L5d:
                java.lang.Object r3 = r4.invoke(r3, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L62
                return r3
            L62:
                r3 = move-exception
                java.lang.Throwable r3 = r3.getCause()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.f.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        private void a(Object[] objArr) {
            if (this.f6145b == null) {
                Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
                return;
            }
            this.f6145b.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
        }

        private void b(Object[] objArr) {
            if (this.f6145b == null) {
                Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            } else {
                this.f6145b.removeView((View) objArr[0]);
            }
        }

        private void c(Object[] objArr) {
            if (this.f6145b == null) {
                Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f6145b.removeView(view);
        }

        private void d(Object[] objArr) {
            if (this.f6145b == null) {
                Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
                return;
            }
            this.f6145b.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
        }
    }

    private static class a extends FrameLayout {

        /* renamed from: a, reason: collision with root package name */
        private final io.flutter.plugin.platform.b f6134a;

        /* renamed from: b, reason: collision with root package name */
        private final View f6135b;

        public a(Context context, io.flutter.plugin.platform.b bVar, View view) {
            super(context);
            this.f6134a = bVar;
            this.f6135b = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f6134a.a(this.f6135b, view, accessibilityEvent);
        }
    }
}

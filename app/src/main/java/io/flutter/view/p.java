package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import b.a.a$i;
import f.a.a.a.e;
import io.flutter.embedding.engine.e.m;
import io.flutter.view.g;
import io.flutter.view.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class p extends SurfaceView implements f.a.a.a.e, r {

    /* renamed from: a, reason: collision with root package name */
    private final io.flutter.embedding.engine.a.b f6327a;

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.d.c f6328b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.f f6329c;

    /* renamed from: d, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.c f6330d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.d f6331e;

    /* renamed from: f, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.e f6332f;

    /* renamed from: g, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.i f6333g;

    /* renamed from: h, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.m f6334h;

    /* renamed from: i, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.n f6335i;
    private final InputMethodManager j;
    private final f.a.a.b.c k;
    private final io.flutter.embedding.android.a l;
    private final io.flutter.embedding.android.b m;
    private g n;
    private final SurfaceHolder.Callback o;
    private final d p;
    private final List<f.a.a.a.a> q;
    private final List<a> r;
    private final AtomicLong s;
    private k t;
    private boolean u;
    private boolean v;
    private final g.e w;

    public interface a {
        void a();
    }

    public interface b {
        p a();
    }

    enum e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private void q() {
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        float f6341a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        int f6342b = 0;

        /* renamed from: c, reason: collision with root package name */
        int f6343c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f6344d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f6345e = 0;

        /* renamed from: f, reason: collision with root package name */
        int f6346f = 0;

        /* renamed from: g, reason: collision with root package name */
        int f6347g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f6348h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f6349i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;

        d() {
        }
    }

    public p(Context context, AttributeSet attributeSet, k kVar) {
        super(context, attributeSet);
        this.s = new AtomicLong(0L);
        this.u = false;
        this.v = false;
        this.w = new m(this);
        Activity activityA = a(getContext());
        if (activityA == null) {
            throw new IllegalArgumentException("Bad context");
        }
        if (kVar == null) {
            this.t = new k(activityA.getApplicationContext());
        } else {
            this.t = kVar;
        }
        this.f6327a = this.t.c();
        this.f6328b = new io.flutter.embedding.engine.d.c(this.t.h());
        this.u = this.t.h().nativeGetIsSoftwareRenderingEnabled();
        this.p = new d();
        this.p.f6341a = context.getResources().getDisplayMetrics().density;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.t.a(this, activityA);
        this.o = new n(this);
        getHolder().addCallback(this.o);
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.f6329c = new io.flutter.embedding.engine.e.f(this.f6327a);
        this.f6330d = new io.flutter.embedding.engine.e.c(this.f6327a);
        this.f6331e = new io.flutter.embedding.engine.e.d(this.f6327a);
        this.f6332f = new io.flutter.embedding.engine.e.e(this.f6327a);
        this.f6333g = new io.flutter.embedding.engine.e.i(this.f6327a);
        this.f6335i = new io.flutter.embedding.engine.e.n(this.f6327a);
        this.f6334h = new io.flutter.embedding.engine.e.m(this.f6327a);
        a(new o(this, new io.flutter.plugin.platform.e(activityA, this.f6333g)));
        this.j = (InputMethodManager) getContext().getSystemService("input_method");
        this.k = new f.a.a.b.c(this, this.f6327a, this.t.d().c());
        this.l = new io.flutter.embedding.android.a(this.f6330d, this.k);
        this.m = new io.flutter.embedding.android.b(this.f6328b);
        this.t.d().c().a(this.k);
        a(getResources().getConfiguration());
        n();
    }

    private static Activity a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public io.flutter.embedding.engine.a.b getDartExecutor() {
        return this.f6327a;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!o()) {
            return super.onKeyUp(i2, keyEvent);
        }
        this.l.a(keyEvent);
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!o()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.l.b(keyEvent);
        return super.onKeyDown(i2, keyEvent);
    }

    public k getFlutterNativeView() {
        return this.t;
    }

    public io.flutter.app.f getPluginRegistry() {
        return this.t.d();
    }

    public void a(f.a.a.a.a aVar) {
        this.q.add(aVar);
    }

    public void b() {
        this.f6331e.a();
    }

    public void c() {
        this.f6331e.a();
    }

    public void d() {
        Iterator<f.a.a.a.a> it = this.q.iterator();
        while (it.hasNext()) {
            it.next().onPostResume();
        }
        this.f6331e.b();
    }

    public void e() {
        this.f6331e.c();
    }

    public void f() {
        this.f6335i.a();
    }

    public void a(a aVar) {
        this.r.add(aVar);
    }

    public void b(a aVar) {
        this.r.remove(aVar);
    }

    public void setInitialRoute(String str) {
        this.f6329c.a(str);
    }

    public void g() {
        this.f6329c.a();
    }

    private void n() {
        m.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? m.b.dark : m.b.light;
        m.a aVarA = this.f6334h.a();
        aVarA.a(getResources().getConfiguration().fontScale);
        aVarA.a(DateFormat.is24HourFormat(getContext()));
        aVarA.a(bVar);
        aVarA.a();
    }

    private void a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(locales.get(i2));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f6332f.a(arrayList);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
        n();
    }

    float getDevicePixelRatio() {
        return this.p.f6341a;
    }

    public k h() {
        if (!o()) {
            return null;
        }
        getHolder().removeCallback(this.o);
        this.t.a();
        k kVar = this.t;
        this.t = null;
        return kVar;
    }

    public void i() {
        if (o()) {
            getHolder().removeCallback(this.o);
            this.t.b();
            this.t = null;
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.k.a(this, editorInfo);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return this.t.d().c().a(view);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.m.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!o()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.n.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (o() && this.m.b(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.p.f6342b = i2;
        this.p.f6343c = i3;
        r();
        super.onSizeChanged(i2, i3, i4, i5);
    }

    e j() {
        Activity activity = (Activity) getContext();
        int i2 = activity.getResources().getConfiguration().orientation;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (i2 == 2) {
            if (rotation == 1) {
                return e.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? e.LEFT : e.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return e.BOTH;
            }
        }
        return e.NONE;
    }

    @TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
    int a(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetBottom;
        boolean z = (getWindowSystemUiVisibility() & 4) != 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) != 0;
        e eVarJ = e.NONE;
        if (z2) {
            eVarJ = j();
        }
        this.p.f6344d = z ? 0 : windowInsets.getSystemWindowInsetTop();
        this.p.f6345e = (eVarJ == e.RIGHT || eVarJ == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
        this.p.f6346f = 0;
        this.p.f6347g = (eVarJ == e.LEFT || eVarJ == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
        this.p.f6348h = 0;
        this.p.f6349i = 0;
        d dVar = this.p;
        if (z2) {
            systemWindowInsetBottom = a(windowInsets);
        } else {
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        dVar.j = systemWindowInsetBottom;
        this.p.k = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.p.l = systemGestureInsets.top;
            this.p.m = systemGestureInsets.right;
            this.p.n = systemGestureInsets.bottom;
            this.p.o = systemGestureInsets.left;
        }
        r();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            this.p.f6344d = rect.top;
            this.p.f6345e = rect.right;
            this.p.f6346f = 0;
            this.p.f6347g = rect.left;
            this.p.f6348h = 0;
            this.p.f6349i = 0;
            this.p.j = rect.bottom;
            this.p.k = 0;
            r();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    private boolean o() {
        return this.t != null && this.t.e();
    }

    void k() {
        if (!o()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    private void p() {
        l();
    }

    void l() {
        if (this.n != null) {
            this.n.d();
        }
    }

    public void a(l lVar) {
        k();
        p();
        this.t.a(lVar);
        q();
    }

    public Bitmap getBitmap() {
        k();
        return this.t.h().getBitmap();
    }

    private void r() {
        if (o()) {
            this.t.h().setViewportMetrics(this.p.f6341a, this.p.f6342b, this.p.f6343c, this.p.f6344d, this.p.f6345e, this.p.f6346f, this.p.f6347g, this.p.f6348h, this.p.f6349i, this.p.j, this.p.k, this.p.l, this.p.m, this.p.n, this.p.o);
        }
    }

    public void m() {
        this.v = true;
        Iterator it = new ArrayList(this.r).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = new g(this, new io.flutter.embedding.engine.e.b(this.f6327a, getFlutterNativeView().h()), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().c());
        this.n.a(this.w);
        a(this.n.b(), this.n.c());
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.a();
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.u) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.n == null || !this.n.b()) {
            return null;
        }
        return this.n;
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer) {
        a(str, byteBuffer, (e.b) null);
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer, e.b bVar) {
        if (!o()) {
            Log.d("FlutterView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        this.t.a(str, byteBuffer, bVar);
    }

    @Override // f.a.a.a.e
    public void a(String str, e.a aVar) {
        this.t.a(str, aVar);
    }

    @Override // io.flutter.view.r
    public r.a a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        c cVar = new c(this.s.getAndIncrement(), surfaceTexture);
        this.t.h().registerTexture(cVar.c(), surfaceTexture);
        return cVar;
    }

    final class c implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final long f6336a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTexture f6337b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6338c;

        /* renamed from: d, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f6339d = new q(this);

        c(long j, SurfaceTexture surfaceTexture) {
            this.f6336a = j;
            this.f6337b = surfaceTexture;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f6337b.setOnFrameAvailableListener(this.f6339d, new Handler());
            } else {
                this.f6337b.setOnFrameAvailableListener(this.f6339d);
            }
        }

        @Override // io.flutter.view.r.a
        public SurfaceTexture b() {
            return this.f6337b;
        }

        @Override // io.flutter.view.r.a
        public long c() {
            return this.f6336a;
        }

        @Override // io.flutter.view.r.a
        public void a() {
            if (this.f6338c) {
                return;
            }
            this.f6338c = true;
            this.f6337b.setOnFrameAvailableListener(null);
            this.f6337b.release();
            p.this.t.h().unregisterTexture(this.f6336a);
        }
    }
}

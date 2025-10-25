package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import b.a.a$i;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.r;

@TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
/* loaded from: classes.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6178a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6179b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6180c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f6181d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f6182e;

    /* renamed from: f, reason: collision with root package name */
    private VirtualDisplay f6183f;

    /* renamed from: g, reason: collision with root package name */
    private SingleViewPresentation f6184g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f6185h;

    public static r a(Context context, b bVar, h hVar, r.a aVar, int i2, int i3, int i4, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        aVar.b().setDefaultBufferSize(i2, i3);
        Surface surface = new Surface(aVar.b());
        VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i2, i3, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (virtualDisplayCreateVirtualDisplay == null) {
            return null;
        }
        return new r(context, bVar, virtualDisplayCreateVirtualDisplay, hVar, surface, aVar, onFocusChangeListener, i4, obj);
    }

    private r(Context context, b bVar, VirtualDisplay virtualDisplay, h hVar, Surface surface, r.a aVar, View.OnFocusChangeListener onFocusChangeListener, int i2, Object obj) {
        this.f6178a = context;
        this.f6179b = bVar;
        this.f6181d = aVar;
        this.f6182e = onFocusChangeListener;
        this.f6185h = surface;
        this.f6183f = virtualDisplay;
        this.f6180c = context.getResources().getDisplayMetrics().densityDpi;
        this.f6184g = new SingleViewPresentation(context, this.f6183f.getDisplay(), hVar, bVar, i2, obj, onFocusChangeListener);
        this.f6184g.show();
    }

    public void a(int i2, int i3, Runnable runnable) {
        boolean zIsFocused = d().isFocused();
        SingleViewPresentation.e eVarDetachState = this.f6184g.detachState();
        this.f6183f.setSurface(null);
        this.f6183f.release();
        this.f6181d.b().setDefaultBufferSize(i2, i3);
        this.f6183f = ((DisplayManager) this.f6178a.getSystemService("display")).createVirtualDisplay("flutter-vd", i2, i3, this.f6180c, this.f6185h, 0);
        View viewD = d();
        viewD.addOnAttachStateChangeListener(new p(this, viewD, runnable));
        this.f6184g = new SingleViewPresentation(this.f6178a, this.f6183f.getDisplay(), this.f6179b, eVarDetachState, this.f6182e, zIsFocused);
        this.f6184g.show();
    }

    public void a() {
        g view = this.f6184g.getView();
        this.f6184g.cancel();
        this.f6184g.detachState();
        view.b();
        this.f6183f.release();
        this.f6181d.a();
    }

    void a(View view) {
        if (this.f6184g == null || this.f6184g.getView() == null) {
            return;
        }
        this.f6184g.getView().a(view);
    }

    void b() {
        if (this.f6184g == null || this.f6184g.getView() == null) {
            return;
        }
        this.f6184g.getView().a();
    }

    void c() {
        if (this.f6184g == null || this.f6184g.getView() == null) {
            return;
        }
        this.f6184g.getView().c();
    }

    public View d() {
        if (this.f6184g == null) {
            return null;
        }
        return this.f6184g.getView().d();
    }

    @TargetApi(16)
    static class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final View f6186a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f6187b;

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new a(view, runnable));
        }

        a(View view, Runnable runnable) {
            this.f6186a = view;
            this.f6187b = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (this.f6187b == null) {
                return;
            }
            this.f6187b.run();
            this.f6187b = null;
            this.f6186a.post(new q(this));
        }
    }
}

package io.flutter.view;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
class n implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f6324a;

    n(p pVar) {
        this.f6324a = pVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f6324a.k();
        this.f6324a.t.h().onSurfaceCreated(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.f6324a.k();
        this.f6324a.t.h().onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f6324a.k();
        this.f6324a.t.h().onSurfaceDestroyed();
    }
}

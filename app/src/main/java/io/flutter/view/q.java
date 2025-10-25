package io.flutter.view;

import android.graphics.SurfaceTexture;
import io.flutter.view.p;

/* loaded from: classes.dex */
class q implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p.c f6355a;

    q(p.c cVar) {
        this.f6355a = cVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f6355a.f6338c || p.this.t == null) {
            return;
        }
        p.this.t.h().markTextureFrameAvailable(this.f6355a.f6336a);
    }
}

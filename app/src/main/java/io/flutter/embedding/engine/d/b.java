package io.flutter.embedding.engine.d;

import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.d.c;

/* loaded from: classes.dex */
class b implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.a f6002a;

    b(c.a aVar) {
        this.f6002a = aVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f6002a.f6009c) {
            return;
        }
        c.this.a(this.f6002a.f6007a);
    }
}

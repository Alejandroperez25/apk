package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f6356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f6357b;

    s(t tVar, long j) {
        this.f6357b = tVar;
        this.f6356a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        FlutterJNI.nativeOnVsync(j, j + ((long) (1.0E9d / this.f6357b.f6358a.f6360b.getDefaultDisplay().getRefreshRate())), this.f6356a);
    }
}

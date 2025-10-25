package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
class t implements FlutterJNI.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f6358a;

    t(u uVar) {
        this.f6358a = uVar;
    }

    @Override // io.flutter.embedding.engine.FlutterJNI.b
    public void a(long j) {
        Choreographer.getInstance().postFrameCallback(new s(this, j));
    }
}

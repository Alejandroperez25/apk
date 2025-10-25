package io.flutter.plugin.platform;

import io.flutter.plugin.platform.r;

/* loaded from: classes.dex */
class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r.a f6177a;

    q(r.a aVar) {
        this.f6177a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6177a.f6186a.getViewTreeObserver().removeOnDrawListener(this.f6177a);
    }
}

package io.flutter.app;

import io.flutter.view.p;

/* loaded from: classes.dex */
class c implements p.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5947a;

    c(d dVar) {
        this.f5947a = dVar;
    }

    @Override // io.flutter.view.p.a
    public void a() {
        this.f5947a.f5952e.animate().alpha(0.0f).setListener(new b(this));
        this.f5947a.f5951d.b(this);
    }
}

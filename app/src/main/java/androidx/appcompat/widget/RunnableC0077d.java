package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC0077d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f359a;

    RunnableC0077d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f359a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f359a.b();
        this.f359a.x = this.f359a.f221e.animate().translationY(0.0f).setListener(this.f359a.y);
    }
}

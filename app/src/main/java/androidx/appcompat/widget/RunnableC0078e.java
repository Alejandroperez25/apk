package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC0078e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f361a;

    RunnableC0078e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f361a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361a.b();
        this.f361a.x = this.f361a.f221e.animate().translationY(-this.f361a.f221e.getHeight()).setListener(this.f361a.y);
    }
}

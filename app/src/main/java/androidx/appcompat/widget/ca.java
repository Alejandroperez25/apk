package androidx.appcompat.widget;

/* loaded from: classes.dex */
class ca implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f358a;

    ca(Toolbar toolbar) {
        this.f358a = toolbar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f358a.b();
    }
}

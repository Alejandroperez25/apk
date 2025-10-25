package androidx.appcompat.widget;

/* loaded from: classes.dex */
class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f274a;

    K(SearchView searchView) {
        this.f274a = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f274a.b();
    }
}

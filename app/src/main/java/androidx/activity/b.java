package androidx.activity;

/* loaded from: classes.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f83a;

    b(c cVar) {
        this.f83a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.app.Activity*/.onBackPressed();
    }
}

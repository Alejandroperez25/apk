package androidx.lifecycle;

/* loaded from: classes.dex */
class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LiveData f847a;

    n(LiveData liveData) {
        this.f847a = liveData;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        synchronized (this.f847a.f802b) {
            obj = this.f847a.f806f;
            this.f847a.f806f = LiveData.f801a;
        }
        this.f847a.a((LiveData) obj);
    }
}

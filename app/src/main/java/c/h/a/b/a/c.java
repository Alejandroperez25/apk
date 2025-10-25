package c.h.a.b.a;

/* loaded from: classes.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f4673a;

    c(d dVar) {
        this.f4673a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f4673a.f4679f) {
            c.h.a.c cVarE = this.f4673a.e();
            if (cVarE != null) {
                this.f4673a.f4676c.b(cVarE);
            } else {
                this.f4673a.f4679f = false;
            }
        }
    }
}

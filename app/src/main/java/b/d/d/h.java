package b.d.d;

/* loaded from: classes.dex */
class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f1083a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f1084b;

    h(i iVar, Object obj) {
        this.f1084b = iVar;
        this.f1083a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1084b.f1087c.a(this.f1083a);
    }
}

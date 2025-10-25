package c.d.a.a.m;

/* renamed from: c.d.a.a.m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3521a;

    public synchronized boolean a() {
        if (this.f3521a) {
            return false;
        }
        this.f3521a = true;
        notifyAll();
        return true;
    }

    public synchronized boolean b() {
        boolean z;
        z = this.f3521a;
        this.f3521a = false;
        return z;
    }

    public synchronized void c() {
        while (!this.f3521a) {
            wait();
        }
    }
}

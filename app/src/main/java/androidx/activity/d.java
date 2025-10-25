package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f91a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f92b = new CopyOnWriteArrayList<>();

    public abstract void c();

    public d(boolean z) {
        this.f91a = z;
    }

    public final void a(boolean z) {
        this.f91a = z;
    }

    public final boolean a() {
        return this.f91a;
    }

    public final void b() {
        Iterator<a> it = this.f92b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void a(a aVar) {
        this.f92b.add(aVar);
    }

    void b(a aVar) {
        this.f92b.remove(aVar);
    }
}

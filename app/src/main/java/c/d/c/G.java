package c.d.c;

import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class G<T> extends H<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H f4106a;

    G(H h2) {
        this.f4106a = h2;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, T t) throws IOException {
        if (t == null) {
            dVar.h();
        } else {
            this.f4106a.a(dVar, t);
        }
    }

    @Override // c.d.c.H
    public T a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return (T) this.f4106a.a(bVar);
    }
}

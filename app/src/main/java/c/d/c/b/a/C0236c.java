package c.d.c.b.a;

import c.d.c.b.AbstractC0260b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: c.d.c.b.a.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236c implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.b.q f4137a;

    public C0236c(c.d.c.b.q qVar) {
        this.f4137a = qVar;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Type typeB = aVar.b();
        Class<? super T> clsA = aVar.a();
        if (!Collection.class.isAssignableFrom(clsA)) {
            return null;
        }
        Type typeA = AbstractC0260b.a(typeB, (Class<?>) clsA);
        return new a(pVar, typeA, pVar.a((c.d.c.c.a) c.d.c.c.a.a(typeA)), this.f4137a.a(aVar));
    }

    /* renamed from: c.d.c.b.a.c$a */
    private static final class a<E> extends c.d.c.H<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.c.H<E> f4138a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.c.b.A<? extends Collection<E>> f4139b;

        public a(c.d.c.p pVar, Type type, c.d.c.H<E> h2, c.d.c.b.A<? extends Collection<E>> a2) {
            this.f4138a = new C0256w(pVar, h2, type);
            this.f4139b = a2;
        }

        @Override // c.d.c.H
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<E> a(c.d.c.d.b bVar) {
            if (bVar.g() == c.d.c.d.c.NULL) {
                bVar.l();
                return null;
            }
            Collection<E> collectionA = this.f4139b.a();
            bVar.b();
            while (bVar.f()) {
                collectionA.add(this.f4138a.a(bVar));
            }
            bVar.c();
            return collectionA;
        }

        @Override // c.d.c.H
        public void a(c.d.c.d.d dVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                dVar.h();
                return;
            }
            dVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f4138a.a(dVar, it.next());
            }
            dVar.e();
        }
    }
}

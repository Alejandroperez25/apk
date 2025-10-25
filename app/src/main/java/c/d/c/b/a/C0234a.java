package c.d.c.b.a;

import c.d.c.b.AbstractC0260b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: c.d.c.b.a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0234a implements c.d.c.I {
    C0234a() {
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Type typeB = aVar.b();
        if (!(typeB instanceof GenericArrayType) && (!(typeB instanceof Class) || !((Class) typeB).isArray())) {
            return null;
        }
        Type typeG = AbstractC0260b.g(typeB);
        return new C0235b(pVar, pVar.a((c.d.c.c.a) c.d.c.c.a.a(typeG)), AbstractC0260b.e(typeG));
    }
}

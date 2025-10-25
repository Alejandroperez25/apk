package c.d.c.b.a;

import c.d.c.b.a.ia;

/* loaded from: classes.dex */
class U implements c.d.c.I {
    U() {
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (!Enum.class.isAssignableFrom(clsA) || clsA == Enum.class) {
            return null;
        }
        if (!clsA.isEnum()) {
            clsA = clsA.getSuperclass();
        }
        return new ia.a(clsA);
    }
}

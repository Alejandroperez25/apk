package c.d.c.b.a;

/* renamed from: c.d.c.b.a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239f implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.b.q f4142a;

    public C0239f(c.d.c.b.q qVar) {
        this.f4142a = qVar;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        c.d.c.a.b bVar = (c.d.c.a.b) aVar.a().getAnnotation(c.d.c.a.b.class);
        if (bVar == null) {
            return null;
        }
        return (c.d.c.H<T>) a(this.f4142a, pVar, aVar, bVar);
    }

    c.d.c.H<?> a(c.d.c.b.q qVar, c.d.c.p pVar, c.d.c.c.a<?> aVar, c.d.c.a.b bVar) {
        c.d.c.H<?> c0255v;
        Object objA = qVar.a(c.d.c.c.a.b(bVar.value())).a();
        if (objA instanceof c.d.c.H) {
            c0255v = (c.d.c.H) objA;
        } else if (objA instanceof c.d.c.I) {
            c0255v = ((c.d.c.I) objA).a(pVar, aVar);
        } else {
            boolean z = objA instanceof c.d.c.B;
            if (z || (objA instanceof c.d.c.t)) {
                c0255v = new C0255v<>(z ? (c.d.c.B) objA : null, objA instanceof c.d.c.t ? (c.d.c.t) objA : null, pVar, aVar, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (c0255v == null || !bVar.nullSafe()) ? c0255v : c0255v.a();
    }
}

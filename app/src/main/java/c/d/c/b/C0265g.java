package c.d.c.b;

import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: c.d.c.b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0265g<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    private final I f4209a = I.a();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f4210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Type f4211c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f4212d;

    C0265g(q qVar, Class cls, Type type) {
        this.f4212d = qVar;
        this.f4210b = cls;
        this.f4211c = type;
    }

    @Override // c.d.c.b.A
    public T a() {
        try {
            return (T) this.f4209a.b(this.f4210b);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f4211c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
        }
    }
}

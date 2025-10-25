package c.d.c.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class l<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Type f4222a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f4223b;

    l(q qVar, Type type) {
        this.f4223b = qVar;
        this.f4222a = type;
    }

    @Override // c.d.c.b.A
    public T a() {
        if (this.f4222a instanceof ParameterizedType) {
            Type type = ((ParameterizedType) this.f4222a).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return (T) EnumSet.noneOf((Class) type);
            }
            throw new c.d.c.v("Invalid EnumSet type: " + this.f4222a.toString());
        }
        throw new c.d.c.v("Invalid EnumSet type: " + this.f4222a.toString());
    }
}

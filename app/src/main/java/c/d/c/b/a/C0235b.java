package c.d.c.b.a;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: c.d.c.b.a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235b<E> extends c.d.c.H<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.I f4134a = new C0234a();

    /* renamed from: b, reason: collision with root package name */
    private final Class<E> f4135b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.c.H<E> f4136c;

    public C0235b(c.d.c.p pVar, c.d.c.H<E> h2, Class<E> cls) {
        this.f4136c = new C0256w(pVar, h2, cls);
        this.f4135b = cls;
    }

    @Override // c.d.c.H
    public Object a(c.d.c.d.b bVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.f()) {
            arrayList.add(this.f4136c.a(bVar));
        }
        bVar.c();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f4135b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            dVar.h();
            return;
        }
        dVar.d();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f4136c.a(dVar, Array.get(obj, i2));
        }
        dVar.e();
    }
}

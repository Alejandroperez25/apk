package c.d.c.b.a;

import c.d.c.b.AbstractC0260b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.d.c.b.a.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249p implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.b.q f4169a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.c.j f4170b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.c.b.s f4171c;

    /* renamed from: d, reason: collision with root package name */
    private final C0239f f4172d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.c.b.b.b f4173e = c.d.c.b.b.b.a();

    public C0249p(c.d.c.b.q qVar, c.d.c.j jVar, c.d.c.b.s sVar, C0239f c0239f) {
        this.f4169a = qVar;
        this.f4170b = jVar;
        this.f4171c = sVar;
        this.f4172d = c0239f;
    }

    public boolean a(Field field, boolean z) {
        return a(field, z, this.f4171c);
    }

    static boolean a(Field field, boolean z, c.d.c.b.s sVar) {
        return (sVar.a(field.getType(), z) || sVar.a(field, z)) ? false : true;
    }

    private List<String> a(Field field) {
        c.d.c.a.c cVar = (c.d.c.a.c) field.getAnnotation(c.d.c.a.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f4170b.a(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (Object.class.isAssignableFrom(clsA)) {
            return new a(this.f4169a.a(aVar), a(pVar, (c.d.c.c.a<?>) aVar, (Class<?>) clsA));
        }
        return null;
    }

    private b a(c.d.c.p pVar, Field field, String str, c.d.c.c.a<?> aVar, boolean z, boolean z2) {
        boolean zA = c.d.c.b.C.a((Type) aVar.a());
        c.d.c.a.b bVar = (c.d.c.a.b) field.getAnnotation(c.d.c.a.b.class);
        c.d.c.H<?> hA = bVar != null ? this.f4172d.a(this.f4169a, pVar, aVar, bVar) : null;
        boolean z3 = hA != null;
        if (hA == null) {
            hA = pVar.a((c.d.c.c.a) aVar);
        }
        return new C0248o(this, str, z, z2, field, z3, hA, pVar, aVar, zA);
    }

    private Map<String, b> a(c.d.c.p pVar, c.d.c.c.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeB = aVar.b();
        c.d.c.c.a<?> aVarA = aVar;
        Class<?> clsA = cls;
        while (clsA != Object.class) {
            Field[] declaredFields = clsA.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zA = a(field, true);
                boolean zA2 = a(field, z);
                if (zA || zA2) {
                    this.f4173e.a(field);
                    Type typeA = AbstractC0260b.a(aVarA.b(), clsA, field.getGenericType());
                    List<String> listA = a(field);
                    int size = listA.size();
                    b bVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = listA.get(i3);
                        boolean z2 = i3 != 0 ? false : zA;
                        b bVar2 = bVar;
                        int i4 = i3;
                        int i5 = size;
                        List<String> list = listA;
                        Field field2 = field;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, a(pVar, field, str, c.d.c.c.a.a(typeA), z2, zA2)) : bVar2;
                        i3 = i4 + 1;
                        zA = z2;
                        listA = list;
                        size = i5;
                        field = field2;
                    }
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(typeB + " declares multiple JSON fields named " + bVar3.f4176a);
                    }
                }
                i2++;
                z = false;
            }
            aVarA = c.d.c.c.a.a(AbstractC0260b.a(aVarA.b(), clsA, clsA.getGenericSuperclass()));
            clsA = aVarA.a();
        }
        return linkedHashMap;
    }

    /* renamed from: c.d.c.b.a.p$b */
    static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final String f4176a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f4177b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f4178c;

        abstract void a(c.d.c.d.b bVar, Object obj);

        abstract void a(c.d.c.d.d dVar, Object obj);

        abstract boolean a(Object obj);

        protected b(String str, boolean z, boolean z2) {
            this.f4176a = str;
            this.f4177b = z;
            this.f4178c = z2;
        }
    }

    /* renamed from: c.d.c.b.a.p$a */
    public static final class a<T> extends c.d.c.H<T> {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.c.b.A<T> f4174a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, b> f4175b;

        a(c.d.c.b.A<T> a2, Map<String, b> map) {
            this.f4174a = a2;
            this.f4175b = map;
        }

        @Override // c.d.c.H
        public T a(c.d.c.d.b bVar) throws c.d.c.d.e {
            if (bVar.g() == c.d.c.d.c.NULL) {
                bVar.l();
                return null;
            }
            T tA = this.f4174a.a();
            try {
                bVar.d();
                while (bVar.f()) {
                    b bVar2 = this.f4175b.get(bVar.i());
                    if (bVar2 == null || !bVar2.f4178c) {
                        bVar.p();
                    } else {
                        bVar2.a(bVar, tA);
                    }
                }
                bVar.e();
                return tA;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new c.d.c.C(e3);
            }
        }

        @Override // c.d.c.H
        public void a(c.d.c.d.d dVar, T t) throws IOException {
            if (t == null) {
                dVar.h();
                return;
            }
            dVar.f();
            try {
                for (b bVar : this.f4175b.values()) {
                    if (bVar.a(t)) {
                        dVar.b(bVar.f4176a);
                        bVar.a(dVar, t);
                    }
                }
                dVar.g();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}

package c.d.c.b.a;

import c.d.c.b.AbstractC0260b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: c.d.c.b.a.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244k implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.b.q f4154a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f4155b;

    public C0244k(c.d.c.b.q qVar, boolean z) {
        this.f4154a = qVar;
        this.f4155b = z;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeB = aVar.b();
        if (!Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        Type[] typeArrB = AbstractC0260b.b(typeB, AbstractC0260b.e(typeB));
        return new a(pVar, typeArrB[0], a(pVar, typeArrB[0]), typeArrB[1], pVar.a((c.d.c.c.a) c.d.c.c.a.a(typeArrB[1])), this.f4154a.a(aVar));
    }

    private c.d.c.H<?> a(c.d.c.p pVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return ia.f4148f;
        }
        return pVar.a((c.d.c.c.a) c.d.c.c.a.a(type));
    }

    /* renamed from: c.d.c.b.a.k$a */
    private final class a<K, V> extends c.d.c.H<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.c.H<K> f4156a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.c.H<V> f4157b;

        /* renamed from: c, reason: collision with root package name */
        private final c.d.c.b.A<? extends Map<K, V>> f4158c;

        public a(c.d.c.p pVar, Type type, c.d.c.H<K> h2, Type type2, c.d.c.H<V> h3, c.d.c.b.A<? extends Map<K, V>> a2) {
            this.f4156a = new C0256w(pVar, h2, type);
            this.f4157b = new C0256w(pVar, h3, type2);
            this.f4158c = a2;
        }

        @Override // c.d.c.H
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> a(c.d.c.d.b bVar) {
            c.d.c.d.c cVarG = bVar.g();
            if (cVarG == c.d.c.d.c.NULL) {
                bVar.l();
                return null;
            }
            Map<K, V> mapA = this.f4158c.a();
            if (cVarG == c.d.c.d.c.BEGIN_ARRAY) {
                bVar.b();
                while (bVar.f()) {
                    bVar.b();
                    K kA = this.f4156a.a(bVar);
                    if (mapA.put(kA, this.f4157b.a(bVar)) != null) {
                        throw new c.d.c.C("duplicate key: " + kA);
                    }
                    bVar.c();
                }
                bVar.c();
            } else {
                bVar.d();
                while (bVar.f()) {
                    c.d.c.b.u.f4244a.a(bVar);
                    K kA2 = this.f4156a.a(bVar);
                    if (mapA.put(kA2, this.f4157b.a(bVar)) != null) {
                        throw new c.d.c.C("duplicate key: " + kA2);
                    }
                }
                bVar.e();
            }
            return mapA;
        }

        @Override // c.d.c.H
        public void a(c.d.c.d.d dVar, Map<K, V> map) throws IOException {
            if (map == null) {
                dVar.h();
                return;
            }
            if (!C0244k.this.f4155b) {
                dVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    dVar.b(String.valueOf(entry.getKey()));
                    this.f4157b.a(dVar, entry.getValue());
                }
                dVar.g();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                c.d.c.u uVarA = this.f4156a.a((c.d.c.H<K>) entry2.getKey());
                arrayList.add(uVarA);
                arrayList2.add(entry2.getValue());
                z |= uVarA.c() || uVarA.d();
            }
            if (z) {
                dVar.d();
                int size = arrayList.size();
                while (i2 < size) {
                    dVar.d();
                    c.d.c.b.D.a((c.d.c.u) arrayList.get(i2), dVar);
                    this.f4157b.a(dVar, arrayList2.get(i2));
                    dVar.e();
                    i2++;
                }
                dVar.e();
                return;
            }
            dVar.f();
            int size2 = arrayList.size();
            while (i2 < size2) {
                dVar.b(a((c.d.c.u) arrayList.get(i2)));
                this.f4157b.a(dVar, arrayList2.get(i2));
                i2++;
            }
            dVar.g();
        }

        private String a(c.d.c.u uVar) {
            if (uVar.e()) {
                c.d.c.z zVarI = uVar.i();
                if (zVarI.m()) {
                    return String.valueOf(zVarI.n());
                }
                if (zVarI.j()) {
                    return Boolean.toString(zVarI.l());
                }
                if (zVarI.o()) {
                    return zVarI.p();
                }
                throw new AssertionError();
            }
            if (uVar.f()) {
                return "null";
            }
            throw new AssertionError();
        }
    }
}

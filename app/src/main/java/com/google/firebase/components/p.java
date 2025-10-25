package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f5434a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5435b;

        private b(Class<?> cls, boolean z) {
            this.f5434a = cls;
            this.f5435b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f5434a.equals(this.f5434a) && bVar.f5435b == this.f5435b;
        }

        public int hashCode() {
            return ((this.f5434a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5435b).hashCode();
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final e<?> f5431a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<a> f5432b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<a> f5433c = new HashSet();

        a(e<?> eVar) {
            this.f5431a = eVar;
        }

        void a(a aVar) {
            this.f5432b.add(aVar);
        }

        void b(a aVar) {
            this.f5433c.add(aVar);
        }

        Set<a> a() {
            return this.f5432b;
        }

        void c(a aVar) {
            this.f5433c.remove(aVar);
        }

        e<?> b() {
            return this.f5431a;
        }

        boolean c() {
            return this.f5433c.isEmpty();
        }

        boolean d() {
            return this.f5432b.isEmpty();
        }
    }

    static void a(List<e<?>> list) {
        Set<a> setB = b(list);
        Set<a> setA = a(setB);
        int i2 = 0;
        while (!setA.isEmpty()) {
            a next = setA.iterator().next();
            setA.remove(next);
            i2++;
            for (a aVar : next.a()) {
                aVar.c(next);
                if (aVar.c()) {
                    setA.add(aVar);
                }
            }
        }
        if (i2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (a aVar2 : setB) {
            if (!aVar2.c() && !aVar2.d()) {
                arrayList.add(aVar2.b());
            }
        }
        throw new r(arrayList);
    }

    private static Set<a> b(List<e<?>> list) {
        Set<a> set;
        HashMap map = new HashMap(list.size());
        Iterator<e<?>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                e<?> next = it.next();
                a aVar = new a(next);
                for (Class<? super Object> cls : next.a()) {
                    b bVar = new b(cls, !next.g());
                    if (!map.containsKey(bVar)) {
                        map.put(bVar, new HashSet());
                    }
                    Set set2 = (Set) map.get(bVar);
                    if (!set2.isEmpty() && !bVar.f5435b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(aVar);
                }
            } else {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar2 : (Set) it2.next()) {
                        for (q qVar : aVar2.b().b()) {
                            if (qVar.d() && (set = (Set) map.get(new b(qVar.a(), qVar.c()))) != null) {
                                for (a aVar3 : set) {
                                    aVar2.a(aVar3);
                                    aVar3.b(aVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }

    private static Set<a> a(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a aVar : set) {
            if (aVar.c()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }
}

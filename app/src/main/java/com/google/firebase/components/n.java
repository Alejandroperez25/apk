package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final c.d.b.c.a<Set<Object>> f5426a = m.a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<e<?>, v<?>> f5427b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, v<?>> f5428c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, v<Set<?>>> f5429d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final u f5430e;

    @Override // com.google.firebase.components.a, com.google.firebase.components.f
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.f
    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }

    public n(Executor executor, Iterable<j> iterable, e<?>... eVarArr) {
        this.f5430e = new u(executor);
        ArrayList<e<?>> arrayList = new ArrayList();
        arrayList.add(e.a(this.f5430e, u.class, c.d.b.b.d.class, c.d.b.b.c.class));
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        Collections.addAll(arrayList, eVarArr);
        p.a(arrayList);
        for (e<?> eVar : arrayList) {
            this.f5427b.put(eVar, new v<>(k.a(this, eVar)));
        }
        a();
        b();
    }

    private void a() {
        for (Map.Entry<e<?>, v<?>> entry : this.f5427b.entrySet()) {
            e<?> key = entry.getKey();
            if (key.g()) {
                v<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.a().iterator();
                while (it.hasNext()) {
                    this.f5428c.put(it.next(), value);
                }
            }
        }
        c();
    }

    private void b() {
        HashMap map = new HashMap();
        for (Map.Entry<e<?>, v<?>> entry : this.f5427b.entrySet()) {
            e<?> key = entry.getKey();
            if (!key.g()) {
                v<?> value = entry.getValue();
                for (Class<? super Object> cls : key.a()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.f5429d.put((Class) entry2.getKey(), new v<>(l.a((Set) entry2.getValue())));
        }
    }

    static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((v) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // com.google.firebase.components.f
    public <T> c.d.b.c.a<T> b(Class<T> cls) {
        com.google.android.gms.common.internal.t.a(cls, "Null interface requested.");
        return this.f5428c.get(cls);
    }

    @Override // com.google.firebase.components.f
    public <T> c.d.b.c.a<Set<T>> c(Class<T> cls) {
        v<Set<?>> vVar = this.f5429d.get(cls);
        return vVar != null ? vVar : (c.d.b.c.a<Set<T>>) f5426a;
    }

    public void a(boolean z) {
        for (Map.Entry<e<?>, v<?>> entry : this.f5427b.entrySet()) {
            e<?> key = entry.getKey();
            v<?> value = entry.getValue();
            if (key.e() || (key.f() && z)) {
                value.get();
            }
        }
        this.f5430e.a();
    }

    private void c() {
        for (e<?> eVar : this.f5427b.keySet()) {
            for (q qVar : eVar.b()) {
                if (qVar.b() && !this.f5428c.containsKey(qVar.a())) {
                    throw new w(String.format("Unsatisfied dependency for component %s: %s", eVar, qVar.a()));
                }
            }
        }
    }
}

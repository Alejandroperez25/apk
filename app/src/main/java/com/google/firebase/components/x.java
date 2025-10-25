package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class x extends com.google.firebase.components.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f5448a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f5449b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f5450c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f5451d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<Class<?>> f5452e;

    /* renamed from: f, reason: collision with root package name */
    private final f f5453f;

    x(e<?> eVar, f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (q qVar : eVar.b()) {
            if (qVar.d()) {
                if (qVar.c()) {
                    hashSet3.add(qVar.a());
                } else {
                    hashSet.add(qVar.a());
                }
            } else if (qVar.c()) {
                hashSet4.add(qVar.a());
            } else {
                hashSet2.add(qVar.a());
            }
        }
        if (!eVar.d().isEmpty()) {
            hashSet.add(c.d.b.b.c.class);
        }
        this.f5448a = Collections.unmodifiableSet(hashSet);
        this.f5449b = Collections.unmodifiableSet(hashSet2);
        this.f5450c = Collections.unmodifiableSet(hashSet3);
        this.f5451d = Collections.unmodifiableSet(hashSet4);
        this.f5452e = eVar.d();
        this.f5453f = fVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.f
    public <T> T a(Class<T> cls) {
        if (!this.f5448a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f5453f.a(cls);
        return !cls.equals(c.d.b.b.c.class) ? t : (T) new a(this.f5452e, (c.d.b.b.c) t);
    }

    @Override // com.google.firebase.components.f
    public <T> c.d.b.c.a<T> b(Class<T> cls) {
        if (!this.f5449b.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.f5453f.b(cls);
    }

    @Override // com.google.firebase.components.f
    public <T> c.d.b.c.a<Set<T>> c(Class<T> cls) {
        if (!this.f5451d.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
        }
        return this.f5453f.c(cls);
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.f
    public <T> Set<T> d(Class<T> cls) {
        if (!this.f5450c.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
        }
        return this.f5453f.d(cls);
    }

    private static class a implements c.d.b.b.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f5454a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.b.b.c f5455b;

        public a(Set<Class<?>> set, c.d.b.b.c cVar) {
            this.f5454a = set;
            this.f5455b = cVar;
        }
    }
}

package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<? super T>> f5408a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<q> f5409b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5410c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5411d;

    /* renamed from: e, reason: collision with root package name */
    private final i<T> f5412e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f5413f;

    static /* synthetic */ Object a(Object obj, f fVar) {
        return obj;
    }

    static /* synthetic */ Object b(Object obj, f fVar) {
        return obj;
    }

    private e(Set<Class<? super T>> set, Set<q> set2, int i2, int i3, i<T> iVar, Set<Class<?>> set3) {
        this.f5408a = Collections.unmodifiableSet(set);
        this.f5409b = Collections.unmodifiableSet(set2);
        this.f5410c = i2;
        this.f5411d = i3;
        this.f5412e = iVar;
        this.f5413f = Collections.unmodifiableSet(set3);
    }

    public Set<Class<? super T>> a() {
        return this.f5408a;
    }

    public Set<q> b() {
        return this.f5409b;
    }

    public i<T> c() {
        return this.f5412e;
    }

    public Set<Class<?>> d() {
        return this.f5413f;
    }

    public boolean e() {
        return this.f5410c == 1;
    }

    public boolean f() {
        return this.f5410c == 2;
    }

    public boolean g() {
        return this.f5411d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f5408a.toArray()) + ">{" + this.f5410c + ", type=" + this.f5411d + ", deps=" + Arrays.toString(this.f5409b.toArray()) + "}";
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr);
    }

    @SafeVarargs
    public static <T> e<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        a aVarA = a(cls, clsArr);
        aVarA.a(b.a(t));
        return aVarA.b();
    }

    public static <T> a<T> b(Class<T> cls) {
        a<T> aVarA = a(cls);
        a.a(aVarA);
        return aVarA;
    }

    public static <T> e<T> a(T t, Class<T> cls) {
        a aVarB = b(cls);
        aVarB.a(c.a(t));
        return aVarB.b();
    }

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<? super T>> f5414a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<q> f5415b;

        /* renamed from: c, reason: collision with root package name */
        private int f5416c;

        /* renamed from: d, reason: collision with root package name */
        private int f5417d;

        /* renamed from: e, reason: collision with root package name */
        private i<T> f5418e;

        /* renamed from: f, reason: collision with root package name */
        private Set<Class<?>> f5419f;

        static /* synthetic */ a a(a aVar) {
            aVar.c();
            return aVar;
        }

        @SafeVarargs
        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.f5414a = new HashSet();
            this.f5415b = new HashSet();
            this.f5416c = 0;
            this.f5417d = 0;
            this.f5419f = new HashSet();
            com.google.android.gms.common.internal.t.a(cls, "Null interface");
            this.f5414a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                com.google.android.gms.common.internal.t.a(cls2, "Null interface");
            }
            Collections.addAll(this.f5414a, clsArr);
        }

        public a<T> a(q qVar) {
            com.google.android.gms.common.internal.t.a(qVar, "Null dependency");
            a(qVar.a());
            this.f5415b.add(qVar);
            return this;
        }

        public a<T> a() {
            a(1);
            return this;
        }

        private a<T> a(int i2) {
            com.google.android.gms.common.internal.t.a(this.f5416c == 0, "Instantiation type has already been set.");
            this.f5416c = i2;
            return this;
        }

        private void a(Class<?> cls) {
            com.google.android.gms.common.internal.t.b(!this.f5414a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public a<T> a(i<T> iVar) {
            com.google.android.gms.common.internal.t.a(iVar, "Null factory");
            this.f5418e = iVar;
            return this;
        }

        private a<T> c() {
            this.f5417d = 1;
            return this;
        }

        public e<T> b() {
            com.google.android.gms.common.internal.t.a(this.f5418e != null, "Missing required property: factory.");
            return new e<>(new HashSet(this.f5414a), new HashSet(this.f5415b), this.f5416c, this.f5417d, this.f5418e, this.f5419f);
        }
    }
}

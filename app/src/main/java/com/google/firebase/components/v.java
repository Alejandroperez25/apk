package com.google.firebase.components;

/* loaded from: classes.dex */
public class v<T> implements c.d.b.c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5445a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f5446b = f5445a;

    /* renamed from: c, reason: collision with root package name */
    private volatile c.d.b.c.a<T> f5447c;

    public v(c.d.b.c.a<T> aVar) {
        this.f5447c = aVar;
    }

    @Override // c.d.b.c.a
    public T get() {
        T t = (T) this.f5446b;
        if (t == f5445a) {
            synchronized (this) {
                t = (T) this.f5446b;
                if (t == f5445a) {
                    t = this.f5447c.get();
                    this.f5446b = t;
                    this.f5447c = null;
                }
            }
        }
        return t;
    }
}

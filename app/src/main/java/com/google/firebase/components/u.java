package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class u implements c.d.b.b.d, c.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<c.d.b.b.b<Object>, Executor>> f5442a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<c.d.b.b.a<?>> f5443b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5444c;

    u(Executor executor) {
        this.f5444c = executor;
    }

    public void a(c.d.b.b.a<?> aVar) {
        com.google.android.gms.common.internal.t.a(aVar);
        synchronized (this) {
            if (this.f5443b != null) {
                this.f5443b.add(aVar);
                return;
            }
            for (Map.Entry<c.d.b.b.b<Object>, Executor> entry : b(aVar)) {
                entry.getValue().execute(t.a(entry, aVar));
            }
        }
    }

    private synchronized Set<Map.Entry<c.d.b.b.b<Object>, Executor>> b(c.d.b.b.a<?> aVar) {
        ConcurrentHashMap<c.d.b.b.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f5442a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, c.d.b.b.b<? super T> bVar) {
        com.google.android.gms.common.internal.t.a(cls);
        com.google.android.gms.common.internal.t.a(bVar);
        com.google.android.gms.common.internal.t.a(executor);
        if (!this.f5442a.containsKey(cls)) {
            this.f5442a.put(cls, new ConcurrentHashMap<>());
        }
        this.f5442a.get(cls).put(bVar, executor);
    }

    @Override // c.d.b.b.d
    public <T> void a(Class<T> cls, c.d.b.b.b<? super T> bVar) {
        a(cls, this.f5444c, bVar);
    }

    @Override // c.d.b.b.d
    public synchronized <T> void b(Class<T> cls, c.d.b.b.b<? super T> bVar) {
        com.google.android.gms.common.internal.t.a(cls);
        com.google.android.gms.common.internal.t.a(bVar);
        if (this.f5442a.containsKey(cls)) {
            ConcurrentHashMap<c.d.b.b.b<Object>, Executor> concurrentHashMap = this.f5442a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f5442a.remove(cls);
            }
        }
    }

    void a() {
        Queue<c.d.b.b.a<?>> queue;
        synchronized (this) {
            if (this.f5443b != null) {
                queue = this.f5443b;
                this.f5443b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<c.d.b.b.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}

package b.d.d;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f1089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f1090b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ReentrantLock f1091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f1092d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Condition f1093e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f1094f;

    j(k kVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f1094f = kVar;
        this.f1089a = atomicReference;
        this.f1090b = callable;
        this.f1091c = reentrantLock;
        this.f1092d = atomicBoolean;
        this.f1093e = condition;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1089a.set(this.f1090b.call());
        } catch (Exception unused) {
        }
        this.f1091c.lock();
        try {
            this.f1092d.set(false);
            this.f1093e.signal();
        } finally {
            this.f1091c.unlock();
        }
    }
}

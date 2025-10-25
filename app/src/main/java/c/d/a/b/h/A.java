package c.d.a.b.h;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class A<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4012a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<z<TResult>> f4013b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4014c;

    A() {
    }

    public final void a(z<TResult> zVar) {
        synchronized (this.f4012a) {
            if (this.f4013b == null) {
                this.f4013b = new ArrayDeque();
            }
            this.f4013b.add(zVar);
        }
    }

    public final void a(h<TResult> hVar) {
        z<TResult> zVarPoll;
        synchronized (this.f4012a) {
            if (this.f4013b != null && !this.f4014c) {
                this.f4014c = true;
                while (true) {
                    synchronized (this.f4012a) {
                        zVarPoll = this.f4013b.poll();
                        if (zVarPoll == null) {
                            this.f4014c = false;
                            return;
                        }
                    }
                    zVarPoll.a(hVar);
                }
            }
        }
    }
}

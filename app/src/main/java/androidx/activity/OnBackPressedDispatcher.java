package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f75a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<d> f76b = new ArrayDeque<>();

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f75a = runnable;
    }

    androidx.activity.a a(d dVar) {
        this.f76b.add(dVar);
        a aVar = new a(dVar);
        dVar.a(aVar);
        return aVar;
    }

    public void a(i iVar, d dVar) {
        f fVarA = iVar.a();
        if (fVarA.a() == f.b.DESTROYED) {
            return;
        }
        dVar.a(new LifecycleOnBackPressedCancellable(fVarA, dVar));
    }

    public void a() {
        Iterator<d> itDescendingIterator = this.f76b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            d next = itDescendingIterator.next();
            if (next.a()) {
                next.c();
                return;
            }
        }
        if (this.f75a != null) {
            this.f75a.run();
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f81a;

        a(d dVar) {
            this.f81a = dVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f76b.remove(this.f81a);
            this.f81a.b(this);
        }
    }

    private class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f77a;

        /* renamed from: b, reason: collision with root package name */
        private final d f78b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f79c;

        LifecycleOnBackPressedCancellable(f fVar, d dVar) {
            this.f77a = fVar;
            this.f78b = dVar;
            fVar.a(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                this.f79c = OnBackPressedDispatcher.this.a(this.f78b);
                return;
            }
            if (aVar == f.a.ON_STOP) {
                if (this.f79c != null) {
                    this.f79c.cancel();
                }
            } else if (aVar == f.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f77a.b(this);
            this.f78b.b(this);
            if (this.f79c != null) {
                this.f79c.cancel();
                this.f79c = null;
            }
        }
    }
}

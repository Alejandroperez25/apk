package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.InterfaceC0353n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.i> extends f<R> {

    /* renamed from: a, reason: collision with root package name */
    static final ThreadLocal<Boolean> f4879a = new P();

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.common.api.j<? super R> f4885g;

    /* renamed from: i, reason: collision with root package name */
    private R f4887i;
    private Status j;
    private volatile boolean k;
    private boolean l;
    private boolean m;

    @KeepName
    private b mResultGuardian;
    private InterfaceC0353n n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4880b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f4883e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<f.a> f4884f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<I> f4886h = new AtomicReference<>();
    private boolean o = false;

    /* renamed from: c, reason: collision with root package name */
    private final a<R> f4881c = new a<>(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<com.google.android.gms.common.api.e> f4882d = new WeakReference<>(null);

    private final class b {
        private b() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.a(BasePendingResult.this.f4887i);
            super.finalize();
        }

        /* synthetic */ b(BasePendingResult basePendingResult, P p) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    protected abstract R b(Status status);

    public static class a<R extends com.google.android.gms.common.api.i> extends c.d.a.b.e.a.d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.j<? super R> jVar, R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.first;
                    com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) pair.second;
                    try {
                        jVar.a(iVar);
                        return;
                    } catch (RuntimeException e2) {
                        BasePendingResult.a(iVar);
                        throw e2;
                    }
                case 2:
                    ((BasePendingResult) message.obj).a(Status.f4844d);
                    return;
                default:
                    int i2 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i2);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    public final boolean a() {
        return this.f4883e.getCount() == 0;
    }

    public final void b(R r) {
        synchronized (this.f4880b) {
            if (this.m || this.l) {
                a(r);
                return;
            }
            a();
            com.google.android.gms.common.internal.t.a(!a(), "Results have already been set");
            com.google.android.gms.common.internal.t.a(!this.k, "Result has already been consumed");
            c(r);
        }
    }

    public final void a(Status status) {
        synchronized (this.f4880b) {
            if (!a()) {
                b((BasePendingResult<R>) b(status));
                this.m = true;
            }
        }
    }

    private final R b() {
        R r;
        synchronized (this.f4880b) {
            com.google.android.gms.common.internal.t.a(!this.k, "Result has already been consumed.");
            com.google.android.gms.common.internal.t.a(a(), "Result is not ready.");
            r = this.f4887i;
            this.f4887i = null;
            this.f4885g = null;
            this.k = true;
        }
        I andSet = this.f4886h.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void c(R r) {
        this.f4887i = r;
        P p = null;
        this.n = null;
        this.f4883e.countDown();
        this.j = this.f4887i.m();
        if (this.l) {
            this.f4885g = null;
        } else if (this.f4885g == null) {
            if (this.f4887i instanceof com.google.android.gms.common.api.g) {
                this.mResultGuardian = new b(this, p);
            }
        } else {
            this.f4881c.removeMessages(2);
            this.f4881c.a(this.f4885g, b());
        }
        ArrayList<f.a> arrayList = this.f4884f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            f.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.j);
        }
        this.f4884f.clear();
    }

    public static void a(com.google.android.gms.common.api.i iVar) {
        if (iVar instanceof com.google.android.gms.common.api.g) {
            try {
                ((com.google.android.gms.common.api.g) iVar).a();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }
}

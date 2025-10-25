package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b.a.a$i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC0343c;
import com.google.android.gms.common.internal.C0351l;
import com.google.android.gms.common.internal.InterfaceC0352m;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0323c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final Status f4920a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b, reason: collision with root package name */
    private static final Status f4921b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4922c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static C0323c f4923d;

    /* renamed from: h, reason: collision with root package name */
    private final Context f4927h;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.b.b.d f4928i;
    private final C0351l j;
    private final Handler q;

    /* renamed from: e, reason: collision with root package name */
    private long f4924e = 5000;

    /* renamed from: f, reason: collision with root package name */
    private long f4925f = 120000;

    /* renamed from: g, reason: collision with root package name */
    private long f4926g = 10000;
    private final AtomicInteger k = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);
    private final Map<M<?>, a<?>> m = new ConcurrentHashMap(5, 0.75f, 1);
    private AbstractC0333n n = null;
    private final Set<M<?>> o = new b.c.d();
    private final Set<M<?>> p = new b.c.d();

    public static C0323c a(Context context) {
        C0323c c0323c;
        synchronized (f4922c) {
            if (f4923d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f4923d = new C0323c(context.getApplicationContext(), handlerThread.getLooper(), c.d.a.b.b.d.b());
            }
            c0323c = f4923d;
        }
        return c0323c;
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final M<?> f4938a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.b.b.c f4939b;

        private b(M<?> m, c.d.a.b.b.c cVar) {
            this.f4938a = m;
            this.f4939b = cVar;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return com.google.android.gms.common.internal.s.a(this.f4938a, bVar.f4938a) && com.google.android.gms.common.internal.s.a(this.f4939b, bVar.f4939b);
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.s.a(this.f4938a, this.f4939b);
        }

        public final String toString() {
            s.a aVarA = com.google.android.gms.common.internal.s.a(this);
            aVarA.a("key", this.f4938a);
            aVarA.a("feature", this.f4939b);
            return aVarA.toString();
        }

        /* synthetic */ b(M m, c.d.a.b.b.c cVar, C0337r c0337r) {
            this(m, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.c$c, reason: collision with other inner class name */
    class C0062c implements E, AbstractC0343c.InterfaceC0063c {

        /* renamed from: a, reason: collision with root package name */
        private final a.f f4940a;

        /* renamed from: b, reason: collision with root package name */
        private final M<?> f4941b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC0352m f4942c = null;

        /* renamed from: d, reason: collision with root package name */
        private Set<Scope> f4943d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4944e = false;

        public C0062c(a.f fVar, M<?> m) {
            this.f4940a = fVar;
            this.f4941b = m;
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.InterfaceC0063c
        public final void a(c.d.a.b.b.a aVar) {
            C0323c.this.q.post(new w(this, aVar));
        }

        @Override // com.google.android.gms.common.api.internal.E
        public final void b(c.d.a.b.b.a aVar) {
            ((a) C0323c.this.m.get(this.f4941b)).b(aVar);
        }

        @Override // com.google.android.gms.common.api.internal.E
        public final void a(InterfaceC0352m interfaceC0352m, Set<Scope> set) {
            if (interfaceC0352m == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new c.d.a.b.b.a(4));
            } else {
                this.f4942c = interfaceC0352m;
                this.f4943d = set;
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            if (!this.f4944e || this.f4942c == null) {
                return;
            }
            this.f4940a.a(this.f4942c, this.f4943d);
        }

        static /* synthetic */ boolean a(C0062c c0062c, boolean z) {
            c0062c.f4944e = true;
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public class a<O extends a.d> implements e.a, e.b, Q {

        /* renamed from: b, reason: collision with root package name */
        private final a.f f4930b;

        /* renamed from: c, reason: collision with root package name */
        private final a.b f4931c;

        /* renamed from: d, reason: collision with root package name */
        private final M<O> f4932d;

        /* renamed from: e, reason: collision with root package name */
        private final C0331l f4933e;

        /* renamed from: h, reason: collision with root package name */
        private final int f4936h;

        /* renamed from: i, reason: collision with root package name */
        private final B f4937i;
        private boolean j;

        /* renamed from: a, reason: collision with root package name */
        private final Queue<AbstractC0336q> f4929a = new LinkedList();

        /* renamed from: f, reason: collision with root package name */
        private final Set<N> f4934f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private final Map<f$a<?>, z> f4935g = new HashMap();
        private final List<b> k = new ArrayList();
        private c.d.a.b.b.a l = null;

        public a(com.google.android.gms.common.api.d<O> dVar) {
            this.f4930b = dVar.a(C0323c.this.q.getLooper(), this);
            if (this.f4930b instanceof com.google.android.gms.common.internal.w) {
                this.f4931c = ((com.google.android.gms.common.internal.w) this.f4930b).w();
            } else {
                this.f4931c = this.f4930b;
            }
            this.f4932d = dVar.a();
            this.f4933e = new C0331l();
            this.f4936h = dVar.b();
            if (this.f4930b.g()) {
                this.f4937i = dVar.a(C0323c.this.f4927h, C0323c.this.q);
            } else {
                this.f4937i = null;
            }
        }

        @Override // com.google.android.gms.common.api.e.a
        public final void a(Bundle bundle) {
            if (Looper.myLooper() == C0323c.this.q.getLooper()) {
                m();
            } else {
                C0323c.this.q.post(new RunnableC0338s(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            d();
            d(c.d.a.b.b.a.f3727a);
            p();
            Iterator<z> it = this.f4935g.values().iterator();
            while (it.hasNext()) {
                z next = it.next();
                if (a(next.zajx.b()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zajx.a(this.f4931c, new c.d.a.b.h.i<>());
                    } catch (DeadObjectException unused) {
                        a(1);
                        this.f4930b.c();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            o();
            q();
        }

        @Override // com.google.android.gms.common.api.e.a
        public final void a(int i2) {
            if (Looper.myLooper() == C0323c.this.q.getLooper()) {
                n();
            } else {
                C0323c.this.q.post(new RunnableC0339t(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n() {
            d();
            this.j = true;
            this.f4933e.c();
            C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 9, this.f4932d), C0323c.this.f4924e);
            C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 11, this.f4932d), C0323c.this.f4925f);
            C0323c.this.j.a();
        }

        public final void b(c.d.a.b.b.a aVar) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            this.f4930b.c();
            a(aVar);
        }

        private final boolean c(c.d.a.b.b.a aVar) {
            synchronized (C0323c.f4922c) {
                if (C0323c.this.n == null || !C0323c.this.o.contains(this.f4932d)) {
                    return false;
                }
                C0323c.this.n.a(aVar, this.f4936h);
                return true;
            }
        }

        @Override // com.google.android.gms.common.api.e.b
        public final void a(c.d.a.b.b.a aVar) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (this.f4937i != null) {
                this.f4937i.h();
            }
            d();
            C0323c.this.j.a();
            d(aVar);
            if (aVar.q() != 4) {
                if (this.f4929a.isEmpty()) {
                    this.l = aVar;
                    return;
                }
                if (c(aVar) || C0323c.this.a(aVar, this.f4936h)) {
                    return;
                }
                if (aVar.q() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 9, this.f4932d), C0323c.this.f4924e);
                    return;
                }
                String strA = this.f4932d.a();
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 38);
                sb.append("API: ");
                sb.append(strA);
                sb.append(" is not available on this device.");
                a(new Status(17, sb.toString()));
                return;
            }
            a(C0323c.f4921b);
        }

        private final void o() {
            ArrayList arrayList = new ArrayList(this.f4929a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                AbstractC0336q abstractC0336q = (AbstractC0336q) obj;
                if (!this.f4930b.isConnected()) {
                    return;
                }
                if (b(abstractC0336q)) {
                    this.f4929a.remove(abstractC0336q);
                }
            }
        }

        public final void a(AbstractC0336q abstractC0336q) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (this.f4930b.isConnected()) {
                if (b(abstractC0336q)) {
                    q();
                    return;
                } else {
                    this.f4929a.add(abstractC0336q);
                    return;
                }
            }
            this.f4929a.add(abstractC0336q);
            if (this.l != null && this.l.o()) {
                a(this.l);
            } else {
                i();
            }
        }

        public final void a() {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            a(C0323c.f4920a);
            this.f4933e.b();
            for (f$a f_a : (f$a[]) this.f4935g.keySet().toArray(new f$a[this.f4935g.size()])) {
                a(new L(f_a, new c.d.a.b.h.i()));
            }
            d(new c.d.a.b.b.a(4));
            if (this.f4930b.isConnected()) {
                this.f4930b.a(new C0340u(this));
            }
        }

        public final a.f b() {
            return this.f4930b;
        }

        public final Map<f$a<?>, z> c() {
            return this.f4935g;
        }

        public final void d() {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            this.l = null;
        }

        public final c.d.a.b.b.a e() {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            return this.l;
        }

        private final boolean b(AbstractC0336q abstractC0336q) {
            if (!(abstractC0336q instanceof A)) {
                c(abstractC0336q);
                return true;
            }
            A a2 = (A) abstractC0336q;
            c.d.a.b.b.c cVarA = a(a2.b((a<?>) this));
            if (cVarA == null) {
                c(abstractC0336q);
                return true;
            }
            if (a2.c(this)) {
                b bVar = new b(this.f4932d, cVarA, null);
                int iIndexOf = this.k.indexOf(bVar);
                if (iIndexOf >= 0) {
                    b bVar2 = this.k.get(iIndexOf);
                    C0323c.this.q.removeMessages(15, bVar2);
                    C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 15, bVar2), C0323c.this.f4924e);
                    return false;
                }
                this.k.add(bVar);
                C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 15, bVar), C0323c.this.f4924e);
                C0323c.this.q.sendMessageDelayed(Message.obtain(C0323c.this.q, 16, bVar), C0323c.this.f4925f);
                c.d.a.b.b.a aVar = new c.d.a.b.b.a(2, null);
                if (c(aVar)) {
                    return false;
                }
                C0323c.this.a(aVar, this.f4936h);
                return false;
            }
            a2.a(new com.google.android.gms.common.api.k(cVarA));
            return false;
        }

        private final void c(AbstractC0336q abstractC0336q) {
            abstractC0336q.a(this.f4933e, k());
            try {
                abstractC0336q.a((a<?>) this);
            } catch (DeadObjectException unused) {
                a(1);
                this.f4930b.c();
            }
        }

        public final void a(Status status) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            Iterator<AbstractC0336q> it = this.f4929a.iterator();
            while (it.hasNext()) {
                it.next().a(status);
            }
            this.f4929a.clear();
        }

        public final void f() {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (this.j) {
                i();
            }
        }

        private final void p() {
            if (this.j) {
                C0323c.this.q.removeMessages(11, this.f4932d);
                C0323c.this.q.removeMessages(9, this.f4932d);
                this.j = false;
            }
        }

        public final void g() {
            Status status;
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (this.j) {
                p();
                if (C0323c.this.f4928i.a(C0323c.this.f4927h) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                a(status);
                this.f4930b.c();
            }
        }

        private final void q() {
            C0323c.this.q.removeMessages(12, this.f4932d);
            C0323c.this.q.sendMessageDelayed(C0323c.this.q.obtainMessage(12, this.f4932d), C0323c.this.f4926g);
        }

        public final boolean h() {
            return a(true);
        }

        private final boolean a(boolean z) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (!this.f4930b.isConnected() || this.f4935g.size() != 0) {
                return false;
            }
            if (!this.f4933e.a()) {
                this.f4930b.c();
                return true;
            }
            if (z) {
                q();
            }
            return false;
        }

        public final void i() {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            if (this.f4930b.isConnected() || this.f4930b.a()) {
                return;
            }
            int iA = C0323c.this.j.a(C0323c.this.f4927h, this.f4930b);
            if (iA != 0) {
                a(new c.d.a.b.b.a(iA, null));
                return;
            }
            C0062c c0062c = C0323c.this.new C0062c(this.f4930b, this.f4932d);
            if (this.f4930b.g()) {
                this.f4937i.a(c0062c);
            }
            this.f4930b.a(c0062c);
        }

        public final void a(N n) {
            com.google.android.gms.common.internal.t.a(C0323c.this.q);
            this.f4934f.add(n);
        }

        private final void d(c.d.a.b.b.a aVar) {
            for (N n : this.f4934f) {
                String strB = null;
                if (com.google.android.gms.common.internal.s.a(aVar, c.d.a.b.b.a.f3727a)) {
                    strB = this.f4930b.b();
                }
                n.a(this.f4932d, aVar, strB);
            }
            this.f4934f.clear();
        }

        final boolean j() {
            return this.f4930b.isConnected();
        }

        public final boolean k() {
            return this.f4930b.g();
        }

        public final int l() {
            return this.f4936h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final c.d.a.b.b.c a(c.d.a.b.b.c[] cVarArr) {
            if (cVarArr == null || cVarArr.length == 0) {
                return null;
            }
            c.d.a.b.b.c[] cVarArrF = this.f4930b.f();
            if (cVarArrF == null) {
                cVarArrF = new c.d.a.b.b.c[0];
            }
            b.c.b bVar = new b.c.b(cVarArrF.length);
            for (c.d.a.b.b.c cVar : cVarArrF) {
                bVar.put(cVar.o(), Long.valueOf(cVar.p()));
            }
            for (c.d.a.b.b.c cVar2 : cVarArr) {
                if (!bVar.containsKey(cVar2.o()) || ((Long) bVar.get(cVar2.o())).longValue() < cVar2.p()) {
                    return cVar2;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(b bVar) {
            if (this.k.contains(bVar) && !this.j) {
                if (!this.f4930b.isConnected()) {
                    i();
                } else {
                    o();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(b bVar) {
            c.d.a.b.b.c[] cVarArrB;
            if (this.k.remove(bVar)) {
                C0323c.this.q.removeMessages(15, bVar);
                C0323c.this.q.removeMessages(16, bVar);
                c.d.a.b.b.c cVar = bVar.f4939b;
                ArrayList arrayList = new ArrayList(this.f4929a.size());
                for (AbstractC0336q abstractC0336q : this.f4929a) {
                    if ((abstractC0336q instanceof A) && (cVarArrB = ((A) abstractC0336q).b((a<?>) this)) != null && com.google.android.gms.common.util.a.a(cVarArrB, cVar)) {
                        arrayList.add(abstractC0336q);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    AbstractC0336q abstractC0336q2 = (AbstractC0336q) obj;
                    this.f4929a.remove(abstractC0336q2);
                    abstractC0336q2.a(new com.google.android.gms.common.api.k(cVar));
                }
            }
        }

        static /* synthetic */ boolean a(a aVar, boolean z) {
            return aVar.a(false);
        }
    }

    private C0323c(Context context, Looper looper, c.d.a.b.b.d dVar) {
        this.f4927h = context;
        this.q = new c.d.a.b.e.a.d(looper, this);
        this.f4928i = dVar;
        this.j = new C0351l(dVar);
        this.q.sendMessage(this.q.obtainMessage(6));
    }

    public final int c() {
        return this.k.getAndIncrement();
    }

    public final void a(com.google.android.gms.common.api.d<?> dVar) {
        this.q.sendMessage(this.q.obtainMessage(7, dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(com.google.android.gms.common.api.d<?> dVar) {
        Object objA = dVar.a();
        a<?> aVar = this.m.get(objA);
        if (aVar == null) {
            aVar = new a<>(dVar);
            this.m.put(objA, aVar);
        }
        if (aVar.k()) {
            this.p.add(objA);
        }
        aVar.i();
    }

    public final void d() {
        this.q.sendMessage(this.q.obtainMessage(3));
    }

    public final <O extends a.d, ResultT> void a(com.google.android.gms.common.api.d<O> dVar, int i2, AbstractC0329j<a.b, ResultT> abstractC0329j, c.d.a.b.h.i<ResultT> iVar, InterfaceC0328i interfaceC0328i) {
        this.q.sendMessage(this.q.obtainMessage(4, new y(new K(i2, abstractC0329j, iVar, interfaceC0328i), this.l.get(), dVar)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a<?> next;
        switch (message.what) {
            case 1:
                this.f4926g = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.q.removeMessages(12);
                Iterator<M<?>> it = this.m.keySet().iterator();
                while (it.hasNext()) {
                    this.q.sendMessageDelayed(this.q.obtainMessage(12, it.next()), this.f4926g);
                }
                return true;
            case 2:
                N n = (N) message.obj;
                Iterator<M<?>> it2 = n.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        M<?> next2 = it2.next();
                        a<?> aVar = this.m.get(next2);
                        if (aVar == null) {
                            n.a(next2, new c.d.a.b.b.a(13), null);
                        } else if (aVar.j()) {
                            n.a(next2, c.d.a.b.b.a.f3727a, aVar.b().b());
                        } else if (aVar.e() != null) {
                            n.a(next2, aVar.e(), null);
                        } else {
                            aVar.a(n);
                            aVar.i();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar2 : this.m.values()) {
                    aVar2.d();
                    aVar2.i();
                }
                return true;
            case 4:
            case 8:
            case 13:
                y yVar = (y) message.obj;
                a<?> aVar3 = this.m.get(yVar.f4968c.a());
                if (aVar3 == null) {
                    b(yVar.f4968c);
                    aVar3 = this.m.get(yVar.f4968c.a());
                }
                if (aVar3.k() && this.l.get() != yVar.f4967b) {
                    yVar.f4966a.a(f4920a);
                    aVar3.a();
                } else {
                    aVar3.a(yVar.f4966a);
                }
                return true;
            case 5:
                int i2 = message.arg1;
                c.d.a.b.b.a aVar4 = (c.d.a.b.b.a) message.obj;
                Iterator<a<?>> it3 = this.m.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.l() == i2) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next != null) {
                    String strB = this.f4928i.b(aVar4.q());
                    String strS = aVar4.s();
                    StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 69 + String.valueOf(strS).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strB);
                    sb.append(": ");
                    sb.append(strS);
                    next.a(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (com.google.android.gms.common.util.i.a() && (this.f4927h.getApplicationContext() instanceof Application)) {
                    ComponentCallbacks2C0322b.a((Application) this.f4927h.getApplicationContext());
                    ComponentCallbacks2C0322b.a().a(new C0337r(this));
                    if (!ComponentCallbacks2C0322b.a().a(true)) {
                        this.f4926g = 300000L;
                    }
                }
                return true;
            case 7:
                b((com.google.android.gms.common.api.d<?>) message.obj);
                return true;
            case 9:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).f();
                }
                return true;
            case 10:
                Iterator<M<?>> it4 = this.p.iterator();
                while (it4.hasNext()) {
                    this.m.remove(it4.next()).a();
                }
                this.p.clear();
                return true;
            case 11:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).g();
                }
                return true;
            case 12:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).h();
                }
                return true;
            case 14:
                AbstractC0334o abstractC0334o = (AbstractC0334o) message.obj;
                M<?> mA = abstractC0334o.a();
                if (!this.m.containsKey(mA)) {
                    abstractC0334o.b().a((c.d.a.b.h.i<Boolean>) false);
                } else {
                    abstractC0334o.b().a((c.d.a.b.h.i<Boolean>) Boolean.valueOf(a.a((a) this.m.get(mA), false)));
                }
                return true;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                b bVar = (b) message.obj;
                if (this.m.containsKey(bVar.f4938a)) {
                    this.m.get(bVar.f4938a).a(bVar);
                }
                return true;
            case 16:
                b bVar2 = (b) message.obj;
                if (this.m.containsKey(bVar2.f4938a)) {
                    this.m.get(bVar2.f4938a).b(bVar2);
                }
                return true;
            default:
                int i3 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    final boolean a(c.d.a.b.b.a aVar, int i2) {
        return this.f4928i.a(this.f4927h, aVar, i2);
    }

    public final void b(c.d.a.b.b.a aVar, int i2) {
        if (a(aVar, i2)) {
            return;
        }
        this.q.sendMessage(this.q.obtainMessage(5, i2, 0, aVar));
    }
}

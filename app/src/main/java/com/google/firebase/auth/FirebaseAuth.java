package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c.d.a.b.e.c.Oa;
import c.d.a.b.e.c.Ya;
import c.d.a.b.e.c.fb;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.B;
import com.google.firebase.auth.a.a.C0371i;
import com.google.firebase.auth.a.a.Fa;
import com.google.firebase.auth.a.a.Ga;
import com.google.firebase.auth.a.a.ya;
import com.google.firebase.auth.internal.AbstractC0419j;
import com.google.firebase.auth.internal.C0416g;
import com.google.firebase.auth.internal.C0424o;
import com.google.firebase.auth.internal.C0425p;
import com.google.firebase.auth.internal.ExecutorC0426q;
import com.google.firebase.auth.internal.InterfaceC0410a;
import com.google.firebase.auth.internal.InterfaceC0411b;
import com.google.firebase.auth.internal.InterfaceC0412c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC0411b {

    /* renamed from: a, reason: collision with root package name */
    private c.d.b.e f5178a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f5179b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC0410a> f5180c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f5181d;

    /* renamed from: e, reason: collision with root package name */
    private C0371i f5182e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC0437s f5183f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.auth.internal.B f5184g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f5185h;

    /* renamed from: i, reason: collision with root package name */
    private String f5186i;
    private final Object j;
    private String k;
    private final C0425p l;
    private final C0416g m;
    private C0424o n;
    private ExecutorC0426q o;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    class c extends d implements InterfaceC0412c, com.google.firebase.auth.internal.R {
        c() {
            super();
        }

        @Override // com.google.firebase.auth.internal.R
        public final void a(Status status) {
            if (status.q() == 17011 || status.q() == 17021 || status.q() == 17005) {
                FirebaseAuth.this.e();
            }
        }
    }

    class d implements InterfaceC0412c {
        d() {
        }

        @Override // com.google.firebase.auth.internal.InterfaceC0412c
        public final void a(Oa oa, AbstractC0437s abstractC0437s) {
            com.google.android.gms.common.internal.t.a(oa);
            com.google.android.gms.common.internal.t.a(abstractC0437s);
            abstractC0437s.a(oa);
            FirebaseAuth.this.a(abstractC0437s, oa, true);
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) c.d.b.e.a().a(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(c.d.b.e eVar) {
        return (FirebaseAuth) eVar.a(FirebaseAuth.class);
    }

    public FirebaseAuth(c.d.b.e eVar) {
        this(eVar, Fa.a(eVar.c(), new Ga(eVar.e().a()).a()), new C0425p(eVar.c(), eVar.h()), C0416g.a());
    }

    private FirebaseAuth(c.d.b.e eVar, C0371i c0371i, C0425p c0425p, C0416g c0416g) {
        Oa oaB;
        this.f5185h = new Object();
        this.j = new Object();
        com.google.android.gms.common.internal.t.a(eVar);
        this.f5178a = eVar;
        com.google.android.gms.common.internal.t.a(c0371i);
        this.f5182e = c0371i;
        com.google.android.gms.common.internal.t.a(c0425p);
        this.l = c0425p;
        this.f5184g = new com.google.firebase.auth.internal.B();
        com.google.android.gms.common.internal.t.a(c0416g);
        this.m = c0416g;
        this.f5179b = new CopyOnWriteArrayList();
        this.f5180c = new CopyOnWriteArrayList();
        this.f5181d = new CopyOnWriteArrayList();
        this.o = ExecutorC0426q.a();
        this.f5183f = this.l.a();
        if (this.f5183f != null && (oaB = this.l.b(this.f5183f)) != null) {
            a(this.f5183f, oaB, false);
        }
        this.m.a(this);
    }

    public AbstractC0437s a() {
        return this.f5183f;
    }

    public final void a(AbstractC0437s abstractC0437s, Oa oa, boolean z) {
        boolean z2;
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(oa);
        boolean z3 = true;
        if (this.f5183f == null) {
            z2 = true;
        } else {
            boolean z4 = !this.f5183f.x().q().equals(oa.q());
            boolean zEquals = this.f5183f.i().equals(abstractC0437s.i());
            z2 = !zEquals || z4;
            if (zEquals) {
                z3 = false;
            }
        }
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        if (this.f5183f == null) {
            this.f5183f = abstractC0437s;
        } else {
            this.f5183f.a(abstractC0437s.q());
            if (!abstractC0437s.o()) {
                this.f5183f.r();
            }
            this.f5183f.b(abstractC0437s.B().a());
        }
        if (z) {
            this.l.a(this.f5183f);
        }
        if (z2) {
            if (this.f5183f != null) {
                this.f5183f.a(oa);
            }
            c(this.f5183f);
        }
        if (z3) {
            d(this.f5183f);
        }
        if (z) {
            this.l.a(abstractC0437s, oa);
        }
        f().a(this.f5183f.x());
    }

    public final void b() {
        if (this.f5183f != null) {
            C0425p c0425p = this.l;
            AbstractC0437s abstractC0437s = this.f5183f;
            com.google.android.gms.common.internal.t.a(abstractC0437s);
            c0425p.a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0437s.i()));
            this.f5183f = null;
        }
        this.l.a("com.google.firebase.auth.FIREBASE_USER");
        c((AbstractC0437s) null);
        d((AbstractC0437s) null);
    }

    private final synchronized void a(C0424o c0424o) {
        this.n = c0424o;
    }

    private final synchronized C0424o f() {
        if (this.n == null) {
            a(new C0424o(this.f5178a));
        }
        return this.n;
    }

    public final c.d.b.e c() {
        return this.f5178a;
    }

    public void a(a aVar) {
        this.f5181d.add(aVar);
        this.o.execute(new W(this, aVar));
    }

    public void b(a aVar) {
        this.f5181d.remove(aVar);
    }

    private final void c(AbstractC0437s abstractC0437s) {
        if (abstractC0437s != null) {
            String strI = abstractC0437s.i();
            StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(strI);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        this.o.execute(new Y(this, new c.d.b.d.c(abstractC0437s != null ? abstractC0437s.z() : null)));
    }

    private final void d(AbstractC0437s abstractC0437s) {
        if (abstractC0437s != null) {
            String strI = abstractC0437s.i();
            StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(strI);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        this.o.execute(new X(this));
    }

    public c.d.a.b.h.h<C0439u> a(boolean z) {
        return a(this.f5183f, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.aa, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<C0439u> a(AbstractC0437s abstractC0437s, boolean z) {
        if (abstractC0437s == null) {
            return c.d.a.b.h.k.a((Exception) ya.a(new Status(17495)));
        }
        Oa oaX = abstractC0437s.x();
        if (oaX.o() && !z) {
            return c.d.a.b.h.k.a(AbstractC0419j.a(oaX.q()));
        }
        return this.f5182e.a(this.f5178a, abstractC0437s, oaX.p(), (com.google.firebase.auth.internal.t) new aa(this));
    }

    public c.d.a.b.h.h<InterfaceC0404d> a(AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        if (abstractC0403c instanceof C0405e) {
            C0405e c0405e = (C0405e) abstractC0403c;
            if (!c0405e.s()) {
                return this.f5182e.b(this.f5178a, c0405e.n(), c0405e.q(), this.k, new d());
            }
            if (g(c0405e.r())) {
                return c.d.a.b.h.k.a((Exception) ya.a(new Status(17072)));
            }
            return this.f5182e.a(this.f5178a, c0405e, new d());
        }
        if (abstractC0403c instanceof A) {
            return this.f5182e.a(this.f5178a, (A) abstractC0403c, this.k, (InterfaceC0412c) new d());
        }
        return this.f5182e.a(this.f5178a, abstractC0403c, this.k, new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        if (C0405e.class.isAssignableFrom(abstractC0403c.getClass())) {
            C0405e c0405e = (C0405e) abstractC0403c;
            if ("password".equals(c0405e.p())) {
                return this.f5182e.a(this.f5178a, abstractC0437s, c0405e.n(), c0405e.q(), abstractC0437s.t(), new c());
            }
            if (g(c0405e.r())) {
                return c.d.a.b.h.k.a((Exception) ya.a(new Status(17072)));
            }
            return this.f5182e.a(this.f5178a, abstractC0437s, c0405e, (com.google.firebase.auth.internal.t) new c());
        }
        if (abstractC0403c instanceof A) {
            return this.f5182e.a(this.f5178a, abstractC0437s, (A) abstractC0403c, this.k, (com.google.firebase.auth.internal.t) new c());
        }
        return this.f5182e.a(this.f5178a, abstractC0437s, abstractC0403c, abstractC0437s.t(), (com.google.firebase.auth.internal.t) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<InterfaceC0404d> b(AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        if (C0405e.class.isAssignableFrom(abstractC0403c.getClass())) {
            C0405e c0405e = (C0405e) abstractC0403c;
            if ("password".equals(c0405e.p())) {
                return this.f5182e.b(this.f5178a, abstractC0437s, c0405e.n(), c0405e.q(), abstractC0437s.t(), new c());
            }
            if (g(c0405e.r())) {
                return c.d.a.b.h.k.a((Exception) ya.a(new Status(17072)));
            }
            return this.f5182e.b(this.f5178a, abstractC0437s, c0405e, (com.google.firebase.auth.internal.t) new c());
        }
        if (abstractC0403c instanceof A) {
            return this.f5182e.b(this.f5178a, abstractC0437s, (A) abstractC0403c, this.k, (com.google.firebase.auth.internal.t) new c());
        }
        return this.f5182e.b(this.f5178a, abstractC0437s, abstractC0403c, abstractC0437s.t(), (com.google.firebase.auth.internal.t) new c());
    }

    public c.d.a.b.h.h<InterfaceC0404d> a(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return this.f5182e.a(this.f5178a, str, this.k, new d());
    }

    public c.d.a.b.h.h<InterfaceC0404d> a(String str, String str2) {
        return a(AbstractC0406f.b(str, str2));
    }

    public c.d.a.b.h.h<InterfaceC0404d> d() {
        if (this.f5183f != null && this.f5183f.o()) {
            com.google.firebase.auth.internal.E e2 = (com.google.firebase.auth.internal.E) this.f5183f;
            e2.b(false);
            return c.d.a.b.h.k.a(new com.google.firebase.auth.internal.y(e2));
        }
        return this.f5182e.a(this.f5178a, new d(), this.k);
    }

    public final void a(String str, long j, TimeUnit timeUnit, B.b bVar, Activity activity, Executor executor, boolean z) {
        long jConvert = TimeUnit.SECONDS.convert(j, timeUnit);
        if (jConvert < 0 || jConvert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        this.f5182e.a(this.f5178a, new Ya(str, jConvert, z, this.f5186i, this.k), (this.f5184g.c() && str.equals(this.f5184g.a())) ? new Z(this, bVar) : bVar, activity, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s) {
        return a(abstractC0437s, (com.google.firebase.auth.internal.t) new c());
    }

    private final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s, com.google.firebase.auth.internal.t tVar) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        return this.f5182e.a(this.f5178a, abstractC0437s, tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<InterfaceC0404d> c(AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        return this.f5182e.a(this.f5178a, abstractC0437s, abstractC0403c, (com.google.firebase.auth.internal.t) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<InterfaceC0404d> a(AbstractC0437s abstractC0437s, String str) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        return this.f5182e.d(this.f5178a, abstractC0437s, str, new c());
    }

    public c.d.a.b.h.h<InterfaceC0404d> b(String str, String str2) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(str2);
        return this.f5182e.a(this.f5178a, str, str2, this.k, new d());
    }

    public c.d.a.b.h.h<D> b(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return this.f5182e.a(this.f5178a, str, this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s, H h2) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(h2);
        return this.f5182e.a(this.f5178a, abstractC0437s, h2, (com.google.firebase.auth.internal.t) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> b(AbstractC0437s abstractC0437s, String str) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(str);
        return this.f5182e.b(this.f5178a, abstractC0437s, str, (com.google.firebase.auth.internal.t) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s, A a2) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(a2);
        return this.f5182e.a(this.f5178a, abstractC0437s, a2, (com.google.firebase.auth.internal.t) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.t] */
    public final c.d.a.b.h.h<Void> c(AbstractC0437s abstractC0437s, String str) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(str);
        return this.f5182e.c(this.f5178a, abstractC0437s, str, new c());
    }

    public c.d.a.b.h.h<Void> c(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return a(str, (C0354a) null);
    }

    public c.d.a.b.h.h<Void> a(String str, C0354a c0354a) {
        com.google.android.gms.common.internal.t.a(str);
        if (c0354a == null) {
            c0354a = C0354a.o();
        }
        if (this.f5186i != null) {
            c0354a.a(this.f5186i);
        }
        c0354a.a(fb.PASSWORD_RESET);
        return this.f5182e.a(this.f5178a, str, c0354a, this.k);
    }

    public c.d.a.b.h.h<Void> b(String str, C0354a c0354a) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(c0354a);
        if (!c0354a.v()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        if (this.f5186i != null) {
            c0354a.a(this.f5186i);
        }
        return this.f5182e.b(this.f5178a, str, c0354a, this.k);
    }

    public boolean d(String str) {
        return C0405e.a(str);
    }

    public final c.d.a.b.h.h<Void> a(C0354a c0354a, String str) {
        com.google.android.gms.common.internal.t.a(str);
        if (this.f5186i != null) {
            if (c0354a == null) {
                c0354a = C0354a.o();
            }
            c0354a.a(this.f5186i);
        }
        return this.f5182e.a(this.f5178a, c0354a, str);
    }

    public final c.d.a.b.h.h<Void> b(AbstractC0437s abstractC0437s) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        return this.f5182e.a(abstractC0437s, new ba(this, abstractC0437s));
    }

    public void e() {
        b();
        if (this.n != null) {
            this.n.a();
        }
    }

    public void e(String str) {
        com.google.android.gms.common.internal.t.a(str);
        synchronized (this.f5185h) {
            this.f5186i = str;
        }
    }

    public final void f(String str) {
        com.google.android.gms.common.internal.t.a(str);
        synchronized (this.j) {
            this.k = str;
        }
    }

    private final boolean g(String str) {
        P pA = P.a(str);
        return (pA == null || TextUtils.equals(this.k, pA.b())) ? false : true;
    }
}

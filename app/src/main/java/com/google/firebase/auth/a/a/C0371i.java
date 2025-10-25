package com.google.firebase.auth.a.a;

import android.app.Activity;
import android.content.Context;
import c.d.a.b.e.c.Va;
import c.d.a.b.e.c.Ya;
import c.d.a.b.e.c.fb;
import c.d.a.b.e.c.mb;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AbstractC0403c;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.B;
import com.google.firebase.auth.C0354a;
import com.google.firebase.auth.C0405e;
import com.google.firebase.auth.C0439u;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.internal.AbstractC0421l;
import com.google.firebase.auth.internal.InterfaceC0412c;
import com.google.firebase.auth.internal.InterfaceC0413d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.auth.a.a.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371i extends AbstractC0355a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f5289c;

    /* renamed from: d, reason: collision with root package name */
    private final Ha f5290d;

    /* renamed from: e, reason: collision with root package name */
    private final Future<C0359c<Ha>> f5291e = a();

    C0371i(Context context, Ha ha) {
        this.f5289c = context;
        this.f5290d = ha;
    }

    @Override // com.google.firebase.auth.a.a.AbstractC0355a
    final Future<C0359c<Ha>> a() {
        if (this.f5291e != null) {
            return this.f5291e;
        }
        return Va.a().a(mb.f3920a).submit(new va(this.f5290d, this.f5289c));
    }

    public final c.d.a.b.h.h<C0439u> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, com.google.firebase.auth.internal.t tVar) {
        C0387q c0387q = new C0387q(str);
        c0387q.a(eVar);
        c0387q.a(abstractC0437s);
        c0387q.a((C0387q) tVar);
        c0387q.a((com.google.firebase.auth.internal.R) tVar);
        C0387q c0387q2 = c0387q;
        return a(a(c0387q2), c0387q2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, String str, String str2, InterfaceC0412c interfaceC0412c) {
        C0356aa c0356aa = new C0356aa(str, str2);
        c0356aa.a(eVar);
        c0356aa.a((C0356aa) interfaceC0412c);
        C0356aa c0356aa2 = c0356aa;
        return a(b(c0356aa2), c0356aa2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, AbstractC0403c abstractC0403c, String str, InterfaceC0412c interfaceC0412c) {
        Y y = new Y(abstractC0403c, str);
        y.a(eVar);
        y.a((Y) interfaceC0412c);
        Y y2 = y;
        return a(b(y2), y2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c, String str, com.google.firebase.auth.internal.t tVar) {
        A a2 = new A(abstractC0403c, str);
        a2.a(eVar);
        a2.a(abstractC0437s);
        a2.a((A) tVar);
        a2.a((com.google.firebase.auth.internal.R) tVar);
        A a3 = a2;
        return a(b(a3), a3);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> b(c.d.b.e eVar, AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c, String str, com.google.firebase.auth.internal.t tVar) {
        C c2 = new C(abstractC0403c, str);
        c2.a(eVar);
        c2.a(abstractC0437s);
        c2.a((C) tVar);
        c2.a((com.google.firebase.auth.internal.R) tVar);
        C c3 = c2;
        return a(b(c3), c3);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, InterfaceC0412c interfaceC0412c, String str) {
        W w = new W(str);
        w.a(eVar);
        w.a((W) interfaceC0412c);
        W w2 = w;
        return a(b(w2), w2);
    }

    public final void a(c.d.b.e eVar, Ya ya, B.b bVar, Activity activity, Executor executor) {
        C0396ua c0396ua = new C0396ua(ya);
        c0396ua.a(eVar);
        c0396ua.a(bVar, activity, executor);
        C0396ua c0396ua2 = c0396ua;
        a(b(c0396ua2), c0396ua2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, com.google.firebase.auth.H h2, com.google.firebase.auth.internal.t tVar) {
        C0392sa c0392sa = new C0392sa(h2);
        c0392sa.a(eVar);
        c0392sa.a(abstractC0437s);
        c0392sa.a((C0392sa) tVar);
        c0392sa.a((com.google.firebase.auth.internal.R) tVar);
        C0392sa c0392sa2 = c0392sa;
        return a(b(c0392sa2), c0392sa2);
    }

    public final c.d.a.b.h.h<Void> b(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, com.google.firebase.auth.internal.t tVar) {
        C0380ma c0380ma = new C0380ma(str);
        c0380ma.a(eVar);
        c0380ma.a(abstractC0437s);
        c0380ma.a((C0380ma) tVar);
        c0380ma.a((com.google.firebase.auth.internal.R) tVar);
        C0380ma c0380ma2 = c0380ma;
        return a(b(c0380ma2), c0380ma2);
    }

    public final c.d.a.b.h.h<Void> c(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, com.google.firebase.auth.internal.t tVar) {
        C0384oa c0384oa = new C0384oa(str);
        c0384oa.a(eVar);
        c0384oa.a(abstractC0437s);
        c0384oa.a((C0384oa) tVar);
        c0384oa.a((com.google.firebase.auth.internal.R) tVar);
        C0384oa c0384oa2 = c0384oa;
        return a(b(c0384oa2), c0384oa2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, com.google.firebase.auth.A a2, com.google.firebase.auth.internal.t tVar) {
        C0388qa c0388qa = new C0388qa(a2);
        c0388qa.a(eVar);
        c0388qa.a(abstractC0437s);
        c0388qa.a((C0388qa) tVar);
        c0388qa.a((com.google.firebase.auth.internal.R) tVar);
        C0388qa c0388qa2 = c0388qa;
        return a(b(c0388qa2), c0388qa2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, String str, String str2, String str3, InterfaceC0412c interfaceC0412c) {
        C0375k c0375k = new C0375k(str, str2, str3);
        c0375k.a(eVar);
        c0375k.a((C0375k) interfaceC0412c);
        C0375k c0375k2 = c0375k;
        return a(b(c0375k2), c0375k2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> b(c.d.b.e eVar, String str, String str2, String str3, InterfaceC0412c interfaceC0412c) {
        C0360ca c0360ca = new C0360ca(str, str2, str3);
        c0360ca.a(eVar);
        c0360ca.a((C0360ca) interfaceC0412c);
        C0360ca c0360ca2 = c0360ca;
        return a(b(c0360ca2), c0360ca2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, C0405e c0405e, InterfaceC0412c interfaceC0412c) {
        C0364ea c0364ea = new C0364ea(c0405e);
        c0364ea.a(eVar);
        c0364ea.a((C0364ea) interfaceC0412c);
        C0364ea c0364ea2 = c0364ea;
        return a(b(c0364ea2), c0364ea2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, String str2, String str3, com.google.firebase.auth.internal.t tVar) {
        I i2 = new I(str, str2, str3);
        i2.a(eVar);
        i2.a(abstractC0437s);
        i2.a((I) tVar);
        i2.a((com.google.firebase.auth.internal.R) tVar);
        I i3 = i2;
        return a(b(i3), i3);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> b(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, String str2, String str3, com.google.firebase.auth.internal.t tVar) {
        K k = new K(str, str2, str3);
        k.a(eVar);
        k.a(abstractC0437s);
        k.a((K) tVar);
        k.a((com.google.firebase.auth.internal.R) tVar);
        K k2 = k;
        return a(b(k2), k2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, C0405e c0405e, com.google.firebase.auth.internal.t tVar) {
        E e2 = new E(c0405e);
        e2.a(eVar);
        e2.a(abstractC0437s);
        e2.a((E) tVar);
        e2.a((com.google.firebase.auth.internal.R) tVar);
        E e3 = e2;
        return a(b(e3), e3);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> b(c.d.b.e eVar, AbstractC0437s abstractC0437s, C0405e c0405e, com.google.firebase.auth.internal.t tVar) {
        G g2 = new G(c0405e);
        g2.a(eVar);
        g2.a(abstractC0437s);
        g2.a((G) tVar);
        g2.a((com.google.firebase.auth.internal.R) tVar);
        G g3 = g2;
        return a(b(g3), g3);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, com.google.firebase.auth.A a2, String str, InterfaceC0412c interfaceC0412c) {
        C0368ga c0368ga = new C0368ga(a2, str);
        c0368ga.a(eVar);
        c0368ga.a((C0368ga) interfaceC0412c);
        C0368ga c0368ga2 = c0368ga;
        return a(b(c0368ga2), c0368ga2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, com.google.firebase.auth.A a2, String str, com.google.firebase.auth.internal.t tVar) {
        M m = new M(a2, str);
        m.a(eVar);
        m.a(abstractC0437s);
        m.a((M) tVar);
        m.a((com.google.firebase.auth.internal.R) tVar);
        M m2 = m;
        return a(b(m2), m2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> b(c.d.b.e eVar, AbstractC0437s abstractC0437s, com.google.firebase.auth.A a2, String str, com.google.firebase.auth.internal.t tVar) {
        O o = new O(a2, str);
        o.a(eVar);
        o.a(abstractC0437s);
        o.a((O) tVar);
        o.a((com.google.firebase.auth.internal.R) tVar);
        O o2 = o;
        return a(b(o2), o2);
    }

    public final c.d.a.b.h.h<com.google.firebase.auth.D> a(c.d.b.e eVar, String str, String str2) {
        C0383o c0383o = new C0383o(str, str2);
        c0383o.a(eVar);
        C0383o c0383o2 = c0383o;
        return a(a(c0383o2), c0383o2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, String str, C0354a c0354a, String str2) {
        c0354a.a(fb.PASSWORD_RESET);
        U u = new U(str, c0354a, str2, "sendPasswordResetEmail");
        u.a(eVar);
        U u2 = u;
        return a(b(u2), u2);
    }

    public final c.d.a.b.h.h<Void> b(c.d.b.e eVar, String str, C0354a c0354a, String str2) {
        c0354a.a(fb.EMAIL_SIGNIN);
        U u = new U(str, c0354a, str2, "sendSignInLinkToEmail");
        u.a(eVar);
        U u2 = u;
        return a(b(u2), u2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, C0354a c0354a, String str) {
        S s = new S(str, c0354a);
        s.a(eVar);
        S s2 = s;
        return a(b(s2), s2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, AbstractC0403c abstractC0403c, com.google.firebase.auth.internal.t tVar) {
        com.google.android.gms.common.internal.t.a(eVar);
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(tVar);
        List<String> listP = abstractC0437s.p();
        if (listP != null && listP.contains(abstractC0403c.o())) {
            return c.d.a.b.h.k.a((Exception) ya.a(new Status(17015)));
        }
        if (abstractC0403c instanceof C0405e) {
            C0405e c0405e = (C0405e) abstractC0403c;
            if (!c0405e.s()) {
                C0391s c0391s = new C0391s(c0405e);
                c0391s.a(eVar);
                c0391s.a(abstractC0437s);
                c0391s.a((C0391s) tVar);
                c0391s.a((com.google.firebase.auth.internal.R) tVar);
                C0391s c0391s2 = c0391s;
                return a(b(c0391s2), c0391s2);
            }
            C0400y c0400y = new C0400y(c0405e);
            c0400y.a(eVar);
            c0400y.a(abstractC0437s);
            c0400y.a((C0400y) tVar);
            c0400y.a((com.google.firebase.auth.internal.R) tVar);
            C0400y c0400y2 = c0400y;
            return a(b(c0400y2), c0400y2);
        }
        if (abstractC0403c instanceof com.google.firebase.auth.A) {
            C0398w c0398w = new C0398w((com.google.firebase.auth.A) abstractC0403c);
            c0398w.a(eVar);
            c0398w.a(abstractC0437s);
            c0398w.a((C0398w) tVar);
            c0398w.a((com.google.firebase.auth.internal.R) tVar);
            C0398w c0398w2 = c0398w;
            return a(b(c0398w2), c0398w2);
        }
        com.google.android.gms.common.internal.t.a(eVar);
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(tVar);
        C0395u c0395u = new C0395u(abstractC0403c);
        c0395u.a(eVar);
        c0395u.a(abstractC0437s);
        c0395u.a((C0395u) tVar);
        c0395u.a((com.google.firebase.auth.internal.R) tVar);
        C0395u c0395u2 = c0395u;
        return a(b(c0395u2), c0395u2);
    }

    public final c.d.a.b.h.h<InterfaceC0404d> d(c.d.b.e eVar, AbstractC0437s abstractC0437s, String str, com.google.firebase.auth.internal.t tVar) {
        com.google.android.gms.common.internal.t.a(eVar);
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(tVar);
        List<String> listP = abstractC0437s.p();
        if ((listP != null && !listP.contains(str)) || abstractC0437s.o()) {
            return c.d.a.b.h.k.a((Exception) ya.a(new Status(17016, str)));
        }
        char c2 = 65535;
        if (str.hashCode() == 1216985755 && str.equals("password")) {
            c2 = 0;
        }
        if (c2 == 0) {
            C0372ia c0372ia = new C0372ia();
            c0372ia.a(eVar);
            c0372ia.a(abstractC0437s);
            c0372ia.a((C0372ia) tVar);
            c0372ia.a((com.google.firebase.auth.internal.R) tVar);
            C0372ia c0372ia2 = c0372ia;
            return a(b(c0372ia2), c0372ia2);
        }
        C0376ka c0376ka = new C0376ka(str);
        c0376ka.a(eVar);
        c0376ka.a(abstractC0437s);
        c0376ka.a((C0376ka) tVar);
        c0376ka.a((com.google.firebase.auth.internal.R) tVar);
        C0376ka c0376ka2 = c0376ka;
        return a(b(c0376ka2), c0376ka2);
    }

    public final c.d.a.b.h.h<Void> a(c.d.b.e eVar, AbstractC0437s abstractC0437s, com.google.firebase.auth.internal.t tVar) {
        Q q = new Q();
        q.a(eVar);
        q.a(abstractC0437s);
        q.a((Q) tVar);
        q.a((com.google.firebase.auth.internal.R) tVar);
        Q q2 = q;
        return a(a(q2), q2);
    }

    public final c.d.a.b.h.h<Void> a(AbstractC0437s abstractC0437s, InterfaceC0413d interfaceC0413d) {
        C0379m c0379m = new C0379m();
        c0379m.a(abstractC0437s);
        c0379m.a((C0379m) interfaceC0413d);
        c0379m.a((com.google.firebase.auth.internal.R) interfaceC0413d);
        C0379m c0379m2 = c0379m;
        return a(b(c0379m2), c0379m2);
    }

    static com.google.firebase.auth.internal.E a(c.d.b.e eVar, c.d.a.b.e.c.Ma ma) {
        com.google.android.gms.common.internal.t.a(eVar);
        com.google.android.gms.common.internal.t.a(ma);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.auth.internal.A(ma, "firebase"));
        List<c.d.a.b.e.c.Ra> listQ = ma.q();
        if (listQ != null && !listQ.isEmpty()) {
            for (int i2 = 0; i2 < listQ.size(); i2++) {
                arrayList.add(new com.google.firebase.auth.internal.A(listQ.get(i2)));
            }
        }
        com.google.firebase.auth.internal.E e2 = new com.google.firebase.auth.internal.E(eVar, arrayList);
        e2.a(new com.google.firebase.auth.internal.G(ma.c(), ma.b()));
        e2.b(ma.e());
        e2.a(ma.r());
        e2.b(AbstractC0421l.a(ma.s()));
        return e2;
    }

    private final <ResultT> c.d.a.b.h.h<ResultT> a(c.d.a.b.h.h<ResultT> hVar, InterfaceC0367g<xa, ResultT> interfaceC0367g) {
        return (c.d.a.b.h.h<ResultT>) hVar.a(new C0369h(this, interfaceC0367g));
    }
}

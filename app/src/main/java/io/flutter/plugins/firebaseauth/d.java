package io.flutter.plugins.firebaseauth;

import android.net.Uri;
import android.util.SparseArray;
import c.d.a.b.h.InterfaceC0229c;
import c.d.a.b.h.h;
import c.d.b.e;
import c.d.b.f;
import c.d.b.k;
import com.google.firebase.auth.A;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.B;
import com.google.firebase.auth.C0354a;
import com.google.firebase.auth.C0429k;
import com.google.firebase.auth.C0430l;
import com.google.firebase.auth.D;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.G;
import com.google.firebase.auth.H;
import com.google.firebase.auth.InterfaceC0402b;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.InterfaceC0438t;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final q.d f6195a;

    /* renamed from: d, reason: collision with root package name */
    private final o f6198d;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<FirebaseAuth.a> f6196b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<B.a> f6197c = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private int f6199e = 0;

    public static void a(q.d dVar) {
        o oVar = new o(dVar.f(), "plugins.flutter.io/firebase_auth");
        oVar.a(new d(dVar, oVar));
    }

    private d(q.d dVar, o oVar) {
        this.f6195a = dVar;
        this.f6198d = oVar;
        e.b(dVar.b());
    }

    private FirebaseAuth a(m mVar) {
        return FirebaseAuth.getInstance(e.a((String) ((Map) mVar.a()).get("app")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r3, f.a.a.a.o.d r4) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebaseauth.d.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private void a(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Map map = (Map) mVar.a();
        firebaseAuth.a(B.a((String) map.get("verificationId"), (String) map.get("smsCode"))).a(new b(dVar));
    }

    private void b(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Map map = (Map) mVar.a();
        int iIntValue = ((Integer) map.get("handle")).intValue();
        String str = (String) map.get("phoneNumber");
        int iIntValue2 = ((Integer) map.get("timeout")).intValue();
        io.flutter.plugins.firebaseauth.a aVar = new io.flutter.plugins.firebaseauth.a(this, iIntValue);
        if (mVar.a("forceResendingToken") != null) {
            B.a().a(str, iIntValue2, TimeUnit.MILLISECONDS, this.f6195a.d(), aVar, this.f6197c.get(((Integer) map.get("forceResendingToken")).intValue()));
        } else {
            B.a().a(str, iIntValue2, TimeUnit.MILLISECONDS, this.f6195a.d(), aVar);
        }
        dVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(f fVar) {
        String str = "verifyPhoneNumberError";
        if (fVar instanceof C0430l) {
            str = "invalidCredential";
        } else if (fVar instanceof C0429k) {
            str = "firebaseAuth";
        } else if (fVar instanceof k) {
            str = "quotaExceeded";
        } else if (fVar instanceof c.d.b.b) {
            str = "apiNotAvailable";
        }
        HashMap map = new HashMap();
        map.put("code", str);
        map.put("message", fVar.getMessage());
        return map;
    }

    private void c(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.c(a((Map<String, Object>) mVar.f5664b)).a(new b(dVar));
        }
    }

    private void d(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            dVar.a(null);
        } else {
            dVar.a(a(abstractC0437sA));
        }
    }

    private void e(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.d().a(new b(dVar));
    }

    private void f(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Map map = (Map) mVar.a();
        firebaseAuth.b((String) map.get("email"), (String) map.get("password")).a(new b(dVar));
    }

    private void g(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.b((String) ((Map) mVar.a()).get("email")).a(new a(dVar));
    }

    private void h(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.c((String) ((Map) mVar.a()).get("email")).a(new c(dVar));
    }

    private void i(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Map map = (Map) mVar.a();
        String string = map.get("email").toString();
        C0354a.C0066a c0066aP = C0354a.p();
        c0066aP.a(map.get("url").toString());
        c0066aP.a(((Boolean) map.get("handleCodeInApp")).booleanValue());
        c0066aP.b(map.get("iOSBundleID").toString());
        c0066aP.a(map.get("androidPackageName").toString(), ((Boolean) map.get("androidInstallIfNotAvailable")).booleanValue(), map.get("androidMinimumVersion").toString());
        firebaseAuth.b(string, c0066aP.a()).a(new c(dVar));
    }

    private void j(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        dVar.a(Boolean.valueOf(firebaseAuth.d((String) ((Map) mVar.a()).get("link"))));
    }

    private void k(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Map map = (Map) mVar.a();
        firebaseAuth.a((String) map.get("email"), (String) map.get("link")).a(new b(dVar));
    }

    private void l(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.w().a(new c(dVar));
        }
    }

    private void m(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.u().a(new c(dVar));
        }
    }

    private void n(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.v().a(new c(dVar));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.firebase.auth.AbstractC0403c a(java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebaseauth.d.a(java.util.Map):com.google.firebase.auth.c");
    }

    private void o(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.a(a((Map<String, Object>) mVar.a())).a(new b(dVar));
    }

    private void p(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.a(a((Map<String, Object>) mVar.a())).a(new c(dVar));
        }
    }

    private void q(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.a((String) ((Map) mVar.a()).get("provider")).a(new b(dVar));
        }
    }

    private void r(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.a((String) ((Map) mVar.a()).get("token")).a(new b(dVar));
    }

    private void s(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.e();
        dVar.a(null);
    }

    private void t(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.a(((Boolean) ((Map) mVar.a()).get("refresh")).booleanValue()).a(new io.flutter.plugins.firebaseauth.b(this, dVar));
        }
    }

    private void u(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.b((String) ((Map) mVar.a()).get("email")).a(new c(dVar));
        }
    }

    private void v(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.a().a((A) a((Map<String, Object>) mVar.f5664b)).a(new c(dVar));
    }

    private void w(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
        } else {
            abstractC0437sA.c((String) ((Map) mVar.a()).get("password")).a(new c(dVar));
        }
    }

    private void x(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        AbstractC0437s abstractC0437sA = firebaseAuth.a();
        if (abstractC0437sA == null) {
            a(dVar);
            return;
        }
        Map map = (Map) mVar.a();
        H.a aVar = new H.a();
        if (map.containsKey("displayName")) {
            aVar.a((String) map.get("displayName"));
        }
        if (map.containsKey("photoUrl")) {
            aVar.a(Uri.parse((String) map.get("photoUrl")));
        }
        abstractC0437sA.a(aVar.a()).a(new c(dVar));
    }

    private void y(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        int i2 = this.f6199e;
        this.f6199e = i2 + 1;
        io.flutter.plugins.firebaseauth.c cVar = new io.flutter.plugins.firebaseauth.c(this, i2);
        firebaseAuth.a(cVar);
        this.f6196b.append(i2, cVar);
        dVar.a(Integer.valueOf(i2));
    }

    private void z(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        Integer num = (Integer) ((Map) mVar.a()).get("id");
        FirebaseAuth.a aVar = this.f6196b.get(num.intValue());
        if (aVar != null) {
            firebaseAuth.b(aVar);
            this.f6196b.remove(num.intValue());
            dVar.a(null);
            return;
        }
        a(dVar, new C0429k("ERROR_LISTENER_NOT_FOUND", String.format(Locale.US, "Listener with identifier '%d' not found.", num)));
    }

    private void A(m mVar, o.d dVar, FirebaseAuth firebaseAuth) {
        firebaseAuth.e((String) ((Map) mVar.a()).get("language"));
        dVar.a(null);
    }

    private class b implements InterfaceC0229c<InterfaceC0404d> {

        /* renamed from: a, reason: collision with root package name */
        private final o.d f6202a;

        b(o.d dVar) {
            this.f6202a = dVar;
        }

        @Override // c.d.a.b.h.InterfaceC0229c
        public void a(h<InterfaceC0404d> hVar) {
            if (!hVar.b() || hVar.d() == null) {
                d.this.a(this.f6202a, hVar.e());
                return;
            }
            InterfaceC0404d interfaceC0404dD = hVar.d();
            AbstractC0437s user = interfaceC0404dD.getUser();
            InterfaceC0402b interfaceC0402bD = interfaceC0404dD.d();
            Map mapA = d.this.a(user);
            Map mapA2 = d.this.a(interfaceC0402bD);
            HashMap map = new HashMap();
            map.put("user", mapA);
            map.put("additionalUserInfo", mapA2);
            this.f6202a.a(Collections.unmodifiableMap(map));
        }
    }

    private class c implements InterfaceC0229c<Void> {

        /* renamed from: a, reason: collision with root package name */
        private final o.d f6204a;

        c(o.d dVar) {
            this.f6204a = dVar;
        }

        @Override // c.d.a.b.h.InterfaceC0229c
        public void a(h<Void> hVar) {
            if (!hVar.b()) {
                d.this.a(this.f6204a, hVar.e());
            } else {
                this.f6204a.a(null);
            }
        }
    }

    private class a implements InterfaceC0229c<D> {

        /* renamed from: a, reason: collision with root package name */
        private final o.d f6200a;

        a(o.d dVar) {
            this.f6200a = dVar;
        }

        @Override // c.d.a.b.h.InterfaceC0229c
        public void a(h<D> hVar) {
            if (!hVar.b() || hVar.d() == null) {
                d.this.a(this.f6200a, hVar.e());
            } else {
                this.f6200a.a(hVar.d().a());
            }
        }
    }

    private Map<String, Object> a(G g2) {
        HashMap map = new HashMap();
        map.put("providerId", g2.a());
        map.put("uid", g2.i());
        if (g2.l() != null) {
            map.put("displayName", g2.l());
        }
        if (g2.h() != null) {
            map.put("photoUrl", g2.h().toString());
        }
        if (g2.n() != null) {
            map.put("email", g2.n());
        }
        if (g2.k() != null) {
            map.put("phoneNumber", g2.k());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(AbstractC0437s abstractC0437s) {
        if (abstractC0437s == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends G> it = abstractC0437s.q().iterator();
        while (it.hasNext()) {
            arrayList.add(Collections.unmodifiableMap(a(it.next())));
        }
        Map<String, Object> mapA = a((G) abstractC0437s);
        InterfaceC0438t interfaceC0438tA = abstractC0437s.A();
        if (interfaceC0438tA != null) {
            mapA.put("creationTimestamp", Long.valueOf(interfaceC0438tA.b()));
            mapA.put("lastSignInTimestamp", Long.valueOf(interfaceC0438tA.c()));
        }
        mapA.put("isAnonymous", Boolean.valueOf(abstractC0437s.o()));
        mapA.put("isEmailVerified", Boolean.valueOf(abstractC0437s.j()));
        mapA.put("providerData", Collections.unmodifiableList(arrayList));
        return Collections.unmodifiableMap(mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(InterfaceC0402b interfaceC0402b) {
        if (interfaceC0402b == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("profile", interfaceC0402b.getProfile());
        map.put("providerId", interfaceC0402b.a());
        map.put("username", interfaceC0402b.getUsername());
        map.put("isNewUser", Boolean.valueOf(interfaceC0402b.e()));
        return Collections.unmodifiableMap(map);
    }

    private void a(o.d dVar) {
        dVar.a("USER_REQUIRED", "Please authenticate with Firebase first", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o.d dVar, Exception exc) {
        if (exc != null) {
            if (exc instanceof C0429k) {
                dVar.a(((C0429k) exc).a(), exc.getMessage(), null);
                return;
            }
            if (exc instanceof c.d.b.b) {
                dVar.a("ERROR_API_NOT_AVAILABLE", exc.getMessage(), null);
                return;
            }
            if (exc instanceof k) {
                dVar.a("ERROR_TOO_MANY_REQUESTS", exc.getMessage(), null);
                return;
            } else if (exc instanceof c.d.b.h) {
                dVar.a("ERROR_NETWORK_REQUEST_FAILED", exc.getMessage(), null);
                return;
            } else {
                dVar.a(exc.getClass().getSimpleName(), exc.getMessage(), null);
                return;
            }
        }
        dVar.a("ERROR_UNKNOWN", "An unknown error occurred.", null);
    }
}

package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.b.e f5503a;

    /* renamed from: b, reason: collision with root package name */
    private final C0455k f5504b;

    /* renamed from: c, reason: collision with root package name */
    private final C0461q f5505c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f5506d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.b.e.g f5507e;

    Q(c.d.b.e eVar, C0455k c0455k, Executor executor, c.d.b.e.g gVar) {
        this(eVar, c0455k, executor, new C0461q(eVar.c(), c0455k), gVar);
    }

    private Q(c.d.b.e eVar, C0455k c0455k, Executor executor, C0461q c0461q, c.d.b.e.g gVar) {
        this.f5503a = eVar;
        this.f5504b = c0455k;
        this.f5505c = c0461q;
        this.f5506d = executor;
        this.f5507e = gVar;
    }

    public final c.d.a.b.h.h<String> a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    public final c.d.a.b.h.h<Void> a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return a(b(a(str, "*", "*", bundle)));
    }

    public final c.d.a.b.h.h<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf("/topics/");
        String strValueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        String strValueOf3 = String.valueOf("/topics/");
        String strValueOf4 = String.valueOf(str3);
        return a(b(a(str, str2, strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), bundle)));
    }

    public final c.d.a.b.h.h<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf("/topics/");
        String strValueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        bundle.putString("delete", "1");
        String strValueOf3 = String.valueOf("/topics/");
        String strValueOf4 = String.valueOf(str3);
        return a(b(a(str, str2, strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), bundle)));
    }

    private final c.d.a.b.h.h<Bundle> a(String str, String str2, String str3, final Bundle bundle) throws IOException {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f5503a.e().b());
        bundle.putString("gmsv", Integer.toString(this.f5504b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f5504b.b());
        bundle.putString("app_ver_name", this.f5504b.c());
        String strA = com.google.android.gms.common.internal.r.a().a("firebase-iid");
        if ("UNKNOWN".equals(strA)) {
            int i2 = c.d.a.b.b.e.f3751a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i2);
            strA = sb.toString();
        }
        String strValueOf = String.valueOf(strA);
        bundle.putString("cliv", strValueOf.length() != 0 ? "fiid-".concat(strValueOf) : new String("fiid-"));
        bundle.putString("Firebase-Client", this.f5507e.a());
        final c.d.a.b.h.i iVar = new c.d.a.b.h.i();
        this.f5506d.execute(new Runnable(this, bundle, iVar) { // from class: com.google.firebase.iid.S

            /* renamed from: a, reason: collision with root package name */
            private final Q f5509a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f5510b;

            /* renamed from: c, reason: collision with root package name */
            private final c.d.a.b.h.i f5511c;

            {
                this.f5509a = this;
                this.f5510b = bundle;
                this.f5511c = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5509a.a(this.f5510b, this.f5511c);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final <T> c.d.a.b.h.h<Void> a(c.d.a.b.h.h<T> hVar) {
        return hVar.a(AbstractC0446b.a(), new R(this));
    }

    private final c.d.a.b.h.h<String> b(c.d.a.b.h.h<Bundle> hVar) {
        return hVar.a(this.f5506d, new U(this));
    }

    final /* synthetic */ void a(Bundle bundle, c.d.a.b.h.i iVar) {
        try {
            iVar.a((c.d.a.b.h.i) this.f5505c.a(bundle));
        } catch (IOException e2) {
            iVar.a((Exception) e2);
        }
    }
}

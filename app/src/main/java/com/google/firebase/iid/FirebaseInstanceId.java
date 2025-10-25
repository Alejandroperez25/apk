package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import c.d.a.b.h.InterfaceC0227a;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5466a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b, reason: collision with root package name */
    private static C0466v f5467b;

    /* renamed from: c, reason: collision with root package name */
    private static ScheduledExecutorService f5468c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f5469d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.b.e f5470e;

    /* renamed from: f, reason: collision with root package name */
    private final C0455k f5471f;

    /* renamed from: g, reason: collision with root package name */
    private final Q f5472g;

    /* renamed from: h, reason: collision with root package name */
    private final C0460p f5473h;

    /* renamed from: i, reason: collision with root package name */
    private final C0470z f5474i;
    private boolean j;
    private final a k;

    public static FirebaseInstanceId a() {
        return getInstance(c.d.b.e.a());
    }

    @Keep
    public static FirebaseInstanceId getInstance(c.d.b.e eVar) {
        return (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5475a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.b.b.d f5476b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5477c;

        /* renamed from: d, reason: collision with root package name */
        private c.d.b.b.b<c.d.b.a> f5478d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5479e;

        a(c.d.b.b.d dVar) {
            this.f5476b = dVar;
        }

        private final synchronized void b() {
            if (this.f5477c) {
                return;
            }
            this.f5475a = d();
            this.f5479e = c();
            if (this.f5479e == null && this.f5475a) {
                this.f5478d = new c.d.b.b.b(this) { // from class: com.google.firebase.iid.P

                    /* renamed from: a, reason: collision with root package name */
                    private final FirebaseInstanceId.a f5502a;

                    {
                        this.f5502a = this;
                    }

                    @Override // c.d.b.b.b
                    public final void a(c.d.b.b.a aVar) {
                        FirebaseInstanceId.a aVar2 = this.f5502a;
                        synchronized (aVar2) {
                            if (aVar2.a()) {
                                FirebaseInstanceId.this.m();
                            }
                        }
                    }
                };
                this.f5476b.a(c.d.b.a.class, this.f5478d);
            }
            this.f5477c = true;
        }

        final synchronized boolean a() {
            b();
            if (this.f5479e != null) {
                return this.f5479e.booleanValue();
            }
            return this.f5475a && FirebaseInstanceId.this.f5470e.f();
        }

        final synchronized void a(boolean z) {
            b();
            if (this.f5478d != null) {
                this.f5476b.b(c.d.b.a.class, this.f5478d);
                this.f5478d = null;
            }
            SharedPreferences.Editor editorEdit = FirebaseInstanceId.this.f5470e.c().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", z);
            editorEdit.apply();
            if (z) {
                FirebaseInstanceId.this.m();
            }
            this.f5479e = Boolean.valueOf(z);
        }

        private final Boolean c() {
            ApplicationInfo applicationInfo;
            Context contextC = FirebaseInstanceId.this.f5470e.c();
            SharedPreferences sharedPreferences = contextC.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextC.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextC.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean d() throws ClassNotFoundException {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context contextC = FirebaseInstanceId.this.f5470e.c();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(contextC.getPackageName());
                ResolveInfo resolveInfoResolveService = contextC.getPackageManager().resolveService(intent, 0);
                return (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
            }
        }
    }

    FirebaseInstanceId(c.d.b.e eVar, c.d.b.b.d dVar, c.d.b.e.g gVar) {
        this(eVar, new C0455k(eVar.c()), AbstractC0446b.b(), AbstractC0446b.b(), dVar, gVar);
    }

    private FirebaseInstanceId(c.d.b.e eVar, C0455k c0455k, Executor executor, Executor executor2, c.d.b.b.d dVar, c.d.b.e.g gVar) {
        this.j = false;
        if (C0455k.a(eVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f5467b == null) {
                f5467b = new C0466v(eVar.c());
            }
        }
        this.f5470e = eVar;
        this.f5471f = c0455k;
        this.f5472g = new Q(eVar, c0455k, executor, gVar);
        this.f5469d = executor2;
        this.f5474i = new C0470z(f5467b);
        this.k = new a(dVar);
        this.f5473h = new C0460p(executor);
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.M

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f5493a;

            {
                this.f5493a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5493a.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (a(f()) || this.f5474i.a()) {
            n();
        }
    }

    final c.d.b.e c() {
        return this.f5470e;
    }

    final synchronized void a(boolean z) {
        this.j = z;
    }

    private final synchronized void n() {
        if (!this.j) {
            a(0L);
        }
    }

    final synchronized void a(long j) {
        a(new RunnableC0468x(this, this.f5471f, this.f5474i, Math.min(Math.max(30L, j << 1), f5466a)), j);
        this.j = true;
    }

    static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f5468c == null) {
                f5468c = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.a("FirebaseInstanceId"));
            }
            f5468c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private static String o() {
        return f5467b.b("").a();
    }

    public c.d.a.b.h.h<InterfaceC0445a> d() {
        return b(C0455k.a(this.f5470e), "*");
    }

    private final c.d.a.b.h.h<InterfaceC0445a> b(final String str, String str2) {
        final String strD = d(str2);
        return c.d.a.b.h.k.a((Object) null).b(this.f5469d, new InterfaceC0227a(this, str, strD) { // from class: com.google.firebase.iid.L

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f5490a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5491b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5492c;

            {
                this.f5490a = this;
                this.f5491b = str;
                this.f5492c = strD;
            }

            @Override // c.d.a.b.h.InterfaceC0227a
            public final Object a(c.d.a.b.h.h hVar) {
                return this.f5490a.a(this.f5491b, this.f5492c, hVar);
            }
        });
    }

    public void e() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        a(this.f5472g.a(o()));
        h();
    }

    public String a(String str, String str2) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((InterfaceC0445a) a(b(str, str2))).a();
    }

    final C0465u f() {
        return c(C0455k.a(this.f5470e), "*");
    }

    private static C0465u c(String str, String str2) {
        return f5467b.a("", str, str2);
    }

    final String g() {
        return a(C0455k.a(this.f5470e), "*");
    }

    private final <T> T a(c.d.a.b.h.h<T> hVar) throws IOException {
        try {
            return (T) c.d.a.b.h.k.a(hVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    public final synchronized c.d.a.b.h.h<Void> a(String str) {
        c.d.a.b.h.h<Void> hVarA;
        hVarA = this.f5474i.a(str);
        n();
        return hVarA;
    }

    final void b(String str) throws IOException {
        C0465u c0465uF = f();
        if (a(c0465uF)) {
            throw new IOException("token not available");
        }
        a(this.f5472g.b(o(), c0465uF.f5571b, str));
    }

    final void c(String str) throws IOException {
        C0465u c0465uF = f();
        if (a(c0465uF)) {
            throw new IOException("token not available");
        }
        a(this.f5472g.c(o(), c0465uF.f5571b, str));
    }

    static boolean b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    final synchronized void h() {
        f5467b.b();
        if (this.k.a()) {
            n();
        }
    }

    final boolean i() {
        return this.f5471f.a() != 0;
    }

    final void j() {
        f5467b.c("");
        n();
    }

    public final boolean k() {
        return this.k.a();
    }

    public final void b(boolean z) {
        this.k.a(z);
    }

    private static String d(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    final boolean a(C0465u c0465u) {
        return c0465u == null || c0465u.b(this.f5471f.b());
    }

    final /* synthetic */ c.d.a.b.h.h a(final String str, final String str2, c.d.a.b.h.h hVar) {
        final String strO = o();
        C0465u c0465uC = c(str, str2);
        if (!a(c0465uC)) {
            return c.d.a.b.h.k.a(new Z(strO, c0465uC.f5571b));
        }
        return this.f5473h.a(str, str2, new InterfaceC0462r(this, strO, str, str2) { // from class: com.google.firebase.iid.O

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f5498a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5499b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5500c;

            /* renamed from: d, reason: collision with root package name */
            private final String f5501d;

            {
                this.f5498a = this;
                this.f5499b = strO;
                this.f5500c = str;
                this.f5501d = str2;
            }

            @Override // com.google.firebase.iid.InterfaceC0462r
            public final c.d.a.b.h.h a() {
                return this.f5498a.a(this.f5499b, this.f5500c, this.f5501d);
            }
        });
    }

    final /* synthetic */ c.d.a.b.h.h a(final String str, final String str2, final String str3) {
        return this.f5472g.a(str, str2, str3).a(this.f5469d, new c.d.a.b.h.g(this, str2, str3, str) { // from class: com.google.firebase.iid.N

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f5494a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5495b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5496c;

            /* renamed from: d, reason: collision with root package name */
            private final String f5497d;

            {
                this.f5494a = this;
                this.f5495b = str2;
                this.f5496c = str3;
                this.f5497d = str;
            }

            @Override // c.d.a.b.h.g
            public final c.d.a.b.h.h a(Object obj) {
                return this.f5494a.a(this.f5495b, this.f5496c, this.f5497d, (String) obj);
            }
        });
    }

    final /* synthetic */ c.d.a.b.h.h a(String str, String str2, String str3, String str4) {
        f5467b.a("", str, str2, str4, this.f5471f.b());
        return c.d.a.b.h.k.a(new Z(str3, str4));
    }

    final /* synthetic */ void l() {
        if (this.k.a()) {
            m();
        }
    }
}

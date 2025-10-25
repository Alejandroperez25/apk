package c.d.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.t;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.components.n;
import com.google.firebase.components.v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4069a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f4070b = new c();

    /* renamed from: c, reason: collision with root package name */
    static final Map<String, e> f4071c = new b.c.b();

    /* renamed from: d, reason: collision with root package name */
    private final Context f4072d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4073e;

    /* renamed from: f, reason: collision with root package name */
    private final j f4074f;

    /* renamed from: g, reason: collision with root package name */
    private final n f4075g;
    private final v<c.d.b.d.a> j;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f4076h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f4077i = new AtomicBoolean();
    private final List<a> k = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> l = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    public Context c() {
        i();
        return this.f4072d;
    }

    public String d() {
        i();
        return this.f4073e;
    }

    public j e() {
        i();
        return this.f4074f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4073e.equals(((e) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return this.f4073e.hashCode();
    }

    public String toString() {
        s.a aVarA = s.a(this);
        aVarA.a("name", this.f4073e);
        aVarA.a("options", this.f4074f);
        return aVarA.toString();
    }

    public static List<e> a(Context context) {
        ArrayList arrayList;
        synchronized (f4069a) {
            arrayList = new ArrayList(f4071c.values());
        }
        return arrayList;
    }

    public static e a() {
        e eVar;
        synchronized (f4069a) {
            eVar = f4071c.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.j.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e a(String str) {
        e eVar;
        String str2;
        synchronized (f4069a) {
            eVar = f4071c.get(b(str));
            if (eVar == null) {
                List<String> listJ = j();
                if (listJ.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", listJ);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return eVar;
    }

    public static e b(Context context) {
        synchronized (f4069a) {
            if (f4071c.containsKey("[DEFAULT]")) {
                return a();
            }
            j jVarA = j.a(context);
            if (jVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return a(context, jVarA);
        }
    }

    public static e a(Context context, j jVar) {
        return a(context, jVar, "[DEFAULT]");
    }

    public static e a(Context context, j jVar, String str) {
        e eVar;
        b.b(context);
        String strB = b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4069a) {
            t.a(!f4071c.containsKey(strB), "FirebaseApp name " + strB + " already exists!");
            t.a(context, "Application context cannot be null.");
            eVar = new e(context, strB, jVar);
            f4071c.put(strB, eVar);
        }
        eVar.k();
        return eVar;
    }

    public <T> T a(Class<T> cls) {
        i();
        return (T) this.f4075g.a(cls);
    }

    public boolean f() {
        i();
        return this.j.get().a();
    }

    protected e(Context context, String str, j jVar) {
        t.a(context);
        this.f4072d = context;
        t.a(str);
        this.f4073e = str;
        t.a(jVar);
        this.f4074f = jVar;
        this.f4075g = new n(f4070b, com.google.firebase.components.h.a(context).a(), com.google.firebase.components.e.a(context, Context.class, new Class[0]), com.google.firebase.components.e.a(this, e.class, new Class[0]), com.google.firebase.components.e.a(jVar, j.class, new Class[0]), c.d.b.e.f.a("fire-android", ""), c.d.b.e.f.a("fire-core", "19.0.0"), c.d.b.e.c.b());
        this.j = new v<>(c.d.b.c.a(this, context));
    }

    static /* synthetic */ c.d.b.d.a a(e eVar, Context context) {
        return new c.d.b.d.a(context, eVar.h(), (c.d.b.b.c) eVar.f4075g.a(c.d.b.b.c.class));
    }

    private void i() {
        t.a(!this.f4077i.get(), "FirebaseApp was deleted");
    }

    public boolean g() {
        return "[DEFAULT]".equals(d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public String h() {
        return com.google.android.gms.common.util.b.b(d().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.b.b(e().b().getBytes(Charset.defaultCharset()));
    }

    private static List<String> j() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4069a) {
            Iterator<e> it = f4071c.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!(!b.d.c.a.a(this.f4072d))) {
            this.f4075g.a(g());
        } else {
            d.b(this.f4072d);
        }
    }

    private static String b(String str) {
        return str.trim();
    }

    @TargetApi(24)
    private static class d extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<d> f4087a = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        private final Context f4088b;

        public d(Context context) {
            this.f4088b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f4087a.get() == null) {
                d dVar = new d(context);
                if (f4087a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f4069a) {
                Iterator<e> it = e.f4071c.values().iterator();
                while (it.hasNext()) {
                    it.next().k();
                }
            }
            a();
        }

        public void a() {
            this.f4088b.unregisterReceiver(this);
        }
    }

    @TargetApi(14)
    private static class b implements ComponentCallbacks2C0322b.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f4081a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (com.google.android.gms.common.util.i.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4081a.get() == null) {
                    b bVar = new b();
                    if (f4081a.compareAndSet(null, bVar)) {
                        ComponentCallbacks2C0322b.a(application);
                        ComponentCallbacks2C0322b.a().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b.a
        public void a(boolean z) {
            synchronized (e.f4069a) {
                Iterator it = new ArrayList(e.f4071c.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f4076h.get()) {
                        eVar.a(z);
                    }
                }
            }
        }
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private static final Handler f4084a = new Handler(Looper.getMainLooper());

        private c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f4084a.post(runnable);
        }
    }
}

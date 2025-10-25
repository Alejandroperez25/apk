package c.a.a;

import android.content.Intent;
import android.net.Uri;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import g.b.a.b;
import g.b.a.c;

/* loaded from: classes.dex */
public final class a implements o.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0024a f1286a = new C0024a(null);

    /* renamed from: b, reason: collision with root package name */
    private q.d f1287b;

    public static final void a(q.d dVar) {
        f1286a.a(dVar);
    }

    private final void a(String str) {
        try {
            this.f1287b.d().startActivity(new Intent(str));
        } catch (Exception unused) {
            a();
        }
    }

    private final void a() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.f1287b.d().getPackageName(), null));
        this.f1287b.d().startActivity(intent);
    }

    public a(q.d dVar) {
        c.b(dVar, "registrar");
        this.f1287b = dVar;
    }

    /* renamed from: c.a.a.a$a, reason: collision with other inner class name */
    public static final class C0024a {
        private C0024a() {
        }

        public /* synthetic */ C0024a(b bVar) {
            this();
        }

        public final void a(q.d dVar) {
            c.b(dVar, "registrar");
            new o(dVar.f(), "app_settings").a(new a(dVar));
        }
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        c.b(mVar, "call");
        c.b(dVar, "result");
        if (c.a((Object) mVar.f5663a, (Object) "wifi")) {
            a("android.settings.WIFI_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "location")) {
            a("android.settings.LOCATION_SOURCE_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "security")) {
            a("android.settings.SECURITY_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "bluetooth")) {
            a("android.settings.BLUETOOTH_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "data_roaming")) {
            a("android.settings.DATA_ROAMING_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "date")) {
            a("android.settings.DATE_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "display")) {
            a("android.settings.DISPLAY_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "notification")) {
            a("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            return;
        }
        if (c.a((Object) mVar.f5663a, (Object) "sound")) {
            a("android.settings.SOUND_SETTINGS");
        } else if (c.a((Object) mVar.f5663a, (Object) "internal_storage")) {
            a("android.settings.INTERNAL_STORAGE_SETTINGS");
        } else if (c.a((Object) mVar.f5663a, (Object) "app_settings")) {
            a();
        }
    }
}

package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static aa f5518a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5519b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5520c;

    /* renamed from: d, reason: collision with root package name */
    private ba f5521d = new ba(this);

    /* renamed from: e, reason: collision with root package name */
    private int f5522e = 1;

    public static synchronized aa a(Context context) {
        if (f5518a == null) {
            f5518a = new aa(context, c.d.a.b.e.d.a.a().a(1, new com.google.android.gms.common.util.a.a("MessengerIpcClient"), c.d.a.b.e.d.f.f3956a));
        }
        return f5518a;
    }

    private aa(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5520c = scheduledExecutorService;
        this.f5519b = context.getApplicationContext();
    }

    public final c.d.a.b.h.h<Void> a(int i2, Bundle bundle) {
        return a(new C0451g(a(), 2, bundle));
    }

    public final c.d.a.b.h.h<Bundle> b(int i2, Bundle bundle) {
        return a(new C0456l(a(), 1, bundle));
    }

    private final synchronized <T> c.d.a.b.h.h<T> a(AbstractC0454j<T> abstractC0454j) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(abstractC0454j);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f5521d.a((AbstractC0454j<?>) abstractC0454j)) {
            this.f5521d = new ba(this);
            this.f5521d.a((AbstractC0454j<?>) abstractC0454j);
        }
        return abstractC0454j.f5542b.a();
    }

    private final synchronized int a() {
        int i2;
        i2 = this.f5522e;
        this.f5522e = i2 + 1;
        return i2;
    }
}

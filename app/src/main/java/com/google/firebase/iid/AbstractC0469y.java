package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0469y {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5583a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5584b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c.d.a.b.g.a f5585c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f5584b) {
            if (f5585c == null) {
                c.d.a.b.g.a aVar = new c.d.a.b.g.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f5585c = aVar;
                aVar.a(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            a(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f5585c.a(f5583a);
            }
            return componentNameStartService;
        }
    }

    private static void a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static void a(Intent intent) {
        synchronized (f5584b) {
            if (f5585c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                a(intent, false);
                f5585c.a();
            }
        }
    }
}

package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f5089b;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f5091d = Collections.EMPTY_LIST;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f5092e = Collections.EMPTY_LIST;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f5093f = Collections.EMPTY_LIST;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f5094g = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5088a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5090c = false;

    public static a a() {
        if (f5089b == null) {
            synchronized (f5088a) {
                if (f5089b == null) {
                    f5089b = new a();
                }
            }
        }
        return f5089b;
    }

    private a() {
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : com.google.android.gms.common.util.c.a(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        return context.bindService(intent, serviceConnection, i2);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i2);
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}

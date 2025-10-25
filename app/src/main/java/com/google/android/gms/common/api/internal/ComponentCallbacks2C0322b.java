package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0322b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ComponentCallbacks2C0322b f4915a = new ComponentCallbacks2C0322b();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f4916b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4917c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f4918d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f4919e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface a {
        void a(boolean z);
    }

    private ComponentCallbacks2C0322b() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static ComponentCallbacks2C0322b a() {
        return f4915a;
    }

    public static void a(Application application) {
        synchronized (f4915a) {
            if (!f4915a.f4919e) {
                application.registerActivityLifecycleCallbacks(f4915a);
                application.registerComponentCallbacks(f4915a);
                f4915a.f4919e = true;
            }
        }
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f4917c.get()) {
            if (!com.google.android.gms.common.util.i.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4917c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4916b.set(true);
            }
        }
        return b();
    }

    public final boolean b() {
        return this.f4916b.get();
    }

    public final void a(a aVar) {
        synchronized (f4915a) {
            this.f4918d.add(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f4916b.compareAndSet(true, false);
        this.f4917c.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f4916b.compareAndSet(true, false);
        this.f4917c.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f4916b.compareAndSet(false, true)) {
            this.f4917c.set(true);
            b(true);
        }
    }

    private final void b(boolean z) {
        synchronized (f4915a) {
            ArrayList<a> arrayList = this.f4918d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }
}

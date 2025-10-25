package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0109j;
import androidx.fragment.app.ComponentCallbacksC0108i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class T extends ComponentCallbacksC0108i implements InterfaceC0325e {
    private static WeakHashMap<ActivityC0109j, WeakReference<T>> Y = new WeakHashMap<>();
    private Map<String, LifecycleCallback> Z = new b.c.b();
    private int aa = 0;
    private Bundle ba;

    public static T a(ActivityC0109j activityC0109j) {
        T t;
        WeakReference<T> weakReference = Y.get(activityC0109j);
        if (weakReference != null && (t = weakReference.get()) != null) {
            return t;
        }
        try {
            T t2 = (T) activityC0109j.h().a("SupportLifecycleFragmentImpl");
            if (t2 == null || t2.r()) {
                t2 = new T();
                androidx.fragment.app.D dA = activityC0109j.h().a();
                dA.a(t2, "SupportLifecycleFragmentImpl");
                dA.b();
            }
            Y.put(activityC0109j, new WeakReference<>(t2));
            return t2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0325e
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.Z.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0325e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Z.containsKey(str)) {
            this.Z.put(str, lifecycleCallback);
            if (this.aa > 0) {
                new c.d.a.b.e.b.d(Looper.getMainLooper()).post(new U(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.aa = 1;
        this.ba = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void onStart() {
        super.onStart();
        this.aa = 2;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void onResume() {
        super.onResume();
        this.aa = 3;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void a(int i2, int i3, Intent intent) {
        super.a(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void i(Bundle bundle) {
        super.i(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void onStop() {
        super.onStop();
        this.aa = 4;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void onDestroy() {
        super.onDestroy();
        this.aa = 5;
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class R extends Fragment implements InterfaceC0325e {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<R>> f4905a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, LifecycleCallback> f4906b = new b.c.b();

    /* renamed from: c, reason: collision with root package name */
    private int f4907c = 0;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f4908d;

    public static R a(Activity activity) {
        R r;
        WeakReference<R> weakReference = f4905a.get(activity);
        if (weakReference != null && (r = weakReference.get()) != null) {
            return r;
        }
        try {
            R r2 = (R) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (r2 == null || r2.isRemoving()) {
                r2 = new R();
                activity.getFragmentManager().beginTransaction().add(r2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f4905a.put(activity, new WeakReference<>(r2));
            return r2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0325e
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.f4906b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0325e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f4906b.containsKey(str)) {
            this.f4906b.put(str, lifecycleCallback);
            if (this.f4907c > 0) {
                new c.d.a.b.e.b.d(Looper.getMainLooper()).post(new S(this, lifecycleCallback, str));
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

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4907c = 1;
        this.f4908d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f4906b.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f4907c = 2;
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f4907c = 3;
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f4906b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f4907c = 4;
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f4907c = 5;
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f4906b.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }
}

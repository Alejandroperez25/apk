package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f4952a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map<c.d.a.b.h.i<?>, Boolean> f4953b = Collections.synchronizedMap(new WeakHashMap());

    final <TResult> void a(c.d.a.b.h.i<TResult> iVar, boolean z) {
        this.f4953b.put(iVar, Boolean.valueOf(z));
        iVar.a().a(new C0332m(this, iVar));
    }

    final boolean a() {
        return (this.f4952a.isEmpty() && this.f4953b.isEmpty()) ? false : true;
    }

    public final void b() {
        a(false, C0323c.f4920a);
    }

    public final void c() {
        a(true, H.f4893a);
    }

    private final void a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f4952a) {
            map = new HashMap(this.f4952a);
        }
        synchronized (this.f4953b) {
            map2 = new HashMap(this.f4953b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).a(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((c.d.a.b.h.i) entry2.getKey()).b((Exception) new com.google.android.gms.common.api.b(status));
            }
        }
    }
}

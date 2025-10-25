package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.C0323c;
import java.util.Collections;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c.d.a.b.b.a f4963a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0323c.C0062c f4964b;

    w(C0323c.C0062c c0062c, c.d.a.b.b.a aVar) {
        this.f4964b = c0062c;
        this.f4963a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f4963a.p()) {
            ((C0323c.a) C0323c.this.m.get(this.f4964b.f4941b)).a(this.f4963a);
            return;
        }
        C0323c.C0062c.a(this.f4964b, true);
        if (this.f4964b.f4940a.g()) {
            this.f4964b.a();
            return;
        }
        try {
            this.f4964b.f4940a.a(null, Collections.emptySet());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            ((C0323c.a) C0323c.this.m.get(this.f4964b.f4941b)).a(new c.d.a.b.b.a(10));
        }
    }
}

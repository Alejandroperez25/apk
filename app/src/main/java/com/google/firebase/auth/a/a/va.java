package com.google.firebase.auth.a.a;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class va implements Callable<C0359c<Ha>> {

    /* renamed from: a, reason: collision with root package name */
    private final Ha f5305a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5306b;

    public va(Ha ha, Context context) {
        this.f5305a = ha;
        this.f5306b = context;
    }

    private final com.google.android.gms.common.api.d<Ha> a(boolean z, Context context) {
        Ha ha = (Ha) this.f5305a.clone();
        ha.f5276a = z;
        return new C0361d(context, Fa.f5242c, ha, new c.d.b.g());
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C0359c<Ha> call() throws NoSuchFieldException, ClassNotFoundException {
        int iA = DynamiteModule.a(this.f5306b, "com.google.firebase.auth");
        int iB = 1;
        com.google.android.gms.common.api.d<Ha> dVarA = iA != 0 ? a(true, this.f5306b) : null;
        if (iA != 0) {
            int iA2 = c.d.a.b.b.d.b().a(this.f5306b, 12451000);
            iB = (iA2 == 0 || iA2 == 2) ? DynamiteModule.b(this.f5306b, "com.google.android.gms.firebase_auth") : 0;
        }
        return new C0359c<>(iB != 0 ? a(false, this.f5306b) : null, dVarA, new C0363e(iB, iA, Collections.emptyMap()));
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0323c;

/* loaded from: classes.dex */
public final class L extends J<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    private final f$a<?> f4899c;

    public L(f$a<?> f_a, c.d.a.b.h.i<Boolean> iVar) {
        super(4, iVar);
        this.f4899c = f_a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final /* bridge */ /* synthetic */ void a(C0331l c0331l, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.J
    public final void d(C0323c.a<?> aVar) {
        z zVarRemove = aVar.c().remove(this.f4899c);
        if (zVarRemove != null) {
            zVarRemove.zajy.a(aVar.b(), this.f4895b);
            zVarRemove.zajx.a();
        } else {
            this.f4895b.b((c.d.a.b.h.i<T>) false);
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final c.d.a.b.b.c[] b(C0323c.a<?> aVar) {
        z zVar = aVar.c().get(this.f4899c);
        if (zVar == null) {
            return null;
        }
        return zVar.zajx.b();
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final boolean c(C0323c.a<?> aVar) {
        z zVar = aVar.c().get(this.f4899c);
        return zVar != null && zVar.zajx.c();
    }

    @Override // com.google.android.gms.common.api.internal.J, com.google.android.gms.common.api.internal.AbstractC0336q
    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.J, com.google.android.gms.common.api.internal.AbstractC0336q
    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }
}

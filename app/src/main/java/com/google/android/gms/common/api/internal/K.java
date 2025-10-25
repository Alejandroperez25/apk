package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C0323c;

/* loaded from: classes.dex */
public final class K<ResultT> extends A {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0329j<a.b, ResultT> f4896b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.b.h.i<ResultT> f4897c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0328i f4898d;

    public K(int i2, AbstractC0329j<a.b, ResultT> abstractC0329j, c.d.a.b.h.i<ResultT> iVar, InterfaceC0328i interfaceC0328i) {
        super(i2);
        this.f4897c = iVar;
        this.f4896b = abstractC0329j;
        this.f4898d = interfaceC0328i;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final void a(C0323c.a<?> aVar) throws DeadObjectException {
        try {
            this.f4896b.a(aVar.b(), this.f4897c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(AbstractC0336q.b(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final void a(Status status) {
        this.f4897c.b(this.f4898d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final void a(RuntimeException runtimeException) {
        this.f4897c.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final void a(C0331l c0331l, boolean z) {
        c0331l.a(this.f4897c, z);
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final c.d.a.b.b.c[] b(C0323c.a<?> aVar) {
        return this.f4896b.b();
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final boolean c(C0323c.a<?> aVar) {
        return this.f4896b.c();
    }
}

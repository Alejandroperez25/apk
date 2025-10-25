package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0323c;

/* loaded from: classes.dex */
abstract class J<T> extends A {

    /* renamed from: b, reason: collision with root package name */
    protected final c.d.a.b.h.i<T> f4895b;

    public J(int i2, c.d.a.b.h.i<T> iVar) {
        super(i2);
        this.f4895b = iVar;
    }

    protected abstract void d(C0323c.a<?> aVar);

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public void a(Status status) {
        this.f4895b.b(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public void a(RuntimeException runtimeException) {
        this.f4895b.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0336q
    public final void a(C0323c.a<?> aVar) throws DeadObjectException {
        try {
            d(aVar);
        } catch (DeadObjectException e2) {
            a(AbstractC0336q.b(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(AbstractC0336q.b(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }
}

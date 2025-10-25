package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0323c;

/* renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0336q {

    /* renamed from: a, reason: collision with root package name */
    private final int f4957a;

    public AbstractC0336q(int i2) {
        this.f4957a = i2;
    }

    public abstract void a(Status status);

    public abstract void a(C0323c.a<?> aVar);

    public abstract void a(C0331l c0331l, boolean z);

    public abstract void a(RuntimeException runtimeException);

    /* JADX INFO: Access modifiers changed from: private */
    public static Status b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (com.google.android.gms.common.util.i.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}

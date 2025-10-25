package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC0352m;

/* renamed from: com.google.android.gms.common.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0341a extends InterfaceC0352m.a {
    public static Account a(InterfaceC0352m interfaceC0352m) {
        if (interfaceC0352m != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC0352m.a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}

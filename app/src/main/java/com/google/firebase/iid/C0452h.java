package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0452h {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f5538a;

    /* renamed from: b, reason: collision with root package name */
    private final K f5539b;

    C0452h(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f5538a = new Messenger(iBinder);
            this.f5539b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f5539b = new K(iBinder);
            this.f5538a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    final void a(Message message) throws RemoteException {
        if (this.f5538a != null) {
            this.f5538a.send(message);
        } else {
            if (this.f5539b != null) {
                this.f5539b.a(message);
                return;
            }
            throw new IllegalStateException("Both messengers are null");
        }
    }
}

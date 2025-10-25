package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class W implements T {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f5513a;

    W(IBinder iBinder) {
        this.f5513a = iBinder;
    }

    @Override // com.google.firebase.iid.T
    public final void a(Message message) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        parcelObtain.writeInt(1);
        message.writeToParcel(parcelObtain, 0);
        try {
            this.f5513a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5513a;
    }
}

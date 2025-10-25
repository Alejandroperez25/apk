package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class J implements Parcelable.Creator<K> {
    J() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ K[] newArray(int i2) {
        return new K[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ K createFromParcel(Parcel parcel) {
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new K(strongBinder);
        }
        return null;
    }
}

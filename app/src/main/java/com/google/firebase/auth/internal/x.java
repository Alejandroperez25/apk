package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.T;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i2) {
        return new y[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        E e2 = null;
        w wVar = null;
        T t = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    e2 = (E) com.google.android.gms.common.internal.a.b.a(parcel, iA, E.CREATOR);
                    break;
                case 2:
                    wVar = (w) com.google.android.gms.common.internal.a.b.a(parcel, iA, w.CREATOR);
                    break;
                case 3:
                    t = (T) com.google.android.gms.common.internal.a.b.a(parcel, iA, T.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new y(e2, wVar, t);
    }
}

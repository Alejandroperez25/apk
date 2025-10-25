package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.bb;

/* loaded from: classes.dex */
public final class S implements Parcelable.Creator<T> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ T[] newArray(int i2) {
        return new T[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ T createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        bb bbVar = null;
        String strI4 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 3:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    bbVar = (bb) com.google.android.gms.common.internal.a.b.a(parcel, iA, bb.CREATOR);
                    break;
                case 5:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new T(strI, strI2, strI3, bbVar, strI4);
    }
}

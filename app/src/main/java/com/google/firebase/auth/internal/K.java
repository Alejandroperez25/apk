package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.T;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K implements Parcelable.Creator<H> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H[] newArray(int i2) {
        return new H[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        ArrayList arrayListC = null;
        J j = null;
        String strI = null;
        T t = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, com.google.firebase.auth.L.CREATOR);
                    break;
                case 2:
                    j = (J) com.google.android.gms.common.internal.a.b.a(parcel, iA, J.CREATOR);
                    break;
                case 3:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    t = (T) com.google.android.gms.common.internal.a.b.a(parcel, iA, T.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new H(arrayListC, j, strI, t);
    }
}

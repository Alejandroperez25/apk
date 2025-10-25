package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C implements Parcelable.Creator<v> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int i2) {
        return new v[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        IBinder iBinderJ = null;
        c.d.a.b.b.a aVar = null;
        int iE = 0;
        boolean zC = false;
        boolean zC2 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    iBinderJ = com.google.android.gms.common.internal.a.b.j(parcel, iA);
                    break;
                case 3:
                    aVar = (c.d.a.b.b.a) com.google.android.gms.common.internal.a.b.a(parcel, iA, c.d.a.b.b.a.CREATOR);
                    break;
                case 4:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 5:
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new v(iE, iBinderJ, aVar, zC, zC2);
    }
}

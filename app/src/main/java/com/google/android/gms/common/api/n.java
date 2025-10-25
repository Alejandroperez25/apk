package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        int iE = 0;
        String strI = null;
        PendingIntent pendingIntent = null;
        int iE2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            int iA2 = com.google.android.gms.common.internal.a.b.a(iA);
            if (iA2 != 1000) {
                switch (iA2) {
                    case 1:
                        iE2 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                        break;
                    case 2:
                        strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) com.google.android.gms.common.internal.a.b.a(parcel, iA, PendingIntent.CREATOR);
                        break;
                    default:
                        com.google.android.gms.common.internal.a.b.b(parcel, iA);
                        break;
                }
            } else {
                iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Status(iE, iE2, strI, pendingIntent);
    }
}

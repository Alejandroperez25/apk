package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a$i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        String strI = null;
        ArrayList<String> arrayListL = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        String strI5 = null;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        float fH = 0.0f;
        boolean zC = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    jF = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
                case 4:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    iE3 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 6:
                    arrayListL = com.google.android.gms.common.internal.a.b.l(parcel, iA);
                    break;
                case 8:
                    jF2 = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case 10:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 11:
                    iE2 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 12:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 13:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 14:
                    iE4 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                    fH = com.google.android.gms.common.internal.a.b.h(parcel, iA);
                    break;
                case 16:
                    jF3 = com.google.android.gms.common.internal.a.b.f(parcel, iA);
                    break;
                case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                    strI5 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 18:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new WakeLockEvent(iE, jF, iE2, strI, iE3, arrayListL, strI2, jF2, iE4, strI3, strI4, fH, jF3, strI5, zC);
    }
}

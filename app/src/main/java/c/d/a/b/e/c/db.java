package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a$i;

/* loaded from: classes.dex */
public final class db implements Parcelable.Creator<bb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bb[] newArray(int i2) {
        return new bb[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bb createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        String strI5 = null;
        String strI6 = null;
        String strI7 = null;
        String strI8 = null;
        String strI9 = null;
        String strI10 = null;
        String strI11 = null;
        String strI12 = null;
        String strI13 = null;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 2:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 3:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    strI3 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    strI4 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 6:
                    strI5 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 7:
                    strI6 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 8:
                    strI7 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 9:
                    strI8 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 10:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 11:
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 12:
                    strI9 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 13:
                    strI10 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 14:
                    strI11 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                    strI12 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 16:
                    zC3 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                    strI13 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new bb(strI, strI2, strI3, strI4, strI5, strI6, strI7, strI8, zC, zC2, strI9, strI10, strI11, strI12, zC3, strI13);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class La implements Parcelable.Creator<Ka> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ka[] newArray(int i2) {
        return new Ka[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ka createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        String strI2 = null;
        ab abVar = null;
        ArrayList<String> arrayListL = null;
        boolean zC = false;
        boolean zC2 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 2:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 4:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    zC2 = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
                case 6:
                    abVar = (ab) com.google.android.gms.common.internal.a.b.a(parcel, iA, ab.CREATOR);
                    break;
                case 7:
                    arrayListL = com.google.android.gms.common.internal.a.b.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ka(strI, zC, strI2, zC2, abVar, arrayListL);
    }
}

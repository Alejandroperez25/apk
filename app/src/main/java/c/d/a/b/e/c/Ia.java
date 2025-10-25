package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Ia implements Parcelable.Creator<Ja> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ja[] newArray(int i2) {
        return new Ja[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ja createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        ArrayList arrayListC = null;
        com.google.firebase.auth.T t = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, Pa.CREATOR);
                    break;
                case 3:
                    t = (com.google.firebase.auth.T) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.T.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ja(strI, arrayListC, t);
    }
}

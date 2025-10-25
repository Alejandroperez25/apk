package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Da implements Parcelable.Creator<Ea> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ea[] newArray(int i2) {
        return new Ea[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ea createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        com.google.firebase.auth.H h2 = null;
        String strI = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    h2 = (com.google.firebase.auth.H) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.H.CREATOR);
                    break;
                case 2:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ea(h2, strI);
    }
}

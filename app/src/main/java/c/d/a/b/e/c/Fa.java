package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class Fa implements Parcelable.Creator<Ga> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ga[] newArray(int i2) {
        return new Ga[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ga createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        Status status = null;
        com.google.firebase.auth.T t = null;
        String strI = null;
        String strI2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    status = (Status) com.google.android.gms.common.internal.a.b.a(parcel, iA, Status.CREATOR);
                    break;
                case 2:
                    t = (com.google.firebase.auth.T) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.T.CREATOR);
                    break;
                case 3:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 4:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ga(status, t, strI, strI2);
    }
}

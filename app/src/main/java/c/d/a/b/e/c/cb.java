package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cb implements Parcelable.Creator<ab> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ab[] newArray(int i2) {
        return new ab[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ab createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        int iE = 0;
        ArrayList<String> arrayListL = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    arrayListL = com.google.android.gms.common.internal.a.b.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new ab(iE, arrayListL);
    }
}

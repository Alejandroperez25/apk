package c.d.a.b.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i2) {
        return new k[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        c.d.a.b.b.a aVar = null;
        int iE = 0;
        v vVar = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    aVar = (c.d.a.b.b.a) com.google.android.gms.common.internal.a.b.a(parcel, iA, c.d.a.b.b.a.CREATOR);
                    break;
                case 3:
                    vVar = (v) com.google.android.gms.common.internal.a.b.a(parcel, iA, v.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new k(iE, aVar, vVar);
    }
}

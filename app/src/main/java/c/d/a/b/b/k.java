package c.d.a.b.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        int iE = 0;
        PendingIntent pendingIntent = null;
        String strI = null;
        int iE2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    iE2 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) com.google.android.gms.common.internal.a.b.a(parcel, iA, PendingIntent.CREATOR);
                    break;
                case 4:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new a(iE, iE2, pendingIntent, strI);
    }
}

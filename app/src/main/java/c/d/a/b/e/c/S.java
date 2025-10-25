package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class S implements Parcelable.Creator<T> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ T[] newArray(int i2) {
        return new T[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ T createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 1) {
                strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new T(strI);
    }
}

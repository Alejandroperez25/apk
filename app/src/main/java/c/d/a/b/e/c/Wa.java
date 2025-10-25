package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Wa implements Parcelable.Creator<Ta> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ta[] newArray(int i2) {
        return new Ta[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Ta createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 2) {
                arrayListC = com.google.android.gms.common.internal.a.b.c(parcel, iA, Ra.CREATOR);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new Ta(arrayListC);
    }
}

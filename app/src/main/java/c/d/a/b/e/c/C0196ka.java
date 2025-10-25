package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196ka implements Parcelable.Creator<C0198la> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0198la[] newArray(int i2) {
        return new C0198la[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0198la createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        Ya ya = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 1) {
                ya = (Ya) com.google.android.gms.common.internal.a.b.a(parcel, iA, Ya.CREATOR);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0198la(ya);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176aa implements Parcelable.Creator<C0178ba> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0178ba[] newArray(int i2) {
        return new C0178ba[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0178ba createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        bb bbVar = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    bbVar = (bb) com.google.android.gms.common.internal.a.b.a(parcel, iA, bb.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0178ba(strI, bbVar);
    }
}

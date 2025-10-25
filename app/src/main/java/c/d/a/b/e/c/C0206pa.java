package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206pa implements Parcelable.Creator<C0208qa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0208qa[] newArray(int i2) {
        return new C0208qa[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0208qa createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        bb bbVar = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 1) {
                bbVar = (bb) com.google.android.gms.common.internal.a.b.a(parcel, iA, bb.CREATOR);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0208qa(bbVar);
    }
}

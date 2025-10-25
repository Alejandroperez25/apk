package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180ca implements Parcelable.Creator<C0182da> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0182da[] newArray(int i2) {
        return new C0182da[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0182da createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        com.google.firebase.auth.A a2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    a2 = (com.google.firebase.auth.A) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.A.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0182da(strI, a2);
    }
}

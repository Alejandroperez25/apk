package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222xa implements Parcelable.Creator<C0224ya> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0224ya[] newArray(int i2) {
        return new C0224ya[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0224ya createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        com.google.firebase.auth.A a2 = null;
        String strI = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    a2 = (com.google.firebase.auth.A) com.google.android.gms.common.internal.a.b.a(parcel, iA, com.google.firebase.auth.A.CREATOR);
                    break;
                case 2:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0224ya(a2, strI);
    }
}

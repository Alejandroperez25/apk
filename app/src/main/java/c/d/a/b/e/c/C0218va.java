package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0405e;

/* renamed from: c.d.a.b.e.c.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218va implements Parcelable.Creator<C0220wa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0220wa[] newArray(int i2) {
        return new C0220wa[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0220wa createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        C0405e c0405e = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            if (com.google.android.gms.common.internal.a.b.a(iA) == 1) {
                c0405e = (C0405e) com.google.android.gms.common.internal.a.b.a(parcel, iA, C0405e.CREATOR);
            } else {
                com.google.android.gms.common.internal.a.b.b(parcel, iA);
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0220wa(c0405e);
    }
}

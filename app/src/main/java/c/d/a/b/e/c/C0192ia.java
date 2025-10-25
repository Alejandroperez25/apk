package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0354a;

/* renamed from: c.d.a.b.e.c.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192ia implements Parcelable.Creator<C0194ja> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0194ja[] newArray(int i2) {
        return new C0194ja[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0194ja createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        C0354a c0354a = null;
        String strI2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 2:
                    c0354a = (C0354a) com.google.android.gms.common.internal.a.b.a(parcel, iA, C0354a.CREATOR);
                    break;
                case 3:
                    strI2 = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0194ja(strI, c0354a, strI2);
    }
}

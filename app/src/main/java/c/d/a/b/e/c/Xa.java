package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase_auth.zzp;

/* loaded from: classes.dex */
public final class Xa extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.a.a.Aa<Xa, zzp.zzj> {
    public static final Parcelable.Creator<Xa> CREATOR = new Za();

    /* renamed from: a, reason: collision with root package name */
    private String f3866a;

    /* renamed from: b, reason: collision with root package name */
    private String f3867b;

    /* renamed from: c, reason: collision with root package name */
    private String f3868c;

    public Xa() {
    }

    Xa(String str, String str2, String str3) {
        this.f3866a = str;
        this.f3867b = str2;
        this.f3868c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3866a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3867b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3868c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

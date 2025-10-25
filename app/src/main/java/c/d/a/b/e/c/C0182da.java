package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182da extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0182da> CREATOR = new C0180ca();

    /* renamed from: a, reason: collision with root package name */
    private final String f3898a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.auth.A f3899b;

    public C0182da(String str, com.google.firebase.auth.A a2) {
        this.f3898a = str;
        this.f3899b = a2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3898a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3899b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

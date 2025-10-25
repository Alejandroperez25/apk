package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224ya extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0224ya> CREATOR = new C0222xa();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.auth.A f3950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3951b;

    public C0224ya(com.google.firebase.auth.A a2, String str) {
        this.f3950a = a2;
        this.f3951b = str;
    }

    public final com.google.firebase.auth.A o() {
        return this.f3950a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3950a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3951b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

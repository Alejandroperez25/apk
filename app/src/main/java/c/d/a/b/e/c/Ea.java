package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Ea extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ea> CREATOR = new Da();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.auth.H f3802a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3803b;

    public Ea(com.google.firebase.auth.H h2, String str) {
        this.f3802a = h2;
        this.f3803b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3802a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3803b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

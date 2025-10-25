package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<P> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    private final String f3843a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3844b;

    public P(String str, String str2) {
        this.f3843a = str;
        this.f3844b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3843a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3844b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<N> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private final String f3836a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3837b;

    public N(String str, String str2) {
        this.f3836a = str;
        this.f3837b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3836a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3837b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

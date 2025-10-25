package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Z> CREATOR = new Y();

    /* renamed from: a, reason: collision with root package name */
    private final String f3874a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3875b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3876c;

    public Z(String str, String str2, String str3) {
        this.f3874a = str;
        this.f3875b = str2;
        this.f3876c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3874a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3875b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3876c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

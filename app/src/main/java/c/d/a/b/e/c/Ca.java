package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Ca extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ca> CREATOR = new Ba();

    /* renamed from: a, reason: collision with root package name */
    private final String f3792a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3793b;

    public Ca(String str, String str2) {
        this.f3792a = str;
        this.f3793b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3792a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3793b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

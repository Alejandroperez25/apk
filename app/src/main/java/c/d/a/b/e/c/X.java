package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<X> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    private final String f3864a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3865b;

    public X(String str, String str2) {
        this.f3864a = str;
        this.f3865b = str2;
    }

    public final String n() {
        return this.f3864a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3864a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3865b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

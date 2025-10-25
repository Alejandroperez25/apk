package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202na extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0202na> CREATOR = new C0200ma();

    /* renamed from: a, reason: collision with root package name */
    private final String f3926a;

    public C0202na(String str) {
        this.f3926a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3926a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

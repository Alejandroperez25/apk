package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178ba extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0178ba> CREATOR = new C0176aa();

    /* renamed from: a, reason: collision with root package name */
    private final String f3881a;

    /* renamed from: b, reason: collision with root package name */
    private final bb f3882b;

    public C0178ba(String str, bb bbVar) {
        this.f3881a = str;
        this.f3882b = bbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3881a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3882b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198la extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0198la> CREATOR = new C0196ka();

    /* renamed from: a, reason: collision with root package name */
    private final Ya f3918a;

    public C0198la(Ya ya) {
        this.f3918a = ya;
    }

    public final Ya o() {
        return this.f3918a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3918a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

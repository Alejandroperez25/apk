package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208qa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0208qa> CREATOR = new C0206pa();

    /* renamed from: a, reason: collision with root package name */
    private final bb f3934a;

    public C0208qa(bb bbVar) {
        this.f3934a = bbVar;
    }

    public final bb o() {
        return this.f3934a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3934a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

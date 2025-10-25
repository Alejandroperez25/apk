package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0405e;

/* renamed from: c.d.a.b.e.c.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220wa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0220wa> CREATOR = new C0218va();

    /* renamed from: a, reason: collision with root package name */
    private final C0405e f3944a;

    public C0220wa(C0405e c0405e) {
        this.f3944a = c0405e;
    }

    public final C0405e o() {
        return this.f3944a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3944a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

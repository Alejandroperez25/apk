package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0354a;

/* renamed from: c.d.a.b.e.c.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190ha extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0190ha> CREATOR = new C0188ga();

    /* renamed from: a, reason: collision with root package name */
    private final String f3912a;

    /* renamed from: b, reason: collision with root package name */
    private final C0354a f3913b;

    public C0190ha(String str, C0354a c0354a) {
        this.f3912a = str;
        this.f3913b = c0354a;
    }

    public final String o() {
        return this.f3912a;
    }

    public final C0354a p() {
        return this.f3913b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3912a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3913b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

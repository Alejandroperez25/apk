package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class Ga extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ga> CREATOR = new Fa();

    /* renamed from: a, reason: collision with root package name */
    private final Status f3807a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.auth.T f3808b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3809c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3810d;

    public Ga(Status status, com.google.firebase.auth.T t, String str, String str2) {
        this.f3807a = status;
        this.f3808b = t;
        this.f3809c = str;
        this.f3810d = str2;
    }

    public final Status m() {
        return this.f3807a;
    }

    public final com.google.firebase.auth.T o() {
        return this.f3808b;
    }

    public final String n() {
        return this.f3809c;
    }

    public final String p() {
        return this.f3810d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) this.f3807a, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3808b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3809c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3810d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

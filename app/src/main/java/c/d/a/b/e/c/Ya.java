package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase_auth.zzp;

/* loaded from: classes.dex */
public final class Ya extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.a.a.Ta<zzp.zzk> {
    public static final Parcelable.Creator<Ya> CREATOR = new _a();

    /* renamed from: a, reason: collision with root package name */
    private final String f3869a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3870b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3871c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3872d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3873e;

    public Ya(String str, long j, boolean z, String str2, String str3) {
        com.google.android.gms.common.internal.t.a(str);
        this.f3869a = str;
        this.f3870b = j;
        this.f3871c = z;
        this.f3872d = str2;
        this.f3873e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3869a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3870b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3871c);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3872d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3873e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

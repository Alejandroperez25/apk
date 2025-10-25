package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Pa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Pa> CREATOR = new Sa();

    /* renamed from: a, reason: collision with root package name */
    private final String f3845a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3846b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3847c;

    /* renamed from: d, reason: collision with root package name */
    private final long f3848d;

    public Pa(String str, String str2, String str3, long j) {
        this.f3845a = str;
        com.google.android.gms.common.internal.t.a(str2);
        this.f3846b = str2;
        this.f3847c = str3;
        this.f3848d = j;
    }

    public final String o() {
        return this.f3845a;
    }

    public final String p() {
        return this.f3846b;
    }

    public final String l() {
        return this.f3847c;
    }

    public final long q() {
        return this.f3848d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3845a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3846b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3847c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3848d);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

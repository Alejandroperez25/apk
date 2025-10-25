package c.d.a.b.e.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Ma extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ma> CREATOR = new Na();

    /* renamed from: a, reason: collision with root package name */
    private String f3827a;

    /* renamed from: b, reason: collision with root package name */
    private String f3828b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3829c;

    /* renamed from: d, reason: collision with root package name */
    private String f3830d;

    /* renamed from: e, reason: collision with root package name */
    private String f3831e;

    /* renamed from: f, reason: collision with root package name */
    private Ta f3832f;

    /* renamed from: g, reason: collision with root package name */
    private String f3833g;

    /* renamed from: h, reason: collision with root package name */
    private String f3834h;

    /* renamed from: i, reason: collision with root package name */
    private long f3835i;
    private long j;
    private boolean k;
    private com.google.firebase.auth.T l;
    private List<Pa> m;

    public Ma() {
        this.f3832f = new Ta();
    }

    public Ma(String str, String str2, boolean z, String str3, String str4, Ta ta, String str5, String str6, long j, long j2, boolean z2, com.google.firebase.auth.T t, List<Pa> list) {
        Ta taA;
        this.f3827a = str;
        this.f3828b = str2;
        this.f3829c = z;
        this.f3830d = str3;
        this.f3831e = str4;
        if (ta == null) {
            taA = new Ta();
        } else {
            taA = Ta.a(ta);
        }
        this.f3832f = taA;
        this.f3833g = str5;
        this.f3834h = str6;
        this.f3835i = j;
        this.j = j2;
        this.k = z2;
        this.l = t;
        this.m = list == null ? AbstractC0221x.h() : list;
    }

    public final String n() {
        return this.f3828b;
    }

    public final boolean j() {
        return this.f3829c;
    }

    public final String o() {
        return this.f3827a;
    }

    public final String l() {
        return this.f3830d;
    }

    public final Uri p() {
        if (TextUtils.isEmpty(this.f3831e)) {
            return null;
        }
        return Uri.parse(this.f3831e);
    }

    public final String k() {
        return this.f3834h;
    }

    public final long b() {
        return this.f3835i;
    }

    public final long c() {
        return this.j;
    }

    public final boolean e() {
        return this.k;
    }

    public final List<Ra> q() {
        return this.f3832f.o();
    }

    public final com.google.firebase.auth.T r() {
        return this.l;
    }

    public final List<Pa> s() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3827a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3828b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3829c);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3830d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f3831e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, (Parcelable) this.f3832f, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f3833g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 9, this.f3834h, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, this.f3835i);
        com.google.android.gms.common.internal.a.c.a(parcel, 11, this.j);
        com.google.android.gms.common.internal.a.c.a(parcel, 12, this.k);
        com.google.android.gms.common.internal.a.c.a(parcel, 13, (Parcelable) this.l, i2, false);
        com.google.android.gms.common.internal.a.c.b(parcel, 14, this.m, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

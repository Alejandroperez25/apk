package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.firebase_auth.zzp;

/* loaded from: classes.dex */
public final class bb extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.a.a.Ta<zzp.zzp> {
    public static final Parcelable.Creator<bb> CREATOR = new db();

    /* renamed from: a, reason: collision with root package name */
    private String f3883a;

    /* renamed from: b, reason: collision with root package name */
    private String f3884b;

    /* renamed from: c, reason: collision with root package name */
    private String f3885c;

    /* renamed from: d, reason: collision with root package name */
    private String f3886d;

    /* renamed from: e, reason: collision with root package name */
    private String f3887e;

    /* renamed from: f, reason: collision with root package name */
    private String f3888f;

    /* renamed from: g, reason: collision with root package name */
    private String f3889g;

    /* renamed from: h, reason: collision with root package name */
    private String f3890h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3891i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;

    public bb() {
        this.f3891i = true;
        this.j = true;
    }

    bb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f3883a = str;
        this.f3884b = str2;
        this.f3885c = str3;
        this.f3886d = str4;
        this.f3887e = str5;
        this.f3888f = str6;
        this.f3889g = str7;
        this.f3890h = str8;
        this.f3891i = z;
        this.j = z2;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = z3;
        this.p = str13;
    }

    public bb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f3883a = "http://localhost";
        this.f3885c = str;
        this.f3886d = str2;
        this.f3890h = str5;
        this.k = str6;
        this.n = str7;
        this.p = str8;
        this.f3891i = true;
        if (TextUtils.isEmpty(this.f3885c) && TextUtils.isEmpty(this.f3886d) && TextUtils.isEmpty(this.k)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        com.google.android.gms.common.internal.t.a(str3);
        this.f3887e = str3;
        this.f3888f = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f3885c)) {
            sb.append("id_token=");
            sb.append(this.f3885c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3886d)) {
            sb.append("access_token=");
            sb.append(this.f3886d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3888f)) {
            sb.append("identifier=");
            sb.append(this.f3888f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3890h)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f3890h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.k)) {
            sb.append("code=");
            sb.append(this.k);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.f3887e);
        this.f3889g = sb.toString();
        this.j = true;
    }

    public final bb a(boolean z) {
        this.j = false;
        return this;
    }

    public final bb a(String str) {
        this.n = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3883a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3884b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3885c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3886d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f3887e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f3888f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f3889g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 9, this.f3890h, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, this.f3891i);
        com.google.android.gms.common.internal.a.c.a(parcel, 11, this.j);
        com.google.android.gms.common.internal.a.c.a(parcel, 12, this.k, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 13, this.l, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 14, this.m, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 15, this.n, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 16, this.o);
        com.google.android.gms.common.internal.a.c.a(parcel, 17, this.p, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

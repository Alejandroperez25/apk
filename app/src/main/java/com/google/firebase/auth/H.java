package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class H extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<H> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    private String f5189a;

    /* renamed from: b, reason: collision with root package name */
    private String f5190b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5191c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5192d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f5193e;

    H(String str, String str2, boolean z, boolean z2) {
        this.f5189a = str;
        this.f5190b = str2;
        this.f5191c = z;
        this.f5192d = z2;
        this.f5193e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5194a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f5195b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5196c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5197d;

        public a a(String str) {
            if (str == null) {
                this.f5196c = true;
            } else {
                this.f5194a = str;
            }
            return this;
        }

        public a a(Uri uri) {
            if (uri == null) {
                this.f5197d = true;
            } else {
                this.f5195b = uri;
            }
            return this;
        }

        public H a() {
            return new H(this.f5194a, this.f5195b == null ? null : this.f5195b.toString(), this.f5196c, this.f5197d);
        }
    }

    public String l() {
        return this.f5189a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, l(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5190b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5191c);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5192d);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

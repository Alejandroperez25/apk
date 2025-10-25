package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public class u extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<u> CREATOR = new B();

    /* renamed from: a, reason: collision with root package name */
    private final int f5064a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f5065b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5066c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f5067d;

    u(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f5064a = i2;
        this.f5065b = account;
        this.f5066c = i3;
        this.f5067d = googleSignInAccount;
    }

    public u(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    public Account o() {
        return this.f5065b;
    }

    public int p() {
        return this.f5066c;
    }

    public GoogleSignInAccount q() {
        return this.f5067d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5064a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) o(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, p());
        com.google.android.gms.common.internal.a.c.a(parcel, 4, (Parcelable) q(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

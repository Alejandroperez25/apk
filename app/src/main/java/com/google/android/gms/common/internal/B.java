package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class B implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i2) {
        return new u[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        Account account = null;
        int iE = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int iE2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    account = (Account) com.google.android.gms.common.internal.a.b.a(parcel, iA, Account.CREATOR);
                    break;
                case 3:
                    iE2 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.a.b.a(parcel, iA, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new u(iE, account, iE2, googleSignInAccount);
    }
}

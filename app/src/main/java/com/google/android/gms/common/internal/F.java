package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator<C0347g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0347g[] newArray(int i2) {
        return new C0347g[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0347g createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.a.b.b(parcel);
        String strI = null;
        IBinder iBinderJ = null;
        Scope[] scopeArr = null;
        Bundle bundleK = null;
        Account account = null;
        c.d.a.b.b.c[] cVarArr = null;
        c.d.a.b.b.c[] cVarArr2 = null;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        boolean zC = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(iA)) {
                case 1:
                    iE = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 2:
                    iE2 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 3:
                    iE3 = com.google.android.gms.common.internal.a.b.e(parcel, iA);
                    break;
                case 4:
                    strI = com.google.android.gms.common.internal.a.b.i(parcel, iA);
                    break;
                case 5:
                    iBinderJ = com.google.android.gms.common.internal.a.b.j(parcel, iA);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.a.b.b(parcel, iA, Scope.CREATOR);
                    break;
                case 7:
                    bundleK = com.google.android.gms.common.internal.a.b.k(parcel, iA);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.a.b.a(parcel, iA, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.a.b.b(parcel, iA);
                    break;
                case 10:
                    cVarArr = (c.d.a.b.b.c[]) com.google.android.gms.common.internal.a.b.b(parcel, iA, c.d.a.b.b.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (c.d.a.b.b.c[]) com.google.android.gms.common.internal.a.b.b(parcel, iA, c.d.a.b.b.c.CREATOR);
                    break;
                case 12:
                    zC = com.google.android.gms.common.internal.a.b.c(parcel, iA);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.m(parcel, iB);
        return new C0347g(iE, iE2, iE3, strI, iBinderJ, scopeArr, bundleK, account, cVarArr, cVarArr2, zC);
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0352m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class a extends c.d.a.b.e.b.b implements InterfaceC0352m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a, reason: collision with other inner class name */
        public static class C0064a extends c.d.a.b.e.b.a implements InterfaceC0352m {
            C0064a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.InterfaceC0352m
            public final Account a() {
                Parcel parcelA = a(2, h());
                Account account = (Account) c.d.a.b.e.b.c.a(parcelA, Account.CREATOR);
                parcelA.recycle();
                return account;
            }
        }

        public static InterfaceC0352m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC0352m) {
                return (InterfaceC0352m) iInterfaceQueryLocalInterface;
            }
            return new C0064a(iBinder);
        }
    }

    Account a();
}

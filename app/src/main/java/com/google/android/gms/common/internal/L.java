package com.google.android.gms.common.internal;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class L extends c.d.a.b.e.b.b implements K {
    public L() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // c.d.a.b.e.b.b
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                c.d.a.b.c.a aVarE = e();
                parcel2.writeNoException();
                c.d.a.b.e.b.c.a(parcel2, aVarE);
                return true;
            case 2:
                int iG = g();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            default:
                return false;
        }
    }
}

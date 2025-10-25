package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import c.d.a.b.c.a;

/* loaded from: classes.dex */
public final class l extends c.d.a.b.e.b.a implements k {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.d.a.b.c.a a(c.d.a.b.c.a aVar, String str, int i2, c.d.a.b.c.a aVar2) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i2);
        c.d.a.b.e.b.c.a(parcelH, aVar2);
        Parcel parcelA = a(2, parcelH);
        c.d.a.b.c.a aVarA = a.AbstractBinderC0044a.a(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarA;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.d.a.b.c.a b(c.d.a.b.c.a aVar, String str, int i2, c.d.a.b.c.a aVar2) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i2);
        c.d.a.b.e.b.c.a(parcelH, aVar2);
        Parcel parcelA = a(3, parcelH);
        c.d.a.b.c.a aVarA = a.AbstractBinderC0044a.a(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarA;
    }
}

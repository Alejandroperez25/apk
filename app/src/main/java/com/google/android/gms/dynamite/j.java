package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import c.d.a.b.c.a;

/* loaded from: classes.dex */
public final class j extends c.d.a.b.e.b.a implements i {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.i
    public final c.d.a.b.c.a a(c.d.a.b.c.a aVar, String str, int i2) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i2);
        Parcel parcelA = a(2, parcelH);
        c.d.a.b.c.a aVarA = a.AbstractBinderC0044a.a(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarA;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int b(c.d.a.b.c.a aVar, String str, boolean z) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        c.d.a.b.e.b.c.a(parcelH, z);
        Parcel parcelA = a(3, parcelH);
        int i2 = parcelA.readInt();
        parcelA.recycle();
        return i2;
    }

    @Override // com.google.android.gms.dynamite.i
    public final c.d.a.b.c.a b(c.d.a.b.c.a aVar, String str, int i2) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i2);
        Parcel parcelA = a(4, parcelH);
        c.d.a.b.c.a aVarA = a.AbstractBinderC0044a.a(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarA;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int a(c.d.a.b.c.a aVar, String str, boolean z) {
        Parcel parcelH = h();
        c.d.a.b.e.b.c.a(parcelH, aVar);
        parcelH.writeString(str);
        c.d.a.b.e.b.c.a(parcelH, z);
        Parcel parcelA = a(5, parcelH);
        int i2 = parcelA.readInt();
        parcelA.recycle();
        return i2;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int f() {
        Parcel parcelA = a(6, h());
        int i2 = parcelA.readInt();
        parcelA.recycle();
        return i2;
    }
}

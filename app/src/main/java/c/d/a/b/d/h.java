package c.d.a.b.d;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h extends c.d.a.b.e.e.a implements f {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // c.d.a.b.d.f
    public final void init(c.d.a.b.c.a aVar) {
        Parcel parcelH = h();
        c.d.a.b.e.e.c.a(parcelH, aVar);
        b(1, parcelH);
    }

    @Override // c.d.a.b.d.f
    public final boolean getBooleanFlagValue(String str, boolean z, int i2) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        c.d.a.b.e.e.c.a(parcelH, z);
        parcelH.writeInt(i2);
        Parcel parcelA = a(2, parcelH);
        boolean zA = c.d.a.b.e.e.c.a(parcelA);
        parcelA.recycle();
        return zA;
    }
}

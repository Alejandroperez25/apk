package c.d.a.b.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.d.a.b.c.a;

/* loaded from: classes.dex */
public abstract class g extends c.d.a.b.e.e.b implements f {
    public g() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static f a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (iInterfaceQueryLocalInterface instanceof f) {
            return (f) iInterfaceQueryLocalInterface;
        }
        return new h(iBinder);
    }

    @Override // c.d.a.b.e.e.b
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                init(a.AbstractBinderC0044a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), c.d.a.b.e.e.c.a(parcel), parcel.readInt());
                parcel2.writeNoException();
                c.d.a.b.e.e.c.a(parcel2, booleanFlagValue);
                return true;
            case 3:
                int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            case 4:
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            case 5:
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            default:
                return false;
        }
    }
}

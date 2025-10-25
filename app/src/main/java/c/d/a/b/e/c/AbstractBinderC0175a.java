package c.d.a.b.e.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.b.e.c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0175a extends Binder implements IInterface {
    protected AbstractBinderC0175a(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean a(int i2, Parcel parcel, Parcel parcel2, int i3);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        boolean zOnTransact;
        if (i2 > 16777215) {
            zOnTransact = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return a(i2, parcel, parcel2, i3);
    }
}

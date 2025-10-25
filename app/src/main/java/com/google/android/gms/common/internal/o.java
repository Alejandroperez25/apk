package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface o extends IInterface {
    void a(int i2, IBinder iBinder, Bundle bundle);

    void a(int i2, IBinder iBinder, D d2);

    void b(int i2, Bundle bundle);

    public static abstract class a extends c.d.a.b.e.b.b implements o {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // c.d.a.b.e.b.b
        protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
            switch (i2) {
                case 1:
                    a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.d.a.b.e.b.c.a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    b(parcel.readInt(), (Bundle) c.d.a.b.e.b.c.a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    a(parcel.readInt(), parcel.readStrongBinder(), (D) c.d.a.b.e.b.c.a(parcel, D.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }
}

package c.d.a.b.e.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.d.a.b.e.c.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225z implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3952a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3953b;

    protected AbstractC0225z(IBinder iBinder, String str) {
        this.f3952a = iBinder;
        this.f3953b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3952a;
    }

    protected final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3953b);
        return parcelObtain;
    }

    protected final void a(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3952a.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}

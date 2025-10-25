package c.d.a.b.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3778a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3779b;

    protected a(IBinder iBinder, String str) {
        this.f3778a = iBinder;
        this.f3779b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3778a;
    }

    protected final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3779b);
        return parcelObtain;
    }

    protected final void a(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3778a.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}

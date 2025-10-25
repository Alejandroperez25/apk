package c.d.a.b.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f3781a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3782b;

    protected a(IBinder iBinder, String str) {
        this.f3781a = iBinder;
        this.f3782b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3781a;
    }

    protected final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3782b);
        return parcelObtain;
    }

    protected final Parcel a(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3781a.transact(i2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }
}

package b.f.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class b implements Parcelable.ClassLoaderCreator<c> {
    b() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return c.f1186a;
    }

    @Override // android.os.Parcelable.Creator
    public c createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public c[] newArray(int i2) {
        return new c[i2];
    }
}

package c.d.a.a.i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class D implements Parcelable.Creator<E> {
    D() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public E createFromParcel(Parcel parcel) {
        return new E(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public E[] newArray(int i2) {
        return new E[i2];
    }
}

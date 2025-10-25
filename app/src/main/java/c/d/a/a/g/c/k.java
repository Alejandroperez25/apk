package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class k implements Parcelable.Creator<l> {
    k() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public l createFromParcel(Parcel parcel) {
        return new l(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public l[] newArray(int i2) {
        return new l[i2];
    }
}

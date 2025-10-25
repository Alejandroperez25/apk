package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class p implements Parcelable.Creator<q> {
    p() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public q createFromParcel(Parcel parcel) {
        return new q(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public q[] newArray(int i2) {
        return new q[i2];
    }
}

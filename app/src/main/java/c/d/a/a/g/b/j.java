package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class j implements Parcelable.Creator<k> {
    j() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public k createFromParcel(Parcel parcel) {
        return new k(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public k[] newArray(int i2) {
        return new k[i2];
    }
}

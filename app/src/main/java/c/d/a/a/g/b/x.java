package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class x implements Parcelable.Creator<y> {
    x() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public y createFromParcel(Parcel parcel) {
        return new y(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public y[] newArray(int i2) {
        return new y[i2];
    }
}

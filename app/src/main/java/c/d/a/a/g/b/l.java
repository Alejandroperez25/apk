package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class l implements Parcelable.Creator<m> {
    l() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public m createFromParcel(Parcel parcel) {
        return new m(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public m[] newArray(int i2) {
        return new m[i2];
    }
}

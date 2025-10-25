package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class t implements Parcelable.Creator<u> {
    t() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public u createFromParcel(Parcel parcel) {
        return new u(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public u[] newArray(int i2) {
        return new u[i2];
    }
}

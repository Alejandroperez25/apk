package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class f implements Parcelable.Creator<g> {
    f() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public g createFromParcel(Parcel parcel) {
        return new g(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public g[] newArray(int i2) {
        return new g[i2];
    }
}

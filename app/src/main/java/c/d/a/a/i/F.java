package c.d.a.a.i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class F implements Parcelable.Creator<G> {
    F() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public G createFromParcel(Parcel parcel) {
        return new G(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public G[] newArray(int i2) {
        return new G[i2];
    }
}

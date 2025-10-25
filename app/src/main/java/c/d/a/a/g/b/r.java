package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class r implements Parcelable.Creator<s> {
    r() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public s createFromParcel(Parcel parcel) {
        return new s(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public s[] newArray(int i2) {
        return new s[i2];
    }
}

package c.d.a.a.e.e;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class i implements Parcelable.Creator<j> {
    i() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public j createFromParcel(Parcel parcel) {
        return new j(parcel, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public j[] newArray(int i2) {
        return new j[i2];
    }
}

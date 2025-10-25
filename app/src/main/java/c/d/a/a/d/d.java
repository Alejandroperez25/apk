package c.d.a.a.d;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class d implements Parcelable.Creator<f> {
    d() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f createFromParcel(Parcel parcel) {
        return new f(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f[] newArray(int i2) {
        return new f[i2];
    }
}

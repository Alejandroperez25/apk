package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class e implements Parcelable.Creator<f> {
    e() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f createFromParcel(Parcel parcel) {
        return new f(parcel, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f[] newArray(int i2) {
        return new f[i2];
    }
}

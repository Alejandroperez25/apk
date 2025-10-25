package c.d.a.a.d;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.d.f;

/* loaded from: classes.dex */
class e implements Parcelable.Creator<f.a> {
    e() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f.a createFromParcel(Parcel parcel) {
        return new f.a(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public f.a[] newArray(int i2) {
        return new f.a[i2];
    }
}

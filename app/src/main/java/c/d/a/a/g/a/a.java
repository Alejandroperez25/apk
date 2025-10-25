package c.d.a.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class a implements Parcelable.Creator<b> {
    a() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public b createFromParcel(Parcel parcel) {
        return new b(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public b[] newArray(int i2) {
        return new b[i2];
    }
}

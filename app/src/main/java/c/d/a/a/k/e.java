package c.d.a.a.k;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.k.d;

/* loaded from: classes.dex */
class e implements Parcelable.Creator<d.c> {
    e() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public d.c createFromParcel(Parcel parcel) {
        return new d.c(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public d.c[] newArray(int i2) {
        return new d.c[i2];
    }
}

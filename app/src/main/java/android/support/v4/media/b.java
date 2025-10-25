package android.support.v4.media;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class b implements Parcelable.Creator<MediaDescriptionCompat> {
    b() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 21) {
            return new MediaDescriptionCompat(parcel);
        }
        return MediaDescriptionCompat.a(c.a(parcel));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat[] newArray(int i2) {
        return new MediaDescriptionCompat[i2];
    }
}

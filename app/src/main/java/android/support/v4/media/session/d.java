package android.support.v4.media.session;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
class d implements Parcelable.Creator<MediaSessionCompat.Token> {
    d() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token createFromParcel(Parcel parcel) {
        Object strongBinder;
        if (Build.VERSION.SDK_INT >= 21) {
            strongBinder = parcel.readParcelable(null);
        } else {
            strongBinder = parcel.readStrongBinder();
        }
        return new MediaSessionCompat.Token(strongBinder);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token[] newArray(int i2) {
        return new MediaSessionCompat.Token[i2];
    }
}

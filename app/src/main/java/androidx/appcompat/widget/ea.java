package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
class ea implements Parcelable.ClassLoaderCreator<Toolbar.d> {
    ea() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public Toolbar.d createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.d(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Toolbar.d createFromParcel(Parcel parcel) {
        return new Toolbar.d(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Toolbar.d[] newArray(int i2) {
        return new Toolbar.d[i2];
    }
}

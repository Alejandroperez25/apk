package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
class T implements Parcelable.ClassLoaderCreator<SearchView.e> {
    T() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchView.e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.e(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SearchView.e createFromParcel(Parcel parcel) {
        return new SearchView.e(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public SearchView.e[] newArray(int i2) {
        return new SearchView.e[i2];
    }
}

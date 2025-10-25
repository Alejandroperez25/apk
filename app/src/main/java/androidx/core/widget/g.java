package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
class g implements Parcelable.Creator<NestedScrollView.c> {
    g() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public NestedScrollView.c createFromParcel(Parcel parcel) {
        return new NestedScrollView.c(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public NestedScrollView.c[] newArray(int i2) {
        return new NestedScrollView.c[i2];
    }
}

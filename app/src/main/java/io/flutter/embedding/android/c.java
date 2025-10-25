package io.flutter.embedding.android;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class c implements Parcelable.Creator<FlutterSplashView$SavedState> {
    c() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FlutterSplashView$SavedState createFromParcel(Parcel parcel) {
        return new FlutterSplashView$SavedState(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FlutterSplashView$SavedState[] newArray(int i2) {
        return new FlutterSplashView$SavedState[i2];
    }
}

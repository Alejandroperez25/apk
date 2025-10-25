package io.flutter.embedding.android;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class FlutterSplashView$SavedState extends View.BaseSavedState {
    public static Parcelable.Creator<FlutterSplashView$SavedState> CREATOR = new c();
    private String previousCompletedSplashIsolate;
    private Bundle splashScreenState;

    FlutterSplashView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    FlutterSplashView$SavedState(Parcel parcel) {
        super(parcel);
        this.previousCompletedSplashIsolate = parcel.readString();
        this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.previousCompletedSplashIsolate);
        parcel.writeBundle(this.splashScreenState);
    }
}

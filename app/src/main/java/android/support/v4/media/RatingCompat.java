package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    private final int f40a;

    /* renamed from: b, reason: collision with root package name */
    private final float f41b;

    RatingCompat(int i2, float f2) {
        this.f40a = i2;
        this.f41b = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f40a);
        sb.append(" rating=");
        sb.append(this.f41b < 0.0f ? "unrated" : String.valueOf(this.f41b));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f40a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f40a);
        parcel.writeFloat(this.f41b);
    }
}

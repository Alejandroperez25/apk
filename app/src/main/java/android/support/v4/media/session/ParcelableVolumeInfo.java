package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public int f49a;

    /* renamed from: b, reason: collision with root package name */
    public int f50b;

    /* renamed from: c, reason: collision with root package name */
    public int f51c;

    /* renamed from: d, reason: collision with root package name */
    public int f52d;

    /* renamed from: e, reason: collision with root package name */
    public int f53e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f49a = parcel.readInt();
        this.f51c = parcel.readInt();
        this.f52d = parcel.readInt();
        this.f53e = parcel.readInt();
        this.f50b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f49a);
        parcel.writeInt(this.f51c);
        parcel.writeInt(this.f52d);
        parcel.writeInt(this.f53e);
        parcel.writeInt(this.f50b);
    }
}

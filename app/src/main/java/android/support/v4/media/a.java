package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    a() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.support.v4.media.MediaBrowserCompat$MediaItem] */
    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat$MediaItem createFromParcel(final Parcel parcel) {
        return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
            public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f13a;

            /* renamed from: b, reason: collision with root package name */
            private final MediaDescriptionCompat f14b;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            {
                this.f13a = parcel.readInt();
                this.f14b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel2, int i2) {
                parcel2.writeInt(this.f13a);
                this.f14b.writeToParcel(parcel2, i2);
            }

            public String toString() {
                return "MediaItem{mFlags=" + this.f13a + ", mDescription=" + this.f14b + '}';
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat$MediaItem[] newArray(int i2) {
        return new MediaBrowserCompat$MediaItem[i2];
    }
}

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f54a;

    /* renamed from: b, reason: collision with root package name */
    final long f55b;

    /* renamed from: c, reason: collision with root package name */
    final long f56c;

    /* renamed from: d, reason: collision with root package name */
    final float f57d;

    /* renamed from: e, reason: collision with root package name */
    final long f58e;

    /* renamed from: f, reason: collision with root package name */
    final int f59f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f60g;

    /* renamed from: h, reason: collision with root package name */
    final long f61h;

    /* renamed from: i, reason: collision with root package name */
    List<CustomAction> f62i;
    final long j;
    final Bundle k;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f54a = parcel.readInt();
        this.f55b = parcel.readLong();
        this.f57d = parcel.readFloat();
        this.f61h = parcel.readLong();
        this.f56c = parcel.readLong();
        this.f58e = parcel.readLong();
        this.f60g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f62i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f59f = parcel.readInt();
    }

    public String toString() {
        return "PlaybackState {state=" + this.f54a + ", position=" + this.f55b + ", buffered position=" + this.f56c + ", speed=" + this.f57d + ", updated=" + this.f61h + ", actions=" + this.f58e + ", error code=" + this.f59f + ", error message=" + this.f60g + ", custom actions=" + this.f62i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f54a);
        parcel.writeLong(this.f55b);
        parcel.writeFloat(this.f57d);
        parcel.writeLong(this.f61h);
        parcel.writeLong(this.f56c);
        parcel.writeLong(this.f58e);
        TextUtils.writeToParcel(this.f60g, parcel, i2);
        parcel.writeTypedList(this.f62i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f59f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new g();

        /* renamed from: a, reason: collision with root package name */
        private final String f63a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f64b;

        /* renamed from: c, reason: collision with root package name */
        private final int f65c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f66d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        CustomAction(Parcel parcel) {
            this.f63a = parcel.readString();
            this.f64b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f65c = parcel.readInt();
            this.f66d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f63a);
            TextUtils.writeToParcel(this.f64b, parcel, i2);
            parcel.writeInt(this.f65c);
            parcel.writeBundle(this.f66d);
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f64b) + ", mIcon=" + this.f65c + ", mExtras=" + this.f66d;
        }
    }
}

package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    static final b.c.b<String, Integer> f35a = new b.c.b<>();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f36b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f37c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f38d;

    /* renamed from: e, reason: collision with root package name */
    final Bundle f39e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        f35a.put("android.media.metadata.TITLE", 1);
        f35a.put("android.media.metadata.ARTIST", 1);
        f35a.put("android.media.metadata.DURATION", 0);
        f35a.put("android.media.metadata.ALBUM", 1);
        f35a.put("android.media.metadata.AUTHOR", 1);
        f35a.put("android.media.metadata.WRITER", 1);
        f35a.put("android.media.metadata.COMPOSER", 1);
        f35a.put("android.media.metadata.COMPILATION", 1);
        f35a.put("android.media.metadata.DATE", 1);
        f35a.put("android.media.metadata.YEAR", 0);
        f35a.put("android.media.metadata.GENRE", 1);
        f35a.put("android.media.metadata.TRACK_NUMBER", 0);
        f35a.put("android.media.metadata.NUM_TRACKS", 0);
        f35a.put("android.media.metadata.DISC_NUMBER", 0);
        f35a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f35a.put("android.media.metadata.ART", 2);
        f35a.put("android.media.metadata.ART_URI", 1);
        f35a.put("android.media.metadata.ALBUM_ART", 2);
        f35a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f35a.put("android.media.metadata.USER_RATING", 3);
        f35a.put("android.media.metadata.RATING", 3);
        f35a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f35a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f35a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f35a.put("android.media.metadata.DISPLAY_ICON", 2);
        f35a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f35a.put("android.media.metadata.MEDIA_ID", 1);
        f35a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f35a.put("android.media.metadata.MEDIA_URI", 1);
        f35a.put("android.media.metadata.ADVERTISEMENT", 0);
        f35a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f36b = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f37c = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f38d = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new e();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f39e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f39e);
    }
}

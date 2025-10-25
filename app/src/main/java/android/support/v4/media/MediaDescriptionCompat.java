package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.support.v4.media.d;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f18a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f19b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f20c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f21d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f22e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f23f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f24g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f25h;

    /* renamed from: i, reason: collision with root package name */
    private Object f26i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f18a = str;
        this.f19b = charSequence;
        this.f20c = charSequence2;
        this.f21d = charSequence3;
        this.f22e = bitmap;
        this.f23f = uri;
        this.f24g = bundle;
        this.f25h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f18a = parcel.readString();
        this.f19b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f20c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f21d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f22e = (Bitmap) parcel.readParcelable(classLoader);
        this.f23f = (Uri) parcel.readParcelable(classLoader);
        this.f24g = parcel.readBundle(classLoader);
        this.f25h = (Uri) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f18a);
            TextUtils.writeToParcel(this.f19b, parcel, i2);
            TextUtils.writeToParcel(this.f20c, parcel, i2);
            TextUtils.writeToParcel(this.f21d, parcel, i2);
            parcel.writeParcelable(this.f22e, i2);
            parcel.writeParcelable(this.f23f, i2);
            parcel.writeBundle(this.f24g);
            parcel.writeParcelable(this.f25h, i2);
            return;
        }
        c.a(f(), parcel, i2);
    }

    public String toString() {
        return ((Object) this.f19b) + ", " + ((Object) this.f20c) + ", " + ((Object) this.f21d);
    }

    public Object f() {
        if (this.f26i != null || Build.VERSION.SDK_INT < 21) {
            return this.f26i;
        }
        Object objA = c.a.a();
        c.a.a(objA, this.f18a);
        c.a.a(objA, this.f19b);
        c.a.b(objA, this.f20c);
        c.a.c(objA, this.f21d);
        c.a.a(objA, this.f22e);
        c.a.a(objA, this.f23f);
        Bundle bundle = this.f24g;
        if (Build.VERSION.SDK_INT < 23 && this.f25h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f25h);
        }
        c.a.a(objA, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            d.a.a(objA, this.f25h);
        }
        this.f26i = c.a.a(objA);
        return this.f26i;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        a aVar = new a();
        aVar.a(c.a(obj));
        aVar.a(c.b(obj));
        aVar.b(c.c(obj));
        aVar.c(c.d(obj));
        aVar.a(c.e(obj));
        aVar.a(c.f(obj));
        Bundle bundleG = c.g(obj);
        if (bundleG != null) {
            MediaSessionCompat.a(bundleG);
            uri = (Uri) bundleG.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleG;
        } else if (!bundleG.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleG.size() != 2) {
            bundleG.remove("android.support.v4.media.description.MEDIA_URI");
            bundleG.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleG;
        }
        aVar.a(bundle);
        if (uri != null) {
            aVar.b(uri);
        } else if (Build.VERSION.SDK_INT >= 23) {
            aVar.b(d.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = aVar.a();
        mediaDescriptionCompatA.f26i = obj;
        return mediaDescriptionCompatA;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f27a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f28b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f29c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f30d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f31e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f32f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f33g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f34h;

        public a a(String str) {
            this.f27a = str;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f28b = charSequence;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f29c = charSequence;
            return this;
        }

        public a c(CharSequence charSequence) {
            this.f30d = charSequence;
            return this;
        }

        public a a(Bitmap bitmap) {
            this.f31e = bitmap;
            return this;
        }

        public a a(Uri uri) {
            this.f32f = uri;
            return this;
        }

        public a a(Bundle bundle) {
            this.f33g = bundle;
            return this;
        }

        public a b(Uri uri) {
            this.f34h = uri;
            return this;
        }

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f27a, this.f28b, this.f29c, this.f30d, this.f31e, this.f32f, this.f33g, this.f34h);
        }
    }
}

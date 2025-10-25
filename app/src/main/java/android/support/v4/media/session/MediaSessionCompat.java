package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public abstract class MediaSessionCompat {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        private final Object f46a;

        /* renamed from: b, reason: collision with root package name */
        private a f47b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f48c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, a aVar, Bundle bundle) {
            this.f46a = obj;
            this.f47b = aVar;
            this.f48c = bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f46a, i2);
            } else {
                parcel.writeStrongBinder((IBinder) this.f46a);
            }
        }

        public int hashCode() {
            if (this.f46a == null) {
                return 0;
            }
            return this.f46a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f46a == null) {
                return token.f46a == null;
            }
            if (token.f46a == null) {
                return false;
            }
            return this.f46a.equals(token.f46a);
        }

        public void a(a aVar) {
            this.f47b = aVar;
        }

        public void a(Bundle bundle) {
            this.f48c = bundle;
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final MediaDescriptionCompat f43a;

        /* renamed from: b, reason: collision with root package name */
        private final long f44b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        QueueItem(Parcel parcel) {
            this.f43a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f44b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f43a.writeToParcel(parcel, i2);
            parcel.writeLong(this.f44b);
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f43a + ", Id=" + this.f44b + " }";
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        ResultReceiver f45a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f45a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f45a.writeToParcel(parcel, i2);
        }
    }
}

package a.a.a.a;

import a.a.a.a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a.a.a.a.b();

    /* renamed from: a, reason: collision with root package name */
    final boolean f1a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f2b = null;

    /* renamed from: c, reason: collision with root package name */
    a.a.a.a.a f3c;

    protected void a(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f5a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f6b;

        b(int i2, Bundle bundle) {
            this.f5a = i2;
            this.f6b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f5a, this.f6b);
        }
    }

    class a extends a.AbstractBinderC0000a {
        a() {
        }

        @Override // a.a.a.a.a
        public void a(int i2, Bundle bundle) {
            if (c.this.f2b != null) {
                c.this.f2b.post(c.this.new b(i2, bundle));
            } else {
                c.this.a(i2, bundle);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f3c == null) {
                this.f3c = new a();
            }
            parcel.writeStrongBinder(this.f3c.asBinder());
        }
    }

    c(Parcel parcel) {
        this.f3c = a.AbstractBinderC0000a.a(parcel.readStrongBinder());
    }
}

package b.f.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final Parcelable f1187b;

    /* renamed from: a, reason: collision with root package name */
    public static final c f1186a = new a();
    public static final Parcelable.Creator<c> CREATOR = new b();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    private c() {
        this.f1187b = null;
    }

    protected c(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1187b = parcelable == f1186a ? null : parcelable;
    }

    protected c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1187b = parcelable == null ? f1186a : parcelable;
    }

    public final Parcelable f() {
        return this.f1187b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1187b, i2);
    }
}

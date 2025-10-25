package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    ArrayList<C> f792a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f793b;

    /* renamed from: c, reason: collision with root package name */
    C0102c[] f794c;

    /* renamed from: d, reason: collision with root package name */
    String f795d;

    /* renamed from: e, reason: collision with root package name */
    int f796e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public y() {
        this.f795d = null;
    }

    public y(Parcel parcel) {
        this.f795d = null;
        this.f792a = parcel.createTypedArrayList(C.CREATOR);
        this.f793b = parcel.createStringArrayList();
        this.f794c = (C0102c[]) parcel.createTypedArray(C0102c.CREATOR);
        this.f795d = parcel.readString();
        this.f796e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f792a);
        parcel.writeStringList(this.f793b);
        parcel.writeTypedArray(this.f794c, i2);
        parcel.writeString(this.f795d);
        parcel.writeInt(this.f796e);
    }
}

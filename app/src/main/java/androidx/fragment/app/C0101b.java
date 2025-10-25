package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0101b implements Parcelable.Creator<C0102c> {
    C0101b() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public C0102c createFromParcel(Parcel parcel) {
        return new C0102c(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public C0102c[] newArray(int i2) {
        return new C0102c[i2];
    }
}

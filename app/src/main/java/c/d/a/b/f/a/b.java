package c.d.a.b.f.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.a.a implements com.google.android.gms.common.api.i {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final int f3986a;

    /* renamed from: b, reason: collision with root package name */
    private int f3987b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f3988c;

    b(int i2, int i3, Intent intent) {
        this.f3986a = i2;
        this.f3987b = i3;
        this.f3988c = intent;
    }

    public b() {
        this(0, null);
    }

    private b(int i2, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.i
    public final Status m() {
        if (this.f3987b == 0) {
            return Status.f4841a;
        }
        return Status.f4845e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3986a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3987b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.f3988c, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

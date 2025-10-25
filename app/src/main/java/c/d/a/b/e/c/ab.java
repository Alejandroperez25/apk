package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ab extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ab> CREATOR = new cb();

    /* renamed from: a, reason: collision with root package name */
    private final int f3877a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f3878b;

    public ab() {
        this(null);
    }

    private ab(List<String> list) {
        this.f3877a = 1;
        this.f3878b = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f3878b.addAll(list);
    }

    ab(int i2, List<String> list) {
        this.f3877a = i2;
        if (list == null || list.isEmpty()) {
            this.f3878b = Collections.emptyList();
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            list.set(i3, com.google.android.gms.common.util.k.a(list.get(i3)));
        }
        this.f3878b = Collections.unmodifiableList(list);
    }

    public static ab o() {
        return new ab(null);
    }

    public static ab a(ab abVar) {
        return new ab(abVar != null ? abVar.f3878b : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3877a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3878b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Ta extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ta> CREATOR = new Wa();

    /* renamed from: a, reason: collision with root package name */
    private List<Ra> f3860a;

    public Ta() {
        this.f3860a = new ArrayList();
    }

    Ta(List<Ra> list) {
        if (list != null && !list.isEmpty()) {
            this.f3860a = Collections.unmodifiableList(list);
        } else {
            this.f3860a = Collections.emptyList();
        }
    }

    public final List<Ra> o() {
        return this.f3860a;
    }

    public static Ta a(Ta ta) {
        List<Ra> list = ta.f3860a;
        Ta ta2 = new Ta();
        if (list != null) {
            ta2.f3860a.addAll(list);
        }
        return ta2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.b(parcel, 2, this.f3860a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

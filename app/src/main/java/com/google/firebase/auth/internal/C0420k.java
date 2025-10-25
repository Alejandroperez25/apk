package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.AbstractC0221x;
import com.google.firebase.auth.ja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.auth.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0420k> CREATOR = new C0423n();

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.firebase.auth.L> f5373a;

    C0420k(List<com.google.firebase.auth.L> list) {
        this.f5373a = list == null ? AbstractC0221x.h() : list;
    }

    public static C0420k a(List<ja> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ja jaVar : list) {
            if (jaVar instanceof com.google.firebase.auth.L) {
                arrayList.add((com.google.firebase.auth.L) jaVar);
            }
        }
        return new C0420k(arrayList);
    }

    public final List<ja> o() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.firebase.auth.L> it = this.f5373a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.b(parcel, 1, this.f5373a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

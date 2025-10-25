package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.T;
import com.google.firebase.auth.ia;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class H extends ia {
    public static final Parcelable.Creator<H> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.firebase.auth.L> f5344a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final J f5345b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5346c;

    /* renamed from: d, reason: collision with root package name */
    private final T f5347d;

    public H(List<com.google.firebase.auth.L> list, J j, String str, T t) {
        for (com.google.firebase.auth.L l : list) {
            if (l instanceof com.google.firebase.auth.L) {
                this.f5344a.add(l);
            }
        }
        com.google.android.gms.common.internal.t.a(j);
        this.f5345b = j;
        com.google.android.gms.common.internal.t.a(str);
        this.f5346c = str;
        this.f5347d = t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.b(parcel, 1, this.f5344a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f5345b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5346c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, (Parcelable) this.f5347d, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

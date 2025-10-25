package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ja;
import com.google.firebase.auth.ka;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends ka {
    public static final Parcelable.Creator<J> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private String f5349a;

    /* renamed from: b, reason: collision with root package name */
    private String f5350b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.google.firebase.auth.L> f5351c;

    private J() {
    }

    J(String str, String str2, List<com.google.firebase.auth.L> list) {
        this.f5349a = str;
        this.f5350b = str2;
        this.f5351c = list;
    }

    public static J a(List<ja> list, String str) {
        com.google.android.gms.common.internal.t.a(list);
        com.google.android.gms.common.internal.t.a(str);
        J j = new J();
        j.f5351c = new ArrayList();
        for (ja jaVar : list) {
            if (jaVar instanceof com.google.firebase.auth.L) {
                j.f5351c.add((com.google.firebase.auth.L) jaVar);
            }
        }
        j.f5350b = str;
        return j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5349a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5350b, false);
        com.google.android.gms.common.internal.a.c.b(parcel, 3, this.f5351c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}

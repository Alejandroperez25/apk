package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    private final int f5079a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5080b;

    /* renamed from: c, reason: collision with root package name */
    private int f5081c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5082d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5083e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5084f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5085g;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f5086h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5087i;
    private final long j;
    private int k;
    private final String l;
    private final float m;
    private final long n;
    private final boolean o;
    private long p;

    WakeLockEvent(int i2, long j, int i3, String str, int i4, List<String> list, String str2, long j2, int i5, String str3, String str4, float f2, long j3, String str5, boolean z) {
        this.f5079a = i2;
        this.f5080b = j;
        this.f5081c = i3;
        this.f5082d = str;
        this.f5083e = str3;
        this.f5084f = str5;
        this.f5085g = i4;
        this.p = -1L;
        this.f5086h = list;
        this.f5087i = str2;
        this.j = j2;
        this.k = i5;
        this.l = str4;
        this.m = f2;
        this.n = j3;
        this.o = z;
    }

    public WakeLockEvent(long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f2, long j3, String str5, boolean z) {
        this(2, j, i2, str, i3, list, str2, j2, i4, str3, str4, f2, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long o() {
        return this.f5080b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int p() {
        return this.f5081c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long q() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5079a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, o());
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5082d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5085g);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f5086h, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.j);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, this.f5083e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 11, p());
        com.google.android.gms.common.internal.a.c.a(parcel, 12, this.f5087i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 13, this.l, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 14, this.k);
        com.google.android.gms.common.internal.a.c.a(parcel, 15, this.m);
        com.google.android.gms.common.internal.a.c.a(parcel, 16, this.n);
        com.google.android.gms.common.internal.a.c.a(parcel, 17, this.f5084f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 18, this.o);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String r() {
        String str = this.f5082d;
        int i2 = this.f5085g;
        String strJoin = this.f5086h == null ? "" : TextUtils.join(",", this.f5086h);
        int i3 = this.k;
        String str2 = this.f5083e == null ? "" : this.f5083e;
        String str3 = this.l == null ? "" : this.l;
        float f2 = this.m;
        String str4 = this.f5084f == null ? "" : this.f5084f;
        boolean z = this.o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(strJoin).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}

package com.google.firebase.auth.a.a;

import java.util.Map;

/* renamed from: com.google.firebase.auth.a.a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0363e implements InterfaceC0365f {

    /* renamed from: a, reason: collision with root package name */
    private final int f5282a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5283b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f5284c;

    public C0363e(int i2, int i3, Map<String, Integer> map) {
        this.f5282a = i2;
        this.f5283b = i3;
        com.google.android.gms.common.internal.t.a(map);
        this.f5284c = map;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0365f
    public final boolean a(String str) {
        if (this.f5282a == 0) {
            return true;
        }
        if (this.f5283b <= this.f5282a) {
            return false;
        }
        Integer num = this.f5284c.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue() > this.f5282a && this.f5283b >= num.intValue();
    }
}

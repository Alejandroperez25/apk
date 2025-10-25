package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.firebase.iid.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0454j<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f5541a;

    /* renamed from: b, reason: collision with root package name */
    final c.d.a.b.h.i<T> f5542b = new c.d.a.b.h.i<>();

    /* renamed from: c, reason: collision with root package name */
    final int f5543c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f5544d;

    AbstractC0454j(int i2, int i3, Bundle bundle) {
        this.f5541a = i2;
        this.f5543c = i3;
        this.f5544d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean a();

    final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f5542b.a((c.d.a.b.h.i<T>) t);
    }

    final void a(C0453i c0453i) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(c0453i);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14 + String.valueOf(strValueOf2).length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f5542b.a(c0453i);
    }

    public String toString() {
        int i2 = this.f5543c;
        int i3 = this.f5541a;
        boolean zA = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(zA);
        sb.append("}");
        return sb.toString();
    }
}

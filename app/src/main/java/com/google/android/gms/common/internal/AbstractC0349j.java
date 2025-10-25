package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0349j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5048a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static AbstractC0349j f5049b;

    protected abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void b(a aVar, ServiceConnection serviceConnection, String str);

    public static AbstractC0349j a(Context context) {
        synchronized (f5048a) {
            if (f5049b == null) {
                f5049b = new G(context.getApplicationContext());
            }
        }
        return f5049b;
    }

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5050a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5051b;

        /* renamed from: c, reason: collision with root package name */
        private final ComponentName f5052c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5053d;

        public a(String str, String str2, int i2) {
            t.a(str);
            this.f5050a = str;
            t.a(str2);
            this.f5051b = str2;
            this.f5052c = null;
            this.f5053d = i2;
        }

        public final String toString() {
            return this.f5050a == null ? this.f5052c.flattenToString() : this.f5050a;
        }

        public final String a() {
            return this.f5051b;
        }

        public final ComponentName b() {
            return this.f5052c;
        }

        public final int c() {
            return this.f5053d;
        }

        public final Intent a(Context context) {
            if (this.f5050a != null) {
                return new Intent(this.f5050a).setPackage(this.f5051b);
            }
            return new Intent().setComponent(this.f5052c);
        }

        public final int hashCode() {
            return s.a(this.f5050a, this.f5051b, this.f5052c, Integer.valueOf(this.f5053d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.a(this.f5050a, aVar.f5050a) && s.a(this.f5051b, aVar.f5051b) && s.a(this.f5052c, aVar.f5052c) && this.f5053d == aVar.f5053d;
        }
    }

    public final void a(String str, String str2, int i2, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i2), serviceConnection, str3);
    }
}

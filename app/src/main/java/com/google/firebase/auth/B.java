package com.google.firebase.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private FirebaseAuth f5173a;

    private B(FirebaseAuth firebaseAuth) {
        this.f5173a = firebaseAuth;
    }

    public static class a extends com.google.android.gms.common.internal.a.a {
        public static final Parcelable.Creator<a> CREATOR = new R();

        a() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            com.google.android.gms.common.internal.a.c.a(parcel, com.google.android.gms.common.internal.a.c.a(parcel));
        }

        public static a o() {
            return new a();
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c.d.a.b.b.a.a f5174a = new c.d.a.b.b.a.a("PhoneAuthProvider", new String[0]);

        public abstract void a(c.d.b.f fVar);

        public abstract void a(A a2);

        public void a(String str, a aVar) {
        }

        public void a(String str) {
            f5174a.b("Sms auto retrieval timed-out.", new Object[0]);
        }
    }

    public static B a() {
        return new B(FirebaseAuth.getInstance(c.d.b.e.a()));
    }

    public void a(String str, long j, TimeUnit timeUnit, Activity activity, b bVar) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(activity);
        Executor executor = c.d.a.b.h.j.f4024a;
        com.google.android.gms.common.internal.t.a(bVar);
        a(str, j, timeUnit, activity, executor, bVar, null);
    }

    public void a(String str, long j, TimeUnit timeUnit, Activity activity, b bVar, a aVar) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(activity);
        Executor executor = c.d.a.b.h.j.f4024a;
        com.google.android.gms.common.internal.t.a(bVar);
        a(str, j, timeUnit, activity, executor, bVar, aVar);
    }

    private final void a(String str, long j, TimeUnit timeUnit, Activity activity, Executor executor, b bVar, a aVar) {
        this.f5173a.a(str, j, timeUnit, bVar, activity, executor, aVar != null);
    }

    public static A a(String str, String str2) {
        return new A(str, str2, false, null, true, null);
    }
}

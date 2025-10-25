package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416g {

    /* renamed from: a, reason: collision with root package name */
    private static final C0416g f5367a = new C0416g();

    /* renamed from: b, reason: collision with root package name */
    private final C0422m f5368b;

    /* renamed from: c, reason: collision with root package name */
    private final C0414e f5369c;

    private C0416g() {
        this(C0422m.a(), C0414e.a());
    }

    private C0416g(C0422m c0422m, C0414e c0414e) {
        this.f5368b = c0422m;
        this.f5369c = c0414e;
    }

    public static C0416g a() {
        return f5367a;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        this.f5368b.a(firebaseAuth);
    }

    public final void a(Context context) {
        this.f5368b.a(context);
    }
}
